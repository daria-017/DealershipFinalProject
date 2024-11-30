package proiectjava.dealershipfinalproject;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Dragos :>
 */
public class Boat extends Vehicle {

    private int nauticalMiles;
    private boolean gps;
    private double accelerationTime;
    private boolean sonar;
    private String propulsionType;

    Boat() {
        super();
        nauticalMiles = 0;
        gps = false;
        accelerationTime = 0;
        sonar = false;
        propulsionType = "<empty>";
    }

    Boat(int id, String brand, String model, short year, Color color, double price, int weight, Engine engine, Transmission transmission, ImageIcon photo,
            int nauticalMiles, boolean gps, double accelerationTime, boolean sonar, String propulsionType) {
        super(id, brand, model, year, color, price, weight, engine, transmission, photo);
        this.nauticalMiles = nauticalMiles;
        this.gps = gps;
        this.accelerationTime = accelerationTime;
        this.sonar = sonar;
        this.propulsionType = propulsionType;
    }

    Boat(Boat b) {
        super(b);
        this.nauticalMiles = b.nauticalMiles;
        this.gps = b.gps;
        this.accelerationTime = b.accelerationTime;
        this.sonar = b.sonar;
        this.propulsionType = b.propulsionType;
    }

    @Override
    public String toString() {
        return super.toString() + "Nautical Miles = " + nauticalMiles + ", GPS = " + gps + ", Acceleration Time = " + accelerationTime
                + ", Sonar = " + sonar + ", Propulsion Type = " + propulsionType;
    }

    public int getNauticalMiles() {
        return nauticalMiles;
    }

    public boolean getGps() {
        return gps;
    }

    public double getAccelerationTime() {
        return accelerationTime;
    }

    public boolean getSonar() {
        return sonar;
    }

    public String getPropulsionType() {
        return propulsionType;
    }

    public void setNauticalMiles(int nauticalMiles) {
        this.nauticalMiles = nauticalMiles;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public void setAccelerationTime(double accelerationTime) {
        this.accelerationTime = accelerationTime;
    }

    public void setSonar(boolean sonar) {
        this.sonar = sonar;
    }

    public void setPropulsionType(String propulsionType) {
        this.propulsionType = propulsionType;
    }

    public boolean respectaCerinta(boolean gps, double accelerationTime) {
        if (this.gps == gps && this.accelerationTime < accelerationTime) {
            return true;
        } else {
            return false;
        }
    }
}
