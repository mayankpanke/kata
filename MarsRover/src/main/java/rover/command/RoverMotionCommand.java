package rover.command;

import rover.position.RoverPosition;

@FunctionalInterface
public interface RoverMotionCommand {
    RoverPosition execute(RoverPosition position);
}
