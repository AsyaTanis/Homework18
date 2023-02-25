package Transport;

import java.util.List;

public class Trucks extends Transport <DriverD> implements ServiceStation {

    public Trucks(String brand, String model, Double engineVolume, DriverD driver, List<Mechanic>mechanicLists) {
        super(brand, model, engineVolume, driver, mechanicLists);
    }
    @Override
    public void performMaintenance() {
        System.out.println("Провести техобслуживание" + getModel() + " " + getBrand());
    }
    @Override
    public void fixTheCar() {
        System.out.println("Починить машину" + getModel() + " " + getBrand());

    }
    @Override
    public void nameOfTheDriver() {
        System.out.println("Водителя автомобиля зовут - " + getDriver());
    }
    @Override
    public void carMechanics() {
        System.out.println("Механики закрепленные за автомобилем : " + getMechanicLists());
    }

    @Override
    public String toString() {
        return "Trucks{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", driver=" + driver +
                ", mechanicLists=" + mechanicLists +
                '}';
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

    @Override
    public void addACarToTheQueue() {
        System.out.println("Добавить авто в очередь - " + getBrand() + " " + getModel());
    }

    @Override
    public void technicalInspectionOfTheCar() {
        System.out.println("Провести техосмотр авто - " + getBrand() + " " + getModel());
    }
}
enum LoadCapacity{
    N1 (0,3.5),
    N2 (3.5,12),
    N3 (12,15);

    private double weightFrom;
    private double weightUpTo;

    LoadCapacity(double weightFrom, double weightUpTo) {
        setWeightFrom(weightFrom);
        this.weightUpTo = weightUpTo;
    }

    public double getWeightFrom() {
        return weightFrom;
    }

    public void setWeightFrom(double weightFrom) {
        if (weightFrom <= 0 ){
            System.out.println("Грузоподъемность»: до «нижняя граница» тонн.");
        }
        this.weightFrom = weightFrom;
    }

    public double getWeightUpTo() {
        return weightUpTo;
    }

    public void setWeightUpTo(double weightUpTo) {
        if (weightFrom >= 15 ){
            System.out.println("Грузоподъемность»: до «верхняя граница» тонн.");
        }
        this.weightUpTo = weightUpTo;
    }

    @Override
    public String toString() {
        return "Грузоподъемность{" +
                "нижняя граница=" + weightFrom +
                ", верхняя граница=" + weightUpTo +
                '}';
    }

}