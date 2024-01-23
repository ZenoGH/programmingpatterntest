package Engine;

public abstract class AbstractEngine implements Cloneable {
    public abstract int getEngineSpeed();

    @Override
    public AbstractEngine clone() {
        try {
            return (AbstractEngine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
