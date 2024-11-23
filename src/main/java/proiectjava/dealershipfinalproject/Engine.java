/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiectjava.dealershipfinalproject;

/**
 *
 * @author Raul
 */
public class Engine{
    String type;
    int horsepower;
    int fuelCapacity;
    String typeOfFuel;
    
    public Engine(){
        this("",0,0,"");
    }
    public Engine(String type, int horsepower, int fuelCapacity, String typeOfFuel){
        this.type=type;
        this.horsepower=horsepower;
        this.fuelCapacity=fuelCapacity;
        this.typeOfFuel=typeOfFuel;
    }
    public Engine(Engine engine){
        this(engine.type, engine.horsepower, engine.fuelCapacity, engine.typeOfFuel);
    }
    void setType(String type){
        this.type=type;
    }
    void setHorsepower(int horsepower){
        this.horsepower=horsepower;
    }
    void setFuelCapacity(int fuelCapacity){
        this.fuelCapacity=fuelCapacity;
    }
    void setTypeOfFuel(String typeOfFuel){
        this.typeOfFuel=typeOfFuel;
    }
    String getType(){
        return this.type;
    }
    int getHorsepower(){
        return this.horsepower;
    }
    int getFuelCapacity(){
        return this.fuelCapacity;
    }
    String getTypeOfFuel(){
        return this.typeOfFuel;
    }
    @Override
    public String toString(){
        return "Type: "+this.type+ ", Horsepower: "+this.horsepower+", Fuel Capacity: "+this.fuelCapacity+", The Type of Fuel: "+this.typeOfFuel;
    }
}