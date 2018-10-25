package hu.webzeppelin.vai.pacman.render;

import dagger.Module;
import dagger.Provides;
import hu.webzeppelin.vai.pacman.render.swing.SwingActorRenderer;
import hu.webzeppelin.vai.pacman.render.swing.SwingMapRenderer;

@Module
public class RenderModule {

    @Provides
    public static ActorRenderer actorRenderer() {
        return new SwingActorRenderer();
    }

    @Provides
    public static MapRenderer mapRenderer() {
        return new SwingMapRenderer();
    }
}
