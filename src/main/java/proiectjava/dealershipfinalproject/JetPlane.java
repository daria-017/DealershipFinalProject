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
public class Jetplane extends Vehicle {
    private int maxAltitude; // Altitudine maximă in metri
    private int maxRange;    // Distanța maximă (în kilometri)
    private int maxSpeed;    // Viteza maximă (în km/h)
    private int engineCycles;         // Număr de cicluri ale motorului
    private boolean militaryAircraft; // Este avion militar sau nu
    private boolean luggageCapacity;  // Are capacitate pentru bagaje?
    private boolean highSpeed;        // Este un avion de mare viteză?
    private String propulsionSystem;  // Tipul sistemului de propulsie
    
    

    
    public Jetplane() {
        super();
        this.maxAltitude = 0;
        this.maxRange = 0;
        this.maxSpeed = 0;
        this.engineCycles = 0;
        this.militaryAircraft = false;
        this.luggageCapacity = false;

        this.highSpeed = false;
        this.propulsionSystem = "unknown";

   
    }    
   
    public Jetplane(int id, String brand, String model, short year, Color color, double price, int weight,  Engine engine,Transmission transmission, ImageIcon photo, int maxAltitude, int maxRange, int maxSpeed,
                    boolean militaryAircraft, boolean luggageCapacity, String propulsionSystem, boolean highSpeed,
                    int engineCycles) {
        super(id, brand, model, year, color, price, weight, engine, transmission, photo);
        this.maxAltitude = maxAltitude;
        this.maxRange = maxRange;
        this.maxSpeed = maxSpeed;
        this.militaryAircraft = militaryAircraft;
        this.luggageCapacity = luggageCapacity;
        this.propulsionSystem = propulsionSystem;
        this.highSpeed = highSpeed;
        this.engineCycles = engineCycles;
      
    }

   
    public Jetplane(Jetplane jetplane) {
        super(jetplane);
        this.maxAltitude = jetplane.maxAltitude;
        this.maxRange = jetplane.maxRange;
        this.maxSpeed = jetplane.maxSpeed;
        this.militaryAircraft = jetplane.militaryAircraft;
        this.luggageCapacity = jetplane.luggageCapacity;
        this.propulsionSystem = jetplane.propulsionSystem;
        this.highSpeed = jetplane.highSpeed;
        this.engineCycles = jetplane.engineCycles;

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

    public boolean isMilitaryAircraft() {
        return militaryAircraft;
    }

    public void setMilitaryAircraft(boolean militaryAircraft) {
        this.militaryAircraft = militaryAircraft;
    }

    public boolean hasLuggageCapacity() {
        return luggageCapacity;
    }

    public void setLuggageCapacity(boolean luggageCapacity) {
        this.luggageCapacity = luggageCapacity;
    }

    public String getPropulsionSystem() {
        return propulsionSystem;
    }

    public void setPropulsionSystem(String propulsionSystem) {
        this.propulsionSystem = propulsionSystem;
    }

    public boolean isHighSpeed() {
        return highSpeed;
    }

    public void setHighSpeed(boolean highSpeed) {
        this.highSpeed = highSpeed;
    }

    public int getEngineCycles() {
        return engineCycles;
    }

    public void setEngineCycles(int engineCycles) {
        this.engineCycles = engineCycles;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    // Suprascrierea metodei toString()
    @Override
     public String toString() {
        return "JetPlane "+super.toString()+"max altitude: "+maxAltitude+" max range: "+maxRange+" max speed: "+maxSpeed+" engine cycles: "+engineCycles+
                "military aircraft:"+militaryAircraft+" luggage capacity: "+luggageCapacity+" high speed: "+highSpeed+" propulsion system: "+propulsionSystem;
    }

}

