package com.arthur.numberguessinggame.model;

public class MediumDifficulty implements Difficulty{

    @Override
    public int getChances() {
        return 5;
    }

    @Override
    public String getSelectedMessage() {
        return "Great! You have selected the Medium difficulty level.\nYou have 5 chances to guess the number.";
    }

}
