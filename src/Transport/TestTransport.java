package Transport;

public class TestTransport extends  Driver {

    public TestTransport(String name, Boolean aDriversLicense, Integer experience) {
        super(name, aDriversLicense, experience);
    }

    @Override
    public void startMoving() {

    }

    @Override
    public void finishTheMovement() {

    }

    @Override
    public void refuelTheCar() {

    }

    public static void main(String[] args) {
        DriverB B1 = new DriverB("Романов Иван Федорович", true, 2);

        PassengerCars passengerCar = new PassengerCars("Benz", "001", 1.3, B1);

        DriverC C2 = new DriverC("Малинов Кирилл Викторович", true, 13);

        Buses theBuses2 = new Buses("Scania", "002", 8.1, C2);

        DriverD D3 = new DriverD("Григорьев Сергей Александрович", true, 27);

        Trucks trucks3 = new Trucks("ЗИЛ", "004", 12.1, D3);

        System.out.println(B1.getPrintInfo(passengerCar));

        System.out.println(C2.getPrintInfo(theBuses2));

        System.out.println(D3.getPrintInfo(trucks3));

        System.out.println();

        for (bodyType Type : bodyType.values()) {
            System.out.println(Type.toString());
        }
        System.out.println();
        for (LoadCapacity capacity : LoadCapacity.values()) {
            System.out.println(capacity.toString());
        }
        System.out.println();
        for (Capacity busCapacity : Capacity.values()) {
            System.out.println(busCapacity.toString());
        }
        System.out.println();
    }
}