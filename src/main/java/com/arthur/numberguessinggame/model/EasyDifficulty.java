package com.arthur.numberguessinggame.model;

public class EasyDifficulty implements Difficulty{

    @Override
    public int getChances() {
        return 10;
    }

    @Override
    public String getSelectedMessage() {
        return "Great! You have selected the Easy difficulty level.\nYou have 10 chances to guess the number.";
    }

}
