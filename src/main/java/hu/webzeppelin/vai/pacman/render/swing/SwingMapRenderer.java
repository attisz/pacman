package hu.webzeppelin.vai.pacman.render.swing;

import hu.webzeppelin.vai.pacman.map.Map;
import hu.webzeppelin.vai.pacman.render.MapRenderer;

public class SwingMapRenderer implements MapRenderer {

    private final DrawablePanel drawablePanel;

    public SwingMapRenderer(DrawablePanel drawablePanel) {
        this.drawablePanel = drawablePanel;
    }

    @Override
    public void render(Map map) {
        System.out.println("Rendering map: " + map.toString());
    }
}
