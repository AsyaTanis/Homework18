package Transport;

public class Trucks extends Transport <DriverD> implements Competing{
    private final LoadCapacity loadType;

    public Trucks(String brand, String model, Double engineVolume, DriverD driver, LoadCapacity loadType) {
        super(brand, model, engineVolume, driver);
        this.loadType = loadType;
    }

    public LoadCapacity getLoadType() {
        return loadType;
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик марки " + getBrand() + " на пит - стопе ");
    }
    @Override
    public void bestLapTime() {
        int minTime = 6;
        int maxTime = 17;
        int lapTime = (int) (Math.random()*((maxTime-minTime)+2));
        System.out.println("Лучшее время круга грузового автомобиля " + lapTime + " минут");
    }
    @Override
    public void maximumSpeed() {
        int minSpeed = 50;
        int maxSpeed = 130;
        int lapTime = (int) (Math.random()*((maxSpeed-minSpeed)+11));
        System.out.println("Максимальная скорость грузового автомобиля " + lapTime + "км/ч");
    }
    @Override
    public  void startMoving() {
        System.out.println("Грузовой автомобиль " + getBrand()+ " начал движение");
    }
    @Override
    public  void finishTheMovement() {
        System.out.println("Грузовой автомобиль " + getBrand()+ " закончил движение");
    }

    @Override
    public void getType() {
    }

    @Override
    public void printType()
    {
        if (loadType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(Type.Trucks);
            System.out.println(getLoadType().toString());
        }
    }
}
    enum LoadCapacity{
        N1 ("N1",null,3.5f),
        N2 ("N2",3.5f,12f),
        N3 ("N3",12f,15f);

        private Float weightFrom;
        private Float weightUpTo;
        private String capasity;

        LoadCapacity(String capasity, Float weightFrom, Float weightUpTo) {
            this.weightFrom = weightFrom;
            this.weightUpTo = weightUpTo;
            this.capasity = capasity;
        }

        public String getCapasity() {
            return capasity;
        }

        public void setCapasity(String capasity) {
            this.capasity = capasity;
        }

        public Float getWeightFrom() {
            return weightFrom;
        }

        public void setWeightFrom(Float weightFrom) {
            if (weightFrom <= 0 ){
                System.out.println(getCapasity() + ": " + "до " + getWeightFrom());
            }
            this.weightFrom = weightFrom;
        }

        public Float getWeightUpTo() {
            return weightUpTo;
        }

        public void setWeightUpTo(Float weightUpTo) {
            if (weightFrom >= 15 ){
                System.out.println(getCapasity() + ": " + "до " + getWeightUpTo());
            }
            this.weightUpTo = weightUpTo;
        }

            @Override
            public String toString() {
                return (getWeightFrom() == null) ? " Грузоподъемность до " + getWeightUpTo() + " тонн"
                        : " Грузоподъемность от " + getWeightFrom() + " тонн " + ((getWeightUpTo() == null) ? ""
                        : "до " + getWeightUpTo() + " тонн");
            }
        }
