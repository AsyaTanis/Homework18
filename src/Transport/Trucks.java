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

    @Override
    public void getType() {
    }

    @Override
    public void printType() {
        System.out.println(Type.Trucks);
    }

    @Override
    public void passDiagnostics() {
        System.out.println("Пройти диагностику " + getBrand() + " " + getModel());
    }

}
enum LoadCapacity{
    N1 ("N1",0,3.5),
    N2 ("N2",3.5,12),
    N3 ("N3",12,15);

    private double weightFrom;
    private double weightUpTo;
    private String capasity;

    LoadCapacity(String capasity, double weightFrom, double weightUpTo) {
        this.weightFrom = weightFrom;
        this.weightUpTo = weightUpTo;
        this.capasity = capasity;
    }

    public String getCapasity() {
        return capasity;
    }

    public void setCapasity(String capasity) {
        this.capasity = capasity;
    }

    public double getWeightFrom() {
        return weightFrom;
    }

    public void setWeightFrom(double weightFrom) {
        if (weightFrom <= 0 ){
            System.out.println(getCapasity() + ": " + "до " + getWeightFrom());
        }
        this.weightFrom = weightFrom;
    }

    public double getWeightUpTo() {
        return weightUpTo;
    }

    public void setWeightUpTo(double weightUpTo) {
        if (weightFrom >= 15 ){
            System.out.println(getCapasity() + ": " + "до " + getWeightUpTo());
        }
        this.weightUpTo = weightUpTo;
    }

    @Override
    public String toString() {
        return getCapasity() + ": " +
                "нижняя граница = " + getWeightFrom() +
                ", верхняя граница = " + getWeightUpTo();
    }


}
