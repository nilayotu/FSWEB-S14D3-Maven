package org.example.arge;

public class GasPoweredCar extends CarSkeleton{

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description, String name, double avgKmPerLitre, int cylinders) {
        super(description, name);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String drive() {
        return "run from GasPowered car";
    }

    @Override
    public String startEngine() {
        runEngine(this);
        return getName() + " car is starting";
    }
}
