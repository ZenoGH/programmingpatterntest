public abstract class Wheels implements Cloneable {
    @Override
    public Wheels clone() {
        try {
            return (Wheels) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public enum WheelType {
        FastWheel,
        HardWheel,
        SoftWheel
    }

    WheelType getType() {
        return null;
    }

    boolean isEngineCompatible(Engine engine) {
        return false;
    }
}
