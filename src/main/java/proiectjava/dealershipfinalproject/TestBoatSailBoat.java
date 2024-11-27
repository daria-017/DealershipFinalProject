package proiectjava.dealershipfinalproject;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Dragos :>
 */
public class TestBoatSailBoat {
    public static void main(String[] args) {
        
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
                1, "Yamaha", "Model X", (short) 2022, Color.BLUE, 25000.0, 1200, sailBoatEngine1,
                sailBoatTransmission1, null, 1000, true, 8.5, true, true);

        SailBoat sailBoat4 = new SailBoat(
                2, "Bayliner", "Model Y", (short) 2023, Color.WHITE, 30000.0, 1500, sailBoatEngine2,
                sailBoatTransmission2, null, 1500, false, 10.0, false, false);

        System.out.println(sailBoat3);
        System.out.println(sailBoat4);

        SailBoat sailBoat5 = new SailBoat(sailBoat3);
        SailBoat sailBoat6 = new SailBoat(sailBoat4);

        System.out.println(sailBoat5);
        System.out.println(sailBoat6);
        
        SailBoat[] sailBoats = new SailBoat[10];
        sailBoats[0] = new SailBoat(3, "Hunter", "Model C", (short) 2021, Color.WHITE, 18000.0, 1400, sailBoatEngine1, sailBoatTransmission2, null, 600, true, 12.0, false, true);
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
    }
}
