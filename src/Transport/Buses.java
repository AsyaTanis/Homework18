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

    @Override
    public void getType() {
    }

    @Override
    public void printType() {
        System.out.println(Type.Buses);
    }
}
enum Capacity{
    ESPECIALLY_SMALL("особо малая", 0, 10),
    SMALL("малая", 0, 25),
    MIDDLE("средняя", 25, 50),
    BIG("большая", 50, 80),
    ESPECIALLY_BIG("особо большая", 80, 120);
    private double capacityUpTo;
    private double capacityFrom;
    private String busCapacity;

    Capacity(String busCapacity, double capacityFrom, double capacityUpTo) {
        this.capacityFrom = capacityFrom;
        this.capacityUpTo = capacityUpTo;
        this.busCapacity = busCapacity;
    }
    public String getBusCapacity() {
        return busCapacity;
    }

    public void setBusCapacity(String busCapacity) {
        this.busCapacity = busCapacity;
    }

    public double getCapacityFrom() {
        return capacityFrom;
    }

    public void setCapacityFrom(double capacityFrom) {
        if (capacityFrom <= 0 ){
            System.out.println(getBusCapacity()  + ": " + "до " + getCapacityFrom());
        }
        this.capacityFrom = capacityFrom;
    }

    public double getCapacityUpTo() {
        return capacityUpTo;
    }

    public void setCapacityUpTo(double capacityUpTo) {
        if (capacityFrom >= 15 ){
            System.out.println(getBusCapacity() + ": " + "до " + getCapacityUpTo());
        }
        this.capacityUpTo = capacityUpTo;
    }

    @Override
    public String toString() {
        return getBusCapacity() + ": " +
                "нижняя граница = " + getCapacityFrom() +
                ", верхняя граница = " + getCapacityUpTo() + " мест";
    }
}
