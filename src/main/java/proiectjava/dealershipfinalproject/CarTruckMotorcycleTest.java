/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiectjava.dealershipfinalproject;
import java.awt.Color;
import java.util.Vector;

/**
 *
 * @author Alex
 */
public class CarTruckMotorcycleTest {
    public static void main(String[] args) {
        // -----Car-----
        Engine carEngine1 = new Engine("V6", 200, 60, "Diesel");
        Engine carEngine2 = new Engine("V4", 120, 40, "Diesel");
        Engine carEngine3 = new Engine("V8", 300, 80, "Benzina");
        Engine carEngine4 = new Engine("V6", 300, 60, "Petrol");
        Engine carEngine5 = new Engine("V8", 450, 70, "Petrol");
        Engine carEngine6 = new Engine("Electric", 200, 100, "Electric");
        Engine carEngine7 = new Engine("V4", 180, 50, "Petrol");
        Engine carEngine8 = new Engine("Inline-6", 350, 65, "Diesel");
        Engine carEngine9 = new Engine("Hybrid", 250, 55, "Hybrid");
        Engine carEngine10 = new Engine("Boxer-4", 220, 45, "Petrol");
        
        Transmission carTransmission1 = new Transmission("Automatic", 6);
        Transmission carTransmission2 = new Transmission("Manual", 6);
        Transmission carTransmission3 = new Transmission("Automatic", 5);
        Transmission carTransmission4 = new Transmission("Automatic", 8);
        Transmission carTransmission5 = new Transmission("Manual", 6);
        Transmission carTransmission6 = new Transmission("CVT", 0);
        Transmission carTransmission7 = new Transmission("Automatic", 10);
        Transmission carTransmission8 = new Transmission("Manual", 5);
        Transmission carTransmission9 = new Transmission("Semi-Automatic", 7);
        Transmission carTransmission10 = new Transmission("Dual-Clutch", 9);
        
        // 6 instante:
        Car car11 = new Car();
        Car car12 = new Car(12, "Nissan", "Altima", (short) 2023, Color.BLUE, 28000.00, 1500, carEngine2, carTransmission1, null, 9000, 210, false, true, true, "Sedan");
        Car car13 = new Car(car12);
        Car car14 = new Car();
        Car car15 = new Car(15, "Volkswagen", "Passat", (short) 2022, Color.GRAY, 27000.00, 1800, carEngine2, carTransmission2, null, 18000, 220, false, true, true, "Sedan");
        Car car16 = new Car(car15);

        System.out.println(car11);
        System.out.println(car12);
        System.out.println(car13);
        System.out.println(car14);
        System.out.println(car15);
        System.out.println(car16);
        
        // Vector:
        Car[] cars = new Car[10];
        cars[0] = new Car(1, "Toyota", "Camry", (short) 2022, Color.BLUE, 25000.99, 1500, carEngine1, carTransmission1, null, 12000, 240, false, true, true, "Sedan");
        cars[1] = new Car(2, "Ford", "Mustang", (short) 2023, Color.RED, 45000.50, 1600, carEngine2, carTransmission2, null, 8000, 260, true, true, true, "Coupe");
        cars[2] = new Car(3, "Tesla", "Model S", (short) 2021, Color.WHITE, 75000.00, 2000, carEngine3, carTransmission3, null, 15000, 250, false, true, true, "Sedan");
        cars[3] = new Car(4, "Honda", "Civic", (short) 2020, Color.GRAY, 22000.00, 1300, carEngine4, carTransmission4, null, 18000, 220, false, true, false, "Hatchback");
        cars[4] = new Car(5, "BMW", "X5", (short) 2024, Color.BLACK, 60000.00, 2500, carEngine5, carTransmission5, null, 5000, 240, false, true, true, "SUV");
        cars[5] = new Car(6, "Toyota", "Prius", (short) 2022, Color.GREEN, 28000.00, 1400, carEngine6, carTransmission6, null, 10000, 180, false, true, true, "Hatchback");
        cars[6] = new Car(7, "Subaru", "Impreza", (short) 2021, Color.GREEN, 30000.00, 1450, carEngine7, carTransmission7, null, 15000, 220, false, true, true, "Sedan");
        cars[7] = new Car(8, "Lucid", "Air", (short) 2023, Color.RED, 80000.00, 2200, carEngine8, carTransmission8, null, 1200, 320, false, true, true, "Sedan");
        cars[8] = new Car(9, "Lamborghini", "Huracan", (short) 2023, Color.YELLOW, 200000.00, 1550, carEngine9, carTransmission9, null, 3000, 325, false, true, true, "Coupe");
        cars[9] = new Car(10, "Mazda", "RX-8", (short) 2009, Color.RED, 15000.00, 1300, carEngine10, carTransmission10, null, 50000, 230, true, true, false, "Coupe");
        
        for (Car car : cars) {
            System.out.println(car);
        }
        
        // -----Truck-----
        // 6 instante:
        Truck truck11 = new Truck();
        Truck truck12 = new Truck(12, "Ram", "1500", (short) 2023, Color.RED, 42000.00, 2800, carEngine5, carTransmission5, null, 12000, 5500, 1500, false, true);
        Truck truck13 = new Truck(truck12);
        Truck truck14 = new Truck();
        Truck truck15 = new Truck(15, "Nissan", "Titan", (short) 2020, Color.WHITE, 40000.00, 3100, carEngine8, carTransmission8, null, 20000, 7000, 1600, true, true);
        Truck truck16 = new Truck(truck15);
        
        System.out.println(truck11);
        System.out.println(truck12);
        System.out.println(truck13);
        System.out.println(truck14);
        System.out.println(truck15);
        System.out.println(truck16);
        
        // Vector:
        Truck[] trucks = new Truck[10];
        trucks[0] = new Truck(17, "Ford", "F-250", (short) 2023, Color.BLACK, 55000.00, 3500, carEngine1, carTransmission1, null, 18000, 7500, 1700, false, true);
        trucks[1] = new Truck(18, "Chevrolet", "Silverado 2500", (short) 2022, Color.BLUE, 60000.00, 4000, carEngine2, carTransmission2, null, 22000, 8000, 1800, true, true);
        trucks[2] = new Truck(19, "Ram", "3500", (short) 2021, Color.GRAY, 65000.00, 4500, carEngine3, carTransmission3, null, 25000, 8500, 1900, true, false);
        trucks[3] = new Truck(20, "GMC", "Sierra 3500", (short) 2020, Color.RED, 70000.00, 4600, carEngine4, carTransmission4, null, 28000, 9000, 2000, false, true);
        trucks[4] = new Truck(21, "Toyota", "Tundra", (short) 2023, Color.GREEN, 75000.00, 4000, carEngine5, carTransmission5, null, 30000, 9500, 2100, true, false);
        trucks[5] = new Truck(22, "Ford", "Super Duty", (short) 2022, Color.RED, 80000.00, 4700, carEngine6, carTransmission6, null, 32000, 10000, 2200, false, true);
        trucks[6] = new Truck(23, "Chevrolet", "Colorado ZR2", (short) 2021, Color.ORANGE, 70000.00, 3800, carEngine7, carTransmission7, null, 29000, 10500, 2300, true, true);
        trucks[7] = new Truck(24, "Nissan", "Frontier", (short) 2020, Color.BLUE, 50000.00, 3300, carEngine8, carTransmission8, null, 31000, 11000, 2400, true, false);
        trucks[8] = new Truck(25, "Ram", "2500 Power Wagon", (short) 2023, Color.BLUE, 85000.00, 4800, carEngine9, carTransmission9, null, 35000, 11500, 2500, false, true);
        trucks[9] = new Truck(26, "GMC", "Canyon", (short) 2022, Color.WHITE, 60000.00, 3500, carEngine10, carTransmission10, null, 33000, 12000, 2600, true, false);

        for (Truck truck : trucks) {
                    System.out.println(truck);
        }
        
        // -----Motorcycle-----
        // 6 instances:
        Motorcycle motorcycle11 = new Motorcycle();
        Motorcycle motorcycle12 = new Motorcycle(12, "Harley-Davidson", "Street 750", (short) 2023, Color.RED, 7500.00, 200, carEngine5, carTransmission5, null, 10000, 150, true, true, "Cruiser");
        Motorcycle motorcycle13 = new Motorcycle(motorcycle12);
        Motorcycle motorcycle14 = new Motorcycle();
        Motorcycle motorcycle15 = new Motorcycle(15, "Yamaha", "YZF-R1", (short) 2020, Color.WHITE, 15000.00, 220, carEngine8, carTransmission8, null, 15000, 160, true, false, "Sport");
        Motorcycle motorcycle16 = new Motorcycle(motorcycle15);

        System.out.println(motorcycle11);
        System.out.println(motorcycle12);
        System.out.println(motorcycle13);
        System.out.println(motorcycle14);
        System.out.println(motorcycle15);
        System.out.println(motorcycle16);

        // Vector:
        Motorcycle[] motorcycles = new Motorcycle[10];
        motorcycles[0] = new Motorcycle(17, "Honda", "CBR1000RR", (short) 2023, Color.BLACK, 18000.00, 250, carEngine1, carTransmission1, null, 12000, 180, false, true, "Sport");
        motorcycles[1] = new Motorcycle(18, "Kawasaki", "Ninja ZX-10R", (short) 2022, Color.GREEN, 19000.00, 260, carEngine2, carTransmission2, null, 15000, 190, true, true, "Sport");
        motorcycles[2] = new Motorcycle(19, "Suzuki", "GSX-R1000", (short) 2021, Color.BLUE, 17000.00, 240, carEngine3, carTransmission3, null, 18000, 175, true, false, "Sport");
        motorcycles[3] = new Motorcycle(20, "BMW", "S1000RR", (short) 2020, Color.RED, 20000.00, 280, carEngine4, carTransmission4, null, 20000, 200, false, true, "Sport");
        motorcycles[4] = new Motorcycle(21, "Ducati", "Panigale V4", (short) 2023, Color.GREEN, 25000.00, 300, carEngine5, carTransmission5, null, 25000, 220, true, false, "Sport");
        motorcycles[5] = new Motorcycle(22, "Triumph", "Speed Triple 1200", (short) 2022, Color.BLACK, 19000.00, 280, carEngine6, carTransmission6, null, 22000, 210, false, true, "Street");
        motorcycles[6] = new Motorcycle(23, "KTM", "RC 390", (short) 2021, Color.ORANGE, 7000.00, 150, carEngine7, carTransmission7, null, 25000, 140, true, true, "Sport");
        motorcycles[7] = new Motorcycle(24, "Yamaha", "MT-09", (short) 2020, Color.BLUE, 9000.00, 180, carEngine8, carTransmission8, null, 27000, 160, true, false, "Street");
        motorcycles[8] = new Motorcycle(25, "Harley-Davidson", "Iron 883", (short) 2023, Color.RED, 11000.00, 190, carEngine9, carTransmission9, null, 28000, 170, false, true, "Cruiser");
        motorcycles[9] = new Motorcycle(26, "Honda", "Rebel 500", (short) 2022, Color.WHITE, 7000.00, 160, carEngine10, carTransmission10, null, 29000, 150, true, false, "Cruiser");

        for (Motorcycle motorcycle : motorcycles) {
            System.out.println(motorcycle);
        }
    }
}