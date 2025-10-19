package com.arthur.numberguessinggame.model;

import java.util.Random;

public class Game {
    private Difficulty difficulty;
    private int totalAttempts;
    private int attemptsLeft;
    private int randomNumber;

    

    public Game(Difficulty difficulty) {
        this.difficulty = difficulty;
        this.totalAttempts = this.attemptsLeft = difficulty.getChances();
        this.randomNumber = new Random().nextInt(100 + 1);
    }

    public void decrementAttempts() {
        attemptsLeft--;
    }

    public int getAttemptsLeft() {
        return attemptsLeft;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public int getTotalAttempts() {
        return totalAttempts;
    }

    public int getAttemptsGuessed() {
        return totalAttempts - attemptsLeft + 1;
    }
}
