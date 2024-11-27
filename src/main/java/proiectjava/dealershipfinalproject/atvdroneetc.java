/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiectjava.dealershipfinalproject;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author i5 8th
 */
public class atvdroneetc {
       Atv atv1 = new Atv(1, "Honda", "TRX250", (short) 2020, Color.RED, 3000.0, 180,
                new Engine("Petrol", 250, 25, "Single-cylinder"),
                new Transmission("Manual", 5),
                new ImageIcon("atv1.jpg"), "Utility", false, true, 30, "Independent");

        Atv atv2 = new Atv(2, "Yamaha", "Raptor 700R", (short) 2021, Color.BLUE, 9000.0, 200,
                new Engine("Petrol", 686, 45, "Single-cylinder"),
                new Transmission("Automatic", 4),
                new ImageIcon("atv2.jpg"), "Sport", false, true, 20, "Dual-A-arm");

        Atv atv3 = new Atv(3, "Can-Am", "Outlander 450", (short) 2022, Color.BLACK, 6500.0, 400,
                new Engine("Petrol", 427, 38, "Single-cylinder"),
                new Transmission("CVT", 0),
                new ImageIcon("atv3.jpg"), "Utility", true, false, 40, "Trailing Arm");

        Atv atv4 = new Atv(4, "Polaris", "Sportsman 570", (short) 2019, Color.GREEN, 7000.0, 300,
                new Engine("Petrol", 567, 44, "ProStar"),
                new Transmission("Automatic", 0),
                new ImageIcon("atv4.jpg"), "Utility", false, true, 50, "Independent Rear");

        Atv atv5 = new Atv(5, "Suzuki", "QuadSport Z400", (short) 2020, Color.YELLOW, 6000.0, 280,
                new Engine("Petrol", 398, 38, "Single-cylinder"),
                new Transmission("Manual", 5),
                new ImageIcon("atv5.jpg"), "Sport", false, true, 15, "Swing Arm");

        Atv atv6 = new Atv(6, "Kawasaki", "Brute Force 300", (short) 2021, Color.ORANGE, 5000.0, 320,
                new Engine("Petrol", 271, 20, "Single-cylinder"),
                new Transmission("CVT", 0),
                new ImageIcon("atv6.jpg"), "Utility", true, false, 25, "Independent Rear");

        System.out.println("Cele 6 instante ale Atv");
        System.out.println(atv1.toString());
        System.out.println(atv2.toString());
        System.out.println(atv3.toString());
        System.out.println(atv4.toString());
        System.out.println(atv5.toString());
        System.out.println(atv6.toString());

        
        //
        Atv[] atvArray = new Atv[10];
        atvArray[0] = new Atv(atv1);
        atvArray[1] = new Atv(atv2);
        atvArray[2] = new Atv(atv3);
        atvArray[3] = new Atv(atv4);
        atvArray[4] = new Atv(atv5);
        atvArray[5] = new Atv(atv6);
        atvArray[6] = new Atv(atv3);
        atvArray[7] = new Atv(atv4);
        atvArray[8] = new Atv(atv5);
        atvArray[9] = new Atv(atv6);

        System.out.println("Toate elementele vectorului cu atv-uri");
        for (Atv atv : atvArray) {
            System.out.println(atv.toString());

        }

        System.out.println("");
        Drone drone1 = new Drone(1, "DJI", "Phantom 4", (short) 2021, Color.WHITE, 1500.0, 1380,
                new Engine("Electric", 4, 40, "Quadcopter"), new Transmission("None", 0),
                new ImageIcon("drone1.jpg"), 4, true, "Medium", true, 6);

        Drone drone2 = new Drone(2, "Parrot", "Anafi", (short) 2020, Color.BLACK, 1000.0, 500,
                new Engine("Electric", 2, 25, "Quadcopter"), new Transmission("None", 0),
                new ImageIcon("drone2.jpg"), 2, false, "Small", false, 4);

        Drone drone3 = new Drone(3, "Autel Robotics", "Evo Lite+", (short) 2022, Color.ORANGE, 2000.0, 820,
                new Engine("Electric", 4, 50, "Quadcopter"), new Transmission("None", 0),
                new ImageIcon("drone3.jpg"), 4, true, "Large", true, 8);

        Drone drone4 = new Drone(4, "Skydio", "X2", (short) 2021, Color.GRAY, 1200.0, 1100,
                new Engine("Electric", 6, 60, "Hexacopter"), new Transmission("None", 0),
                new ImageIcon("drone4.jpg"), 6, true, "Large", true, 10);

