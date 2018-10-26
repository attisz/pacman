package hu.webzeppelin.vai.pacman;

import dagger.Component;
import hu.webzeppelin.vai.pacman.render.swing.SwingRenderModule;
import javax.inject.Singleton;

@Singleton
@Component(modules = {
    SwingRenderModule.class
})
public interface PacMan {
    PacManEngine engine();
}
