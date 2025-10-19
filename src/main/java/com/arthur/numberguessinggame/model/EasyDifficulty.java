package com.arthur.numberguessinggame.model;

// Easy difficulty implementation of Difficulty interface
public class EasyDifficulty implements Difficulty {

    @Override
    public int getChances() {
        return 10; // Easy difficulty gives the player 10 attempts
    }

    @Override
    public String getSelectedMessage() {
        return "Great! You have selected the Easy difficulty level.\nYou have 10 chances to guess the number.";
        // Message displayed when the player chooses Easy
    }

}
