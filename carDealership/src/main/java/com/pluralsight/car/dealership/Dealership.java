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
        noMatchCaseHandling(filteredVehiclesByPrice);

        return filteredVehiclesByPrice; // Return the filtered list
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model){
        ArrayList<Vehicle> filteredVehiclesByMakeModel = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model)){
                filteredVehiclesByMakeModel.add(vehicle);
            }
        }
        noMatchCaseHandling(filteredVehiclesByMakeModel);
        return filteredVehiclesByMakeModel;
    }

    public ArrayList<Vehicle> getVehiclesByYear(int min, int max) {
        ArrayList<Vehicle> filteredVehiclesByYear = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getYear() >= min && vehicle.getYear() <= max) {
                filteredVehiclesByYear.add(vehicle);
            }
        }
        noMatchCaseHandling(filteredVehiclesByYear);

        return filteredVehiclesByYear;

    }

    public ArrayList<Vehicle> getVehiclesByColor(String color){
        ArrayList<Vehicle> filteredVehiclesByColor = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if(vehicle.getColor().equalsIgnoreCase(color)){
                filteredVehiclesByColor.add(vehicle);
            }
        }
        noMatchCaseHandling(filteredVehiclesByColor);

        return filteredVehiclesByColor;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max) {
        ArrayList<Vehicle> filteredVehiclesByMileage = new ArrayList<>();
        for(Vehicle vehicle : inventory){
            if(vehicle.getOdometer() >= min && vehicle.getOdometer() <= max) {
                filteredVehiclesByMileage.add(vehicle);
            }
        }
        noMatchCaseHandling(filteredVehiclesByMileage);
        return filteredVehiclesByMileage;
    }

    public ArrayList<Vehicle> getVehiclesByType(String vehicleType) {
        ArrayList<Vehicle> filteredVehiclesByType = new ArrayList<>();
        for(Vehicle vehicle : inventory) {
            if(vehicle.getVehicleType().equalsIgnoreCase(vehicleType)){
                filteredVehiclesByType.add(vehicle);
            }
        }
        noMatchCaseHandling(filteredVehiclesByType);
        return filteredVehiclesByType;
    }

    public Vehicle findVehicleByVin(int vin){
        Vehicle vehicle = null;
        for(Vehicle v : inventory) {
            if(v.getVin() == vin) {
                vehicle = v;
            }
        }
        return vehicle;
    }

    public void removeVehicle(Vehicle v){

        inventory.remove(v);

    }

    public void noMatchCaseHandling(ArrayList<Vehicle> vehicles){
        if(vehicles.toArray().length < 1) {
            System.out.println("No matching vehicles.");
        }
    }

    @Override
    public String toString() {
        return String.format("Dealership: %s, Address: %s, Phone Number: %s \n Inventory: \n%s",
                name,address,phoneNumber,inventory);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ArrayList<Vehicle> getInventory() {
        return inventory;
    }
}
