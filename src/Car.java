public class Car implements Cloneable {
    private int maxSpeed = 0;
    private Color color;
    private Engine engine;
    private Wheels wheels;
    public Builder builder;

    private Car() {
    }

    public class Builder implements Cloneable {
        private Car parentCar = Car.this;
        private Builder() {
            parentCar.builder = this;
            setColor(new Color(0, 0, 0));
            setEngine(EngineFactory.makeEngine(EngineFactory.EngineType.ENGINE2));
            setWheels(Car.getWheelsByType(Wheels.WheelType.SoftWheel));
        }

        public Builder setColor(Color color) {
            parentCar.color = color;
            return this;
        }

        public Builder setEngine(Engine engine) {
            parentCar.engine = engine;
            parentCar.maxSpeed = engine.getEngineSpeed();
            return this;
        }

        public Builder setWheels(Wheels wheels) {
            parentCar.wheels = wheels;
            return this;
        }

        public Car build() {
            return Car.this;
        }

        @Override
        public Builder clone() {
            try {
                return (Builder) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }

    @Override
    public Car clone() {
        try {
            Car car = (Car) super.clone();
            car.engine = engine.clone();
            car.wheels = wheels.clone();
            car.color = color.clone();
            car.builder = builder.clone();
            car.builder.parentCar = car;
            return car;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void drive() {
        if (isCompatible()) {
            System.out.printf("Driving safely at around %s km/h\n", maxSpeed);
        } else {
            System.out.printf("You got into a car accident at around %s km/h\n", maxSpeed);
        }
    }

    private boolean isCompatible() {
        return wheels.isEngineCompatible(engine);
    }

    public static Builder newBuilder() {
        return new Car().new Builder();
    }

    static Wheels getWheelsByType(Wheels.WheelType type) {
        return switch (type) {
            case FastWheel -> new FastWheels();
            case HardWheel -> new HardWheels();
            case SoftWheel -> new SoftWheels();
            default -> null;
        };
    }
}
