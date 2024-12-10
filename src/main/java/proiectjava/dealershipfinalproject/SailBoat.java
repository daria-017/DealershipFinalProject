package proiectjava.dealershipfinalproject;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Dragos :>
 */
public class SailBoat extends Vehicle {

    private int nauticalMiles;
    private boolean gps;
    private double accelerationTime;
    private boolean sonar;
    private boolean hasLifeBuoy;

    SailBoat() {
        super();
        nauticalMiles = 0;
        gps = false;
        accelerationTime = 0;
        sonar = false;
        hasLifeBuoy = false;
    }

    SailBoat(int id, String brand, String model, short year, Color color, double price, int weight, Engine engine, Transmission transmission, ImageIcon photo,
            int nauticalMiles, boolean gps, double accelerationTime, boolean sonar, boolean hasLifeBuoy) {
        super(id, brand, model, year, color, price, weight, engine, transmission, photo);
        this.nauticalMiles = nauticalMiles;
        this.gps = gps;
        this.accelerationTime = accelerationTime;
        this.sonar = sonar;
        this.hasLifeBuoy = hasLifeBuoy;
    }

    SailBoat(SailBoat s) {
        super(s);
        this.nauticalMiles = s.nauticalMiles;
        this.gps = s.gps;
        this.accelerationTime = s.accelerationTime;
        this.sonar = s.sonar;
        this.hasLifeBuoy = s.hasLifeBuoy;
    }

    @Override
    public String toString() {
        return super.toString() + "Nautical Miles = " + nauticalMiles + ", GPS = " + gps + ", Acceleration Time = " + accelerationTime
                + ", Sonar = " + sonar + ", Has Life Buoy = " + hasLifeBuoy;
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

    public boolean getHasLifeBuoy() {
        return hasLifeBuoy;
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

    public void setHasLifeBuoy(boolean hasLifeBuoy) {
        this.hasLifeBuoy = hasLifeBuoy;
    }

    public boolean respectaCerinta(int nauticalMiles, boolean hasLifeBuoy) {
        return this.nauticalMiles < nauticalMiles && this.hasLifeBuoy == hasLifeBuoy;
    }
}
