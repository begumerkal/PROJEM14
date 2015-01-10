package com.bobbyloujo.jumpybug;

import android.os.Bundle;

import bobby.engine.bobengine.BobActivity;


public class MainActivity extends BobActivity {

    private GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        gameView = new GameView(this);

        setContentView(gameView);
    }
}
