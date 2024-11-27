/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package proiectjava.dealershipfinalproject;

import java.awt.Color;

/**
 *
 * @author Daria
 */
public class DealershipFinalProject {

    public static void main(String[] args) {
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
    }
}
