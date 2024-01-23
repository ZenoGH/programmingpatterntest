public class FastWheels extends Wheels {
    WheelType getType() {
        return WheelType.FastWheel;
    }

    boolean isEngineCompatible(Engine engine) {
        return engine.getClass().equals(Engine16.class) ||
                engine.getClass().equals(Engine8.class);
    }
}
