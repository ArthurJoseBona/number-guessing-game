package com.arthur.numberguessinggame.model;

// Medium difficulty implementation of Difficulty interface
public class MediumDifficulty implements Difficulty {

    @Override
    public int getChances() {
        return 5; // Medium difficulty gives 5 attempts
    }

    @Override
    public String getSelectedMessage() {
        return "Great! You have selected the Medium difficulty level.\nYou have 5 chances to guess the number.";
        // Message displayed when the player chooses Medium
    }

}
