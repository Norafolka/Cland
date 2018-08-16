package com.cland.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.cland.game.objects.unit.player.Player;

public class GameScreen implements Screen {
    SpriteBatch batch;
    Player player;

    public GameScreen (SpriteBatch spriteBatch){
        this.batch = spriteBatch;
    }

    @Override
    public void show() {
        this.player = new Player();
    }

    public void update(float delta){
        player.update(delta);
    }

    @Override
    public void render(float delta) {
        update(delta);
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        player.render(batch);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
