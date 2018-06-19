package com.cland.game.objects;

import com.cland.game.objects.Parameters.MainParameters;
import com.cland.game.objects.Parameters.Race;

public abstract class Unit extends GamePoint implements MainParameters {
    Race race;
    float angle;
    float speed;
    long experience;
    int level;

    public Unit(){

    }

    public void render(){

    }

    public void update(){

    }
}
