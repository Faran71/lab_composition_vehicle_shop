package vehicles.air;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;

public class Helicopter extends Vehicle implements IAirVehicle, IMotorised {

    private int capacity;
    private IMotorised motor;

    public Helicopter(float weight, int maxSpeed, IProduct baseProduct, IMotorised motor){
        super(weight,maxSpeed,baseProduct);
        this.capacity = 2;
        this.motor = motor;
    }


    @Override
    public void startEngine() {
        this.motor.startEngine();
    }

    @Override
    public void stopEngine() {
        this.motor.stopEngine();
    }

    @Override
    public int getHp() {
        return this.motor.getHp();
    }

    @Override
    public void setHp(int hp) {
        this.motor.setHp(hp);
    }

    @Override
    public int getFuel() {
        return this.motor.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        this.motor.setFuel(fuel);
    }

    @Override
    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
