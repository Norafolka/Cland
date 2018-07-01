package com.cland.game.objects.unit.player;

import com.badlogic.gdx.graphics.Texture;
import com.cland.game.GameScreen;
import com.cland.game.objects.parameters.UnitСontrol;
import com.cland.game.objects.unit.Unit;

public class Player extends Unit {
    UnitСontrol unitСontrol;

    public Player (GameScreen gameScreen, float x, float y) {
        super(x, y);
        this.texture = new Texture("player.png");
        this.unitСontrol = new UnitСontrol();
    }

    public void update(float deltatime){
        super.update(deltatime);
        unitСontrol.movement();
    }
}
