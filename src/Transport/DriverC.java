package Transport;

public class DriverC < T extends Buses> extends  Driver{
    public DriverC(String name, Boolean aDriversLicense, Integer experience) {
        super(name, aDriversLicense, experience);
    }
    @Override
    public void startMoving() {
        System.out.println("Водитель категории С " + getName() + " начал движение");
    }

    @Override
    public void finishTheMovement() {
        System.out.println("Водитель категории С " + getName() + " остановился");
    }

    @Override
    public void refuelTheCar() {
        System.out.println("Водитель категории С " + getName() + " на заправке");
    }
    public  String getPrintInfo(T transport) {
        return "Водитель "+ transport.getDriver().getName()+ " управляет автомобилем "+ transport.getBrand() +" "+ transport.getModel()+" и будет участвовать в заезде";
    }


}