package com.cland.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class CLandGame extends Game {
	private SpriteBatch batch;

	@Override
	public void create () {
		batch = new SpriteBatch();
	}

	@Override
	public void render () {
		float dt = Gdx.graphics.getDeltaTime();
		getScreen().render(dt);
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
