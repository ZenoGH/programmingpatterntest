public class EngineFactory {
    public enum EngineType {
        ENGINE2,
        ENGINE4,
        ENGINE8,
        ENGINE16
    }

    public static Engine makeEngine(EngineType type) {
        return switch (type) {
            case ENGINE2 -> new Engine2();
            case ENGINE4 -> new Engine4();
            case ENGINE8 -> new Engine8();
            case ENGINE16 -> new Engine16();
            default -> throw new IllegalArgumentException("EngineType is not supported.");
        };
    }
}

