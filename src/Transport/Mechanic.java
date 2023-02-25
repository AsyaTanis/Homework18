package Transport;

import java.util.ArrayList;
import java.util.List;

public class Mechanic {
    public String name;
    public String employerCompany;

    public Mechanic(String name, String employerCompany) {
        this.name = name;
        this.employerCompany = employerCompany;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployerCompany() {
        return employerCompany;
    }

    public void setEmployerCompany(String employerCompany) {
        this.employerCompany = employerCompany;
    }

    public void performMaintenance() {
        System.out.println("Провести техобслуживание ");

    }
    public void fixTheCar() {
        System.out.println("Починить машину");

    }
    public void carMechanics() {
        System.out.println("Механики закрепленные за автомобилем : " + getName());
        System.out.println();
    }

    @Override
    public String toString() {
        return "\n" + "Механик: " +
                " Имя - '" + name + '\'' +
                ", трудится в компании : '" + employerCompany + '\'';
    }
}