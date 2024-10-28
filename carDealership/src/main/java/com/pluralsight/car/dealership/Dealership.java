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

    public ArrayList<Vehicle> getAllVehicles(){
        if(inventory.isEmpty()){
            System.out.println("No vehicles available at the moment.");
        } else {
            System.out.println("Vehicles available at " + name + ": ");
            for(Vehicle vehicle : inventory){
                System.out.println(vehicle);
            }

        }
        return inventory;
    }

    public ArrayList<Vehicle> getVehiclesByPrice(int min, int max){
        ArrayList<Vehicle> filteredVehiclesByPrice = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getPrice() >= min && vehicle.getPrice() <= max) {
                filteredVehiclesByPrice.add(vehicle);
            }
        }

        return filteredVehiclesByPrice; // Return the filtered list
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

    @Override
    public String toString() {
        return String.format("Dealership: %s, Address: %s, Phone Number: %s \n Inventory: \n%s",
                name,address,phoneNumber,inventory);
    }
}
