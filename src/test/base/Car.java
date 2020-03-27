package test.base;

public abstract class Car extends Vehicle {

    public Car(String brand, String model, E_EngineStartType engineStartType, E_ChargingType chargingType,
            int numOfWheels, int speed, int milage, int maxPower, int remainingPower) {
        super(brand, model, engineStartType, chargingType, numOfWheels, speed, milage, maxPower, remainingPower);
        if (numOfWheels == 0) {
            this.numOfWheels = 4;
        }
    }

    @Override
    public String toString() {

        return super.toString() +
                "\n[Car]\n";
    }
}