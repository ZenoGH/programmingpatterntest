package Wheels;

import Engine.AbstractEngine;

public abstract class AbstractWheels implements Cloneable {
    @Override
    public AbstractWheels clone() {
        try {
            return (AbstractWheels) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public enum WheelType {
        FastWheel,
        HardWheel,
        SoftWheel
    }

    public static AbstractWheels getWheelsByType(AbstractWheels.WheelType type) {
        return switch (type) {
            case FastWheel -> new FastWheels();
            case HardWheel -> new HardWheels();
            case SoftWheel -> new SoftWheels();
            default -> null;
        };
    }

    WheelType getType() {
        return null;
    }

    public boolean isEngineCompatible(AbstractEngine engine) {
        return false;
    }
}