        Drone drone5 = new Drone(5, "Ryze Tech", "Tello", (short) 2019, Color.YELLOW, 200.0, 150,
                new Engine("Electric", 2, 10, "Mini"), new Transmission("None", 0),
                new ImageIcon("drone5.jpg"), 2, false, "Small", false, 2);

        Drone drone6 = new Drone(6, "Hubsan", "Zino Mini", (short) 2023, Color.BLUE, 800.0, 300,
                new Engine("Electric", 4, 30, "Quadcopter"), new Transmission("None", 0),
                new ImageIcon("drone6.jpg"), 4, false, "Medium", false, 5);

        System.out.println("Cele 6 instante cu Drone:");
        System.out.println(drone1.toString());
        System.out.println(drone2.toString());
        System.out.println(drone3.toString());
        System.out.println(drone4.toString());
        System.out.println(drone5.toString());
        System.out.println(drone6.toString());

        Drone[] droneArray = new Drone[10];
        droneArray[0] = new Drone(drone1);
        droneArray[1] = new Drone(drone2);
        droneArray[2] = new Drone(drone3);
        droneArray[3] = new Drone(drone4);
        droneArray[4] = new Drone(drone5);
        droneArray[5] = new Drone(drone6);
        droneArray[6] = new Drone(drone3);
        droneArray[7] = new Drone(drone2);
        droneArray[8] = new Drone(drone3);
        droneArray[9] = new Drone(drone4);

        System.out.println("Elementele vectorului cu drone:");
        for (Drone drone : droneArray) {
            System.out.println(drone.toString());
        }

        System.out.println("");

        Scooter scooter1 = new Scooter(1, "Vespa", "Primavera", (short) 2020, Color.RED, 4000.0, 120,
                new Engine("Electric", 1, 10, "Single"), new Transmission("Automatic", 1),
                new ImageIcon("scooter1.jpg"), "Electric", true, false, false, 50);

        Scooter scooter2 = new Scooter(2, "Honda", "PCX", (short) 2021, Color.BLACK, 3700.0, 135,
                new Engine("Petrol", 2, 15, "Single Cylinder"), new Transmission("Automatic", 1),
                new ImageIcon("scooter2.jpg"), "Gasoline", true, false, true, 80);

        Scooter scooter3 = new Scooter(3, "Yamaha", "NMAX", (short) 2022, Color.BLUE, 4500.0, 140,
                new Engine("Petrol", 2, 20, "Single Cylinder"), new Transmission("Automatic", 1),
                new ImageIcon("scooter3.jpg"), "Hybrid", true, true, true, 90);

        Scooter scooter4 = new Scooter(4, "Suzuki", "Burgman", (short) 2019, Color.GRAY, 5000.0, 150,
                new Engine("Petrol", 2, 18, "Single Cylinder"), new Transmission("Automatic", 1),
                new ImageIcon("scooter4.jpg"), "Gasoline", false, true, true, 85);

        Scooter scooter5 = new Scooter(5, "BMW", "C 400 GT", (short) 2023, Color.WHITE, 7000.0, 170,
                new Engine("Petrol", 4, 30, "Twin Cylinder"), new Transmission("Automatic", 2),
                new ImageIcon("scooter5.jpg"), "Touring", true, false, false, 100);

        Scooter scooter6 = new Scooter(6, "Kymco", "Like 125", (short) 2020, Color.GREEN, 2500.0, 110,
                new Engine("Electric", 1, 8, "Single"), new Transmission("Automatic", 1),
                new ImageIcon("scooter6.jpg"), "Electric", false, false, false, 45);

        System.out.println("Cele 6 instante ale lui scooter:");
        System.out.println(scooter1.toString());
        System.out.println(scooter2.toString());
        System.out.println(scooter3.toString());
        System.out.println(scooter4.toString());
        System.out.println(scooter5.toString());
        System.out.println(scooter6.toString());

        Scooter[] scooterArray = new Scooter[10];
        scooterArray[0] = new Scooter(scooter1);
        scooterArray[1] = new Scooter(scooter2);
        scooterArray[2] = new Scooter(scooter3);
        scooterArray[3] = new Scooter(scooter4);
        scooterArray[4] = new Scooter(scooter5);
        scooterArray[5] = new Scooter(scooter6);
        scooterArray[6] = new Scooter(scooter3);
        scooterArray[7] = new Scooter(scooter4);
        scooterArray[8] = new Scooter(scooter2);
        scooterArray[9] = new Scooter(scooter1);

        System.out.println("Toate instantele vectorului cu scootere");
        for (Scooter scooter : scooterArray) {
            System.out.println(scooter.toString());
        }

}
