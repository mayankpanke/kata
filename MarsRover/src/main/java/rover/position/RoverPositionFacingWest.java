package rover.position;

 class RoverPositionFacingWest extends RoverPosition {

    RoverPositionFacingWest(int x, int y) {
        super(x, y);
    }

    @Override
    public RoverPosition moveAhead() {
        x-= 1;
        return this;
    }

    @Override
    public RoverPosition moveBack() {
        x+= 1;
        return this;
    }

     @Override
     public RoverPosition moveLeft() {

         return null;
     }
 }
