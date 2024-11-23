/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiectjava.dealershipfinalproject;
import javax.swing.ImageIcon;
import java.awt.Color;
/**
 *
 * @author hcosm
 */
public class Drone extends Vehicle {

    private int engineCycles;
    private boolean surveillance;
    private String size;
    private boolean magnetometer;
    private int numberOfSensors;
    
    public Drone() {
        super();
        this.engineCycles = 0;
        this.surveillance = false;
        this.size = "Unknown";
        this.magnetometer = false;
        this.numberOfSensors = 0;
    }

    public Drone(int id,String brand, String model,short year,Color color, double price,int weight,Engine engine,Transmission transmission,
            ImageIcon photo,int engineCycles, boolean surveillance, String size, boolean magnetometer, int numberOfSensors) {
        super(id, brand, model,year, color, price, weight, engine, transmission, photo);
        this.engineCycles = engineCycles;
        this.surveillance = surveillance;
        this.size = size;
        this.magnetometer = magnetometer;
        this.numberOfSensors = numberOfSensors;
    }
    public Drone(Drone copy)
    {
    super(copy);
          this.engineCycles = copy.engineCycles;
        this.surveillance = copy.surveillance;
        this.size = copy.size;
        this.magnetometer = copy.magnetometer;
        this.numberOfSensors = copy.numberOfSensors;
    }
    public int getEngineCycles() {
        return engineCycles;
    }

    public boolean isSurveillance() {
        return surveillance;
    }

    public String getSize() {
        return size;
    }

    public boolean isMagnetometer() {
        return magnetometer;
    }

    public int getNumberOfSensors() {
        return numberOfSensors;
    }

    public void setEngineCycles(int engineCycles) {
        this.engineCycles = engineCycles;
    }

    public void setSurveillance(boolean surveillance) {
        this.surveillance = surveillance;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setMagnetometer(boolean magnetometer) {
        this.magnetometer = magnetometer;
    }

    public void setNumberOfSensors(int numberOfSensors) {
        this.numberOfSensors = numberOfSensors;
    }

    @Override
    public String toString() {
        return super.toString()+"Drone{" + "engineCycles=" + engineCycles + ", surveillance=" + surveillance + ", size=" + size + ", magnetometer=" + magnetometer + ", numberOfSensors=" + numberOfSensors + '}';
    }


}