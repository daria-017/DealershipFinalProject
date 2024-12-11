/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiectjava.dealershipfinalproject;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author aa437
 */
public class Motorcycle extends Vehicle {
    private int mileage, topSpeed;
    private boolean abs, sport;
    private String type; // Crossroad, Speed etc.

    public Motorcycle() {
        super();
        this.mileage = 0;
        this.topSpeed = 0;
        this.abs = false;
        this.sport = false;
        this.type = "";
    }

    public Motorcycle(int id,String brand, String model,short year,Color color, double price,int weight,Engine engine,Transmission transmission,
            ImageIcon photo, int mileage, int topSpeed, boolean abs, boolean sport, String type) {
        super(id, brand, model,year, color, price, weight, engine, transmission, photo);
        this.mileage = mileage;
        this.topSpeed = topSpeed;
        this.abs = abs;
        this.sport = sport;
        this.type = type;
    }
    
    public Motorcycle(Motorcycle motorcycle) {
        super(motorcycle);
        this.mileage = motorcycle.mileage;
        this.topSpeed = motorcycle.topSpeed;
        this.abs = motorcycle.abs;
        this.sport = motorcycle.sport;
        this.type = motorcycle.type;
    }
    
    // Setter:
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public void setSport(boolean sport) {
        this.sport = sport;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    // Getter:
    public int getMileage() {
        return this.mileage;
    }

    public int getTopSpeed() {
        return this.topSpeed;
    }

    public boolean isAbs() {
        return this.abs;
    }

    public boolean isSport() {
        return this.sport;
    }

    public String getType() {
        return this.type;
    }
    
    // respectaCerinta() method:
    public boolean respectaCerinta(boolean abs, int mileage) {
        return this.abs == abs && this.mileage < mileage;
    }
    
    // toString method:
    @Override
    public String toString() {
        return super.toString() + "\n\n> Motorcycle Specifications" + "\nMileage: " + this.mileage + "\nTopSpeed: " + this.topSpeed + "\nAbs: " + (this.abs ? "Yes" : "No") + "\nSport: " + (this.sport ? "Yes" : "No") + "\nType: " + this.type;
    }
}
