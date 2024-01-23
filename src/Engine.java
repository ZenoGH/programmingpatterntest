public abstract class Engine implements Cloneable {
    public abstract int getEngineSpeed();

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
