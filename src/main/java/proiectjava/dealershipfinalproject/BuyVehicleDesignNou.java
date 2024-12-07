package proiectjava.dealershipfinalproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BuyVehicleDesignNou extends javax.swing.JFrame {

    private JPanel jPanel1;
    private JPanel Left, Right;
    private JLabel copyright, carLabel;
    private JLabel title, brand, model, year, color, price, moreLabel;
    private JButton buyButton, moreButton, lessButton;
    private ImageIcon carIcon;
    private JComboBox<String> optionsList, specificVehicleTypes, availableVehicles;

    String selectedLine;

    public BuyVehicleDesignNou() {
        setTitle("Buy Vehicle");
        setPreferredSize(new Dimension(800, 600));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);

        initComponents();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComponents() {
        jPanel1 = new JPanel();
        jPanel1.setLayout(null);
        jPanel1.setPreferredSize(new Dimension(800, 600));

        Left = new JPanel();
        Left.setBackground(new Color(0, 102, 102));
        Left.setBounds(0, 0, 400, 600);
        Left.setLayout(null);

        carLabel = new JLabel();
        carIcon = new ImageIcon();
        carLabel.setIcon(carIcon);
        carLabel.setBounds(50, 50, 300, 300);

        brand = new JLabel();
        brand.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        brand.setForeground(new Color(216, 214, 196));
        brand.setBounds(55, 360, 300, 25);

        model = new JLabel();
        model.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        model.setForeground(new Color(216, 214, 196));
        model.setBounds(55, 390, 300, 25);

        year = new JLabel();
        year.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        year.setForeground(new Color(216, 214, 196));
        year.setBounds(55, 420, 300, 25);

        color = new JLabel();
        color.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        color.setForeground(new Color(216, 214, 196));
        color.setBounds(55, 450, 300, 25);

        price = new JLabel();
        price.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        price.setForeground(new Color(216, 214, 196));
        price.setBounds(55, 480, 300, 25);

        copyright = new JLabel("© Dealership. All rights reserved.");
        copyright.setForeground(new Color(216, 214, 196));
        copyright.setBounds(100, 525, 200, 25);

        String[] vehicleTypes = {"==Please select a vehicle type==", "Land Vehicles", "Water Vehicles", "Air Vehicles"};

        Right = new JPanel();
        Right.setLayout(null);
        Right.setBackground(new Color(216, 214, 196));
        Right.setBounds(400, 0, 400, 600);

        title = new JLabel("DEALERSHIP");
        title.setFont(new Font("Segoe UI", Font.BOLD, 36));
        title.setForeground(new Color(0, 102, 102));
        title.setBounds(85, 35, 300, 100);

        optionsList = new JComboBox<>(vehicleTypes);
        optionsList.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        optionsList.setForeground(new Color(0, 102, 102));
        optionsList.setBackground(new Color(216, 214, 196));
        optionsList.setBounds(30, 200, 325, 40);

        specificVehicleTypes = new JComboBox<>();
        specificVehicleTypes.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        specificVehicleTypes.setForeground(new Color(0, 102, 102));
        specificVehicleTypes.setBackground(new Color(216, 214, 196));
        specificVehicleTypes.setBounds(30, 270, 325, 40);
        specificVehicleTypes.addItem("==No vehicle type selected==");

        availableVehicles = new JComboBox<>();
        availableVehicles.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        availableVehicles.setForeground(new Color(0, 102, 102));
        availableVehicles.setBackground(new Color(216, 214, 196));
        availableVehicles.setBounds(30, 340, 325, 40);
        availableVehicles.addItem("==Not available==");

        buyButton = new JButton("Buy");
        buyButton.setBackground(new Color(0, 102, 102));
        buyButton.setForeground(new Color(216, 214, 196));
        buyButton.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        buyButton.setBounds(55, 400, 100, 50);

        moreButton = new JButton("See more details");
        moreButton.setBackground(new Color(216, 214, 196));
        moreButton.setForeground(new Color(0, 102, 102));
        moreButton.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        moreButton.setBounds(180, 400, 150, 50);

        optionsList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) optionsList.getSelectedItem();

                specificVehicleTypes.removeAllItems();
                switch (selectedItem) {
                    case "==Please select a vehicle type==":
                        specificVehicleTypes.addItem("==No vehicle type selected==");
                        break;

                    case "Land Vehicles":
                        specificVehicleTypes.addItem("Cars");
                        specificVehicleTypes.addItem("Trucks");
                        specificVehicleTypes.addItem("Motorcycles");
                        specificVehicleTypes.addItem("ATVs");
                        specificVehicleTypes.addItem("Scooters");
                        break;

                    case "Water Vehicles":
                        specificVehicleTypes.addItem("Yachts");
                        specificVehicleTypes.addItem("Jet Skis");
                        specificVehicleTypes.addItem("Boats");
                        specificVehicleTypes.addItem("Sail Boats");
                        break;

                    case "Air Vehicles":
                        specificVehicleTypes.addItem("Drones");
                        specificVehicleTypes.addItem("Jet Planes");
                        specificVehicleTypes.addItem("Airplanes");
                        specificVehicleTypes.addItem("Helicopters");
                        break;
                }
            }
        });

        specificVehicleTypes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) specificVehicleTypes.getSelectedItem();
                availableVehicles.removeAllItems();
                if (selectedItem != null) {
                    if (selectedItem.equals("==No vehicle type selected==")) {
                        availableVehicles.addItem("==Not Available==");
                        carLabel.setIcon(carIcon);
                        brand.setText("");
                        model.setText("");
                        year.setText("");
                        color.setText("");
                        price.setText("");
                    } else {
                        try (BufferedReader reader = new BufferedReader(new FileReader("availableVehicles.txt"))) {
                            String line;
                            while ((line = reader.readLine()) != null) {
                                String[] vehicleData = line.split(",");
                                if (vehicleData.length >= 5) {
                                    if (vehicleData[0].trim().equals(selectedItem)) {
                                        availableVehicles.addItem(vehicleData[2].trim() + " - " + vehicleData[3].trim() + " - " + vehicleData[5].trim());
                                    }
                                }
                            }
                        } catch (IOException err) {
                            JOptionPane.showMessageDialog(jPanel1, "Error writing to file!", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
        }
        );

        availableVehicles.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) availableVehicles.getSelectedItem();
                if (selectedItem != null && !selectedItem.equals("==Not available==")) {
                    try (BufferedReader reader = new BufferedReader(new FileReader("availableVehicles.txt"))) {
                        while ((selectedLine = reader.readLine()) != null) {
                            String[] vehicleData = selectedLine.split(",");
                            if (vehicleData.length >= 14 && selectedItem.equals(vehicleData[2] + " - " + vehicleData[3] + " - " + vehicleData[5])) {
                                String imageFileName = vehicleData[14].trim();
                                carLabel.setIcon(new ImageIcon("resources/images/" + imageFileName));
                                brand.setText("Brand: " + vehicleData[2]);
                                model.setText("Model: " + vehicleData[3]);
                                year.setText("Year: " + vehicleData[4]);
                                color.setText("Color: " + vehicleData[5]);
                                price.setText("Price: " + vehicleData[6] + " RON");

                                break;
                            }
                        }
                    } catch (IOException err) {
                        JOptionPane.showMessageDialog(jPanel1, "Error reading file!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        buyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String loggedUser = "-1";
                String selectedVehicle = (String) availableVehicles.getSelectedItem();
                if (selectedVehicle != null && !selectedVehicle.equals("==Not available==")) {
                    try (BufferedReader reader = new BufferedReader(new FileReader("availableVehicles.txt")); BufferedWriter writer = new BufferedWriter(new FileWriter("purchasesNew.txt", true))) {

                        String line;
                        boolean vehicleFound = false;

                        while ((line = reader.readLine()) != null) {
                            String[] vehicleData = line.split(",");
                            if (vehicleData.length >= 6 && selectedVehicle.equals(vehicleData[2] + " - " + vehicleData[3] + " - " + vehicleData[5])) {
                                writer.write(loggedUser + "," + line);
                                writer.newLine();
                                vehicleFound = true;
                                JOptionPane.showMessageDialog(jPanel1, "Vehicle bought successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }
                        }

                        if (!vehicleFound) {
                            JOptionPane.showMessageDialog(jPanel1, "Selected vehicle not found!", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(jPanel1, "Error processing file!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(jPanel1, "No vehicle selected to buy!", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        moreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] parts = selectedLine.split(",");

                // Extract and parse values
                int id = Integer.parseInt(parts[1]);
                String brand = parts[2];
                String model = parts[3];
                short year = Short.parseShort(parts[4]);
                Color color = getColor(parts[5]);
                double price = Double.parseDouble(parts[6]);
                int weight = Integer.parseInt(parts[7]);

                // Create Engine object
                Engine engine = new Engine(parts[8], Integer.parseInt(parts[9]),
                        Integer.parseInt(parts[10]), parts[11]);

                // Create Transmission object
                Transmission transmission = new Transmission(parts[12], Integer.parseInt(parts[13]));

                // Load ImageIcon
                ImageIcon photo = new ImageIcon(parts[14]); // Ensure the path to the image is correct
                int mileage, topSpeed, maxWeight, capacityInKg, nauticalMiles, maxCrew, engineCycles, numberOfSensors;
                int maxAltitude, maxRange, maxSpeed, passengerCapacity, numberOfWings, loudness;
                short numberOfBlades;
                double accelerationTime;
                boolean isConvertible, abs, gps, backupSound, cargoSensor, sport, sonar, hasLifeBuoy, surveillance;
                boolean magnetometer, militaryAircraft, luggageCapacity, highSpeed, cargo;
                String body, type, flag, propulsionType, size, propulsionSystem, category, rotorType;

                switch (parts[0]) {
                    case "Cars":
                        mileage = Integer.parseInt(parts[15]);
                        topSpeed = Integer.parseInt(parts[16]);
                        isConvertible = Boolean.parseBoolean(parts[17]);
                        abs = Boolean.parseBoolean(parts[18]);
                        gps = Boolean.parseBoolean(parts[19]);
                        body = parts[20];
                        Car car = new Car(id, brand, model, year, color, price, weight, engine, transmission, photo,
                                mileage, topSpeed, isConvertible, abs, gps, body);
                        System.out.println(car + "\n");
                        break;

                    case "Trucks":
                        mileage = Integer.parseInt(parts[15]);
                        maxWeight = Integer.parseInt(parts[16]);
                        capacityInKg = Integer.parseInt(parts[17]);
                        backupSound = Boolean.parseBoolean(parts[18]);
                        cargoSensor = Boolean.parseBoolean(parts[19]);
                        Truck truck = new Truck(id, brand, model, year, color, price, weight, engine, transmission, photo,
                                mileage, maxWeight, capacityInKg, backupSound, cargoSensor);
                        System.out.println(truck + "\n");
                        break;

                    case "Motorcycles":
                        mileage = Integer.parseInt(parts[15]);
                        topSpeed = Integer.parseInt(parts[16]);
                        abs = Boolean.parseBoolean(parts[17]);
                        sport = Boolean.parseBoolean(parts[18]);
                        type = parts[19];
                        Motorcycle motorcycle = new Motorcycle(id, brand, model, year, color, price, weight, engine, transmission, photo,
                                mileage, topSpeed, abs, sport, type);
                        System.out.println(motorcycle + "\n");
                        break;

                    case "ATVs":
                        String usage = parts[15];
                        boolean forYouth = Boolean.parseBoolean(parts[16]);
                        boolean offroad = Boolean.parseBoolean(parts[17]);
                        int rackCapacity = Integer.parseInt(parts[18]);
                        String suspensionType = parts[19];
                        Atv atv = new Atv(id, brand, model, year, color, price, weight, engine, transmission, photo,
                                usage, forYouth, offroad, rackCapacity, suspensionType);
                        System.out.println(atv + "\n");
                        break;

                    case "Scooters":
                        type = parts[15];
                        abs = Boolean.parseBoolean(parts[16]);
                        offroad = Boolean.parseBoolean(parts[17]);
                        sport = Boolean.parseBoolean(parts[18]);
                        topSpeed = Integer.parseInt(parts[19]);
                        Scooter scooter = new Scooter(id, brand, model, year, color, price, weight, engine, transmission, photo,
                                type, abs, offroad, sport, topSpeed);
                        System.out.println(scooter + "\n");
                        break;

                    case "Yachts":
                        nauticalMiles = Integer.parseInt(parts[15]);
                        maxCrew = Integer.parseInt(parts[16]);
                        flag = parts[17];
                        Yacht yacht = new Yacht(id, brand, model, year, color, price, weight, engine, transmission, photo,
                                nauticalMiles, maxCrew, flag);
                        System.out.println(yacht + "\n");
                        break;

                    case "Jet Skis":
                        nauticalMiles = Integer.parseInt(parts[15]);
                        boolean handlebars = Boolean.parseBoolean(parts[16]);
                        propulsionSystem = parts[17];
                        Jetski jetski = new Jetski(id, brand, model, year, color, price, weight, engine, transmission, photo,
                                nauticalMiles, handlebars, propulsionSystem);
                        System.out.println(jetski + "\n");
                        break;

                    case "Boats":
                        nauticalMiles = Integer.parseInt(parts[15]);
                        gps = Boolean.parseBoolean(parts[16]);
                        accelerationTime = Double.parseDouble(parts[17]);
                        sonar = Boolean.parseBoolean(parts[18]);
                        propulsionType = parts[19];
                        Boat boat = new Boat(id, brand, model, year, color, price, weight, engine, transmission, photo,
                                nauticalMiles, gps, accelerationTime, sonar, propulsionType);
                        System.out.println(boat + "\n");
                        break;

                    case "Sail Boats":
                        nauticalMiles = Integer.parseInt(parts[15]);
                        gps = Boolean.parseBoolean(parts[16]);
                        accelerationTime = Double.parseDouble(parts[17]);
                        sonar = Boolean.parseBoolean(parts[18]);
                        hasLifeBuoy = Boolean.parseBoolean(parts[19]);
                        SailBoat sailBoat = new SailBoat(id, brand, model, year, color, price, weight, engine, transmission, photo,
                                nauticalMiles, gps, accelerationTime, sonar, hasLifeBuoy);
                        System.out.println(sailBoat + "\n");
                        break;

                    case "Drones":
                        engineCycles = Integer.parseInt(parts[15]);
                        surveillance = Boolean.parseBoolean(parts[16]);
                        size = parts[17];
                        magnetometer = Boolean.parseBoolean(parts[18]);
                        numberOfSensors = Integer.parseInt(parts[19]);
                        Drone drone = new Drone(id, brand, model, year, color, price, weight, engine, transmission, photo,
                                engineCycles, surveillance, size, magnetometer, numberOfSensors);
                        System.out.println(drone + "\n");
                        break;

                    case "Jet Planes":
                        maxAltitude = Integer.parseInt(parts[15]);
                        maxRange = Integer.parseInt(parts[16]);
                        maxSpeed = Integer.parseInt(parts[17]);
                        militaryAircraft = Boolean.parseBoolean(parts[18]);
                        luggageCapacity = Boolean.parseBoolean(parts[19]);
                        propulsionSystem = parts[20];
                        highSpeed = Boolean.parseBoolean(parts[21]);
                        engineCycles = Integer.parseInt(parts[22]);
                        JetPlane jetPlane = new JetPlane(id, brand, model, year, color, price, weight, engine, transmission, photo,
                                maxAltitude, maxRange, maxSpeed, militaryAircraft, luggageCapacity, propulsionSystem, highSpeed, engineCycles);
                        System.out.println(jetPlane + "\n");
                        break;

                    case "Airplanes":
                        maxAltitude = Integer.parseInt(parts[15]);
                        maxRange = Integer.parseInt(parts[16]);
                        maxSpeed = Integer.parseInt(parts[17]);
                        passengerCapacity = Integer.parseInt(parts[18]);
                        numberOfWings = Integer.parseInt(parts[19]);
                        luggageCapacity = Boolean.parseBoolean(parts[20]);
                        cargo = Boolean.parseBoolean(parts[21]);
                        highSpeed = Boolean.parseBoolean(parts[22]);
                        category = parts[23];
                        engineCycles = Integer.parseInt(parts[24]);
                        Airplane airplane = new Airplane(id, brand, model, year, color, price, weight, engine, transmission, photo,
                                maxAltitude, maxRange, maxSpeed, passengerCapacity, numberOfWings, luggageCapacity, cargo,
                                highSpeed, category, engineCycles);
                        System.out.println(airplane + "\n");
                        break;

                    case "Helicopters":
                        maxAltitude = Integer.parseInt(parts[15]);
                        maxRange = Integer.parseInt(parts[16]);
                        maxSpeed = Integer.parseInt(parts[17]);
                        numberOfBlades = Short.parseShort(parts[18]);
                        loudness = Integer.parseInt(parts[19]);
                        engineCycles = Integer.parseInt(parts[20]);
                        militaryAircraft = Boolean.parseBoolean(parts[21]);
                        cargo = Boolean.parseBoolean(parts[22]);
                        rotorType = parts[23];
                        Helicopter helicopter = new Helicopter(id, brand, model, year, color, price, weight, engine, transmission, photo,
                                maxAltitude, maxRange, maxSpeed, numberOfBlades, loudness, engineCycles, militaryAircraft, cargo, rotorType);
                        System.out.println(helicopter + "\n");
                        break;
                }
            }
        });

        Left.add(carLabel);
        Left.add(brand);
        Left.add(model);
        Left.add(year);
        Left.add(color);
        Left.add(price);
        Left.add(copyright);

        Right.add(title);
        Right.add(optionsList);
        Right.add(specificVehicleTypes);
        Right.add(availableVehicles);
        Right.add(buyButton);
        Right.add(moreButton);

        jPanel1.add(Left);
        jPanel1.add(Right);
        add(jPanel1);
    }

    private void handleSomething() {
    }

    public static void main(String[] args) {
        new BuyVehicleDesignNou();
    }

    private static Color getColor(String colorName) {
        switch (colorName.toLowerCase()) {
            case "blue":
                return Color.BLUE;
            case "red":
                return Color.RED;
            case "green":
                return Color.GREEN;
            case "black":
                return Color.BLACK;
            case "white":
                return Color.WHITE;
            default:
                return Color.GRAY; // Default color if no match
        }
    }
}
