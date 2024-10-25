package com.pluralsight.car.dealership;

import java.io.BufferedReader;
import java.io.FileReader;

public class DealershipFileManager {
    static Dealership getDealership(){
        try {
            FileReader fileReader = new FileReader("src/main/resources/Data/inventory.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String input ;
            while((input = bufferedReader.readLine()) != null){
                System.out.println(input);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    static void saveDealership(Dealership dealerShip){

    }

}
