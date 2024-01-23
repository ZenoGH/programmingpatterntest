import Car.Car;
import Car.CarBuilder;
import Wheels.AbstractWheels;
import Color.Color;
import Engine.EngineFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .setColor(new Color(0, 100, 50))
                .setEngine(EngineFactory.makeEngine(EngineFactory.EngineType.ENGINE8))
                .setWheels(AbstractWheels.getWheelsByType(AbstractWheels.WheelType.HardWheel))
                .build();
        car.drive();
    }
}