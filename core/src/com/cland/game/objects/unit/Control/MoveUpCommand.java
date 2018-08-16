package com.cland.game.objects.unit.Control;

import com.cland.game.objects.unit.Unit;

public class MoveUpCommand implements Command {
    @Override
    public void execute(Unit unit, float dt) {
        unit.moveUp(dt);
    }
}
