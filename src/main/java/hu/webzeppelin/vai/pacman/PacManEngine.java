package hu.webzeppelin.vai.pacman;

import hu.webzeppelin.vai.pacman.render.ActorRenderer;
import hu.webzeppelin.vai.pacman.render.GuiRenderer;
import hu.webzeppelin.vai.pacman.render.MapRenderer;
import hu.webzeppelin.vai.pacman.scene.LevelOne;
import hu.webzeppelin.vai.pacman.scene.Scene;
import javax.inject.Inject;

public class PacManEngine {

    private final GuiRenderer guiRenderer;
    private final MapRenderer mapRenderer;
    private final ActorRenderer actorRenderer;
    private Scene scene;

    @Inject
    public PacManEngine(GuiRenderer guiRenderer, MapRenderer mapRenderer, ActorRenderer actorRenderer) {
        this.guiRenderer = guiRenderer;
        this.mapRenderer = mapRenderer;
        this.actorRenderer = actorRenderer;
        this.scene = new LevelOne();
    }

    public void start() {
        System.out.println("Starting PacMan engine");

        guiRenderer.createAndShowGui();
        mapRenderer.render(scene.getMap());
        scene.getActors().forEach(actorRenderer::render);
    }
}
