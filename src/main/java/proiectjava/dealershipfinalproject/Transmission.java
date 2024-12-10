/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiectjava.dealershipfinalproject;

/**
 *
 * @author aa437
 */
public class Transmission {
    private String type;
    private int numberOfGears;
        
    public Transmission() {
        this("", 0);
    }
    
    public Transmission(String type, int numberOfGears) {
        this.type = type;
        this.numberOfGears = numberOfGears;
    }
    
    public Transmission(Transmission transmission) {
        this.type = transmission.type;
        this.numberOfGears = transmission.numberOfGears;
    }
    
    // Setter:
    public void setType(String type) {
        this.type = type;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }
    
    // Getter:
    public String getType() {
        return this.type;
    }

    public int getNumberOfGears() {
        return this.numberOfGears;
    }
    
    // toString method:
    @Override
    public String toString() {
       return "\nType: " + this.type + "\nNumber of Gears: " + this.numberOfGears;
    }
}













