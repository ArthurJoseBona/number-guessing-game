package com.arthur.numberguessinggame;

import com.arthur.numberguessinggame.controller.GameController;

public class AppGame {

    // The main entry point of the application
    public static void main(String[] args) {

        // Create a new GameController instance
        // The controller will handle the game logic and user interactions
        GameController controller = new GameController();

        // Start the game
        controller.initGame();
    }
}
