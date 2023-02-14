package Transport;

public class Buses extends Transport <DriverC>  {


    public Buses(String brand, String model, Double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус марки " + getBrand() + " на пит - стопе ");
    }
    @Override
    public void bestLapTime() {
        int minTime = 4;
        int maxTime = 20;
        int lapTime = (int) (Math.random()*((maxTime-minTime)+2));
        System.out.println("Лучшее время круга автобуса " + lapTime + " минут");
    }
    @Override
    public void maximumSpeed() {
        int minSpeed = 40;
        int maxSpeed = 120;
        int lapTime = (int) (Math.random()*((maxSpeed-minSpeed)+11));
        System.out.println("Максимальная скорость автобуса " + lapTime + "км/ч");
    }
    @Override
    public  void startMoving() {
        System.out.println("Автобус  " + getBrand()+ " начал движение");
    }
    @Override
    public  void finishTheMovement() {
        System.out.println("Автобус" + getBrand()+ " закончил движение");
    }


}