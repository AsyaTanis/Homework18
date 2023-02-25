package Transport;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract  class Transport <T extends Driver> implements Competing {
    String brand;
    String model;
    Double engineVolume;
    T driver;

    public List<Mechanic> mechanicLists;


    public Transport(String brand, String model, Double engineVolume, T driver,List<Mechanic> mechanicLists) {
        this.brand = (isBrandIsEmpty(brand) ? "default" : brand);
        this.model = (isModelIsEmpty(model) ? "default" : model);
        setEngineVolume(engineVolume);
        setDriver(driver);
        this.mechanicLists = mechanicLists;
    }

    public List<Mechanic> getMechanicLists() {
        return mechanicLists;
    }

    public void setMechanicLists(List<Mechanic> mechanicLists) {
        this.mechanicLists = mechanicLists;
    }

    private boolean isBrandIsEmpty(String brand) {
        return brand == null || brand.isEmpty();
    }

    private boolean isModelIsEmpty(String model) {
        return model == null || model.isEmpty();
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Double engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = 2.2;
        }
        this.engineVolume = engineVolume;
    }

    public abstract void performMaintenance();

    public abstract void fixTheCar();

    public abstract void nameOfTheDriver();

    public abstract void carMechanics();

    public void pitStop() {

    }

    public void bestLapTime() {
    }

    public void maximumSpeed() {
    }

    public void startMoving() {
    }

    public void finishTheMovement() {
    }

    public void refuelTheCar() {
    }

    public abstract void getType();

    public abstract void printType();

    public void passDiagnostics() throws TransportTypeException, IOException {
    }

    @Override
    public String toString() {
        return "Транспорт{" +
                "бренд ='" + brand + '\'' +
                ", модель ='" + model + '\'' +
                ", объём двигателя =" + engineVolume +
                ", водитель =" + driver +
                '}';
    }
}