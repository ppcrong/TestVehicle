package test.scooter;

import test.base.Scooter;
import test.supply.SupplyFuel;

public class Syn extends Scooter implements SupplyFuel {

    public Syn(String model, E_EngineStartType engineStartType, int speed, int milage, int remainingPower) {
        super("SYN", model, engineStartType, E_ChargingType.E_REFUEL,
            2, speed, milage, 100, remainingPower);
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