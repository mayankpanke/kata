package rover.command;

import rover.RoverPosition;

@FunctionalInterface
public interface Command {
    void apply(RoverPosition position);
}
