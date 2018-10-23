package hu.webzeppelin.vai.pacman;

import dagger.Component;
import hu.webzeppelin.vai.pacman.render.RenderModule;

import javax.inject.Singleton;

@Singleton
@Component(modules = {
        RenderModule.class
})
public interface PacMan {
    PacManEngine engine();
}
