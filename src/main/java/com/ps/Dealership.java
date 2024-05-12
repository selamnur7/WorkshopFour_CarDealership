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

    public Object getVehiclesByPrice(double price){
        return null;
    }
    public Object getVehiclesByMakeModel(String make, String model){
        return null;
    }
    public Object getVehiclesByYear(int year){
        return null;
    }
    public Object getVehiclesByColor(String color){
        return null;
    }
    public Object getVehiclesByMilage(int odometer){
        return null;
    }
    public Object getVehiclesByType(String vehicleType){
        return null;
    }
    public ArrayList <Vehicle> showAllVehicles(){
        return this.inventory;
    }
}
