package proiectjava.dealershipfinalproject;

import java.awt.Color;
public class TestSailBoat {

    public static void main(String[] args) {
        
        Engine boatEngine1 = new Engine("V4", 100, 50, "Diesel");
        Engine boatEngine2 = new Engine("V6", 200, 100, "Petrol");

        Transmission sailBoatTransmission1 = new Transmission("Manual", 6);
        Transmission sailBoatTransmission2 = new Transmission("Automatic", 5);

        SailBoat sailBoat1 = new SailBoat();
        SailBoat sailBoat2 = new SailBoat();
        
        System.out.println(">>> Sail Boat");
        System.out.println(sailBoat1);
        System.out.println(sailBoat2);

        SailBoat sailBoat3 = new SailBoat(
                1, "Yamaha", "Model X", (short) 2022, Color.BLUE, 25000.0, 1200, boatEngine1,
                sailBoatTransmission1, null, 1000, true, 8.5, true, true);

        SailBoat sailBoat4 = new SailBoat(
                2, "Bayliner", "Model Y", (short) 2023, Color.WHITE, 30000.0, 1500, boatEngine2,
                sailBoatTransmission2, null, 1500, false, 10.0, false, false);

        System.out.println(sailBoat3);
        System.out.println(sailBoat4);

        SailBoat sailBoat5 = new SailBoat(sailBoat3);
        SailBoat sailBoat6 = new SailBoat(sailBoat4);

        System.out.println(sailBoat5);
        System.out.println(sailBoat6);
        
        SailBoat[] sailBoats = new SailBoat[10];
        sailBoats[0] = new SailBoat(3, "Hunter", "Model C", (short) 2021, Color.WHITE, 18000.0, 1400, boatEngine1, sailBoatTransmission2, null, 600, true, 12.0, false, true);
        sailBoats[1] = new SailBoat(4, "Jeanneau", "Model D", (short) 2020, Color.YELLOW, 22000.0, 1700, boatEngine2, sailBoatTransmission1, null, 900, false, 9.8, true, true);
        sailBoats[2] = new SailBoat(5, "Beneteau", "Model E", (short) 2019, Color.GRAY, 19000.0, 1600, boatEngine1, sailBoatTransmission2, null, 400, true, 11.2, false, false);
        sailBoats[3] = new SailBoat(6, "Catalina", "Model F", (short) 2021, Color.GREEN, 21000.0, 1550, boatEngine2, sailBoatTransmission1, null, 800, true, 10.0, true, true);
        sailBoats[4] = new SailBoat(7, "Pearson", "Model G", (short) 2023, Color.PINK, 23000.0, 1650, boatEngine1, sailBoatTransmission2, null, 1000, false, 9.0, false, true);
        sailBoats[5] = new SailBoat(8, "O'Day", "Model H", (short) 2022, Color.ORANGE, 17000.0, 1450, boatEngine2, sailBoatTransmission1, null, 700, true, 10.5, true, false);
        sailBoats[6] = new SailBoat(9, "Freedom", "Model I", (short) 2021, Color.CYAN, 24000.0, 1750, boatEngine1, sailBoatTransmission2, null, 850, false, 8.7, false, true);
        sailBoats[7] = new SailBoat(10, "Morgan", "Model J", (short) 2020, Color.MAGENTA, 26000.0, 1850, boatEngine2, sailBoatTransmission1, null, 950, true, 9.5, true, true);
        sailBoats[8] = new SailBoat(11, "Ericson", "Model K", (short) 2022, Color.DARK_GRAY, 20000.0, 1500, boatEngine1, sailBoatTransmission2, null, 550, false, 10.0, false, false);
        sailBoats[9] = new SailBoat(12, "Hanse", "Model L", (short) 2023, Color.LIGHT_GRAY, 27000.0, 1900, boatEngine2, sailBoatTransmission1, null, 650, true, 9.2, true, true);

        System.out.println(">>> Vector Sail Boat");
        
        for (SailBoat sailBoat : sailBoats) {
            System.out.println(sailBoat);
        }
    }
}
