package Wheels;

import Engine.AbstractEngine;
import Engine.Engine16;
import Engine.Engine8;

public class FastWheels extends AbstractWheels {
    WheelType getType() {
        return WheelType.FastWheel;
    }

    public boolean isEngineCompatible(AbstractEngine engine) {
        return engine.getClass().equals(Engine16.class) ||
                engine.getClass().equals(Engine8.class);
    }
}
