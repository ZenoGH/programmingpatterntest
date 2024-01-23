//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = Car.newBuilder()
                .setColor(new Color(0, 100, 50))
                .setEngine(EngineFactory.makeEngine(EngineFactory.EngineType.ENGINE8))
                .setWheels(Car.getWheelsByType(Wheels.WheelType.HardWheel))
                .build();
        car.drive();
        Car car2 = car.clone();
        car2.drive();

        car2.builder.setEngine(EngineFactory.makeEngine(EngineFactory.EngineType.ENGINE4));
        car2.drive();
        car.drive();
    }
}