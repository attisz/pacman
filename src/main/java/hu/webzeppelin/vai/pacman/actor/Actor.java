package hu.webzeppelin.vai.pacman.actor;

public abstract class Actor {

    private Position position;
    private Position destination;

    public Actor() {
        position = Position.at(0, 0);
    }

    protected abstract float baseSpeed();

    public void updatePosition() {

    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Position getDestination() {
        return destination;
    }

    public void setDestination(Position destination) {
        this.destination = destination;
    }
}
