package com.arthur.numberguessinggame.model;

// Interface defining the behavior of a difficulty level
public interface Difficulty {

    // Returns the number of chances allowed for this difficulty
    int getChances();

    // Returns a message describing the selected difficulty
    String getSelectedMessage();
}
