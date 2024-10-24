package com.pluralsight.car.dealership;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phoneNumber;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phoneNumber, ArrayList<Vehicle> inventory) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.inventory = inventory;
    }

    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }

    public void getAllVehicles(){
        if(inventory.isEmpty()){
            System.out.println("No vehicles available at the moment.");
        } else {
            System.out.println("Vehicles available at " + name + ": ");
            for(Vehicle vehicle : inventory){
                System.out.println(vehicle);
            }
        }
    }

    public List<Vehicle> getVehiclesByPrice(int min, int max){
        return null;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model){
        return null;
    }

    public List<Vehicle> getVehiclesByYear(int min, int max) {
        return null;
    }

    public List<Vehicle> getVehiclesByColor(String color){
        return null;
    }

    public List<Vehicle> getVehiclesByMileage(int min, int max) {
        return null;
    }

    public List<Vehicle> getVehiclesByType(String vehicleType) {
        return null;
    }

    public void removeVehicle(Vehicle vehicle){

    }
}
