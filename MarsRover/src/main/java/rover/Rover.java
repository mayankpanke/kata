package rover;

import rover.command.RoverMotionCommand;
import rover.position.RoverPosition;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Rover {
    private static Map<String, RoverMotionCommand> motionCommands = new HashMap<>();

    static {
        motionCommands.put("F", RoverPosition::moveAhead);
        motionCommands.put("B", RoverPosition::moveBack);
        motionCommands.put("L", RoverPosition::moveLeft);
    }

    private RoverPosition currentPosition;

    public Rover(RoverPosition initialPosition) {
        currentPosition = initialPosition;
    }

    public void applyCommand(String... commands) {
        Arrays.stream(commands)
                .forEach((String command) ->
                        currentPosition = motionCommands.get(command).execute(currentPosition));
    }

    public RoverPosition currentPosition() {
        return currentPosition;
    }
}
