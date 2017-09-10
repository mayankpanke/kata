package rover.position;

class RoverPositionFacingEast extends RoverPosition {

    RoverPositionFacingEast(int x, int y) {
        super(x, y);
    }


    @Override
    public RoverPosition moveAhead() {
        x += 1;
        return this;
    }

    @Override
    public RoverPosition moveBack() {
        x -= 1;
        return this;
    }

    @Override
    public RoverPosition moveLeft() {

        return RoverPositionFactory.position(this.x,this.y, RoverPositionFactory.FaceDirection.NORTH);
    }

    @Override
    public RoverPosition moveRight() {
        return RoverPositionFactory.position(this.x,this.y, RoverPositionFactory.FaceDirection.SOUTH);

    }
}