package rover;

import rover.command.Command;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Rover {
    private static Map<String, Command> commandFetcher = new HashMap<>();
    static {
        commandFetcher.put("F", RoverPosition::moveAhead);
        commandFetcher.put("B", RoverPosition::moveBack);
    }

    private RoverPosition currentPosition;

    public Rover(RoverPosition initialPosition) {
        currentPosition = initialPosition;
    }

    public void applyCommand(String[] commands) {
        Arrays.stream(commands)
                .forEach(command -> commandFetcher.get(command).apply(currentPosition));
    }

    public RoverPosition getPosition() {
        return currentPosition;
    }
}
