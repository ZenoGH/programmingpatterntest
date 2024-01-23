package Car;

import Engine.AbstractEngine;
import Color.Color;
import Engine.EngineFactory;
import Wheels.AbstractWheels;
public class CarBuilder {
    Car newCar = new Car();
    public CarBuilder() {
        setColor(new Color(0, 0, 0));
        setEngine(EngineFactory.makeEngine(EngineFactory.EngineType.ENGINE2));
        setWheels(AbstractWheels.getWheelsByType(AbstractWheels.WheelType.SoftWheel));
    }

    public CarBuilder setColor(Color color) {
        newCar.color = color;
        return this;
    }

    public CarBuilder setEngine(AbstractEngine engine) {
        newCar.engine = engine;
        newCar.maxSpeed = engine.getEngineSpeed();
        return this;
    }

    public CarBuilder setWheels(AbstractWheels wheels) {
        newCar.wheels = wheels;
        return this;
    }

    public Car build() {
        return newCar.clone();
    }
}
