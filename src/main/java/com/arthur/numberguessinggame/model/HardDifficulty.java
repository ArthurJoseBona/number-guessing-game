package com.arthur.numberguessinggame.model;

// Hard difficulty implementation of Difficulty interface
public class HardDifficulty implements Difficulty {

    @Override
    public int getChances() {
        return 3; // Hard difficulty gives only 3 attempts
    }

    @Override
    public String getSelectedMessage() {
        return "Great! You have selected the Hard difficulty level.\nYou have 3 chances to guess the number.";
        // Message displayed when the player chooses Hard
    }

}
