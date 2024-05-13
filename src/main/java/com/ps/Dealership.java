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

    public static Object getVehiclesByPrice(double price){
        return null;
    }
    public static Object getVehiclesByMakeModel(String make, String model){
        return null;
    }
    public static Object getVehiclesByYear(int year){
        return null;
    }
    public static Object getVehiclesByColor(String color){
        return null;
    }
    public static Object getVehiclesByMilage(int odometer){
        return null;
    }
    public static Object getVehiclesByType(String vehicleType){
        return null;
    }
    public ArrayList <Vehicle> showAllVehicles(){
        return this.inventory;
    }

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
