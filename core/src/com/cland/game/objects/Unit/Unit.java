package com.cland.game.objects.Unit;

import com.cland.game.objects.GamePoint;
import com.cland.game.objects.Parameters.Race;

public abstract class Unit extends GamePoint {
    Race race;

    long experience = 0;
    int level = 0;

    int strength = 0;
    int dexterity = 0;
    int intelligence = 0;
    int Endurance = 0;

    int helth = 0;
    int mana = 0;
    int speed = 0;
    int resistance = 0;
    int armor = 0;
    int carryweight = 0;

    public Unit(){

    }

    public void render(){

    }

    public void update(){

    }
}
