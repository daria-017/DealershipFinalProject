package proiectjava.dealershipfinalproject;

import java.awt.Color;

public class AirVehiclesTest {
    public static void main(String[] args) {
        
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
                airplaneEngine1, airplaneTransmission1, null, 80000, 900, 1000, 150, 2, true, false, true,
                "Commercial", 800);
        Airplane airplane3 = new Airplane(airplane2);

        System.out.println(airplane1);
        System.out.println(airplane2);
        System.out.println(airplane3+"\n\n");

       
        Airplane[] allAirplanes = new Airplane[10];
        allAirplanes[0] = new Airplane(1, "Boeing", "747", (short) 2020, Color.GRAY, 25000000, 30000,
                airplaneEngine1, airplaneTransmission2, null, 100000, 950, 1000, 800, 4, true, false, true,
                "Commercial", 1200);
        allAirplanes[1] = new Airplane(2, "Airbus", "A320", (short) 2018, Color.BLUE, 20000000, 25000,
                airplaneEngine2, airplaneTransmission3, null, 90000, 850, 900, 600, 2, true, false, true,
                "Commercial", 600);
        allAirplanes[2] = new Airplane(3, "Cessna", "Skyhawk", (short) 2015, Color.RED, 300000, 1200,
                airplaneEngine3, airplaneTransmission4, null, 5000, 220, 250, 4, 1, false, true, false,
                "Private", 300);
        allAirplanes[3] = new Airplane(4, "Piper", "Cherokee", (short) 2019, Color.YELLOW, 250000, 1100,
                airplaneEngine4, airplaneTransmission5, null, 4000, 240, 260, 4, 1, false, true, false,
                "Private", 400);
        allAirplanes[4] = new Airplane(5, "Bombardier", "Global 7500", (short) 2022, Color.WHITE, 45000000, 35000,
                airplaneEngine5, airplaneTransmission6, null, 100000, 980, 1100, 20, 2, true, false, true,
                "Business", 800);
        allAirplanes[5] = new Airplane(6, "Gulfstream", "G700", (short) 2023, Color.BLACK, 65000000, 40000,
                airplaneEngine6, airplaneTransmission7, null, 120000, 1050, 1150, 25, 2, true, false, true,
                "Business", 900);
        allAirplanes[6] = new Airplane(7, "Lockheed", "SR-71", (short) 1976, Color.WHITE, 120000000, 15000,
                airplaneEngine7, airplaneTransmission8, null, 140000, 3600, 4000, 2, 1, true, false, true,
                "Military", 1500);
        allAirplanes[7] = new Airplane(8, "Antonov", "An-225", (short) 1988, Color.GRAY, 300000000, 60000,
                airplaneEngine8, airplaneTransmission9, null, 640000, 800, 900, 1500, 6, true, true, true,
                "Cargo", 500);
        allAirplanes[8] = new Airplane(9, "Embraer", "E195", (short) 2021, Color.WHITE, 15000000, 20000,
                airplaneEngine9, airplaneTransmission10, null, 85000, 900, 950, 600, 2, true, false, true,
                "Commercial", 600);
        allAirplanes[9] = new Airplane(10, "Dassault", "Falcon 8X", (short) 2023, Color.BLUE, 50000000, 30000,
                airplaneEngine10, airplaneTransmission1, null, 110000, 950, 1050, 20, 2, true, false, true,
                "Business", 700);

        for (Airplane airplane : allAirplanes) {
            System.out.println(airplane);
        }

   
        Helicopter helicopter1 = new Helicopter();
        Helicopter helicopter2 = new Helicopter(1, "Bell", "206", (short) 2020, Color.GREEN, 1200000, 800,
                airplaneEngine1, airplaneTransmission1, null, 4000, 220, 250, (short) 1, 800, 2, true,
                true, "Main Rotor");
        Helicopter helicopter3 = new Helicopter(helicopter2);

