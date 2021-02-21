package oop.generictypes;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(240);

        GenericBox<Car> carBox = new GenericBox<>(car);

        System.out.println(carBox.getItem().getMaxSpeed());

        Car car1 = new Car(240);
        Garage<Car> garage =new Garage<>(car1);

        garage.repair();
        System.out.println(garage.getVehicle().getMaxSpeed());

        Garage<Vehicle> vehicle = new Garage<>(car1);
        vehicle.repair();
        System.out.println(vehicle.getVehicle().getMaxSpeed());

    }
}
