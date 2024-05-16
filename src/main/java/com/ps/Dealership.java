package com.ps;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private String address;
    private String phone;

    ArrayList <Vehicle> inventory = new ArrayList<>();

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle){
        inventory.remove(vehicle);
    }

    public void getVehiclesByPrice(double userCarPrice){
        for (Vehicle vehicle : inventory) {
            if (vehicle.getPrice() == userCarPrice);
            System.out.println(vehicle);

        }
    }
    public void getVehiclesByMake(String make){
        for (Vehicle vehicle : inventory) {
            if (vehicle.getMake().equalsIgnoreCase(make));
            System.out.println(vehicle);

        }
    }
    public void getVehiclesByModel(String model){
        for (Vehicle vehicle : inventory) {
            if (vehicle.getModel().equalsIgnoreCase(model));
            System.out.println(vehicle);

        }
    }
    public void getVehiclesByYear(int year){
        for (Vehicle vehicle : inventory) {
            if (vehicle.getYear() == year);
            System.out.println(vehicle);

        }
    }
    public void getVehiclesByColor(String color){
        for (Vehicle vehicle : inventory) {
            if (vehicle.getColor().equalsIgnoreCase(color));
            System.out.println(vehicle);

        }
    }
    public void getVehiclesByMilage(int odometer){
        for (Vehicle vehicle : inventory) {
            if (vehicle.getOdometer() == odometer);
            System.out.println(vehicle);

        }
    }
    public void getVehiclesByType(String vehicleType){
        for (Vehicle vehicle : inventory) {
            if (vehicle.getVehicleType().equalsIgnoreCase(vehicleType));
            System.out.println(vehicle);

        }
    }
//    public ArrayList <Vehicle> showAllVehicles(){
//        return this.inventory;
//    }

    @Override
    public String toString() {
        return "Dealership{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", inventory=" + inventory +
                '}';
    }
}
