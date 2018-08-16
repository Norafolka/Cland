package com.cland.game.objects.unit.player;

import com.badlogic.gdx.graphics.Texture;
import com.cland.game.GameScreen;
import com.cland.game.objects.unit.Control.InputHandler;
import com.cland.game.objects.unit.Unit;

public class Player extends Unit {
    InputHandler inputHandler;

    public Player() {
        super(100, 100);
        this.inputHandler = new InputHandler();
        this.texture = new Texture("player.png");
    }

    public Player (GameScreen gameScreen, float x, float y) {
        super(x, y);
        this.texture = new Texture("player.png");
        this.inputHandler = new InputHandler();
    }

    public void update(float deltatime){
        super.update(deltatime);
        inputHandler.mouseImputHandler(this);
        inputHandler.inputHandler(this,deltatime);
    }
}
