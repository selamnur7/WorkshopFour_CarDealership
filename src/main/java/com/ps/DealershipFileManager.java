package com.ps;

import java.io.*;

public class DealershipFileManager {

    public static void getDealership(){
        try{
            BufferedReader bufReader = new BufferedReader(new FileReader("DealershipInventory"));
            int lineCounter = 0;
            String input;
            while ((input = bufReader.readLine()) != null) {
                if (lineCounter == 0) {
                    String[] dealershipSplitLine = input.split("\\|");
                    String name = dealershipSplitLine[0];
                    String address = dealershipSplitLine[1];
                    String phone = dealershipSplitLine[2];
                    Dealership dealership = new Dealership(name, address, phone);
                    System.out.println(dealership);
                    lineCounter++;

                } else {
                    String[] vehicleSplitLine = input.split("\\|");
                    int vin = Integer.parseInt(vehicleSplitLine[0]);
                    int year = Integer.parseInt(vehicleSplitLine[1]);
                    String make = vehicleSplitLine[2];
                    String model = vehicleSplitLine[3];
                    String vehicleType = vehicleSplitLine[4];
                    String color = vehicleSplitLine[5];
                    int odometer = Integer.parseInt(vehicleSplitLine[6]);
                    double price = Double.parseDouble(vehicleSplitLine[7]);
                    Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                    System.out.println(vehicle);
                    lineCounter++;

                }
            }


        } catch (IOException e){
            e.printStackTrace();
        }

    }
    public static void writeToFile(String path, String str) {
        try {

            BufferedWriter bufWriter = new BufferedWriter(new FileWriter(path, true));
            bufWriter.write(str);
            bufWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
