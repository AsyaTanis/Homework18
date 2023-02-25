package Transport;

import java.util.List;

public class PassengerCars extends Transport <DriverB>  implements ServiceStation{

    public PassengerCars(String brand, String model, Double engineVolume, DriverB driver, List<Mechanic> mechanicLists) {
        super(brand, model, engineVolume, driver,mechanicLists);
    }

    @Override
    public void performMaintenance() {
        System.out.println("Провести техобслуживание" + getModel() + " " + getBrand());
    }

    @Override
    public String toString() {
        return "PassengerCar " +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", driver=" + driver +
                ", mechanicLists=" + mechanicLists;
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
    public void pitStop() {
        System.out.println("Легковой автомобиль марки " + getBrand() + " на пит - стопе");
    }
    @Override
    public void bestLapTime() {
        int minTime = 5;
        int maxTime = 15;
        int lapTime = (int) (Math.random()*((maxTime-minTime)+2));
        System.out.println("Лучшее время круга легкового автомобиля " + lapTime + " минут");
    }
    @Override
    public void maximumSpeed() {
        int minSpeed = 70;
        int maxSpeed = 260;
        int lapTime = (int) (Math.random()*((maxSpeed-minSpeed)+11));
        System.out.println("Максимальная скорость легкового автомобиля " + lapTime + "км/ч");
    }
    @Override
    public  void startMoving() {
        System.out.println("Легковой автомобиль " + getBrand()+ " начал движение");
    }
    @Override
    public  void finishTheMovement() {
        System.out.println("Легковой автомобиль " + getBrand()+ " закончил движение");
    }

    @Override
    public void getType() {
    }

    @Override
    public void printType() {
        System.out.println(Type.PassengerCars);
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
enum TypeOfBody{
    Sedan("Седан"),
    Hatchback("Хэтчбэк"),
    Coupe("Купе"),
    StationWagon("Универсал"),
    SUV("Внедорожник"),
    Crossover("Кроссовер"),
    PickupTruck("Пикап"),
    Van("Фургон"),
    Minivan("Минивэн");

    private String type;
    TypeOfBody(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "Тип кузова: " +
                "Название типа кузова на русском языке '" + type + '\'';
    }

}
