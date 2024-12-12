/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiectjava.dealershipfinalproject;

/**
 *
 * @author Daria
 */
import javax.swing.ImageIcon;
import java.awt.Color;

public class Vehicle {

    private int id;
    private String brand;
    private String model;
    private short year;
    private Color color;
    private double price;
    private int weight;
    Engine engine;
    Transmission transmission;
    ImageIcon photo;

    public Vehicle() {
        id = 0;
        brand = "unknown";
        model = "unknown";
        year = 0;
        color = null;
        price = 0;
        weight = 0;
        engine = new Engine();
        transmission = new Transmission();
        photo = new ImageIcon();
    }

    public Vehicle(int id, String brand, String model, short year, Color color, double price, int weight, Engine engine, Transmission transmission, ImageIcon photo) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.engine = new Engine(engine);
        this.transmission = new Transmission(transmission);
        this.photo = photo;

    }

    public Vehicle(Vehicle vehicle) {
        this.id = vehicle.id;
        this.brand = vehicle.brand;
        this.model = vehicle.model;
        this.year = vehicle.year;
        this.color = vehicle.color;
        this.price = vehicle.price;
        this.weight = vehicle.weight;
        this.engine = new Engine(vehicle.engine);
        this.transmission = new Transmission(vehicle.transmission);
        this.photo = vehicle.photo;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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

    public ImageIcon getPhoto() {
        return photo;
    }

    public void setPhoto(ImageIcon photo) {
        this.photo = photo;
    }
    
    @Override
    public String toString() {
        return "> General Specifications" + "\nID: " + id + "\nBrand: " + brand + "\nModel: " + model + "\nYear: " + year + 
                "\nColor: " + normColor(color) + "\nPrice: " + price + " RON" + "\nWeight: " + weight + " KG" + 
                "\n\n> Engine Specifications" + (engine != null ? engine : "No Engine") +
                "\n\n> Transmission Specifications" + (transmission != null ? transmission : "No Transmission");
    }

    private String normColor(Color color) {
        int rgb = color.getRGB();
        switch (rgb) {
            case 0xFF000000:
                return "Black";
            case 0xFF0000FF:
                return "Blue";
            case 0xFF00FFFF:
                return "Cyan";
            case 0xFF404040:
                return "Dark Gray";
            case 0xFF808080:
                return "Gray";
            case 0xFF00FF00:
                return "Green";
            case 0xFFC0C0C0:
                return "Light Gray";
            case 0xFFFF00FF:
                return "Magenta";
            case 0xFFFFC800:
                return "Orange";
            case 0xFFFFAFAF:
                return "Pink";
            case 0xFFFF0000:
                return "Red";
            case 0xFFFFFFFF:
                return "White";
            case 0xFFFFFF00:
                return "Yellow";
            default:
                return "Unknown";
        }
    }

}
