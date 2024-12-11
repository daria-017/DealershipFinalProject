/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiectjava.dealershipfinalproject;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Daria
 */
//modificare


public class Helicopter extends Vehicle {
    private int maxAltitude; // Altitudine maximă in metri
    private int maxRange;    // Distanța maximă (în kilometri)
    private int maxSpeed;    // Viteza maximă (în km/h)
    private int engineCycles;      // Număr de cicluri ale motorului
    String rotorType;

    
    public Helicopter() {
        super();
        this.maxAltitude = 0;
        this.maxRange = 0;
        this.maxSpeed = 0;
        this.engineCycles = 0;
        this.rotorType=rotorType;
    }

    
    public Helicopter(int id, String brand, String model, short year, Color color, double price, int weight,  Engine engine,Transmission transmission, ImageIcon photo
            , int maxAltitude, int maxRange, int maxSpeed,
                       int engineCycles, String rotorType) {
        super(id, brand, model, year, color, price, weight, engine, transmission, photo);
        this.maxAltitude = maxAltitude;
        this.maxRange = maxRange;
        this.maxSpeed = maxSpeed;
        this.engineCycles = engineCycles;
        this.rotorType=rotorType;
    }

    
    public Helicopter(Helicopter other) {
        super(other);
        this.maxAltitude = other.maxAltitude;
        this.maxRange = other.maxRange;
        this.maxSpeed = other.maxSpeed;
        this.engineCycles = other.engineCycles;
        this.rotorType=other.rotorType;
    }

    // Getters și Setters
    public int getMaxAltitude() {
        return maxAltitude;
    }

    public void setMaxAltitude(int maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(int maxRange) {
        this.maxRange = maxRange;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    public int getEngineCycles() {
        return engineCycles;
    }

    public void setEngineCycles(int engineCycles) {
        this.engineCycles = engineCycles;
    }



  
    @Override
     public String toString() {
        return "\nHelicopter "+super.toString()+"\nmax altitude: "+maxAltitude+"\nmax range: "+maxRange+"\nmax speed: "+maxSpeed+"\nengine cycles: "+engineCycles+"\nrotor yype: "+rotorType;
    }
     
     //functie
    public boolean canFlyToLocation(int requiredRange, int requiredAltitude) {
        if(this.maxRange >= requiredRange && this.maxAltitude >= requiredAltitude){
            return true;
        }else{
            return false;
        }
    }
}

