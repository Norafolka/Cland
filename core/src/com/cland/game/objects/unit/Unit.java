package com.cland.game.objects.unit;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.cland.game.objects.GamePoint;
import com.cland.game.objects.parameters.Race;
import com.cland.game.objects.parameters.UnitСontrol;

public abstract class Unit extends GamePoint {
    Race race;

    long experience = 0;
    int level = 0;

    int strength = 0;
    int dexterity = 0;
    int intelligence = 0;
    int endurance = 0;

    int helth = 0;
    int mana = 0;
    int speed = 0;
    int resistance = 0;
    int armor = 0;
    int carryweight = 0;

    public Unit(float x, float y){
        this.position = new Vector2(x, y);
        this.scale = 1.0f;
        this.angle = 0.0f;
    }

    public int getSpeed() {
        return speed;
    }

    public void render(SpriteBatch spriteBatch){
        spriteBatch.draw(texture, getPosition().x - 32, getPosition().y - 32,32,32,64,64,
                getScale(), getScale(), getAngle(), 0,0,64,64,false,false);
    }

    public void update(float deltaTime){
    }
}
