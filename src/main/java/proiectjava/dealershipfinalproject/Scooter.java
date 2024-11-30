/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiectjava.dealershipfinalproject;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author hcosm
 */
public class Scooter extends Vehicle{
    String type;
    boolean abs;
    boolean offroad;
    boolean sport;
    int topSpeed;
    
            public Scooter() 
        {
         super();
        this.type = "Unknown";
        this.abs = false;
        this.offroad = false;
        this.sport = false;
        this.topSpeed = 0;
    }
            
        public Scooter(int id, String brand, String model,short year, Color color, double price,int weight, Engine engine, Transmission transmission, ImageIcon photo,
                String type, boolean abs, boolean offroad, boolean sport, int topSpeed) 
        {
          super(id, brand,model,year,color,price,  weight,  engine, transmission,  photo);
        this.type = type;
        this.abs = abs;
        this.offroad = offroad;
        this.sport = sport;
        this.topSpeed = topSpeed;
    }
        Scooter(Scooter copy)
        {
         super(copy);
        this.type = copy.type;
        this.abs = copy.abs;
        this.offroad = copy.offroad;
        this.sport = copy.sport;
        this.topSpeed = copy.topSpeed;
        }
    public String getType() {
        return type;
    }

    public boolean isAbs() {
        return abs;
    }

    public boolean isOffroad() {
        return offroad;
    }

    public boolean isSport() {
        return sport;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public void setOffroad(boolean offroad) {
        this.offroad = offroad;
    }

    public void setSport(boolean sport) {
        this.sport = sport;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }



    @Override
    public String toString() {
        return  super.toString()+"Scooter{" + "type=" + type + ", abs=" + abs + ", offroad=" + offroad + ", sport=" + sport + ", topSpeed=" + topSpeed + '}';
    }

        public boolean respectaCerinta(boolean offroad,short year)
    {
        return offroad==offroad && year<this.getYear();
    }

}
