package Transport;

import com.sun.jdi.connect.TransportTimeoutException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Buses extends Transport <DriverC>  {
    /*Mechanic mechanic1 = new Mechanic("Пискунов Артём", "АСТ-54");
    Mechanic mechanic2 = new Mechanic("Иноземцев Иван", "АСТ-54");
    Mechanic mechanic3 = new Mechanic("Поляков Дмитрий", "Reaktor");
    Mechanic mechanic4 = new Mechanic("Савинов Вячеслав", "TopGear");
    List<Mechanic>mechanic = new ArrayList<>();*/





    public Buses(String brand, String model, Double engineVolume, DriverC driver,List<Mechanic>mechanicLists) {
        super(brand, model, engineVolume, driver,mechanicLists);
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
    public String toString() {
        return "TheBuses{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", driver=" + driver +
                ", mechanicLists=" + mechanicLists +
                '}';
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

    @Override
    public void getType() {
    }

    @Override
    public void printType() {
        System.out.println(Type.Buses);
    }

    @Override
    public void passDiagnostics() throws TransportTypeException, IOException{
        throw new TransportTypeException("”Автобусы” диагностику проходить не должны");
    }
}
enum Capacity{
    ESPECIALLY_SMALL(null, " до 10 мест"),
    SMALL(null, " до 25 мест"),
    MIDDLE("25 -", " 50"),
    BIG("50 -", " 80"),
    ESPECIALLY_BIG("80 -", " 120");

    private String capacityFrom;
    private String capacityUpTo;

    Capacity(String capacityFrom,String capacityUpTo) {
        this.capacityFrom=capacityFrom;
        this.capacityUpTo = capacityUpTo;
    }

    public String getCapacityFrom() {
        return capacityFrom;
    }

    public void setCapacityFrom(String capacityFrom) {
        this.capacityFrom = capacityFrom;
    }

    public String getCapacityUpTo() {
        return capacityUpTo;
    }

    public void setCapacityUpTo(String capacityUpTo) {
        this.capacityUpTo = capacityUpTo;
    }
}
