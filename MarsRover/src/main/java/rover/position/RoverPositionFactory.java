package rover.position;

import java.util.HashMap;
import java.util.Map;

public class RoverPositionFactory {

    public enum FaceDirection {EAST, WEST, NORTH, SOUTH}

    private  static Map<FaceDirection, PositionCreator> faceBasedPosition = new HashMap<>(4);
    static {
        faceBasedPosition.put(FaceDirection.EAST, RoverPositionFacingEast::new);
        faceBasedPosition.put(FaceDirection.WEST, RoverPositionFacingWest::new);
        faceBasedPosition.put(FaceDirection.NORTH, RoverPositionFacingNorth::new);
        faceBasedPosition.put(FaceDirection.SOUTH, RoverPositionFacingSouth::new);
    }
    public static RoverPosition position(int x, int y, FaceDirection faceDirection) {
        return faceBasedPosition.get(faceDirection).create(x, y);
    }

    @FunctionalInterface
    private interface PositionCreator {
        RoverPosition create(int x, int y);
    }
}
