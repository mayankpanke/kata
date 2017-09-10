package rover.position;

public abstract class RoverPosition {
    int x;
    int y;

    RoverPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract RoverPosition moveAhead();

    public abstract RoverPosition moveBack();

    public abstract RoverPosition moveLeft();

    public abstract RoverPosition moveRight();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoverPosition that = (RoverPosition) o;

        return x == that.x &&
                y == that.y;
    }

    @Override
    public String toString() {
        return "RoverPosition{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
