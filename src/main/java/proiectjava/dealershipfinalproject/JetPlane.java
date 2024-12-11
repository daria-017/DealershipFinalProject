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
public class JetPlane extends Vehicle {
    private int maxAltitude; // Altitudine maximă in metri
    private int maxRange;    // Distanța maximă (în kilometri)
    private int maxSpeed;    // Viteza maximă (în km/h)
    private int engineCycles;         // Număr de cicluri ale motorului
    private String propulsionSystem;  // Tipul sistemului de propulsie
   
   
    
    

    
    public JetPlane() {
        super();
        this.maxAltitude = 0;
        this.maxRange = 0;
        this.maxSpeed = 0;
        this.engineCycles = 0;
        this.propulsionSystem=propulsionSystem;

   
    }    
   
    public JetPlane(int id, String brand, String model, short year, Color color, double price, int weight,  Engine engine,Transmission transmission, ImageIcon photo, int maxAltitude, int maxRange, int maxSpeed,
                    int engineCycles, String propulsionSystem) {
        super(id, brand, model, year, color, price, weight, engine, transmission, photo);
        this.maxAltitude = maxAltitude;
        this.maxRange = maxRange;
        this.maxSpeed = maxSpeed;
        this.engineCycles = engineCycles;
        this.propulsionSystem=propulsionSystem;
      
    }

   
    public JetPlane(JetPlane jetplane) {
        super(jetplane);
        this.maxAltitude = jetplane.maxAltitude;
        this.maxRange = jetplane.maxRange;
        this.maxSpeed = jetplane.maxSpeed;
        this.engineCycles = jetplane.engineCycles;
        this.propulsionSystem=jetplane.propulsionSystem;

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
        return "\nJetPlane "+super.toString()+"\nmax altitude: "+maxAltitude+"\nmax range: "+maxRange+"\nmax speed: "+maxSpeed+"\nengine cycles: "+engineCycles
                +"\npropulsion system: "+propulsionSystem;
    }
     
     //functie
    public boolean canFlyToLocation(int requiredRange, int requiredSpeed) {
        if(this.maxRange >= requiredRange && this.maxSpeed >= requiredSpeed){
            return true;
        }else{
            return false;
        }
    }

}

