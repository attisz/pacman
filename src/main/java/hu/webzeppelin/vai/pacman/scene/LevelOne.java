package hu.webzeppelin.vai.pacman.scene;

import static com.google.common.collect.Lists.newArrayList;

import hu.webzeppelin.vai.pacman.actor.Actor;
import hu.webzeppelin.vai.pacman.actor.Monster;
import hu.webzeppelin.vai.pacman.actor.Player;
import hu.webzeppelin.vai.pacman.map.DefaultMap;
import hu.webzeppelin.vai.pacman.map.Map;
import java.util.Collections;
import java.util.List;

public class LevelOne implements Scene {

    private DefaultMap defaultMap = new DefaultMap();

    private List<Actor> actors = newArrayList(
        new Player(),
        new Monster(),
        new Monster());

    @Override
    public Map getMap() {
        return defaultMap;
    }

    @Override
    public List<Actor> getActors() {
        return Collections.unmodifiableList(actors);
    }
}
