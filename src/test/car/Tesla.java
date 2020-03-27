package test.car;

import test.base.Car;
import test.supply.SupplyElectricity;

public class Tesla extends Car implements SupplyElectricity {

    public Tesla(String model, E_EngineStartType engineStartType, int speed, int milage, int remainingPower) {
        super("Tesla", model, engineStartType, E_ChargingType.E_CHARGE,
            4, speed, milage, 100, remainingPower);
    }

    @Override
    public void engineStart(E_EngineStartType engineStartType) {
        // TODO Auto-generated method stub
        super.engineStart(engineStartType);
    }

    @Override
    public void showMilage() {
        // TODO Auto-generated method stub

    }

    @Override
    public void engineStop() {
        // TODO Auto-generated method stub

    }

    @Override
    public void supplyEnergy() {
        // TODO Auto-generated method stub
        if (false == isPowerFull()) {
            charge(); // Keep charging before power full
        }
    }

    @Override
    public void charge() {
        // TODO Auto-generated method stub
        remainingPower++;
    }
}