package hu.webzeppelin.vai.pacman.actor;

public class Movement {
    private Direction direction;
    private float speed;

    public Movement(Direction direction, float speed) {
        this.direction = direction;
        this.speed = speed;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
}
