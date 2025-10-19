package com.arthur.numberguessinggame.model;

public class HardDifficulty implements Difficulty{

    @Override
    public int getChances() {
        return 3;
    }

    @Override
    public String getSelectedMessage() {
        return "Great! You have selected the Hard difficulty level.\nYou have 3 chances to guess the number.";
    }

}
