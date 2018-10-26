package hu.webzeppelin.vai.pacman.render.swing;

import dagger.Module;
import dagger.Provides;
import hu.webzeppelin.vai.pacman.render.ActorRenderer;
import hu.webzeppelin.vai.pacman.render.MapRenderer;

@Module
public class SwingRenderModule {

    @Provides
    public static ActorRenderer actorRenderer() {
        return new SwingActorRenderer();
    }

    @Provides
    public static MapRenderer mapRenderer() {
        return new SwingMapRenderer();
    }
}
