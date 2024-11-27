package proiectjava.dealershipfinalproject;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Daria
 */
public class Airplane extends Vehicle {
    private int maxAltitude; // Altitudine maximă in metri
    private int maxRange;    // Distanța maximă (în kilometri)
    private int maxSpeed;    // Viteza maximă (în km/h)
    private int passengerCapacity; // Număr de pasageri
    private int numberOfWings;     // Număr de aripi
    private int engineCycles;      // Număr de cicluri ale motorului
    private boolean luggageCapacity; // Are capacitate pentru bagaje?
    private boolean cargo;          // Este destinat transportului de mărfuri?
    private boolean highSpeed;      // Este un avion de mare viteză?
    private String category;        // Categoria avionului (business, comercial, etc.)

    
    public Airplane() {
        super();
        this.maxAltitude = 0;
        this.maxRange = 0;
        this.maxSpeed = 0;
        this.passengerCapacity = 0;
        this.numberOfWings = 0;
        this.engineCycles = 0;
        this.luggageCapacity = false;
        this.cargo = false;
        this.highSpeed = false;
        this.category = "unknown";
    }

    
     public Airplane(int id, String brand, String model, short year, Color color, double price, int weight,  Engine engine,Transmission transmission, ImageIcon photo, int maxAltitude,
                    int maxRange, int maxSpeed, int passengerCapacity, int numberOfWings, 
                    boolean luggageCapacity, boolean cargo, boolean highSpeed, String category,
                    int engineCycles) {
        super(id, brand, model, year, color, price, weight, engine, transmission, photo);
        this.maxAltitude = maxAltitude;
        this.maxRange = maxRange;
        this.maxSpeed = maxSpeed;
        this.passengerCapacity = passengerCapacity;
        this.numberOfWings = numberOfWings;
        this.luggageCapacity = luggageCapacity;
        this.cargo = cargo;
        this.highSpeed = highSpeed;
        this.category = category;
        this.engineCycles = engineCycles;
    }
    
    public Airplane(Airplane other) {
        super(other);
        this.maxAltitude = other.maxAltitude;
        this.maxRange = other.maxRange;
        this.maxSpeed = other.maxSpeed;
        this.passengerCapacity = other.passengerCapacity;
        this.numberOfWings = other.numberOfWings;
        this.luggageCapacity = other.luggageCapacity;
        this.cargo = other.cargo;
        this.highSpeed = other.highSpeed;
        this.category = other.category;
        this.engineCycles = other.engineCycles;
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

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getNumberOfWings() {
        return numberOfWings;
    }

    public void setNumberOfWings(int numberOfWings) {
        this.numberOfWings = numberOfWings;
    }

    public int getEngineCycles() {
        return engineCycles;
    }

    public void setEngineCycles(int engineCycles) {
        this.engineCycles = engineCycles;
    }

    public boolean hasLuggageCapacity() {
        return luggageCapacity;
    }

    public void setLuggageCapacity(boolean luggageCapacity) {
        this.luggageCapacity = luggageCapacity;
    }

    public boolean isCargo() {
        return cargo;
    }

    public void setCargo(boolean cargo) {
        this.cargo = cargo;
    }

    public boolean isHighSpeed() {
        return highSpeed;
    }

    public void setHighSpeed(boolean highSpeed) {
        this.highSpeed = highSpeed;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    
    @Override
    public String toString() {
        return "AirPlane "+super.toString()+"max altitude: "+maxAltitude+" max range: "+maxRange+" max speed: "+maxSpeed+" passenger capacity: "+passengerCapacity+
                "number of wings"+numberOfWings+" luggage capacity: "+luggageCapacity+" cargo: "+cargo+" high speed: "+highSpeed+" category: "+category;
    }
}