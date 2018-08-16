package com.cland.game.objects.unit.Control;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.math.Vector2;
import com.cland.game.objects.unit.Unit;

public class InputHandler {
    Vector2 tmp;

    private Command keyW;
    private Command keyS;
    private Command keyA;
    private Command keyD;

    public InputHandler (){
        this.tmp = new Vector2();

        //TODO сделать систему переназначения клавиш
        this.keyW = new MoveUpCommand();
        this.keyS = new MoveDownCommand();
        this.keyA = new MoveLeftCommand();
        this.keyD = new MoveRightCommand();
    }
    /*
    public Command inputHandler (){
        if (Gdx.input.isKeyPressed(Input.Keys.W)){return keyW;}
        if (Gdx.input.isKeyPressed(Input.Keys.S)){return keyS;}
        if (Gdx.input.isKeyPressed(Input.Keys.A)){return keyA;}
        if (Gdx.input.isKeyPressed(Input.Keys.D)){return keyD;}
        return null;
    }

    public void inputExecute (Command command,Unit unit,float dt){
        if (command != null){
            command.execute(unit,dt);
        }
    } */

    public void inputHandler (Unit unit, float dt){
        if (Gdx.input.isKeyPressed(Input.Keys.W)){keyW.execute(unit, dt);}
        if (Gdx.input.isKeyPressed(Input.Keys.S)){keyS.execute(unit, dt);}
        if (Gdx.input.isKeyPressed(Input.Keys.A)){keyA.execute(unit, dt);}
        if (Gdx.input.isKeyPressed(Input.Keys.D)){keyD.execute(unit, dt);}
    }

    public void mouseImputHandler (Unit unit){
        tmp.set(Gdx.input.getX(), 720 - Gdx.input.getY());
        unit.angleToTarget(tmp);
    }
}
