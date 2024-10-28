package com.pluralsight.car.dealership;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    Dealership dealership;
    static Scanner scanner = new Scanner(System.in);
    public void display(){
     init();
     String choice;

     do {
         displayDealershipMenu();
         choice = usersMenuInput(scanner);

         switch (choice.toLowerCase()){
             case "1":
                 processGetAllVehiclesRequest();
                 break;
             case "2":
                 processGetByPriceRequest();
                 break;
             case "3":
                 System.out.println("Find Vehicles by make / model");
                 break;
             case "4":
                 System.out.println("Find vehicles by color");
                 break;
             case "5":
                 System.out.println("Find vehicles by mileage range");
                 break;
             case "6":
                 System.out.println("Find vehicles by type (car, truck, SUV, van)");
                 break;
             case "7":
                 System.out.println("Find vehicles by year range");
                 break;
             case "8":
                 System.out.println("Add a vehicle");
                 break;
             case "9":
                 System.out.println("Remove a vehicle");
                 break;
             case "x":
                 System.out.println("Quit");
                 break;
             default:
                 System.out.println("Invalid input try again.");
         }

     } while (!choice.equalsIgnoreCase("x"));
     scanner.close();
    }

    private void init(){
        DealershipFileManager fileManager = new DealershipFileManager();
        this.dealership = fileManager.getDealership();

        if(this.dealership != null){
            System.out.println("dealership loaded");
        } else {
            System.out.println("dealership not loaded, check file");
        }
    }

    private String usersMenuInput( Scanner scanner) {
        System.out.print("Enter your command: ");
        return scanner.nextLine().trim();
    }

    private String promptMethod(String prompt){
        System.out.println(prompt);
        return scanner.nextLine().trim();
    }

    private void displayDealershipMenu() {
        System.out.println("""
                1 ) List all Vehicles
                2 ) Find Vehicles Within a Price Range
                3 ) Find Vehicles by make / model
                4 ) Find vehicles by color
                5 ) Find vehicles by mileage range
                6 ) Find vehicles by type (car, truck, SUV, van)
                7 ) Find vehicles by year range
                8 ) Add a vehicle
                9 ) Remove a vehicle
                x ) Quit
                """);
    }

    private void displayVehicles(ArrayList<Vehicle> inventory){
        for (Vehicle v : inventory){
            System.out.println(v);
        }
    }

    public void processGetByPriceRequest(){
        int min = Integer.parseInt(promptMethod("Enter minimum Value"));
        int max = Integer.parseInt(promptMethod("Enter maximum Value"));

        ArrayList<Vehicle> vehicles = this.dealership.getVehiclesByPrice(min,max);
        displayVehicles(vehicles);
    }

    public void processGetByMakeModelRequest(){

    }

    public void processGetByYearRequest(){

    }

    public void processGetByColorRequest(){

    }

    public void processGetByMileageRequest(){

    }

    public void processGetByVehicleTypeRequest(){

    }

    public void processGetAllVehiclesRequest(){
        if(dealership != null) {
            ArrayList<Vehicle> vehicles = this.dealership.getAllVehicles();
            displayVehicles(vehicles);
        }
        else{
            System.out.println("This dealership is empty.");
        }
    }

    public void processAddVehicleRequest(){

    }

    public void processRemoveVehicleRequest(){

    }




}
