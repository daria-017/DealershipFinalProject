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
    private String category;        // Categoria avionului (business, comercial, etc.)

    
    public Airplane() {
        super();
        this.maxAltitude = 0;
        this.maxRange = 0;
        this.maxSpeed = 0;
        this.passengerCapacity = 0;

        this.category = "unknown";
    }

    
     public Airplane(int id, String brand, String model, short year, Color color, double price, int weight,  Engine engine,Transmission transmission, ImageIcon photo, int maxAltitude,
                    int maxRange, int maxSpeed, int passengerCapacity, String category
                    ) {
        super(id, brand, model, year, color, price, weight, engine, transmission, photo);
        this.maxAltitude = maxAltitude;
        this.maxRange = maxRange;
        this.maxSpeed = maxSpeed;
        this.passengerCapacity = passengerCapacity;

        this.category = category;
       
    }
    
    public Airplane(Airplane other) {
        super(other);
        this.maxAltitude = other.maxAltitude;
        this.maxRange = other.maxRange;
        this.maxSpeed = other.maxSpeed;
        this.passengerCapacity = other.passengerCapacity;

        this.category = other.category;
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


    



    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    
    @Override
    public String toString() {
        return "\nAirPlane "+super.toString()+"\nmax altitude: "+maxAltitude+"\nmax range: "+maxRange+"\nmax speed: "+maxSpeed+"\npassenger capacity: "+passengerCapacity+
                "\ncategory: "+category;
    }
    
    //functie
    public boolean canFlyToLocation(int requiredRange, int requiredPassengerCapacity) {
        if((this.maxRange >= requiredRange && this.maxRange<=requiredRange*100) || this.passengerCapacity != requiredPassengerCapacity){
            return true;
        }else{
            return false;
        }
    }
}