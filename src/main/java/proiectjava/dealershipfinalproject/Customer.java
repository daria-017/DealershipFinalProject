/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiectjava.dealershipfinalproject;
import java.util.ArrayList;
/**
 *
 * @author hcosm
 */
public class Customer {
   String forename;
    String surname;
    int phoneNumber;
    ArrayList<Vehicle> vehicles;

    public Customer() {
        this("", "", 0, null);
    }
    
    public Customer(String forename, String surname, int phoneNumber, ArrayList<Vehicle> vehicles) {
        this.forename = forename;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.vehicles = vehicles;
    }
    
    public Customer(Customer customer) {
        this.forename = customer.forename;
        this.surname = customer.surname;
        this.phoneNumber = customer.phoneNumber;
        this.vehicles = customer.vehicles;
    }
    
    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }
    
    public String getForename() {
        return forename;
    }

    public String getSurname() {
        return surname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
    
    @Override
    public String toString() {
        return "Customer{" + "forename=" + this.forename + ", surname=" + this.surname + ", phoneNumber=" + this.phoneNumber + ", vehicles=" + this.vehicles + '}';
    }
 
    
}
