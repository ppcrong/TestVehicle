package test.base;

import java.util.HashMap;
import java.util.Map;

public abstract class Vehicle {

    /**
     * Engine start type.
     */
    public enum E_EngineStartType {
        E_PUSH_START(0), E_KEY(1);

        private static final Map<Integer, E_EngineStartType> VALUE_MAP = new HashMap<>();

        static {
            for (E_EngineStartType codeEnum : values()) {
                VALUE_MAP.put(codeEnum.getValue(), codeEnum);
            }
        }

        private Integer value;

        E_EngineStartType(Integer value) {
            this.value = value;
        }

        public Integer getValue() {
            return this.value;
        }

        public static E_EngineStartType getEnumByValue(Integer value) {
            return VALUE_MAP.get(value);
        }

        @Override
        public String toString() {
            String valueString;
            switch (value) {
                case 0:
                    valueString = "PUSH_START";
                    break;
                case 1:
                    valueString = "KEY";
                    break;
                default:
                    valueString = "UNKNOWN";
                    break;
            }
            return "E_EngineStartType{" + String.format("%d", value) + " " + valueString + '}';
        }
    }

    /**
     * Charging type.
     */
    public enum E_ChargingType {
        E_REFUEL(0), E_CHARGE(1);

        private static final Map<Integer, E_ChargingType> VALUE_MAP = new HashMap<>();

        static {
            for (E_ChargingType codeEnum : values()) {
                VALUE_MAP.put(codeEnum.getValue(), codeEnum);
            }
        }

        private Integer value;

        E_ChargingType(Integer value) {
            this.value = value;
        }

        public Integer getValue() {
            return this.value;
        }

        public static E_ChargingType getEnumByValue(Integer value) {
            return VALUE_MAP.get(value);
        }

        @Override
        public String toString() {
            String valueString;
            switch (value) {
                case 0:
                    valueString = "REFUEL";
                    break;
                case 1:
                    valueString = "CHARGE";
                    break;
                default:
                    valueString = "UNKNOWN";
                    break;
            }
            return "E_ChargingType{" + String.format("%d", value) + " " + valueString + '}';
        }
    }

    protected String brand;
    protected String model;
    protected E_EngineStartType engineStartType;
    protected E_ChargingType chargingType;
    protected int numOfWheels;
    protected int speed; // max speed?
    public int mileage;
    protected int maxPower;
    public int remainingPower;

    @Override
    public String toString() {

        return "\nVehicle{\n" +
                String.format("\tbrand:\t%s\n", brand) +
                String.format("\tmodel:\t%s\n", model) +
                String.format("\t%s\n", engineStartType) +
                String.format("\t%s\n", chargingType) +
                String.format("\tnumOfWheels:\t%d\n", numOfWheels) +
                String.format("\tspeed:\t%d\n", speed) +
                String.format("\tmileage:\t%d\n", mileage) +
                String.format("\tmaxPower:\t%d\n", maxPower) +
                String.format("\tremainingPower:\t%d\n", remainingPower) +
                '}';
    }

    public Vehicle(String brand, String model, E_EngineStartType engineStartType, E_ChargingType chargingType,
            int numOfWheels, int speed, int milage, int maxPower, int remainingPower) {

        this.brand = brand;
        this.model = model;
        this.engineStartType = engineStartType;
        this.chargingType = chargingType;
        this.numOfWheels = numOfWheels;
        this.speed = speed;
        this.mileage = milage;
        this.maxPower = maxPower;
        this.remainingPower = remainingPower;
    }

    public void engineStart(E_EngineStartType engineStartType) {
        this.engineStartType = engineStartType;
    }

    public void move(int distance) {
        mileage += distance;
    }

    public abstract void showMilage();

    public boolean isLowPower() {
        return remainingPower <= 10;
    }

    public boolean isPowerFull() {
        return remainingPower >= maxPower;
    }

    public abstract void engineStop();

    public abstract void supplyEnergy(); // refuel or charge
}