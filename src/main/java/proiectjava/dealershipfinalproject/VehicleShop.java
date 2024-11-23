package proiectjava.dealershipfinalproject;

import java.util.ArrayList;

/**
 *
 * @author Dragos :>
 */
public class VehicleShop {

    private ArrayList<Vehicle> availableVehicles;

    public void addVehicle(Vehicle v) {
        availableVehicles.add(v);
    }

    public void removeVehicle(Vehicle v) {
        availableVehicles.remove(v);
    }

    VehicleShop() {
        availableVehicles = null;
    }

    VehicleShop(ArrayList<Vehicle> availableVehicles) {
        this.availableVehicles = availableVehicles;
    }

    VehicleShop(VehicleShop v) {
        this.availableVehicles = v.availableVehicles;
    }

    @Override
    public String toString() {
        return "Available Vehicles=" + availableVehicles;
    }

    public ArrayList<Vehicle> getAvailableVehicles() {
        return availableVehicles;
    }

    public void setAvailableVehicles(ArrayList<Vehicle> availableVehicles) {
        this.availableVehicles = availableVehicles;
    }
}
