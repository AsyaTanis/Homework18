package Transport;

import java.util.*;

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

    public static void main(String[] args) throws Exception, TransportTypeException {
        Mechanic mechanic1 = new Mechanic("Мишин Федор", "Колесо");
        Mechanic mechanic2 = new Mechanic("Гришин Георгий", "Руль");
        Mechanic mechanic3 = new Mechanic("Иванов Олег", "Руль");
        Mechanic mechanic4 = new Mechanic("Ряушкин Геннадий", "Шина");

        DriverB B1 = new DriverB("Романов Иван Федорович", true,2);
        DriverB B2 = new DriverB("Романов Иван Федорович", true,3);
        DriverB B3 = new DriverB("Романов Иван Федорович", true,4);
        DriverB B4 = new DriverB("Романов Иван Федорович", true,5);
        PassengerCars passengerCar= new PassengerCars("Benz", "001",1.3,B1,List.of(mechanic1));
        PassengerCars passengerCar2 = new PassengerCars("Mazda", "002",1.2,B2,List.of(mechanic2));
        PassengerCars passengerCar3 = new PassengerCars("Mercedes", "003",1.1,B3,List.of(mechanic3));
        PassengerCars passengerCar4 = new PassengerCars("Mitsubishi", "004",0.9,B4,List.of(mechanic4));
        DriverC C1 = new DriverC("Малинов Кирилл Викторович", true,13);
        DriverC C2 = new DriverC("Малинов Кирилл Викторович", true,10);
        DriverC C3 = new DriverC("Малинов Кирилл Викторович", true,12);
        DriverC C4 = new DriverC("Малинов Кирилл Викторович", true,15);
        Buses theBuses = new Buses("Volvo","001",8.3,C1,List.of(mechanic1));
        Buses theBuses2 = new Buses("Scania","002",8.1,C2,List.of(mechanic2));
        Buses theBuses3 = new Buses("Nissan","003",8.2,C3,List.of(mechanic3));
        Buses theBuses4 = new Buses("Renault","004",8.4,C4,List.of(mechanic4));
        DriverD D1 = new DriverD("Григорьев Сергей Александрович", true,23);
        DriverD D2 = new DriverD("Григорьев Сергей Александрович", true,22);
        DriverD D3 = new DriverD("Григорьев Сергей Александрович", true,20);
        DriverD D4 = new DriverD("Григорьев Сергей Александрович", true,27);
        Trucks trucks = new Trucks("КамАЗ", "001",12.5,D1,List.of(mechanic1));
        Trucks trucks2 = new Trucks("ГАЗ", "002",12.4,D2,List.of(mechanic2));
        Trucks trucks3 = new Trucks("ЗИЛ", "004",12.1,D3,List.of(mechanic3));
        Trucks trucks4 = new Trucks("МАЗ", "005",12.2,D4,List.of(mechanic4));

        Map<PassengerCars, List<Mechanic>> mechanicLists = new HashMap<>();
        mechanicLists.put(new PassengerCars("Benz", "001",1.3,B1,List.of(mechanic1)), List.of(mechanic1));
        mechanicLists.put(new PassengerCars("Mazda", "002",1.2,B2, List.of(mechanic2)),List.of(mechanic2));
        mechanicLists.put(new PassengerCars("Mercedes", "003",1.1,B3, List.of(mechanic3)), List.of(mechanic3));
        mechanicLists.put(new PassengerCars("Mitsubishi", "004",0.9,B4, List.of(mechanic3)), List.of(mechanic4));
        for (Map.Entry<PassengerCars, List<Mechanic>> auto: mechanicLists.entrySet()) {
            System.out.println(auto.getKey() + ": " + auto.getValue());
        }

        System.out.println();

        System.out.println(B1.getPrintInfo(passengerCar));
        System.out.println(B2.getPrintInfo(passengerCar2));
        System.out.println(B3.getPrintInfo(passengerCar3));
        System.out.println(B4.getPrintInfo(passengerCar4));
        System.out.println(C1.getPrintInfo(theBuses));
        System.out.println(C2.getPrintInfo(theBuses2));
        System.out.println(C2.getPrintInfo(theBuses3));
        System.out.println(C3.getPrintInfo(theBuses4));
        System.out.println(D1.getPrintInfo(trucks));
        System.out.println(D2.getPrintInfo(trucks2));
        System.out.println(D3.getPrintInfo(trucks3));
        System.out.println(D4.getPrintInfo(trucks4));

        for (TypeOfBody typeOfBody : TypeOfBody.values()) {
            System.out.println(typeOfBody.getType());
        }
        System.out.println();
        for (Capacity capacity : Capacity.values()) {
            System.out.println(capacity.getCapacityFrom() + capacity.getCapacityUpTo());
        }
        System.out.println();
        for (LoadCapacity loadCapacity : LoadCapacity.values()) {
            System.out.println(loadCapacity.getWeightFrom()+ " - " + loadCapacity.getWeightUpTo());
        }

        System.out.println();
        passengerCar.passDiagnostics();
        trucks.passDiagnostics();

        try {
            theBuses.passDiagnostics();
        } catch (TransportTypeException e) {
            System.out.println("”Автобусы” диагностику проходить не должны");
        }
        List<Transport> list = new ArrayList<>();
        list.add(passengerCar);
        list.add(passengerCar2);
        list.add(passengerCar3);
        list.add(passengerCar4);
        list.add(theBuses);
        list.add(theBuses2);
        list.add(theBuses3);
        list.add(theBuses4);
        list.add(trucks);
        list.add(trucks2);
        list.add(trucks3);
        list.add(trucks4);

        System.out.println();

        passengerCar2.nameOfTheDriver();
        theBuses2.carMechanics();
        trucks.nameOfTheDriver();
        System.out.println();
        Queue<ServiceStation>queue = new LinkedList<>();
        queue.add(passengerCar);
        queue.add(passengerCar2);
        queue.add(passengerCar3);
        queue.add(passengerCar4);
        queue.add(trucks);
        queue.add(trucks2);
        queue.add(trucks3);
        queue.add(trucks4);


        Iterator<ServiceStation> iterator = queue.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

    }
}