package com.ps;
import java.util.ArrayList;
import java.util.Scanner;


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
                break;
            case 3:
                break;

            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                DealershipFileManager.getDealership();
                break;
            case 8:
                break;
            case 9:
                break;
        }



    }
    private static void processGetByPrice(){

    }

}
