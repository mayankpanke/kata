package rover.position;

 class RoverPositionFacingSouth extends RoverPosition {

    RoverPositionFacingSouth(int x, int y) {
        super(x, y);
    }

    @Override
    public RoverPosition moveAhead() {
        y-= 1;
        return this;
    }

    @Override
    public RoverPosition moveBack() {
        y+= 1;
        return this;
    }

     @Override
     public RoverPosition moveLeft() {

         return RoverPositionFactory.position(this.x,this.y, RoverPositionFactory.FaceDirection.EAST);
     }
 }
