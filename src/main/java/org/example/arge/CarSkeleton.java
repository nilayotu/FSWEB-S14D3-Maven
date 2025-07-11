package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public CarSkeleton() {
    }

    public CarSkeleton(String description, String name) {
        this.description = description;
        this.name = name;
    }

    public String startEngine(){
        System.out.println("Class name: " + getClass().getSimpleName());
        return getName() + " starting engine";
    }

    protected void runEngine(CarSkeleton carSkeleton){

    }

    public String drive(){
        runEngine(this);
        return getName() + " is driving";
    }
}
