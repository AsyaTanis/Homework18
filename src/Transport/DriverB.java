package Transport;

public class DriverB < T extends PassengerCars > extends  Driver{
    public DriverB(String name, Boolean aDriversLicense, Integer experience) {
        super(name, aDriversLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории В " + getName() + " начал движение");
    }

    @Override
    public void finishTheMovement() {
        System.out.println("Водитель категории В " + getName() + " остановился");
    }

    @Override
    public void refuelTheCar() {
        System.out.println("Водитель категории В " + getName() + " на заправке");
    }
    public  String getPrintInfo(T transport) {
        return "Водитель "+ transport.getDriver().getName()+ " управляет автомобилем "+ transport.getBrand() +" "+transport.getModel()+ " и будет участвовать в заезде";
    }
}