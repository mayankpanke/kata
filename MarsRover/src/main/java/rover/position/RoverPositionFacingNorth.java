package rover.position;

class RoverPositionFacingNorth extends RoverPosition {

    RoverPositionFacingNorth(int x, int y) {
        super(x, y);
    }

    @Override
    public RoverPosition moveAhead() {
        y+= 1;
        return this;
    }

    @Override
    public RoverPosition moveBack() {
        y-= 1;
        return this;
    }

    @Override
    public RoverPosition moveLeft() {
        return RoverPositionFactory.position(this.x,this.y, RoverPositionFactory.FaceDirection.WEST);

    }

    @Override
    public RoverPosition moveRight() {
        return RoverPositionFactory.position(this.x,this.y, RoverPositionFactory.FaceDirection.EAST);

    }
}