        System.out.println("\n\n"+helicopter1);
        System.out.println(helicopter2);
        System.out.println(helicopter3+"\n\n");

     
        Helicopter[] allHelicopters = new Helicopter[10];
        allHelicopters[0] = new Helicopter(2, "Eurocopter", "AS350", (short) 2018, Color.BLUE, 900000, 700,
                airplaneEngine2, airplaneTransmission2, null, 3500, 210, 230, (short) 1, 750, 1, true,
                false, "Main Rotor");
        allHelicopters[1] = new Helicopter(3, "Sikorsky", "UH-60", (short) 2015, Color.BLACK, 15000000, 3000,
                airplaneEngine3, airplaneTransmission3, null, 8000, 295, 315, (short) 4, 900, 4, true,
                true, "Main Rotor");
        allHelicopters[2] = new Helicopter(4, "AgustaWestland", "AW139", (short) 2022, Color.RED, 10000000, 1200,
                airplaneEngine4, airplaneTransmission4, null, 5000, 290, 310, (short) 3, 850, 3, true,
                false, "Coaxial Rotor");
        allHelicopters[3] = new Helicopter(5, "Robinson", "R44", (short) 2021, Color.WHITE, 350000, 400,
                airplaneEngine5, airplaneTransmission5, null, 2000, 200, 220, (short) 2, 600, 1, false,
                false, "Main Rotor");
        allHelicopters[4] = new Helicopter(6, "Kamov", "Ka-52", (short) 2019, Color.GRAY, 18000000, 2500,
                airplaneEngine6, airplaneTransmission6, null, 6000, 310, 340, (short) 6, 1000, 3, true,
                true, "Coaxial Rotor");
        allHelicopters[5] = new Helicopter(7, "Boeing", "AH-64 Apache", (short) 2017, Color.GREEN, 20000000, 3000,
                airplaneEngine7, airplaneTransmission7, null, 7000, 280, 300, (short) 4, 950, 4, true,
                true, "Main Rotor");
        allHelicopters[6] = new Helicopter(8, "Mil", "Mi-26", (short) 2015, Color.GRAY, 25000000, 2000,
                airplaneEngine8, airplaneTransmission8, null, 15000, 250, 270, (short) 8, 1200, 6, true,
                true, "Main Rotor");
        allHelicopters[7] = new Helicopter(9, "Airbus", "H125", (short) 2020, Color.BLUE, 3000000, 900,
                airplaneEngine9, airplaneTransmission9, null, 4000, 245, 265, (short) 2, 700, 2, true,
                false, "Main Rotor");
        allHelicopters[8] = new Helicopter(10, "Leonardo", "AW609", (short) 2021, Color.WHITE, 12000000, 1500,
                airplaneEngine10, airplaneTransmission10, null, 7000, 280, 300, (short) 4, 850, 3, true,
                true, "Tilt Rotor");
        allHelicopters[9] = new Helicopter(11, "Kaman", "K-MAX", (short) 2018, Color.YELLOW, 6000000, 500,
                airplaneEngine1, airplaneTransmission1, null, 4000, 200, 220, (short) 2, 600, 1, true,
                false, "Intermeshing Rotor");

        for (Helicopter helicopter : allHelicopters) {
            System.out.println(helicopter);
        }
        
                
        JetPlane jetPlane1 = new JetPlane();
        JetPlane jetPlane2 = new JetPlane(1, "Concorde", "Type A", (short) 1976, Color.WHITE, 50000000, 40000,
                airplaneEngine1, airplaneTransmission1, null, 120000, 2200, 2400, true, false, "Commercial", true,
                2);
        JetPlane jetPlane3 = new JetPlane(jetPlane2);

        System.out.println("\n\n"+jetPlane1);
        System.out.println(jetPlane2);
        System.out.println(jetPlane3+"\n\n");

       
        JetPlane[] allJetPlanes = new JetPlane[10];
        allJetPlanes[0] = new JetPlane(2, "Boeing", "747", (short) 1990, Color.WHITE, 150000000, 80000,
                airplaneEngine2, airplaneTransmission2, null, 45000, 15000, 900, false, true, "Turbofan", false,
                2);
        allJetPlanes[1] = new JetPlane(3, "Airbus", "A380", (short) 2010, Color.BLUE, 300000000, 120000,
                airplaneEngine3, airplaneTransmission3, null, 43000, 15500, 1020, false, true, "Turbofan", false,
                4);
        allJetPlanes[2] = new JetPlane(4, "Lockheed", "SR-71", (short) 1966, Color.BLACK, 34000000, 30000,
                airplaneEngine4, airplaneTransmission4, null, 85000, 5400, 3700, true, false, "Turbojet", true,
                2);
        allJetPlanes[3] = new JetPlane(5, "McDonnell Douglas", "F-15", (short) 1980, Color.GRAY, 29000000, 25000,
                airplaneEngine5, airplaneTransmission5, null, 65000, 4000, 2650, true, false, "Turbofan", true,
                2);
        allJetPlanes[4] = new JetPlane(6, "Northrop", "B-2 Spirit", (short) 1997, Color.BLACK, 2000000000, 170000,
                airplaneEngine6, airplaneTransmission6, null, 50000, 6000, 1010, true, true, "Turbofan", false,
                4);
        allJetPlanes[5] = new JetPlane(7, "Dassault", "Rafale", (short) 2015, Color.GRAY, 85000000, 24000,
                airplaneEngine7, airplaneTransmission7, null, 52000, 3700, 2120, true, false, "Turbofan", true,
                2);
        allJetPlanes[6] = new JetPlane(8, "Tupolev", "Tu-160", (short) 1987, Color.WHITE, 150000000, 275000,
                airplaneEngine8, airplaneTransmission8, null, 52000, 12300, 2220, true, true, "Turbofan", false,
                4);
        allJetPlanes[7] = new JetPlane(9, "Saab", "Gripen", (short) 2018, Color.GRAY, 85000000, 14000,
                airplaneEngine9, airplaneTransmission9, null, 50000, 3000, 2450, true, false, "Turbofan", true,
                1);
        allJetPlanes[8] = new JetPlane(10, "Boeing", "777", (short) 2016, Color.WHITE, 350000000, 77500,
                airplaneEngine10, airplaneTransmission10, null, 43000, 14300, 905, false, true, "Turbofan", false,
                2);
        allJetPlanes[9] = new JetPlane(11, "Mikoyan", "MiG-29", (short) 1983, Color.GRAY, 29000000, 11000,
                airplaneEngine1, airplaneTransmission1, null, 59000, 3200, 2445, true, false, "Turbofan", true,
                2);

        for (JetPlane jetPlane : allJetPlanes) {
            System.out.println(jetPlane);
        }
        
        

    }
}