package vehicles.air;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;

public class Plane extends Vehicle implements IAirVehicle, IMotorised {

    private int capacity;
    private IMotorised engine;

    public Plane(float weight, int maxSpeed, IProduct baseProduct, IMotorised engine){
        super(weight,maxSpeed,baseProduct);
        this.capacity = 200;
        this.engine = engine;
    }


    @Override
    public void startEngine() {
        this.engine.startEngine();
    }

    @Override
    public void stopEngine() {
        this.engine.stopEngine();
    }

    @Override
    public int getHp() {
        return this.engine.getHp();
    }

    @Override
    public void setHp(int hp) {
        this.engine.setHp(hp);
    }

    @Override
    public int getFuel() {
        return this.engine.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        this.engine.setFuel(fuel);
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
