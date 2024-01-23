package Wheels;

import Engine.AbstractEngine;
import Engine.Engine2;
import Engine.Engine4;

public class HardWheels extends AbstractWheels {
    WheelType getType() {
        return WheelType.HardWheel;
    }

    public boolean isEngineCompatible(AbstractEngine engine) {
        return engine.getClass().equals(Engine4.class) ||
                engine.getClass().equals(Engine2.class);
    }
}
