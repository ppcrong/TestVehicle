package test.car;

import test.base.Car;
import test.supply.SupplyFuel;

public class Ford extends Car implements SupplyFuel {

    public Ford(String model, E_EngineStartType engineStartType, int speed, int milage, int remainingPower) {
        super("Ford", model, engineStartType, E_ChargingType.E_REFUEL,
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
            refuel(); // Keep refuelling before fuel full
        }
    }

    @Override
    public void refuel() {
        // TODO Auto-generated method stub
        remainingPower++;
    }
}