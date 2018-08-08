package com.cland.game.objects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.cland.game.GameScreen;
import com.cland.game.emmiters.Poolable;

public abstract class GamePoint implements Poolable {
    protected transient GameScreen gameScreen;
    protected transient Texture texture;
    protected Vector2 position;
    protected boolean isactive;
    protected float scale;
    protected float angle;

    @Override
    public boolean isActive() {
        return isactive;
    }

    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
    }

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public float getScale() {
        return scale;
    }

    public void setScale(float scale) {
        this.scale = scale;
    }

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }
}
