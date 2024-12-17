/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package proiectjava.dealershipfinalproject;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Daria
 */
public class DealershipFinalProject {

    public static void main(String[] args) {
        
        new Login();
        
        System.out.println("--------Yacht--------");
        Engine yachtEngine1 = new Engine("V6 Marine", 500, 300, "Diesel");
        Engine yachtEngine2 = new Engine("V8 Marine", 700, 400, "Diesel");
        Engine yachtEngine3 = new Engine("Electric Marine", 300, 500, "Electric");
        Engine yachtEngine4 = new Engine("Hybrid Marine", 600, 350, "Hybrid");
        Engine yachtEngine5 = new Engine("V12 Turbo", 1000, 600, "Diesel");
        Engine yachtEngine6 = new Engine("Inline-6 Marine", 450, 320, "Petrol");
        Engine yachtEngine7 = new Engine("Boxer-8", 800, 550, "Petrol");
        Engine yachtEngine8 = new Engine("Turbocharged V10", 900, 600, "Diesel");
        Engine yachtEngine9 = new Engine("Electric Twin", 600, 700, "Electric");
        Engine yachtEngine10 = new Engine("Hydrogen Marine", 550, 800, "Hydrogen");
      
        Transmission yachtTransmission1 = new Transmission("Automatic", 6);
        Transmission yachtTransmission2 = new Transmission("Manual", 5);
        Transmission yachtTransmission3 = new Transmission("CVT", 1);
        Transmission yachtTransmission4 = new Transmission("Semi-Automatic", 7);
        Transmission yachtTransmission5 = new Transmission("Dual-Clutch", 8);
        Transmission yachtTransmission6 = new Transmission("Single-Speed", 1);
        Transmission yachtTransmission7 = new Transmission("Automatic", 10);
        Transmission yachtTransmission8 = new Transmission("Manual", 6);
        Transmission yachtTransmission9 = new Transmission("CVT", 2);
        Transmission yachtTransmission10 = new Transmission("Semi-Automatic", 7);

        Yacht[] yachts = new Yacht[10];
        yachts[0] = new Yacht(1, "Azimut", "Grande", (short) 2023, Color.BLUE, 5000000.00, 30000, yachtEngine1, yachtTransmission1, null, 400, 12, "Italy");
        yachts[1] = new Yacht(2, "Sunseeker", "Predator", (short) 2022, Color.RED, 4500000.00, 28000, yachtEngine2, yachtTransmission2, null, 350, 10, "UK");
        yachts[2] = new Yacht(3, "Princess", "X95", (short) 2021, Color.WHITE, 6000000.00, 35000, yachtEngine3, yachtTransmission3, null, 500, 15, "France");
        yachts[3] = new Yacht(4, "Ferretti", "Y920", (short) 2020, Color.BLACK, 7000000.00, 40000, yachtEngine4, yachtTransmission4, null, 450, 20, "Italy");
        yachts[4] = new Yacht(5, "Benetti", "Oasis", (short) 2024, Color.GRAY, 8000000.00, 45000, yachtEngine5, yachtTransmission5, null, 600, 25, "Germany");
        yachts[5] = new Yacht(6, "Lürssen", "Aurora", (short) 2019, Color.GREEN, 9000000.00, 50000, yachtEngine6, yachtTransmission6, null, 550, 30, "Norway");
        yachts[6] = new Yacht(7, "Pershing", "82V", (short) 2021, Color.CYAN, 4000000.00, 27000, yachtEngine7, yachtTransmission7, null, 320, 8, "Italy");
        yachts[7] = new Yacht(8, "Gulf Craft", "Majesty", (short) 2023, Color.MAGENTA, 8500000.00, 47000, yachtEngine8, yachtTransmission8, null, 580, 18, "UAE");
        yachts[8] = new Yacht(9, "Heesen", "Galactica", (short) 2023, Color.YELLOW, 9500000.00, 52000, yachtEngine9, yachtTransmission9, null, 620, 22, "Netherlands");
        yachts[9] = new Yacht(10, "Feadship", "Symphony", (short) 2018, Color.PINK, 10000000.00, 55000, yachtEngine10, yachtTransmission10, null, 700, 28, "Netherlands");
  
        for (Yacht yacht : yachts) {
            System.out.println(yacht.toString());
        }
        
        Yacht yacht11 = new Yacht();
        Yacht yacht12 = new Yacht(12, "Bayliner", "Element XR7", (short) 2023, Color.BLUE, 350000.00, 12000, yachtEngine4, yachtTransmission4, null, 180, 6, "USA");
        Yacht yacht13 = new Yacht(yacht12);
        Yacht yacht14 = new Yacht();
        Yacht yacht15 = new Yacht(15, "Jeanneau", "Leader 36", (short) 2022, Color.GRAY, 450000.00, 15000, yachtEngine2, yachtTransmission2, null, 200, 8, "France");
        Yacht yacht16 = new Yacht(yacht15);

        System.out.println(yacht11.toString());
        System.out.println(yacht12.toString());
        System.out.println(yacht13.toString());
        System.out.println(yacht14.toString());
        System.out.println(yacht15.toString());
        System.out.println(yacht16.toString());
        System.out.println("");
        
        for(Yacht yacht : yachts) {
            if(yacht.respectaCerinta(2000000, 50)){ 
                System.out.println(yacht); 
            }
        }
        
        System.out.println("--------Jetski--------");
        Engine jetskiEngine1 = new Engine("V2 Marine", 150, 50, "Petrol");
        Engine jetskiEngine2 = new Engine("Electric Marine", 80, 60, "Electric");
        Engine jetskiEngine3 = new Engine("Inline-3 Marine", 200, 70, "Petrol");
        Engine jetskiEngine4 = new Engine("Hybrid Marine", 180, 65, "Hybrid");
        Engine jetskiEngine5 = new Engine("V4 Turbo Marine", 250, 80, "Petrol");
        Engine jetskiEngine6 = new Engine("Hydrogen Marine", 220, 75, "Hydrogen");
        Engine jetskiEngine7 = new Engine("Rotary Marine", 200, 120, "Petrol");
        Engine jetskiEngine8 = new Engine("Twin Electric Marine", 250, 200, "Electric");
        Engine jetskiEngine9 = new Engine("Turbocharged Inline-4 Marine", 300, 150, "Petrol");
        Engine jetskiEngine10 = new Engine("CNG Marine", 180, 130, "CNG");

        Transmission jetskiTransmission1 = new Transmission("Automatic", 1);
        Transmission jetskiTransmission2 = new Transmission("Manual", 1);
        Transmission jetskiTransmission3 = new Transmission("Single-Speed", 0);
        Transmission jetskiTransmission4 = new Transmission("CVT", 0);
        Transmission jetskiTransmission5 = new Transmission("Automatic", 2);
        Transmission jetskiTransmission6 = new Transmission("Manual", 2);
        Transmission jetskiTransmission7 = new Transmission("Hydraulic Drive", 1);
        Transmission jetskiTransmission8 = new Transmission("Electric Direct Drive", 0);
        Transmission jetskiTransmission9 = new Transmission("Propeller Shaft Drive", 2);
        Transmission jetskiTransmission10 = new Transmission("Dual-Propeller Drive", 1);

        Jetski jetski11 = new Jetski();
        Jetski jetski12 = new Jetski(12, "Yamaha", "WaveRunner", (short) 2023, Color.BLUE, 15000.00, 500, jetskiEngine1, jetskiTransmission1, null, 100, true, "Waterjet");
        Jetski jetski13 = new Jetski(jetski12);
        Jetski jetski14 = new Jetski();
        Jetski jetski15 = new Jetski(15, "Sea-Doo", "GTX", (short) 2022, Color.RED, 18000.00, 550, jetskiEngine2, jetskiTransmission2, null, 120, true, "Propeller");
        Jetski jetski16 = new Jetski(jetski15);

        System.out.println(jetski11.toString());
        System.out.println(jetski12.toString());
        System.out.println(jetski13.toString());
        System.out.println(jetski14.toString());
        System.out.println(jetski15.toString());
        System.out.println(jetski16.toString());

        Jetski[] jetskis = new Jetski[10];
        jetskis[0] = new Jetski(1, "Kawasaki", "Ultra 310X", (short) 2023, Color.BLACK, 16000.00, 600, jetskiEngine1, jetskiTransmission1, null, 140, true, "Waterjet");
        jetskis[1] = new Jetski(2, "Honda", "AquaTrax", (short) 2022, Color.YELLOW, 14500.00, 500, jetskiEngine2, jetskiTransmission2, null, 130, true, "Waterjet");
        jetskis[2] = new Jetski(3, "Sea-Doo", "Spark Trixx", (short) 2021, Color.WHITE, 12000.00, 450, jetskiEngine3, jetskiTransmission3, null, 90, true, "Propeller");
        jetskis[3] = new Jetski(4, "Yamaha", "SuperJet", (short) 2020, Color.GRAY, 13000.00, 400, jetskiEngine4, jetskiTransmission4, null, 110, false, "Waterjet");
        jetskis[4] = new Jetski(5, "BRP", "RXT-X", (short) 2024, Color.CYAN, 20000.00, 650, jetskiEngine5, jetskiTransmission5, null, 150, true, "Waterjet");
        jetskis[5] = new Jetski(6, "Kawasaki", "STX 160", (short) 2019, Color.GREEN, 14000.00, 480, jetskiEngine6, jetskiTransmission6, null, 125, true, "Propeller");
        jetskis[6] = new Jetski(7, "Honda", "F-15X", (short) 2021, Color.MAGENTA, 17500.00, 550, jetskiEngine7, jetskiTransmission7, null, 135, true, "Waterjet");
        jetskis[7] = new Jetski(8, "Yamaha", "EX Sport", (short) 2023, Color.ORANGE, 11000.00, 420, jetskiEngine8, jetskiTransmission8, null, 95, true, "Waterjet");
        jetskis[8] = new Jetski(9, "Sea-Doo", "RXP-X", (short) 2023, Color.RED, 19000.00, 600, jetskiEngine9, jetskiTransmission9, null, 160, true, "Waterjet");
        jetskis[9] = new Jetski(10, "Kawasaki", "310LX", (short) 2018, Color.PINK, 17000.00, 580, jetskiEngine10, jetskiTransmission10, null, 145, true, "Waterjet");

        for (Jetski jetski : jetskis) {
            System.out.println(jetski.toString());
        }
        
        for(Jetski jetski : jetskis) {
            if(jetski.respectaCerinta(1000, true)){
                System.out.println(jetski);
            }
        }
        
        System.out.println("");
        
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
        
          
   //Boat
        Boat boat1 = new Boat();
        Boat boat2 = new Boat();
        
        System.out.println(">>> Boat");
        System.out.println(boat1);
        System.out.println(boat2);

        Engine boatEngine1 = new Engine("V4", 300, 500, "Diesel");
        Engine boatEngine2 = new Engine("V6", 200, 0, "Petrol");
        
        Transmission boatTransmission1 = new Transmission("Automatic", 6);
        Transmission boatTransmission2 = new Transmission("Manual", 4);
        
        Boat boat3 = new Boat(
                1, "Yamaha", "WaveRunner", (short)2023, Color.BLUE, 15000.99, 400, boatEngine1, boatTransmission1, 
                new ImageIcon("boat1.jpg"), 500, true, 5.5, true, "Jet Propulsion");

        Boat boat4 = new Boat(
                2, "Bayliner", "Element", (short)2022, Color.WHITE, 25000.75, 1200, boatEngine2, boatTransmission2, 
                new ImageIcon("boat2.jpg"), 700, false, 6.8, false, "Propeller");
        
        System.out.println(boat3);
        System.out.println(boat4);

        Boat boat5 = new Boat(boat3);
        Boat boat6 = new Boat(boat4);

        System.out.println(boat5);
        System.out.println(boat6);
        
        
        Boat[] boats = new Boat[10];
        boats[0] = new Boat(1, "Yamaha", "AR195", (short) 2021, Color.BLUE, 29999.50, 1350, boatEngine1, boatTransmission1, null, 200, true, 6.5, true, "Jet Propulsion");
        boats[1] = new Boat(2, "Sea Ray", "SPX 190", (short) 2023, Color.RED, 35499, 1450, boatEngine2, boatTransmission2, null, 150, true, 7.0, false, "Jet Propulsion");
        boats[2] = new Boat(3, "Bayliner", "Element", (short) 2020, Color.WHITE, 25000.0, 1500, boatEngine1, boatTransmission1, null, 300, false, 8.0, true, "Inboard");
        boats[3] = new Boat(4, "Boston Whaler", "Montauk", (short) 2021, Color.GRAY, 40000.0, 2000, boatEngine2, boatTransmission1, null, 400, true, 5.5, true, "Outboard");
        boats[4] = new Boat(5, "Tracker", "Pro Team", (short) 2022, Color.BLACK, 18000.0, 1200, boatEngine1, boatTransmission2, null, 250, false, 6.8, false, "Outboard");
        boats[5] = new Boat(6, "Lund", "Pro V", (short) 2023, Color.GREEN, 30000.0, 1400, boatEngine2, boatTransmission1, null, 500, true, 4.5, true, "Jet Propulsion");
        boats[6] = new Boat(7, "MasterCraft", "XT21", (short) 2020, Color.YELLOW, 50000.0, 2500, boatEngine1, boatTransmission2, null, 350, false, 7.2, false, "Inboard");
        boats[7] = new Boat(8, "Malibu", "M220", (short) 2019, Color.ORANGE, 70000.0, 3000, boatEngine2, boatTransmission1, null, 600, true, 3.9, true, "Outboard");
        boats[8] = new Boat(9, "Crestliner", "XFC", (short) 2023, Color.PINK, 22000.0, 1100, boatEngine1, boatTransmission2, null, 270, false, 6.0, false, "Jet Propulsion");
        boats[9] = new Boat(10, "Ranger", "RT198P", (short) 2021, Color.CYAN, 28000.0, 1300, boatEngine2, boatTransmission1, null, 320, true, 5.0, true, "Outboard");
        
        System.out.println(">>> Vector Boat");
        
        for (Boat boat : boats) {
            System.out.println(boat);
        }
        
        //~~~~~~~~~~~~~~~~~
        //Sail Boat
        
        Engine sailBoatEngine1 = new Engine("V4", 100, 50, "Diesel");
        Engine sailBoatEngine2 = new Engine("V6", 200, 100, "Petrol");

        Transmission sailBoatTransmission1 = new Transmission("Manual", 6);
        Transmission sailBoatTransmission2 = new Transmission("Automatic", 5);

        SailBoat sailBoat1 = new SailBoat();
        SailBoat sailBoat2 = new SailBoat();
        
        System.out.println(">>> Sail Boat");
        System.out.println(sailBoat1);
        System.out.println(sailBoat2);

        SailBoat sailBoat3 = new SailBoat(
                1, "Beneteau", "Oceanis 30.1", (short) 2023, Color.GRAY, 120000.50, 4000, sailBoatEngine1,
                sailBoatTransmission1, null, 1000, true, 8.5, true, true);

        SailBoat sailBoat4 = new SailBoat(
                2, "Jeanneau", "Sun Odyssey 349", (short) 2022, Color.GRAY, 155000, 5350, sailBoatEngine2,
                sailBoatTransmission2, null, 1500, false, 10.0, false, false);

        System.out.println(sailBoat3);
        System.out.println(sailBoat4);

        SailBoat sailBoat5 = new SailBoat(sailBoat3);
        SailBoat sailBoat6 = new SailBoat(sailBoat4);

        System.out.println(sailBoat5);
        System.out.println(sailBoat6);
        
        SailBoat[] sailBoats = new SailBoat[10];
        sailBoats[0] = new SailBoat(3, "Catalina", "275 Sport", (short) 2021, Color.BLUE, 89999.99, 3200, sailBoatEngine1, sailBoatTransmission2, null, 600, true, 12.0, false, true);
        sailBoats[1] = new SailBoat(4, "Jeanneau", "Model D", (short) 2020, Color.YELLOW, 22000.0, 1700, sailBoatEngine2, sailBoatTransmission1, null, 900, false, 9.8, true, true);
        sailBoats[2] = new SailBoat(5, "Beneteau", "Model E", (short) 2019, Color.GRAY, 19000.0, 1600, sailBoatEngine1, sailBoatTransmission2, null, 400, true, 11.2, false, false);
        sailBoats[3] = new SailBoat(6, "Catalina", "Model F", (short) 2021, Color.GREEN, 21000.0, 1550, sailBoatEngine2, sailBoatTransmission1, null, 800, true, 10.0, true, true);
        sailBoats[4] = new SailBoat(7, "Pearson", "Model G", (short) 2023, Color.PINK, 23000.0, 1650, sailBoatEngine1, sailBoatTransmission2, null, 1000, false, 9.0, false, true);
        sailBoats[5] = new SailBoat(8, "O'Day", "Model H", (short) 2022, Color.ORANGE, 17000.0, 1450, sailBoatEngine2, sailBoatTransmission1, null, 700, true, 10.5, true, false);
        sailBoats[6] = new SailBoat(9, "Freedom", "Model I", (short) 2021, Color.CYAN, 24000.0, 1750, sailBoatEngine1, sailBoatTransmission2, null, 850, false, 8.7, false, true);
        sailBoats[7] = new SailBoat(10, "Morgan", "Model J", (short) 2020, Color.MAGENTA, 26000.0, 1850, sailBoatEngine2, sailBoatTransmission1, null, 950, true, 9.5, true, true);
        sailBoats[8] = new SailBoat(11, "Ericson", "Model K", (short) 2022, Color.DARK_GRAY, 20000.0, 1500, sailBoatEngine1, sailBoatTransmission2, null, 550, false, 10.0, false, false);
        sailBoats[9] = new SailBoat(12, "Hanse", "Model L", (short) 2023, Color.LIGHT_GRAY, 27000.0, 1900, sailBoatEngine2, sailBoatTransmission1, null, 650, true, 9.2, true, true);

        System.out.println(">>> Vector Sail Boat");
        
        for (SailBoat sailBoat : sailBoats) {
            System.out.println(sailBoat);
        }
        System.out.println("Car:");
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
        System.out.println("Truck:");
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
        System.out.println("Motorcycle:");
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
        
        
        System.out.println("Airplane:");
        Engine airplaneEngine1 = new Engine("Turbojet", 2000, 5000, "Jet Fuel");
        Engine airplaneEngine2 = new Engine("Turboprop", 1500, 3000, "Jet Fuel");
        Engine airplaneEngine3 = new Engine("Piston", 500, 200, "Avgas");
        Engine airplaneEngine4 = new Engine("Electric", 800, 1000, "Battery");
        Engine airplaneEngine5 = new Engine("Hybrid", 1200, 2500, "Jet Fuel & Battery");
        Engine airplaneEngine6 = new Engine("Ramjet", 3000, 6000, "Jet Fuel");
        Engine airplaneEngine7 = new Engine("Scramjet", 3500, 7000, "Hydrogen");
        Engine airplaneEngine8 = new Engine("Pulsejet", 1000, 1500, "Kerosene");
        Engine airplaneEngine9 = new Engine("Geared Turbofan", 2500, 4000, "Jet Fuel");
        Engine airplaneEngine10 = new Engine("Unducted Fan", 1800, 3500, "Jet Fuel");

        Transmission airplaneTransmission1 = new Transmission("Propeller", 2);
        Transmission airplaneTransmission2 = new Transmission("Single-stage Gearbox", 1);
        Transmission airplaneTransmission3 = new Transmission("Multi-stage Gearbox", 3);
        Transmission airplaneTransmission4 = new Transmission("Electric Drive", 0);
        Transmission airplaneTransmission5 = new Transmission("Hydraulic Drive", 2);
        Transmission airplaneTransmission6 = new Transmission("Mechanical", 2);
        Transmission airplaneTransmission7 = new Transmission("Magnetic Drive", 0);
        Transmission airplaneTransmission8 = new Transmission("Variable Pitch Propeller", 3);
        Transmission airplaneTransmission9 = new Transmission("Turbofan System", 1);
        Transmission airplaneTransmission10 = new Transmission("Dual Propeller", 2);

        
        Airplane airplane1 = new Airplane();
        Airplane airplane2 = new Airplane(2, "Boeing", "737", (short) 2019, Color.WHITE, 1200000, 2000,
                airplaneEngine1, airplaneTransmission1, null, 80000, 900, 1000, 150, 
                "Commercial");
        Airplane airplane3 = new Airplane(airplane2);

        System.out.println(airplane1);
        System.out.println(airplane2);
        System.out.println(airplane3+"\n\n");

       
        Airplane[] allAirplanes = new Airplane[10];
        allAirplanes[0] = new Airplane(1, "Boeing", "747", (short) 2020, Color.GRAY, 25000000, 30000,
                airplaneEngine1, airplaneTransmission2, null, 13000, 14000, 1000, 800, 
                "Commercial");
        allAirplanes[1] = new Airplane(2, "Airbus", "A320", (short) 2018, Color.BLUE, 20000000, 25000,
                airplaneEngine2, airplaneTransmission3, null, 12000, 7000, 900, 220, 
                "Commercial");
        allAirplanes[2] = new Airplane(3, "Cessna", "172", (short) 2015, Color.RED, 300000, 1200,
                airplaneEngine3, airplaneTransmission4, null, 4500, 960, 300, 4, 
                "Private");
        allAirplanes[3] = new Airplane(4, "Piper", "Cherokee", (short) 2019, Color.YELLOW, 250000, 1100,
                airplaneEngine4, airplaneTransmission5, null, 3400, 967, 237, 4,
                "Private");
        allAirplanes[4] = new Airplane(5, "Bombardier", "Global 7500", (short) 2022, Color.WHITE, 45000000, 35000,
                airplaneEngine5, airplaneTransmission6, null, 15500, 14200, 1100, 20, 
                "Business");
        allAirplanes[5] = new Airplane(6, "Gulfstream", "G700", (short) 2023, Color.BLACK, 65000000, 40000,
                airplaneEngine6, airplaneTransmission7, null, 15500, 12070, 1150, 25, 
                "Business");
        allAirplanes[6] = new Airplane(7, "Lockheed", "SR-71", (short) 1976, Color.WHITE, 120000000, 15000,
                airplaneEngine7, airplaneTransmission8, null, 25000, 4828, 3500, 1,
                "Military");
        allAirplanes[7] = new Airplane(8, "Antonov", "An-225", (short) 1988, Color.GRAY, 300000000, 60000,
                airplaneEngine8, airplaneTransmission9, null, 10972, 15000, 900, 70, 
                "Cargo");
        allAirplanes[8] = new Airplane(9, "Embraer", "E195", (short) 2021, Color.WHITE, 15000000, 20000,
                airplaneEngine9, airplaneTransmission10, null, 12500, 4800, 800, 132, 
                "Commercial");
        allAirplanes[9] = new Airplane(10, "Dassault", "Falcon 8X", (short) 2023, Color.BLUE, 50000000, 30000,
                airplaneEngine10, airplaneTransmission1, null, 15545, 11945, 1000, 20, 
                "Business");

        for (Airplane airplane : allAirplanes) {
            System.out.println(airplane);
        }

        System.out.println("Helicopter:");
        Helicopter helicopter1 = new Helicopter();
        Helicopter helicopter2 = new Helicopter(1, "Bell", "206", (short) 2020, Color.GREEN, 1200000, 800,
                airplaneEngine1, airplaneTransmission1, null, 4000, 220, 250, 800, "Main Rotor");
        Helicopter helicopter3 = new Helicopter(helicopter2);

        System.out.println("\n\n"+helicopter1);
        System.out.println(helicopter2);
        System.out.println(helicopter3+"\n\n");

     
        Helicopter[] allHelicopters = new Helicopter[10];
        allHelicopters[0] = new Helicopter(2, "Eurocopter", "AS350", (short) 2018, Color.BLUE, 900000, 700,
                airplaneEngine2, airplaneTransmission2, null, 3500, 210, 230,750, "Main Rotor");
        allHelicopters[1] = new Helicopter(3, "Sikorsky", "UH-60", (short) 2015, Color.BLACK, 15000000, 3000,
                airplaneEngine3, airplaneTransmission3, null, 8000, 295, 315,  900,"Main Rotor");
        allHelicopters[2] = new Helicopter(4, "AgustaWestland", "AW139", (short) 2022, Color.RED, 10000000, 1200,
                airplaneEngine4, airplaneTransmission4, null, 5000, 290, 310,850, "Coaxial Rotor");
        allHelicopters[3] = new Helicopter(5, "Robinson", "R44", (short) 2021, Color.WHITE, 350000, 400,
                airplaneEngine5, airplaneTransmission5, null, 2000, 200, 220,600, "Main Rotor");
        allHelicopters[4] = new Helicopter(6, "Kamov", "Ka-52", (short) 2019, Color.GRAY, 18000000, 2500,
                airplaneEngine6, airplaneTransmission6, null, 6000, 310, 340,  1000,"Coaxial Rotor");
        allHelicopters[5] = new Helicopter(7, "Boeing", "AH-64 Apache", (short) 2017, Color.GREEN, 20000000, 3000,
                airplaneEngine7, airplaneTransmission7, null, 7000, 280, 300,  950,"Main Rotor");
        allHelicopters[6] = new Helicopter(8, "Mil", "Mi-26", (short) 2015, Color.GRAY, 25000000, 2000,
                airplaneEngine8, airplaneTransmission8, null, 15000, 250, 270,1200,"Main Rotor");
        allHelicopters[7] = new Helicopter(9, "Airbus", "H125", (short) 2020, Color.BLUE, 3000000, 900,
                airplaneEngine9, airplaneTransmission9, null, 4000, 245, 265, 700,"Main Rotor");
        allHelicopters[8] = new Helicopter(10, "Leonardo", "AW609", (short) 2021, Color.WHITE, 12000000, 1500,
                airplaneEngine10, airplaneTransmission10, null, 7000, 300, 300, 850, "Tilt Rotor");
        allHelicopters[9] = new Helicopter(11, "Kaman", "K-MAX", (short) 2018, Color.YELLOW, 6000000, 500,
                airplaneEngine1, airplaneTransmission1, null, 4000, 200, 220, 600, "Intermeshing Rotor");

        for (Helicopter helicopter : allHelicopters) {
            System.out.println(helicopter);
        }
        
        System.out.println("JetPlane:");
        JetPlane jetPlane1 = new JetPlane();
        JetPlane jetPlane2 = new JetPlane(1, "Concorde", "Type A", (short) 1976, Color.WHITE, 50000000, 40000,
                airplaneEngine1, airplaneTransmission1, null, 120000, 2200, 2400,800, "Commercial");
        JetPlane jetPlane3 = new JetPlane(jetPlane2);

        System.out.println("\n\n"+jetPlane1);
        System.out.println(jetPlane2);
        System.out.println(jetPlane3+"\n\n");

       
        JetPlane[] allJetPlanes = new JetPlane[10];
        allJetPlanes[0] = new JetPlane(2, "Boeing", "747", (short) 1990, Color.WHITE, 150000000, 80000,
                airplaneEngine2, airplaneTransmission2, null, 13000, 14000, 1000, 2000 , "Turbofan");
        allJetPlanes[1] = new JetPlane(3, "Airbus", "A380", (short) 2010, Color.BLUE, 300000000, 120000,
                airplaneEngine3, airplaneTransmission3, null, 13100, 15200, 1020,2000 , "Turbofan");
        allJetPlanes[2] = new JetPlane(4, "Lockheed", "SR-71", (short) 1966, Color.BLACK, 34000000, 30000,
                airplaneEngine4, airplaneTransmission4, null, 26000, 5400, 3700, 4000, "Turbojet");
        allJetPlanes[3] = new JetPlane(5, "McDonnell Douglas", "F-15", (short) 1980, Color.GRAY, 29000000, 25000,
                airplaneEngine5, airplaneTransmission5, null, 15000, 3800, 2650,2000 , "Turbofan");
        allJetPlanes[4] = new JetPlane(6, "Northrop", "B-2 Spirit", (short) 1997, Color.BLACK, 2000000000, 170000,
                airplaneEngine6, airplaneTransmission6, null, 15000, 11000, 1010,2000 , "Turbofan");
        allJetPlanes[5] = new JetPlane(7, "Dassault", "Rafale", (short) 2015, Color.GRAY, 85000000, 24000,
                airplaneEngine7, airplaneTransmission7, null, 15200, 3700, 2120,2000 , "Turbofan");
        allJetPlanes[6] = new JetPlane(8, "Tupolev", "Tu-160", (short) 1987, Color.WHITE, 150000000, 275000,
                airplaneEngine8, airplaneTransmission8, null, 12500, 12300, 2220, 2000 , "Turbofan");
        allJetPlanes[7] = new JetPlane(9, "Saab", "Gripen", (short) 2018, Color.GRAY, 85000000, 14000,
                airplaneEngine9, airplaneTransmission9, null, 15000, 3000, 2450,2000 , "Turbofan");
        allJetPlanes[8] = new JetPlane(10, "Boeing", "777", (short) 2016, Color.WHITE, 350000000, 77500,
                airplaneEngine10, airplaneTransmission10, null, 13100, 14300, 905,2000 , "Turbofan");
        allJetPlanes[9] = new JetPlane(11, "Mikoyan", "MiG-29", (short) 1983, Color.GRAY, 29000000, 11000,
                airplaneEngine1, airplaneTransmission1, null, 18000, 3200, 2445,2000 , "Turbofan");

        for (JetPlane jetPlane : allJetPlanes) {
            System.out.println(jetPlane);
        }
        
        // Afisare in functie de 2 conditii:
        // Car:
        System.out.println("Filtrare car:");
        for(Car car : cars) {
            if(car.respectaCerinta(true, 300000)) { System.out.println(car); }
        }
        
        // Truck:
        System.out.println("Filtrare truck:");
        for(Truck truck : trucks) {
            if(truck.respectaCerinta(true, 10000)) { System.out.println(truck); }
        }
        
        // Motorcycle:
        System.out.println("Filtrare motorcycle:");
        for(Motorcycle motorcycle : motorcycles) {
            if(motorcycle.respectaCerinta(false, 200000)) { System.out.println(motorcycle); }
        }
        
        //
        System.out.println("Toate instantele vectorului cu scootere care respecta conditia");
        for (Scooter scooter : scooterArray) {
 
            if(scooter.respectaCerinta(false, (short)2020)) 
             System.out.println(scooter);
            
            }
        
      System.out.println("Toate instantele vectorului cu drone care respecta conditia");

            
       for (Drone drone : droneArray) 
        {
            if(!drone.respectaCerinta(1000 ,6)) 
             System.out.println(drone);
        }
        
                   
            System.out.println("Toate elementele vectorului cu atv-uri ce respecta conditia");
        for (Atv atv : atvArray) {
            if(atv.respectaCerinta("Manual",40))
                System.out.println(atv);      
        }
        
        // Dragos :>
        //Boat
        System.out.println("\n>> Boats: GPS = TRUE && Acceleration Time < 5");
        
        for(Boat boat : boats)
        {
            if(boat.respectaCerinta(true, 5.0))
            {
                System.out.println(boat);
            }
        }
        
        System.out.println("\n>> Sail Boats: Nautical Miles < 750 && Has Life Buoy = false");
        
        for(SailBoat sailBoat : sailBoats)
        {
            if(sailBoat.respectaCerinta(750, false))
            {
                System.out.println(sailBoat);
            }
        }
        
        System.out.println("\n\n------------------------\nCan the plane fly to its destination? The flight covers 2700 km with a passenger capacity of 800");
        for(Airplane airplane:allAirplanes){
            if(airplane.canFlyToLocation(2700, 800)){
                System.out.println(airplane);
            }
        }
        
        System.out.println("\n\nCan the helicopter fly over the mountains? The flight requires 300 km at an altitude of 6000 meters.");
        for(Helicopter helicopter:allHelicopters){
            if(helicopter.canFlyToLocation(300, 6000)){
                System.out.println(helicopter);
            }
        }
        
        
        System.out.println("\n\nCan the jetplane reach its destination in time? The flight is 5000 km at a speed of 2000 km/h.");
        for(JetPlane jetplane:allJetPlanes){
            if(jetplane.canFlyToLocation(5000, 2000)){
                System.out.println(jetplane);
            }
        }
        
    }
}
