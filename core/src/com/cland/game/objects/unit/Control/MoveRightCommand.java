package com.cland.game.objects.unit.Control;

import com.cland.game.objects.unit.Unit;

public class MoveRightCommand implements Command {
    @Override
    public void execute(Unit unit) {
        unit.moveRight();
    }
}
