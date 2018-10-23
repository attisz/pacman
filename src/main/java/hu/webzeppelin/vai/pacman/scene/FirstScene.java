package hu.webzeppelin.vai.pacman.scene;

import hu.webzeppelin.vai.pacman.actor.Actor;
import hu.webzeppelin.vai.pacman.actor.Player;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class FirstScene implements Scene {

    private List<Actor> actors = newArrayList(
            new Player());


    @Override
    public List<Actor> getActors() {
        return actors;
    }
}
