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
    private JPanel left, right;
    private JPanel morePanel, lessPanel;
    private JLabel copyright, carLabel, logoLabel;
    private JLabel title, brand, model, year, color, price;
    private JButton buyButton, moreButton, lessButton, backButton;
    private ImageIcon carIcon;
    private JComboBox<String> optionsList1, optionsList2, optionsList3;
    private JTextArea moreText;
    private JScrollPane moreScroll;

    private ImageIcon logoIcon;
    private String selectedLine;
    private boolean visibilityToggle;

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

        // Left side --------------------------------------------------------------------
        left = new JPanel();
        left.setBackground(new Color(0, 102, 102));
        left.setBounds(0, 0, 400, 600);
        left.setLayout(null);

        logoLabel = new JLabel();
        logoIcon = new ImageIcon("Dealership_logo_200px.png");
        logoLabel.setIcon(logoIcon);
        logoLabel.setBounds(100, 180, 200, 200);

        carLabel = new JLabel();
        carIcon = new ImageIcon();
        carLabel.setIcon(carIcon);
        carLabel.setBounds(50, 50, 300, 300);

        brand = new JLabel();
        brand.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        brand.setForeground(new Color(0, 102, 102));
        brand.setBounds(75, 380, 300, 25);

        model = new JLabel();
        model.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        model.setForeground(new Color(0, 102, 102));
        model.setBounds(75, 406, 300, 25);

        year = new JLabel();
        year.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        year.setForeground(new Color(0, 102, 102));
        year.setBounds(75, 432, 300, 25);

        color = new JLabel();
        color.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        color.setForeground(new Color(0, 102, 102));
        color.setBounds(75, 458, 300, 25);

        price = new JLabel();
        price.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        price.setForeground(new Color(0, 102, 102));
        price.setBounds(75, 484, 300, 25);

        morePanel = new JPanel();
        morePanel.setBackground(new Color(216, 214, 196));
        morePanel.setBounds(50, 50, 300, 470);

        lessPanel = new JPanel();
        lessPanel.setBackground(new Color(216, 214, 196));
        lessPanel.setBounds(50, 370, 300, 150);

        moreText = new JTextArea();
        moreText.setEditable(false);
        moreText.setForeground(new Color(0, 102, 102));
        moreText.setBackground(new Color(216, 214, 196));
        moreText.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        moreText.setFocusable(false);
        moreScroll = new JScrollPane(moreText);
        moreScroll.setBounds(75, 75, 250, 420);
        moreScroll.setBorder(null);

        copyright = new JLabel("© Dealership. All rights reserved.");
        copyright.setForeground(new Color(216, 214, 196));
        copyright.setBounds(100, 525, 200, 25);

        // Right side ---------------------------------------------------------------------
        String[] vehicleTypes = {"==Please select a vehicle type==", "Land Vehicles", "Water Vehicles", "Air Vehicles"};

        right = new JPanel();
        right.setLayout(null);
        right.setBackground(new Color(216, 214, 196));
        right.setBounds(400, 0, 400, 600);

        title = new JLabel("DEALERSHIP");
        title.setFont(new Font("Segoe UI", Font.BOLD, 36));
        title.setForeground(new Color(0, 102, 102));
        title.setBounds(85, 35, 300, 100);

        optionsList1 = new JComboBox<>(vehicleTypes);
        optionsList1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        optionsList1.setForeground(new Color(0, 102, 102));
        optionsList1.setBackground(new Color(216, 214, 196));
        optionsList1.setBounds(30, 200, 325, 40);
        optionsList1.setFocusable(false);

        optionsList2 = new JComboBox<>();
        optionsList2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        optionsList2.setForeground(new Color(0, 102, 102));
        optionsList2.setBackground(new Color(216, 214, 196));
        optionsList2.setBounds(30, 270, 325, 40);
        optionsList2.addItem("==No vehicle type selected==");
        optionsList2.setFocusable(false);

        optionsList3 = new JComboBox<>();
        optionsList3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        optionsList3.setForeground(new Color(0, 102, 102));
        optionsList3.setBackground(new Color(216, 214, 196));
        optionsList3.setBounds(30, 340, 325, 40);
        optionsList3.addItem("==Not available==");
        optionsList3.setFocusable(false);

        buyButton = new JButton("Buy");
        buyButton.setBackground(new Color(0, 102, 102));
        buyButton.setForeground(new Color(216, 214, 196));
        buyButton.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        buyButton.setBounds(55, 400, 100, 50);
        buyButton.setFocusable(false);

        moreButton = new JButton("See more details");
        moreButton.setBackground(new Color(216, 214, 196));
        moreButton.setForeground(new Color(0, 102, 102));
        moreButton.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        moreButton.setBounds(180, 400, 150, 50);
        moreButton.setFocusable(false);

        lessButton = new JButton("See less details");
        lessButton.setBackground(new Color(216, 214, 196));
        lessButton.setForeground(new Color(0, 102, 102));
        lessButton.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        lessButton.setBounds(180, 400, 150, 50);
        lessButton.setFocusable(false);

        backButton = new JButton("< Go back");
        backButton.setBackground(new Color(216, 214, 196));
        backButton.setForeground(new Color(0, 102, 102));
        backButton.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        backButton.setBounds(127, 470, 125, 50);
        backButton.setFocusable(false);

        // Putting everything together --------------------------------------------------------
        left.add(carLabel);
        left.add(brand);
        left.add(model);
        left.add(year);
        left.add(color);
        left.add(price);
        left.add(moreScroll);
        left.add(morePanel);
        left.add(lessPanel);
        left.add(logoLabel);
        left.add(copyright);

        right.add(title);
        right.add(optionsList1);
        right.add(optionsList2);
        right.add(optionsList3);
        right.add(buyButton);
        right.add(lessButton);
        right.add(moreButton);
        right.add(backButton);

        jPanel1.add(left);
        jPanel1.add(right);
        add(jPanel1);

        visibilityToggle = false;
        visibilityManager();

        // Listeners --------------------------------------------------------------------
        optionsList1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) optionsList1.getSelectedItem();

                optionsList2.removeAllItems();
                switch (selectedItem) {
                    case "Land Vehicles":
                        optionsList2.addItem("Cars");
                        optionsList2.addItem("Trucks");
                        optionsList2.addItem("Motorcycles");
                        optionsList2.addItem("ATVs");
                        optionsList2.addItem("Scooters");
                        break;

                    case "Water Vehicles":
                        optionsList2.addItem("Yachts");
                        optionsList2.addItem("Jet Skis");
                        optionsList2.addItem("Boats");
                        optionsList2.addItem("Sail Boats");
                        break;

                    case "Air Vehicles":
                        optionsList2.addItem("Drones");
                        optionsList2.addItem("Jet Planes");
                        optionsList2.addItem("Airplanes");
                        optionsList2.addItem("Helicopters");
                        break;

                    default:
                        optionsList2.addItem("==No vehicle type selected==");
                        break;

                }
            }
        });

        optionsList2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) optionsList2.getSelectedItem();
                optionsList3.removeAllItems();
                if (selectedItem != null) {
                    if (selectedItem.equals("==No vehicle type selected==")) {
                        optionsList3.addItem("==Not Available==");
                    } else {
                        try (BufferedReader reader = new BufferedReader(new FileReader("availableVehicles.txt"))) {
                            String line;
                            while ((line = reader.readLine()) != null) {
                                String[] vehicleData = line.split(",");
                                if (vehicleData.length >= 6) {
                                    if (vehicleData[0].trim().equals(selectedItem)) {
                                        optionsList3.addItem(vehicleData[2].trim() + " - " + vehicleData[3].trim() + " - " + vehicleData[5].trim());
                                    }
                                }
                            }
                        } catch (IOException err) {
                            JOptionPane.showMessageDialog(jPanel1, "Error writing to file!", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
        });

        optionsList3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) optionsList3.getSelectedItem();
                if (selectedItem != null && !selectedItem.equals("==Not available==")) {
                    try (BufferedReader reader = new BufferedReader(new FileReader("availableVehicles.txt"))) {
                        while ((selectedLine = reader.readLine()) != null) {
                            String[] vehicleData = selectedLine.split(",");
                            if (vehicleData.length >= 15 && selectedItem.equals(vehicleData[2] + " - " + vehicleData[3] + " - " + vehicleData[5])) {
                                break;
                            }
                        }
                    } catch (IOException err) {
                        JOptionPane.showMessageDialog(jPanel1, "Error reading file!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                visibilityManager();
            }
        });

        buyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String loggedUser = "-1";
                String selectedVehicle = (String) optionsList3.getSelectedItem();
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
                visibilityToggle = true;
                visibilityManager();
            }
        });

        lessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visibilityToggle = false;
                visibilityManager();
            }
        });

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                MainFrame.main(null);
            }
        });

    }

    public static void main(String[] args) {
        new BuyVehicleDesignNou();
    }

    // Methods
    private void lessDetailsScript() {
        String[] vehicleData = selectedLine.split(",");
        String imageFileName = vehicleData[14].trim();
        carLabel.setIcon(new ImageIcon("resources/images/" + imageFileName));
        brand.setText("Brand: " + vehicleData[2]);
        model.setText("Model: " + vehicleData[3]);
        year.setText("Year: " + vehicleData[4]);
        color.setText("Color: " + vehicleData[5]);
        price.setText("Price: " + vehicleData[6] + " RON");

    }

    private void moreDetailsScript() {
        String[] parts = selectedLine.split(",");

        // General
        int id = Integer.parseInt(parts[1]);
        String brand = parts[2];
        String model = parts[3];
        short year = Short.parseShort(parts[4]);
        Color color = getColor(parts[5]);
        double price = Double.parseDouble(parts[6]);
        int weight = Integer.parseInt(parts[7]);
        ImageIcon photo = new ImageIcon(parts[14]);
        // Engine
        Engine engine = new Engine(parts[8], Integer.parseInt(parts[9]),
                Integer.parseInt(parts[10]), parts[11]);
        // Transmission
        Transmission transmission = new Transmission(parts[12], Integer.parseInt(parts[13]));

        // Vehicle Specific
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
                moreText.setText(car.toString());
                moreText.setCaretPosition(0);
                moreText.getCaret().setVisible(false);
                break;

            case "Trucks":
                mileage = Integer.parseInt(parts[15]);
                maxWeight = Integer.parseInt(parts[16]);
                capacityInKg = Integer.parseInt(parts[17]);
                backupSound = Boolean.parseBoolean(parts[18]);
                cargoSensor = Boolean.parseBoolean(parts[19]);
                Truck truck = new Truck(id, brand, model, year, color, price, weight, engine, transmission, photo,
                        mileage, maxWeight, capacityInKg, backupSound, cargoSensor);
                moreText.setText(truck.toString());
                moreText.setCaretPosition(0);
                moreText.getCaret().setVisible(false);
                break;

            case "Motorcycles":
                mileage = Integer.parseInt(parts[15]);
                topSpeed = Integer.parseInt(parts[16]);
                abs = Boolean.parseBoolean(parts[17]);
                sport = Boolean.parseBoolean(parts[18]);
                type = parts[19];
                Motorcycle motorcycle = new Motorcycle(id, brand, model, year, color, price, weight, engine, transmission, photo,
                        mileage, topSpeed, abs, sport, type);
                moreText.setText(motorcycle.toString());
                moreText.setCaretPosition(0);
                moreText.getCaret().setVisible(false);
                break;

            case "ATVs":
                String usage = parts[15];
                boolean forYouth = Boolean.parseBoolean(parts[16]);
                boolean offroad = Boolean.parseBoolean(parts[17]);
                int rackCapacity = Integer.parseInt(parts[18]);
                String suspensionType = parts[19];
                Atv atv = new Atv(id, brand, model, year, color, price, weight, engine, transmission, photo,
                        usage, forYouth, offroad, rackCapacity, suspensionType);
                moreText.setText(atv.toString());
                moreText.setCaretPosition(0);
                moreText.getCaret().setVisible(false);
                break;

            case "Scooters":
                type = parts[15];
                abs = Boolean.parseBoolean(parts[16]);
                offroad = Boolean.parseBoolean(parts[17]);
                sport = Boolean.parseBoolean(parts[18]);
                topSpeed = Integer.parseInt(parts[19]);
                Scooter scooter = new Scooter(id, brand, model, year, color, price, weight, engine, transmission, photo,
                        type, abs, offroad, sport, topSpeed);
                moreText.setText(scooter.toString());
                moreText.setCaretPosition(0);
                moreText.getCaret().setVisible(false);
                break;

            case "Yachts":
                nauticalMiles = Integer.parseInt(parts[15]);
                maxCrew = Integer.parseInt(parts[16]);
                flag = parts[17];
                Yacht yacht = new Yacht(id, brand, model, year, color, price, weight, engine, transmission, photo,
                        nauticalMiles, maxCrew, flag);
                moreText.setText(yacht.toString());
                moreText.setCaretPosition(0);
                moreText.getCaret().setVisible(false);
                break;

            case "Jet Skis":
                nauticalMiles = Integer.parseInt(parts[15]);
                boolean handlebars = Boolean.parseBoolean(parts[16]);
                propulsionSystem = parts[17];
                Jetski jetski = new Jetski(id, brand, model, year, color, price, weight, engine, transmission, photo,
                        nauticalMiles, handlebars, propulsionSystem);
                moreText.setText(jetski.toString());
                moreText.setCaretPosition(0);
                moreText.getCaret().setVisible(false);
                break;

            case "Boats":
                nauticalMiles = Integer.parseInt(parts[15]);
                gps = Boolean.parseBoolean(parts[16]);
                accelerationTime = Double.parseDouble(parts[17]);
                sonar = Boolean.parseBoolean(parts[18]);
                propulsionType = parts[19];
                Boat boat = new Boat(id, brand, model, year, color, price, weight, engine, transmission, photo,
                        nauticalMiles, gps, accelerationTime, sonar, propulsionType);
                moreText.setText(boat.toString());
                moreText.setCaretPosition(0);
                moreText.getCaret().setVisible(false);
                break;

            case "Sail Boats":
                nauticalMiles = Integer.parseInt(parts[15]);
                gps = Boolean.parseBoolean(parts[16]);
                accelerationTime = Double.parseDouble(parts[17]);
                sonar = Boolean.parseBoolean(parts[18]);
                hasLifeBuoy = Boolean.parseBoolean(parts[19]);
                SailBoat sailBoat = new SailBoat(id, brand, model, year, color, price, weight, engine, transmission, photo,
                        nauticalMiles, gps, accelerationTime, sonar, hasLifeBuoy);
                moreText.setText(sailBoat.toString());
                moreText.setCaretPosition(0);
                moreText.getCaret().setVisible(false);
                break;

            case "Drones":
                engineCycles = Integer.parseInt(parts[15]);
                surveillance = Boolean.parseBoolean(parts[16]);
                size = parts[17];
                magnetometer = Boolean.parseBoolean(parts[18]);
                numberOfSensors = Integer.parseInt(parts[19]);
                Drone drone = new Drone(id, brand, model, year, color, price, weight, engine, transmission, photo,
                        engineCycles, surveillance, size, magnetometer, numberOfSensors);
                moreText.setText(drone.toString());
                moreText.setCaretPosition(0);
                moreText.getCaret().setVisible(false);
                break;

            case "Jet Planes":
                maxAltitude = Integer.parseInt(parts[15]);
                maxRange = Integer.parseInt(parts[16]);
                maxSpeed = Integer.parseInt(parts[17]);
                engineCycles = Integer.parseInt(parts[18]);
                propulsionSystem = parts[19];
                JetPlane jetPlane = new JetPlane(id, brand, model, year, color, price, weight, engine, transmission, photo,
                        maxAltitude, maxRange, maxSpeed, engineCycles, propulsionSystem);
                moreText.setText(jetPlane.toString());
                moreText.setCaretPosition(0);
                moreText.getCaret().setVisible(false);
                break;

            case "Airplanes":
                maxAltitude = Integer.parseInt(parts[15]);
                maxRange = Integer.parseInt(parts[16]);
                maxSpeed = Integer.parseInt(parts[17]);
                passengerCapacity = Integer.parseInt(parts[18]);
                category = parts[19];
                Airplane airplane = new Airplane(id, brand, model, year, color, price, weight, engine, transmission, photo,
                        maxAltitude, maxRange, maxSpeed, passengerCapacity, category);
                moreText.setText(airplane.toString());
                moreText.setCaretPosition(0);
                moreText.getCaret().setVisible(false);
                break;

            case "Helicopters":
                maxAltitude = Integer.parseInt(parts[15]);
                maxRange = Integer.parseInt(parts[16]);
                maxSpeed = Integer.parseInt(parts[17]);
                engineCycles = Integer.parseInt(parts[18]);
                rotorType = parts[23];
                Helicopter helicopter = new Helicopter(id, brand, model, year, color, price, weight, engine, transmission, photo,
                        maxAltitude, maxRange, maxSpeed, engineCycles, rotorType);
                moreText.setText(helicopter.toString());
                moreText.setCaretPosition(0);
                moreText.getCaret().setVisible(false);
                break;
        }
    }

    private static Color getColor(String colorName) {
        switch (colorName.toLowerCase()) {
            case "black":
                return Color.BLACK;
            case "blue":
                return Color.BLUE;
            case "cyan":
                return Color.CYAN;
            case "dark gray":
                return Color.DARK_GRAY;
            case "gray":
                return Color.GRAY;
            case "green":
                return Color.GREEN;
            case "light gray":
                return Color.LIGHT_GRAY;
            case "magenta":
                return Color.MAGENTA;
            case "orange":
                return Color.ORANGE;
            case "pink":
                return Color.PINK;
            case "red":
                return Color.RED;
            case "white":
                return Color.WHITE;
            case "yellow":
                return Color.YELLOW;
            default:
                return null;
        }
    }

    private void visibilityManager() {
        boolean nullCheck = (selectedLine == null);
        carLabel.setVisible(!nullCheck ? !visibilityToggle : false);
        brand.setVisible(!nullCheck ? !visibilityToggle : false);
        model.setVisible(!nullCheck ? !visibilityToggle : false);
        year.setVisible(!nullCheck ? !visibilityToggle : false);
        color.setVisible(!nullCheck ? !visibilityToggle : false);
        price.setVisible(!nullCheck ? !visibilityToggle : false);
        lessPanel.setVisible(!nullCheck ? !visibilityToggle : false);
        moreButton.setVisible(!visibilityToggle);

        moreScroll.setVisible(!nullCheck ? visibilityToggle : false);
        morePanel.setVisible(!nullCheck ? visibilityToggle : false);
        lessButton.setVisible(visibilityToggle);

        logoLabel.setVisible(nullCheck);

        if (!nullCheck) {
            if (visibilityToggle) {
                moreDetailsScript();
            } else {
                lessDetailsScript();
            }
        }
    }
}
