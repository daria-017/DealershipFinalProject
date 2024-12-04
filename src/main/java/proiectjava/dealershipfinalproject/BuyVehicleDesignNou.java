package proiectjava.dealershipfinalproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class BuyVehicleDesignNou extends javax.swing.JFrame {

    private JPanel jPanel1;
    private JPanel Left, Right;
    private JLabel copyright, carLabel;
    private JLabel title, brand, model, year, color, price, moreLabel;
    private JButton buyButton, moreButton;
    private ImageIcon carIcon;
    private JComboBox<String> optionsList, specificVehicleTypes, availableVehicles;

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
        
        moreLabel = new JLabel("Already have an account?");
        moreLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        moreLabel.setForeground(new Color(0, 102, 102));
        moreLabel.setBounds(40, 605, 200, 40);

        

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
                        String line;
                        while ((line = reader.readLine()) != null) {
                            String[] vehicleData = line.split(",");
                            if (vehicleData.length >= 14 && selectedItem.startsWith(vehicleData[2].trim())) {
                                String imageFileName = vehicleData[14].trim();
                                carLabel.setIcon(new ImageIcon(imageFileName));
                                brand.setText("Brand: " + vehicleData[2]);
                                model.setText("Model: " + vehicleData[3]);
                                year.setText("Year: " + vehicleData[4]);
                                color.setText("Color: " + vehicleData[5]);
                                price.setText("Price: " + vehicleData[6] + " RON");
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
            }
        });

        moreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new LoginFrame();
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
}
