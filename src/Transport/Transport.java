package Transport;

public abstract  class Transport <T extends Driver> implements Competing {
    String brand;
    String model;
    Double engineVolume;
    T driver;


    public Transport(String brand, String model, Double engineVolume, T driver) {
        this.brand = (isBrandIsEmpty(brand) ? "default" : brand);
        this.model = (isModelIsEmpty(model) ? "default" : model);
        setEngineVolume(engineVolume);
        setDriver(driver);
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
        if(engineVolume <= 0 ){engineVolume = 2.2; }
        this.engineVolume=engineVolume;
    }

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