package Transport;

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
                ", водительские права категории: " + aDriversLicense +
                ", опыт вождения :" + experience;
    }

    public abstract void startMoving();
    public abstract void finishTheMovement();
    public abstract void refuelTheCar();
}