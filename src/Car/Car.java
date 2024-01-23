package Car;

import Engine.AbstractEngine;
import Color.Color;
import Wheels.*;

public class Car implements Cloneable {
    int maxSpeed = 0;
    Color color;
    AbstractEngine engine;
    AbstractWheels wheels;

    public Car() {}

    @Override
    public Car clone() {
        try {
            Car car = (Car) super.clone();
            car.engine = engine.clone();
            car.wheels = wheels.clone();
            car.color = color.clone();
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
}
