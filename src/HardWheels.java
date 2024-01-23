public class HardWheels extends Wheels {
    WheelType getType() {
        return WheelType.HardWheel;
    }

    boolean isEngineCompatible(Engine engine) {
        return engine.getClass().equals(Engine4.class) ||
                engine.getClass().equals(Engine2.class);
    }
}
