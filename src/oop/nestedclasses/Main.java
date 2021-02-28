package oop.nestedclasses;

public class Main {
    public static void main(String[] args) {

        Becycle becycle = new Becycle();                                    // NonStatic
        System.out.println(becycle.getMaxSpeed());

        Becycle.Wheel wheel = becycle.new Wheel();
        wheel.repair();

        System.out.println(becycle.getMaxSpeed());

        Becycle.Mechanic mechanic= new Becycle.Mechanic();                 // Static
        mechanic.damage(becycle);
        System.out.println(becycle.getMaxSpeed());
    }
}
