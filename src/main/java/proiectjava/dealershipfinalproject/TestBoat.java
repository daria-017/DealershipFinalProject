package proiectjava.dealershipfinalproject;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Dragos :>
 */
public class TestBoat {
    public static void main(String[] args) {
        
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
        boats[0] = new Boat(1, "Yamaha", "WaveRunner", (short) 2021, Color.BLUE, 15000.0, 800, boatEngine1, boatTransmission1, null, 200, true, 6.5, true, "Jet Propulsion");
        boats[1] = new Boat(2, "Sea-Doo", "Spark", (short) 2022, Color.RED, 12000.0, 700, boatEngine2, boatTransmission2, null, 150, true, 7.0, false, "Jet Propulsion");
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
    }
}
