package Transport;

public class Trucks extends Transport <DriverD> {

    public Trucks(String brand, String model, Double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик марки " + getBrand() + " на пит - стопе ");
    }
    @Override
    public void bestLapTime() {
        int minTime = 6;
        int maxTime = 17;
        int lapTime = (int) (Math.random()*((maxTime-minTime)+2));
        System.out.println("Лучшее время круга грузового автомобиля " + lapTime + " минут");
    }
    @Override
    public void maximumSpeed() {
        int minSpeed = 50;
        int maxSpeed = 130;
        int lapTime = (int) (Math.random()*((maxSpeed-minSpeed)+11));
        System.out.println("Максимальная скорость грузового автомобиля " + lapTime + "км/ч");
    }
    @Override
    public  void startMoving() {
        System.out.println("Грузовой автомобиль " + getBrand()+ " начал движение");
    }
    @Override
    public  void finishTheMovement() {
        System.out.println("Грузовой автомобиль " + getBrand()+ " закончил движение");
    }

}