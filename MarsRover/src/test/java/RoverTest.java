import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import rover.Rover;
import rover.RoverPosition;

public class RoverTest {

    @Test
    public void roverReadyFacingNorth(){
        Rover rover = new Rover(getInitialPosition());
        RoverPosition position = rover.getPosition();

        Assert.assertThat(position, Is.is(getInitialPosition()));
    }

    @Test
    public void roverMoveOneStepForward(){
        Rover rover = new Rover(getInitialPosition());
        rover.applyCommand(new String[]{"F"});
        RoverPosition position = rover.getPosition();

        Assert.assertThat(position, Is.is(new RoverPosition(1,0, "N")));
    }

    @Test
    public void roverMoveTwoStepForward(){
        Rover rover = new Rover(getInitialPosition());
        rover.applyCommand(new String[]{"F", "F"});
        RoverPosition position = rover.getPosition();

        Assert.assertThat(position, Is.is(new RoverPosition(2,0, "N")));
    }
    @Test
    public void roverMoveOneStepBackWord(){
        Rover rover = new Rover(new RoverPosition(1,0, "N"));
        rover.applyCommand(new String[]{"B"});
        RoverPosition position = rover.getPosition();

        Assert.assertThat(position, Is.is(getInitialPosition()));
    }

    private RoverPosition getInitialPosition() {
        return new RoverPosition(0,0, "N");
    }
}
