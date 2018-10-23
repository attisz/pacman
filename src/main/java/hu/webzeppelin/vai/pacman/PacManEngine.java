package hu.webzeppelin.vai.pacman;

import hu.webzeppelin.vai.pacman.render.ActorRenderer;
import hu.webzeppelin.vai.pacman.scene.FirstScene;
import hu.webzeppelin.vai.pacman.scene.Scene;

import javax.inject.Inject;

public class PacManEngine {

    private final ActorRenderer actorRenderer;
    private Scene scene;

    @Inject
    public PacManEngine(ActorRenderer actorRenderer) {
        this.actorRenderer = actorRenderer;
        this.scene = new FirstScene();
    }

    public void start() {
        System.out.println("Starting PacMan engine");

        scene.getActors().forEach(actorRenderer::render);
    }
}
