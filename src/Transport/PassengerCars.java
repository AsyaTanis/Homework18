package Transport;

public class PassengerCars extends Transport <DriverB>  {

    public PassengerCars(String brand, String model, Double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
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
}
enum bodyType{
    SEDAN("Седан"),
    HATCHBACK("Хэтчбэк"),
    COUPLE("Купе"),
    STATIONWAGON("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    private String type;
    bodyType(String type) {
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
        return "Тип кузова " + getType() +": " +
                "Название типа кузова на русском языке '" + type + "'";
    }

}