package com.cland.game.objects.unit.Control;

import com.cland.game.objects.unit.Unit;

public interface Command {
    void execute(Unit unit);
}
