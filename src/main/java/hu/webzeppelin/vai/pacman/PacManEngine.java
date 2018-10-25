package hu.webzeppelin.vai.pacman;

import hu.webzeppelin.vai.pacman.render.ActorRenderer;
import hu.webzeppelin.vai.pacman.render.MapRenderer;
import hu.webzeppelin.vai.pacman.scene.LevelOne;
import hu.webzeppelin.vai.pacman.scene.Scene;
import javax.inject.Inject;

public class PacManEngine {

    private final ActorRenderer actorRenderer;
    private final MapRenderer mapRenderer;
    private Scene scene;

    @Inject
    public PacManEngine(ActorRenderer actorRenderer, MapRenderer mapRenderer) {
        this.actorRenderer = actorRenderer;
        this.mapRenderer = mapRenderer;
        this.scene = new LevelOne();
    }

    public void start() {
        System.out.println("Starting PacMan engine");

        mapRenderer.render(scene.getMap());
        scene.getActors().forEach(actorRenderer::render);
    }
}
