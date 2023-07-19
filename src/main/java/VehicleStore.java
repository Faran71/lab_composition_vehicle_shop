import products.Product;
import vehicles.*;
import vehicles.land.Bicycle;
import vehicles.land.Car;
import vehicles.water.Kayak;
import vehicles.water.Speedboat;

import java.util.ArrayList;
import java.util.List;

public class VehicleStore {
    private static List<IVehicle> vehicles;

    public static void main(String[] args) {
        vehicles = new ArrayList<>();
        // create a bike using composition, and call methods from its components
        Bicycle bike1 = new Bicycle(10, 20, new Product("BMX", 350, 6));
        vehicles.add(bike1);

        System.out.println(bike1.getWheelCount());
        System.out.println(bike1.getTitle());
        System.out.println(bike1.getInventory());

        // create a car using composition, and call methods from its multiple components
        Car car1 = new Car(200, 120, new Product("2015 Dacia Duster", 10000, 3),
        new Engine(100, 150));
        vehicles.add(car1);

        car1.startEngine();
        System.out.println(car1.getFuel());
        System.out.println(car1.getPrice());

        // lab tests (water vehicle related)...
        Kayak kayak1 = new Kayak(100,100,new Product("AquaTec",300,5));
        vehicles.add(kayak1);

        System.out.println(kayak1.getHullType());
        System.out.println(kayak1.getPrice());
//        Testing speedboat
        Speedboat boat = new Speedboat(150,200,new Product("Yamaha",40000,10),new Motor(100,75));
        vehicles.add(boat);

        System.out.println(boat.getPrice());
        System.out.println(boat.getFuel());

    }
}
