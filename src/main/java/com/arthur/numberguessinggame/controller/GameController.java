package com.arthur.numberguessinggame.controller;

import java.util.Scanner;

import com.arthur.numberguessinggame.model.Difficulty;
import com.arthur.numberguessinggame.model.EasyDifficulty;
import com.arthur.numberguessinggame.model.Game;
import com.arthur.numberguessinggame.model.HardDifficulty;
import com.arthur.numberguessinggame.model.MediumDifficulty;
import com.arthur.numberguessinggame.view.GameView;

public class GameController {
    Scanner sc = new Scanner(System.in);
    GameView view;

    public GameController() {
        view = new GameView();
    }

    public void initGame() {
        view.showInitialMenu();

        boolean validInput = false;
        
        int choose = -1;
        while (!validInput) {
            try { 
                view.showDifficultyMenu();
                choose = Integer.parseInt(sc.nextLine());
                validInput = true;
            } catch (Exception e) { 
            view.showMessage("\nInvalid input. Please enter a number.\n", true);
            }   
        }
        
        Difficulty difficulty = getDifficultyByIndex(choose);
        view.showMessage(difficulty.getSelectedMessage() + "\n", true);
        view.showMessage("Let's start the game!\n", true);
        Game game = new Game(difficulty);

        boolean won = false;

        do {
            won = initRound(game);
        } while ((game.getAttemptsLeft() > 0) && !won);

        if (won) {
            view.showMessage("Congratulations! You guessed the correct number in  your " + game.getAttemptsGuessed() + "th attempt.\n", true);
        } else {
            view.showMessage("Game over! You didn’t guess the correct number. The correct answer was " + game.getRandomNumber() + ".\n", true);
        }
    }

    public boolean initRound(Game game) {
        
        int guessed = -1;
        boolean validInput = false;
        while (!validInput) {
            try { 
                view.showMessage("You have "+ game.getAttemptsLeft() +" tries left.\nEnter your guess: ", false);
                guessed = Integer.parseInt(sc.nextLine());
                validInput = true;
            } catch (Exception e) { 
            view.showMessage("Invalid input. Please enter a valid guess.", true);
            }   
        }

        if (guessed == game.getRandomNumber()) return true;
        game.decrementAttempts();
        if (guessed > game.getRandomNumber()) {
            view.showMessage("Incorrect! The number is less than " + guessed + ".\n", true);
        } else {
            view.showMessage("Incorrect! The number is greater than " + guessed + ".\n", true);
        }
        return false;
    }

    public Difficulty getDifficultyByIndex(int index) {
        return switch (index) {
            case 1 -> new EasyDifficulty();
            case 2 -> new MediumDifficulty();
            case 3 -> new HardDifficulty();
            default -> {
                view.showMessage("Invalid choice. Please select one of the available options.", true);
                yield null;
            }
        };
    }

}
