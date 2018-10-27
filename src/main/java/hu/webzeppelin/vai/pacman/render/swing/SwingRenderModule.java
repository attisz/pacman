package hu.webzeppelin.vai.pacman.render.swing;

import dagger.Module;
import dagger.Provides;
import hu.webzeppelin.vai.pacman.render.ActorRenderer;
import hu.webzeppelin.vai.pacman.render.GuiRenderer;
import hu.webzeppelin.vai.pacman.render.MapRenderer;
import javax.inject.Singleton;

@Module
public class SwingRenderModule {

    @Provides
    @Singleton
    public static GuiRenderer guiRenderer() {
        return new SwingGuiRendererImpl();
    }

    @Provides
    @Singleton
    public static DrawablePanelHolder drawablePanelHolder(GuiRenderer guiRenderer) {
        return (SwingGuiRendererImpl) guiRenderer;
    }

    @Provides
    @Singleton
    public static DrawablePanel drawablePanel(DrawablePanelHolder drawablePanelHolder) {
        return drawablePanelHolder.getDrawablePanel();
    }

    @Provides
    @Singleton
    public static ActorRenderer actorRenderer(DrawablePanel drawablePanel) {
        return new SwingActorRenderer(drawablePanel);
    }

    @Provides
    @Singleton
    public static MapRenderer mapRenderer(DrawablePanel drawablePanel) {
        return new SwingMapRenderer(drawablePanel);
    }
}
