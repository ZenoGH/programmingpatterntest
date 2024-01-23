package Wheels;

import Engine.AbstractEngine;
import Engine.Engine4;
import Engine.Engine8;

public class SoftWheels extends AbstractWheels {
    WheelType getType() {
        return WheelType.SoftWheel;
    }
    public boolean isEngineCompatible(AbstractEngine engine) {
        return engine.getClass().equals(Engine8.class) ||
                engine.getClass().equals(Engine4.class);
    }
}
