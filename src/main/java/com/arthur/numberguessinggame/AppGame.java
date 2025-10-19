package com.arthur.numberguessinggame;

import com.arthur.numberguessinggame.controller.GameController;

public class AppGame {
    public static void main(String[] args) {
        GameController controller = new GameController();
        controller.initGame();
    }
}