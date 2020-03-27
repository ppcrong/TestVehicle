package test;

import test.base.Vehicle.E_EngineStartType;
import test.car.Ford;
import test.car.Tesla;
import test.scooter.Gogoro;
import test.scooter.Syn;

public class Test {
    public static void main(String[] args) throws Exception {

        int speed = 200;
        int milage = 0;
        int remainingPower = 50;

        /*
         * Tesla 1
         */
        Tesla tesla1 = new Tesla("model 3", E_EngineStartType.E_PUSH_START,
            speed, milage, remainingPower);
        tesla1.engineStart(E_EngineStartType.E_PUSH_START);
        tesla1.move(100);
        tesla1.move(100);
        for (int i = 0; i < 10; i++) {
            tesla1.supplyEnergy();
        }
        System.out.println("Tesla1\n" + tesla1 + "\n");

        /*
         * Tesla 2
         */
        speed = 250;
        milage = 100;
        remainingPower = 80;
        Tesla tesla2 = new Tesla("model 3", E_EngineStartType.E_KEY,
            speed, milage, remainingPower);
        tesla2.engineStart(E_EngineStartType.E_KEY);
        tesla2.move(100);
        tesla2.move(100);
        for (int i = 0; i < 30; i++) {
            tesla2.supplyEnergy();
        }
        System.out.println("Tesla2\n" + tesla2 + "\n");

        /*
         * Ford
         */
        Ford ford = new Ford("Fiesta", E_EngineStartType.E_PUSH_START,
            speed, milage, remainingPower);
        ford.engineStart(E_EngineStartType.E_PUSH_START);
        ford.move(100);
        ford.move(100);
        for (int i = 0; i < 10; i++) {
            ford.supplyEnergy();
        }
        System.out.println("Ford\n" + ford + "\n");

        /*
         * Gogoro
         */
        Gogoro gogoro = new Gogoro("gogoro", E_EngineStartType.E_PUSH_START,
            speed, milage, remainingPower);
        gogoro.engineStart(E_EngineStartType.E_PUSH_START);
        gogoro.move(100);
        gogoro.move(100);
        for (int i = 0; i < 10; i++) {
            gogoro.supplyEnergy();
        }
        System.out.println("Gogoro\n" + gogoro + "\n");

        /*
         * Syn
         */
        Syn syn = new Syn("GT125", E_EngineStartType.E_PUSH_START,
            speed, milage, remainingPower);
        syn.engineStart(E_EngineStartType.E_PUSH_START);
        syn.move(100);
        syn.move(100);
        for (int i = 0; i < 10; i++) {
            syn.supplyEnergy();
        }
        System.out.println("Syn\n" + syn + "\n");
    }
}