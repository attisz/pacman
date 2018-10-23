package hu.webzeppelin.vai.pacman.render.swing;

import hu.webzeppelin.vai.pacman.actor.Actor;
import hu.webzeppelin.vai.pacman.actor.Position;
import hu.webzeppelin.vai.pacman.render.ActorRenderer;

public class SwingActorRenderer implements ActorRenderer {
    @Override
    public void render(Actor actor) {
        Position position = actor.getPosition();
        System.out.println(String.format("Rendering actor (%s) at position: %s;%s", actor, position.getX(), position.getY()));
    }
}
