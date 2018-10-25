package hu.webzeppelin.vai.pacman.scene;

import hu.webzeppelin.vai.pacman.actor.Actor;
import hu.webzeppelin.vai.pacman.map.Map;
import java.util.List;

public interface Scene {
    Map getMap();
    List<Actor> getActors();
}
