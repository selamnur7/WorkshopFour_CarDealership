package com.ps;
import java.util.ArrayList;
import java.util.Scanner;

import static com.ps.Dealership.*;
import static com.ps.DealershipFileManager.writeToFile;


public class UserInterface {
    private ArrayList<Dealership> dealership = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void display() {

        init();
    }

    private static void init() {
        new DealershipFileManager();

        System.out.println("Good day!");
        System.out.println("What would you like to do?");
        System.out.println("1) Get vehicle by price:");
        System.out.println("2) Get vehicle by Make/Model:");
        System.out.println("3) Get vehicle by Year:");
        System.out.println("4) Get vehicle by Color:");
        System.out.println("5) Get vehicle by Mileage:");
        System.out.println("6) Get vehicle by Vehicle type:");
        System.out.println("7) Display all Vehicles:");
        System.out.println("8) Add a vehicle:");
        System.out.println("9) Remove a vehicle:");

        int mainMenu = scanner.nextInt();

        switch (mainMenu){
            case 1:
                processGetByPrice();
                break;
            case 2:
                processGetByMake();
                break;
            case 3:
                processGetByYear();
                break;

            case 4:
                processGetByColor();
                break;
            case 5:
                processGetByMileage();
                break;
            case 6:
                processGetByType();
                break;
            case 7:
                DealershipFileManager.getDealership();
                break;
            case 8:
                processAddVehicle();
                break;
            case 9:
                break;
        }



    }
    private static void processGetByPrice(){
        System.out.println("What is the price of the car? ");
        double userCarPrice = scanner.nextDouble();
        getVehiclesByPrice(userCarPrice);

    }
    private static void processGetByMake(){
        System.out.println("What is the Make of the car? ");
        String userCarMake = scanner.nextLine();
        getVehiclesByMake(userCarMake);
    }
    private static void processGetByModel(){
        System.out.println("What is the Model of the car? ");
        String userCarModel = scanner.nextLine();
        getVehiclesByModel(userCarModel);
    }
    private static void processGetByYear(){
        System.out.println("What is the year of the car? ");
        int userCarYear = scanner.nextInt();
        getVehiclesByYear(userCarYear);

    }
    private static void processGetByColor(){
        System.out.println("What is the color of the car? ");
        String userCarColor = scanner.nextLine();
        getVehiclesByColor(userCarColor);

    }
    private static void processGetByMileage(){
        System.out.println("What is the mileage of the car? ");
        int userCarMileage = scanner.nextInt();
        getVehiclesByMilage(userCarMileage);

    }
    private static void processGetByType(){
        System.out.println("What is the Type of the car? ");
        String userCarType = scanner.nextLine();
        getVehiclesByType(userCarType);

    }
    private static void processAddVehicle(){
        System.out.println("What is the vin of the car? ");
        int userNewCarVin = scanner.nextInt();

        System.out.println("What is the Make of the car? ");
        String userNewCarMake = scanner.nextLine();

        System.out.println("What is the Model of the car? ");
        String userCarModel = scanner.nextLine();

        System.out.println("What is the year of the car? ");
        int userCarYear = scanner.nextInt();

        System.out.println("What is the color of the car? ");
        String userCarColor = scanner.nextLine();

        System.out.println("What is the mileage of the car? ");
        int userCarMileage = scanner.nextInt();

        System.out.println("What is the Type of the car? ");
        String userCarType = scanner.nextLine();

        System.out.println("What is the price of the car? ");
        double userNewCarPrice = scanner.nextDouble();

        writeToFile("DealershipInventory.txt", String.format("\n%d|%s|%s|%d|%s|%d|%s|%d",
                userNewCarVin,
                userNewCarMake,
                userCarModel,
                userCarYear,
                userCarColor,
                userCarMileage,
                userCarType,
                userNewCarPrice));
    }



}
