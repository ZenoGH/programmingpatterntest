public class SoftWheels extends Wheels {
    WheelType getType() {
        return WheelType.SoftWheel;
    }
    boolean isEngineCompatible(Engine engine) {
        return engine.getClass().equals(Engine8.class) ||
                engine.getClass().equals(Engine4.class);
    }
}
