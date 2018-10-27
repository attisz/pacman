package hu.webzeppelin.vai.pacman.render.swing;

import com.google.common.eventbus.EventBus;
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
    public static EventBus eventBus() {
        return new EventBus();
    }

    @Provides
    @Singleton
    public static GuiRenderer guiRenderer(EventBus eventBus) {
        return new SwingGuiRendererImpl(eventBus);
    }

    @Provides
    @Singleton
    public static DrawablePanelHolder drawablePanelHolder(GuiRenderer guiRenderer) {
        return (SwingGuiRendererImpl) guiRenderer;
    }

    @Provides
    @Singleton
    public static DrawablePanel drawablePanel(DrawablePanelHolder drawablePanelHolder, EventBus eventBus) {
        DrawablePanel drawablePanel = drawablePanelHolder.getDrawablePanel();
        drawablePanel.registerTo(eventBus);
        return drawablePanel;
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
