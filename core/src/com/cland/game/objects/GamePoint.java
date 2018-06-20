package com.cland.game.objects;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.cland.game.GameScreen;

public abstract class GamePoint {
    GameScreen gameScreen;
    TextureRegion texture;
    Vector2 position;
    boolean isactive;
    float scale;
    float angle;

    public Vector2 getPosition() {
        return position;
    }

    public boolean isIsactive() {
        return isactive;
    }

    public float getScale() {
        return scale;
    }


}
