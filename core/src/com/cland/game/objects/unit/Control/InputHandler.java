package com.cland.game.objects.unit.Control;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.cland.game.objects.unit.Unit;

public class InputHandler {

    private Command keyW;
    private Command keyS;
    private Command keyA;
    private Command keyD;

    public InputHandler (){
        //TODO сделать систему переназначения клавиш
        this.keyW = new MoveUpCommand();
        this.keyS = new MoveDownCommand();
        this.keyA = new MoveLeftCommand();
        this.keyD = new MoveRightCommand();
    }

    public Command inputHandler (){
        if (Gdx.input.isKeyPressed(Input.Keys.W)){return keyW;}
        if (Gdx.input.isKeyPressed(Input.Keys.S)){return keyS;}
        if (Gdx.input.isKeyPressed(Input.Keys.A)){return keyA;}
        if (Gdx.input.isKeyPressed(Input.Keys.D)){return keyD;}
        return null;
    }

    public void inputExecute (Command command,Unit unit){
        if (command != null){
            command.execute(unit);
        }
    }
    /*
    public void inputHandler (Unit unit){
        if (Gdx.input.isKeyPressed(Input.Keys.W)){keyW.execute(unit);}
        else if (Gdx.input.isKeyPressed(Input.Keys.S)){keyS.execute(unit);}
        else if (Gdx.input.isKeyPressed(Input.Keys.A)){keyA.execute(unit);}
        else if (Gdx.input.isKeyPressed(Input.Keys.D)){keyD.execute(unit);}
    }
    */

    /*Vector2 tempPosition;

    public void movement(Unit unit){
        if (Gdx.input.isKeyP nressed(Input.Keys.D)){
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
    }*/
}
