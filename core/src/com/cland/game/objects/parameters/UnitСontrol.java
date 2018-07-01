package com.cland.game.objects.parameters;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.math.Vector2;
import com.cland.game.objects.unit.Unit;

public class UnitСontrol {
    Unit unit;
    Vector2 tempPosition;

    public void movement(){
        if (Gdx.input.isKeyPressed(Input.Keys.D)){
            tempPosition = unit.getPosition();
            tempPosition.add(unit.getSpeed(),0);
            unit.setPosition(tempPosition);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.A)){
            tempPosition = unit.getPosition();
            tempPosition.add(-unit.getSpeed(),0);
            unit.setPosition(tempPosition);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.W)){
            tempPosition = unit.getPosition();
            tempPosition.add(0,unit.getSpeed());
            unit.setPosition(tempPosition);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.S)){
            tempPosition = unit.getPosition();
            tempPosition.add(0,-unit.getSpeed());
            unit.setPosition(tempPosition);
        }
    }
}
