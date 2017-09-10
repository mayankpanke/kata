package rover;

public class RoverPosition {
    private int x;
    private int y;
    private String facetingDirection;

    public RoverPosition(int x, int y, String faceingDirection) {
        this.x = x;
        this.y = y;
        this.facetingDirection = faceingDirection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoverPosition that = (RoverPosition) o;

        return x == that.x &&
               y == that.y &&
               (facetingDirection != null ? facetingDirection.equals(that.facetingDirection) : that.facetingDirection == null);
    }

    void moveAhead() {
        x+= 1;
    }

    void moveBack() {
        x-= 1;
    }

    @Override
    public String toString() {
        return "RoverPosition{" +
                "x=" + x +
                ", y=" + y +
                ", facetingDirection='" + facetingDirection + '\'' +
                '}';
    }
}
