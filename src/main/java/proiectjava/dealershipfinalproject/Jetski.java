/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiectjava.dealershipfinalproject;
/**
 *
 * @author Raul
 */

import javax.swing.ImageIcon;
import java.awt.Color;

public class Jetski extends Vehicle{
    private int nauticalMiles;
    private boolean handlebars;
    private String propulsionSystem;

    public Jetski(){
        super();
        this.nauticalMiles=0;
        this.handlebars=false;
        this.propulsionSystem="";
    }
    
    public Jetski(int id,String brand, String model,short year,Color color, double price,int weight,Engine engine,Transmission transmission,
            ImageIcon photo,int nauticalMiles, boolean handlebars, String propulsionSystem) {
        super(id, brand, model,year, color, price, weight, engine, transmission, photo);
        this.nauticalMiles = nauticalMiles;
        this.handlebars = handlebars;
        this.propulsionSystem = propulsionSystem;
    }

    public int getNauticalMiles() {
        return nauticalMiles;
    }

    public void setNauticalMiles(int nauticalMiles) {
        this.nauticalMiles = nauticalMiles;
    }

    public boolean isHandlebars() {
        return handlebars;
    }

    public void setHandlebars(boolean handlebars) {
        this.handlebars = handlebars;
    }

    public String getPropulsionSystem() {
        return propulsionSystem;
    }

    public void setPropulsionSystem(String propulsionSystem) {
        this.propulsionSystem = propulsionSystem;
    }

    public Jetski(Jetski jetski) {
        super(jetski);
        this.nauticalMiles = jetski.nauticalMiles;
        this.handlebars = jetski.handlebars;
        this.propulsionSystem = jetski.propulsionSystem;
    }
    
    @Override
    public String toString() {
        return super.toString()+"Jetski{" + "nauticalMiles=" + nauticalMiles + ", handlebars=" + handlebars + ", propulsionSystem=" + propulsionSystem + '}';
    }
    public boolean respectaCerinta(int nauticalMiles, boolean handlebars)
    {
        if(this.nauticalMiles < nauticalMiles && this.handlebars == handlebars)
            return true;
        else return false;
    }
}