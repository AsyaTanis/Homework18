package Transport;
import java.util.Objects;
public abstract class Driver  {
    private String name;
    private Boolean aDriversLicense;
    private Integer experience;

    public Driver(String name, Boolean aDriversLicense, Integer experience) {
        this.name = name;
        this.aDriversLicense = aDriversLicense;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getaDriversLicense() {
        return aDriversLicense;
    }

    public void setaDriversLicense(Boolean aDriversLicense) {
        this.aDriversLicense = aDriversLicense;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public void nameOfTheDriver() {
        System.out.println("Водителя автомобиля зовут - " + getName());
    }

    @Override
    public String toString() {
        return
                "Имя - '" + name + '\'' +
                ", водительские права: " + aDriversLicense +
                ", опыт вождения: " + experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return Objects.equals(name, driver.name) && Objects.equals(aDriversLicense, driver.aDriversLicense) && Objects.equals(experience, driver.experience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, aDriversLicense, experience);
    }

    public abstract void startMoving();
    public abstract void finishTheMovement();
    public abstract void refuelTheCar();
}