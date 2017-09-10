import org.junit.Test;
import rover.Rover;
import rover.position.RoverPosition;
import rover.position.RoverPositionFactory;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RoverMotionTest {

    @Test
    public void roverReadyFacingNorth(){
        Rover rover = new Rover(RoverPositionFactory.position(0,0, RoverPositionFactory.FaceDirection.NORTH));
        RoverPosition position = rover.currentPosition();

        assertThat(position, is(RoverPositionFactory.position(0,0, RoverPositionFactory.FaceDirection.NORTH)));
    }

    @Test
    public void roverMoveOneStepForwardFacingNorth(){
        Rover rover = new Rover(RoverPositionFactory.position(0,0, RoverPositionFactory.FaceDirection.NORTH));
        rover.applyCommand("F");
        RoverPosition position = rover.currentPosition();

        assertThat(position, is(RoverPositionFactory.position(0,1, RoverPositionFactory.FaceDirection.NORTH)));
    }

    @Test
    public void roverMoveOneStepForwardFacingSouth(){
        Rover rover = new Rover(RoverPositionFactory.position(0,0, RoverPositionFactory.FaceDirection.SOUTH));
        rover.applyCommand("F");
        RoverPosition position = rover.currentPosition();

        assertThat(position, is(RoverPositionFactory.position(0,-1, RoverPositionFactory.FaceDirection.SOUTH)));
    }

    @Test
    public void roverMoveOneStepForwardFacingEast(){
        Rover rover = new Rover(RoverPositionFactory.position(0,0, RoverPositionFactory.FaceDirection.EAST));
        rover.applyCommand("F");
        RoverPosition position = rover.currentPosition();

        assertThat(position, is(RoverPositionFactory.position(1,0, RoverPositionFactory.FaceDirection.EAST)));
    }

    @Test
    public void roverMoveOneStepForwardFacingWest(){
        Rover rover = new Rover(RoverPositionFactory.position(0,0, RoverPositionFactory.FaceDirection.WEST));
        rover.applyCommand("F");
        RoverPosition position = rover.currentPosition();

        assertThat(position, is(RoverPositionFactory.position(-1,0, RoverPositionFactory.FaceDirection.WEST)));
    }

    @Test
    public void roverMoveTwoStepForwardFacingEast(){
        Rover rover = new Rover(RoverPositionFactory.position(0,0, RoverPositionFactory.FaceDirection.EAST));
        rover.applyCommand("F", "F");
        RoverPosition position = rover.currentPosition();

        assertThat(position, is(RoverPositionFactory.position(2,0, RoverPositionFactory.FaceDirection.EAST)));
    }

    @Test
    public void roverMoveTwoStepForwardFacingNorth(){
        Rover rover = new Rover(RoverPositionFactory.position(0,0, RoverPositionFactory.FaceDirection.NORTH));
        rover.applyCommand("F", "F");
        RoverPosition position = rover.currentPosition();

        assertThat(position, is(RoverPositionFactory.position(0,2, RoverPositionFactory.FaceDirection.NORTH)));
    }

    @Test
    public void roverMoveOneStepBackFacingNorth(){
        Rover rover = new Rover(RoverPositionFactory.position(0,1, RoverPositionFactory.FaceDirection.NORTH));
        rover.applyCommand("B");
        RoverPosition position = rover.currentPosition();

        assertThat(position, is(RoverPositionFactory.position(0,0, RoverPositionFactory.FaceDirection.NORTH)));
    }

    @Test
    public void roverMoveOneStepBackFacingSouth(){
        Rover rover = new Rover(RoverPositionFactory.position(0,1, RoverPositionFactory.FaceDirection.SOUTH));
        rover.applyCommand( "B");
        RoverPosition position = rover.currentPosition();

        assertThat(position, is(RoverPositionFactory.position(0,2, RoverPositionFactory.FaceDirection.SOUTH)));
    }

    @Test
    public void roverMoveOneStepBackFacingEast(){
        Rover rover = new Rover(RoverPositionFactory.position(0,1, RoverPositionFactory.FaceDirection.EAST));
        rover.applyCommand("B");
        RoverPosition position = rover.currentPosition();

        assertThat(position, is(RoverPositionFactory.position(-1,1, RoverPositionFactory.FaceDirection.EAST)));
    }

    @Test
    public void roverMoveOneStepBackFacingWest(){
        Rover rover = new Rover(RoverPositionFactory.position(0,1, RoverPositionFactory.FaceDirection.WEST));
        rover.applyCommand("B");
        RoverPosition position = rover.currentPosition();

        assertThat(position, is(RoverPositionFactory.position(1,1, RoverPositionFactory.FaceDirection.WEST)));
    }

    @Test
    public void roverMoveOneStepLeftFacingNorth(){
        Rover rover = new Rover(RoverPositionFactory.position(0,1, RoverPositionFactory.FaceDirection.NORTH));
        rover.applyCommand("L");
        RoverPosition position = rover.currentPosition();

        assertThat(position, is(RoverPositionFactory.position(0,1, RoverPositionFactory.FaceDirection.WEST)));
    }

}
