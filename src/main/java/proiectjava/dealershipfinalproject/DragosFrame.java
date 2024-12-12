package proiectjava.dealershipfinalproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DragosFrame extends javax.swing.JFrame {

    private JPanel jPanel;

    // Left Screen
    private JPanel left;
    private JPanel textPanel, fPanel, generalFPanel, ETFPanel, moreFPanel;
    private JLabel copyright;
    private JTextArea vehicleText;
    private JScrollPane textScroll;

    // Main Page
    private JLabel mainTitle;
    private JButton generalFButton, ETFButton, moreFButton;
    private JButton filterButton, filterGButton, filterETButton, filterMButton;
    private JButton clearButton, backGButton, backETButton, backMButton;

    // General Filters
    private JLabel generalTitle, fTypeLabel, fIDLabel, fBrandLabel, fModelLabel, fYearLabel, fColorLabel, fPriceLabel, fWeightLabel;
    private JTextField fID, fBrand, fModel, fYear, fPrice, fWeight;
    private JComboBox fType, fColor;

    // ET Filters
    private JLabel ETTitle, fEngineTypeLabel, fHorsepowerLabel, fFuelCapacityLabel, fTypeOfFuelLabel, fTransmissionTypeLabel, fNumberOfGearsLabel;
    private JTextField fEngineType, fHorsepower, fFuelCapacity, fTypeOfFuel, fTransmissionType, fNumberOfGears;

    // More Filters
    private JLabel moreTitle, fNauticalMilesLabel, fGPSLabel, fAccelerationTimeLabel, fSonarLabel, fPropulsionTypeLabel, fHasLifeBuoyLabel;
    private JTextField fNauticalMiles, fAccelerationTime, fPropulsionType;
    private JComboBox fGPS, fSonar, fHasLifeBuoy;

    // Variables
    private ArrayList<Boat> boats;
    private ArrayList<SailBoat> sailBoats;

    private String availableVehicles;
    private int vehicleType;

    public DragosFrame() {
        setTitle("Filters Frame");
        setPreferredSize(new Dimension(800, 600));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);

        initComponents();
        initVehicles();
        clearFilters();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        visibilityManager(0);
    }

    private void initComponents() {
        jPanel = new JPanel();
        jPanel.setLayout(null);
        jPanel.setPreferredSize(new Dimension(800, 600));

        // Left side --------------------------------------------------------------------
        left = new JPanel();
        left.setBackground(new Color(0, 102, 102));
        left.setBounds(0, 0, 400, 600);
        left.setLayout(null);

        textPanel = new JPanel();
        textPanel.setBackground(new Color(216, 214, 196));
        textPanel.setBounds(50, 50, 300, 470);

        vehicleText = new JTextArea();
        vehicleText.setEditable(false);
        vehicleText.setForeground(new Color(0, 102, 102));
        vehicleText.setBackground(new Color(216, 214, 196));
        vehicleText.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        vehicleText.setFocusable(false);
        textScroll = new JScrollPane(vehicleText);
        textScroll.setBounds(75, 75, 250, 420);
        textScroll.setBorder(null);

        copyright = new JLabel("© Dealership. All rights reserved.");
        copyright.setForeground(new Color(216, 214, 196));
        copyright.setBounds(100, 525, 200, 25);

        // Right side ---------------------------------------------------------------------
        fPanel = new JPanel();
        fPanel.setLayout(null);
        fPanel.setBackground(new Color(216, 214, 196));
        fPanel.setBounds(400, 0, 400, 600);

        generalFPanel = new JPanel();
        generalFPanel.setLayout(null);
        generalFPanel.setBackground(new Color(216, 214, 196));
        generalFPanel.setBounds(400, 0, 400, 600);

        ETFPanel = new JPanel();
        ETFPanel.setLayout(null);
        ETFPanel.setBackground(new Color(216, 214, 196));
        ETFPanel.setBounds(400, 0, 400, 600);

        moreFPanel = new JPanel();
        moreFPanel.setLayout(null);
        moreFPanel.setBackground(new Color(216, 214, 196));
        moreFPanel.setBounds(400, 0, 400, 600);

        // Main Page -----------------------------------------
        mainTitle = new JLabel("FILTERS");
        mainTitle.setFont(new Font("Segoe UI", Font.BOLD, 36));
        mainTitle.setForeground(new Color(0, 102, 102));
        mainTitle.setBounds(-10, 70, 400, 30);
        mainTitle.setHorizontalAlignment(SwingConstants.CENTER);
        mainTitle.setVerticalAlignment(SwingConstants.CENTER);

        generalFButton = new JButton("General Filters");
        generalFButton.setBackground(new Color(216, 214, 196));
        generalFButton.setForeground(new Color(0, 102, 102));
        generalFButton.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        generalFButton.setBounds(30, 230, 150, 50);

        ETFButton = new JButton("E&T Filters");
        ETFButton.setBackground(new Color(216, 214, 196));
        ETFButton.setForeground(new Color(0, 102, 102));
        ETFButton.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        ETFButton.setBounds(200, 230, 150, 50);

        moreFButton = new JButton("More FIlters");
        moreFButton.setBackground(new Color(216, 214, 196));
        moreFButton.setForeground(new Color(0, 102, 102));
        moreFButton.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        moreFButton.setBounds(115, 300, 150, 50);
        moreFButton.setEnabled(false);

        filterButton = new JButton("FILTER");
        filterButton.setBackground(new Color(0, 102, 102));
        filterButton.setForeground(new Color(216, 214, 196));
        filterButton.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        filterButton.setBounds(200, 470, 150, 50);
        filterButton.setFocusable(false);

        clearButton = new JButton("CLEAR");
        clearButton.setBackground(new Color(216, 214, 196));
        clearButton.setForeground(new Color(0, 102, 102));
        clearButton.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        clearButton.setBounds(30, 470, 150, 50);
        clearButton.setFocusable(false);

        // General Filters Page
        generalTitle = new JLabel("GENERAL FILTERS");
        generalTitle.setFont(new Font("Segoe UI", Font.BOLD, 36));
        generalTitle.setForeground(new Color(0, 102, 102));
        generalTitle.setBounds(-10, 70, 400, 30);
        generalTitle.setHorizontalAlignment(SwingConstants.CENTER);
        generalTitle.setVerticalAlignment(SwingConstants.CENTER);

        String[] vehicleTypes = {"Any Vehicle", "Boats", "Sail Boats"};

        fTypeLabel = new JLabel("Vehicle Type (=)");
        fTypeLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        fTypeLabel.setForeground(new Color(0, 102, 102));
        fTypeLabel.setBounds(30, 150, 200, 30);
        fType = new JComboBox<>(vehicleTypes);
        fType.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        fType.setForeground(new Color(0, 102, 102));
        fType.setBackground(new Color(216, 214, 196));
        fType.setBounds(30, 180, 150, 40);
        fType.setFocusable(false);

        fIDLabel = new JLabel("ID (int) (=)");
        fIDLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        fIDLabel.setForeground(new Color(0, 102, 102));
        fIDLabel.setBounds(200, 150, 200, 30);
        fID = new JTextField();
        fID.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        fID.setBackground(new Color(216, 214, 196));
        fID.setBounds(200, 180, 150, 40);

        fBrandLabel = new JLabel("Brand (string) (=)");
        fBrandLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        fBrandLabel.setForeground(new Color(0, 102, 102));
        fBrandLabel.setBounds(30, 220, 200, 30);
        fBrand = new JTextField();
        fBrand.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        fBrand.setBackground(new Color(216, 214, 196));
        fBrand.setBounds(30, 250, 150, 40);

        fModelLabel = new JLabel("Model (string) (=)");
        fModelLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        fModelLabel.setForeground(new Color(0, 102, 102));
        fModelLabel.setBounds(200, 220, 200, 30);
        fModel = new JTextField();
        fModel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        fModel.setBackground(new Color(216, 214, 196));
        fModel.setBounds(200, 250, 150, 40);

        fYearLabel = new JLabel("Year (short) (>=)");
        fYearLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        fYearLabel.setForeground(new Color(0, 102, 102));
        fYearLabel.setBounds(30, 290, 200, 30);
        fYear = new JTextField();
        fYear.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        fYear.setBackground(new Color(216, 214, 196));
        fYear.setBounds(30, 320, 150, 40);

        String[] colors = {"Any Color", "Black", "Blue", "Cyan", "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange",
            "Pink", "Red", "White", "Yellow"};

        fColorLabel = new JLabel("Color (=)");
        fColorLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        fColorLabel.setForeground(new Color(0, 102, 102));
        fColorLabel.setBounds(200, 290, 200, 30);
        fColor = new JComboBox<>(colors);
        fColor.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        fColor.setForeground(new Color(0, 102, 102));
        fColor.setBackground(new Color(216, 214, 196));
        fColor.setBounds(200, 320, 150, 40);
        fColor.setFocusable(false);

        fPriceLabel = new JLabel("Price (double) (<=)");
        fPriceLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        fPriceLabel.setForeground(new Color(0, 102, 102));
        fPriceLabel.setBounds(30, 360, 200, 30);
        fPrice = new JTextField();
        fPrice.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        fPrice.setBackground(new Color(216, 214, 196));
        fPrice.setBounds(30, 390, 150, 40);

        fWeightLabel = new JLabel("Weight (int) (<=)");
        fWeightLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        fWeightLabel.setForeground(new Color(0, 102, 102));
        fWeightLabel.setBounds(200, 360, 200, 30);
        fWeight = new JTextField();
        fWeight.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        fWeight.setBackground(new Color(216, 214, 196));
        fWeight.setBounds(200, 390, 150, 40);

        filterGButton = new JButton("FILTER");
        filterGButton.setBackground(new Color(0, 102, 102));
        filterGButton.setForeground(new Color(216, 214, 196));
        filterGButton.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        filterGButton.setBounds(200, 470, 150, 50);
        filterGButton.setFocusable(false);

        backGButton = new JButton("< Go Back");
        backGButton.setBackground(new Color(216, 214, 196));
        backGButton.setForeground(new Color(0, 102, 102));
        backGButton.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        backGButton.setBounds(30, 470, 150, 50);
        backGButton.setFocusable(false);

        // Engine & Transmission Filters Page
        ETTitle = new JLabel("E&T FILTERS");
        ETTitle.setFont(new Font("Segoe UI", Font.BOLD, 36));
        ETTitle.setForeground(new Color(0, 102, 102));
        ETTitle.setBounds(-10, 70, 400, 30);
        ETTitle.setHorizontalAlignment(SwingConstants.CENTER);
        ETTitle.setVerticalAlignment(SwingConstants.CENTER);

        fEngineTypeLabel = new JLabel("Engine Type (string) (=)");
        fEngineTypeLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        fEngineTypeLabel.setForeground(new Color(0, 102, 102));
        fEngineTypeLabel.setBounds(30, 150, 200, 30);
        fEngineType = new JTextField();
        fEngineType.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        fEngineType.setBackground(new Color(216, 214, 196));
        fEngineType.setBounds(30, 180, 150, 40);

        fHorsepowerLabel = new JLabel("Horsepower (int) (>=)");
        fHorsepowerLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        fHorsepowerLabel.setForeground(new Color(0, 102, 102));
        fHorsepowerLabel.setBounds(200, 150, 200, 30);
        fHorsepower = new JTextField();
        fHorsepower.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        fHorsepower.setBackground(new Color(216, 214, 196));
        fHorsepower.setBounds(200, 180, 150, 40);

        fFuelCapacityLabel = new JLabel("Fuel Capacity (int) (>=)");
        fFuelCapacityLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        fFuelCapacityLabel.setForeground(new Color(0, 102, 102));
        fFuelCapacityLabel.setBounds(30, 220, 200, 30);
        fFuelCapacity = new JTextField();
        fFuelCapacity.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        fFuelCapacity.setBackground(new Color(216, 214, 196));
        fFuelCapacity.setBounds(30, 250, 150, 40);

        fTypeOfFuelLabel = new JLabel("Type of Fuel (string) (=)");
        fTypeOfFuelLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        fTypeOfFuelLabel.setForeground(new Color(0, 102, 102));
        fTypeOfFuelLabel.setBounds(200, 220, 200, 30);
        fTypeOfFuel = new JTextField();
        fTypeOfFuel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        fTypeOfFuel.setBackground(new Color(216, 214, 196));
        fTypeOfFuel.setBounds(200, 250, 150, 40);

        fTransmissionTypeLabel = new JLabel("Transmission Type (string) (=)");
        fTransmissionTypeLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        fTransmissionTypeLabel.setForeground(new Color(0, 102, 102));
        fTransmissionTypeLabel.setBounds(30, 360, 200, 30);
        fTransmissionType = new JTextField();
        fTransmissionType.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        fTransmissionType.setBackground(new Color(216, 214, 196));
        fTransmissionType.setBounds(30, 390, 150, 40);

        fNumberOfGearsLabel = new JLabel("Number of Gears (int) (>=)");
        fNumberOfGearsLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        fNumberOfGearsLabel.setForeground(new Color(0, 102, 102));
        fNumberOfGearsLabel.setBounds(200, 360, 180, 30);
        fNumberOfGears = new JTextField();
        fNumberOfGears.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        fNumberOfGears.setBackground(new Color(216, 214, 196));
        fNumberOfGears.setBounds(200, 390, 150, 40);

        filterETButton = new JButton("FILTER");
        filterETButton.setBackground(new Color(0, 102, 102));
        filterETButton.setForeground(new Color(216, 214, 196));
        filterETButton.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        filterETButton.setBounds(200, 470, 150, 50);
        filterETButton.setFocusable(false);

        backETButton = new JButton("< Go Back");
        backETButton.setBackground(new Color(216, 214, 196));
        backETButton.setForeground(new Color(0, 102, 102));
        backETButton.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        backETButton.setBounds(30, 470, 150, 50);
        backETButton.setFocusable(false);

        // More Filters
        moreTitle = new JLabel("MORE FILTERS");
        moreTitle.setFont(new Font("Segoe UI", Font.BOLD, 36));
        moreTitle.setForeground(new Color(0, 102, 102));
        moreTitle.setBounds(-10, 70, 400, 30);
        moreTitle.setHorizontalAlignment(SwingConstants.CENTER);
        moreTitle.setVerticalAlignment(SwingConstants.CENTER);

        fNauticalMilesLabel = new JLabel("Nautical Miles (int) (<=)");
        fNauticalMilesLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        fNauticalMilesLabel.setForeground(new Color(0, 102, 102));
        fNauticalMilesLabel.setBounds(30, 150, 200, 30);
        fNauticalMiles = new JTextField();
        fNauticalMiles.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        fNauticalMiles.setBackground(new Color(216, 214, 196));
        fNauticalMiles.setBounds(30, 180, 150, 40);

        String[] boatCombo = {"Any", "Yes", "No"};
        fGPSLabel = new JLabel("GPS (=)");
        fGPSLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        fGPSLabel.setForeground(new Color(0, 102, 102));
        fGPSLabel.setBounds(200, 150, 100, 30);
        fGPS = new JComboBox<>(boatCombo);
        fGPS.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        fGPS.setBackground(new Color(216, 214, 196));
        fGPS.setForeground(new Color(0, 102, 102));
        fGPS.setBounds(200, 180, 150, 40);
        fGPS.setFocusable(false);

        fAccelerationTimeLabel = new JLabel("Acceleration Time (double) (<=)");
        fAccelerationTimeLabel.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        fAccelerationTimeLabel.setForeground(new Color(0, 102, 102));
        fAccelerationTimeLabel.setBounds(30, 220, 200, 30);
        fAccelerationTime = new JTextField();
        fAccelerationTime.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        fAccelerationTime.setBackground(new Color(216, 214, 196));
        fAccelerationTime.setBounds(30, 250, 150, 40);

        fSonarLabel = new JLabel("Sonar (=)");
        fSonarLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        fSonarLabel.setForeground(new Color(0, 102, 102));
        fSonarLabel.setBounds(200, 220, 200, 30);
        fSonar = new JComboBox<>(boatCombo);
        fSonar.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        fSonar.setBackground(new Color(216, 214, 196));
        fSonar.setForeground(new Color(0, 102, 102));
        fSonar.setBounds(200, 250, 150, 40);
        fSonar.setFocusable(false);

        fPropulsionTypeLabel = new JLabel("Propulsion Type (string) (=)");
        fPropulsionTypeLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        fPropulsionTypeLabel.setForeground(new Color(0, 102, 102));
        fPropulsionTypeLabel.setBounds(30, 290, 200, 30);
        fPropulsionType = new JTextField();
        fPropulsionType.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        fPropulsionType.setBackground(new Color(216, 214, 196));
        fPropulsionType.setBounds(30, 320, 150, 40);

        fHasLifeBuoyLabel = new JLabel("Has Life Buoy (=)");
        fHasLifeBuoyLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        fHasLifeBuoyLabel.setForeground(new Color(0, 102, 102));
        fHasLifeBuoyLabel.setBounds(200, 290, 200, 30);
        fHasLifeBuoy = new JComboBox<>(boatCombo);
        fHasLifeBuoy.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        fHasLifeBuoy.setBackground(new Color(216, 214, 196));
        fHasLifeBuoy.setBounds(200, 320, 150, 40);

        filterMButton = new JButton("FILTER");
        filterMButton.setBackground(new Color(0, 102, 102));
        filterMButton.setForeground(new Color(216, 214, 196));
        filterMButton.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        filterMButton.setBounds(200, 470, 150, 50);
        filterMButton.setFocusable(false);

        backMButton = new JButton("< Go Back");
        backMButton.setBackground(new Color(216, 214, 196));
        backMButton.setForeground(new Color(0, 102, 102));
        backMButton.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        backMButton.setBounds(30, 470, 150, 50);
        backMButton.setFocusable(false);

        // Putting everything together --------------------------------------------------------
        left.add(textScroll);
        left.add(textPanel);
        left.add(copyright);

        fPanel.add(mainTitle);
        fPanel.add(generalFButton);
        fPanel.add(ETFButton);
        fPanel.add(moreFButton);
        fPanel.add(filterButton);
        fPanel.add(clearButton);

        generalFPanel.add(generalTitle);
        generalFPanel.add(fTypeLabel);
        generalFPanel.add(fType);
        generalFPanel.add(fIDLabel);
        generalFPanel.add(fID);
        generalFPanel.add(fBrandLabel);
        generalFPanel.add(fBrand);
        generalFPanel.add(fModelLabel);
        generalFPanel.add(fModel);
        generalFPanel.add(fYearLabel);
        generalFPanel.add(fYear);
        generalFPanel.add(fColorLabel);
        generalFPanel.add(fColor);
        generalFPanel.add(fPriceLabel);
        generalFPanel.add(fPrice);
        generalFPanel.add(fWeightLabel);
        generalFPanel.add(fWeight);
        generalFPanel.add(filterGButton);
        generalFPanel.add(backGButton);

        ETFPanel.add(ETTitle);
        ETFPanel.add(fEngineTypeLabel);
        ETFPanel.add(fEngineType);
        ETFPanel.add(fHorsepowerLabel);
        ETFPanel.add(fHorsepower);
        ETFPanel.add(fFuelCapacityLabel);
        ETFPanel.add(fFuelCapacity);
        ETFPanel.add(fTypeOfFuelLabel);
        ETFPanel.add(fTypeOfFuel);
        ETFPanel.add(fTransmissionTypeLabel);
        ETFPanel.add(fTransmissionType);
        ETFPanel.add(fNumberOfGearsLabel);
        ETFPanel.add(fNumberOfGears);
        ETFPanel.add(backETButton);
        ETFPanel.add(filterETButton);

        moreFPanel.add(moreTitle);
        moreFPanel.add(fNauticalMilesLabel);
        moreFPanel.add(fNauticalMiles);
        moreFPanel.add(fGPSLabel);
        moreFPanel.add(fGPS);
        moreFPanel.add(fAccelerationTimeLabel);
        moreFPanel.add(fAccelerationTime);
        moreFPanel.add(fSonarLabel);
        moreFPanel.add(fSonar);
        moreFPanel.add(fPropulsionTypeLabel);
        moreFPanel.add(fPropulsionType);
        moreFPanel.add(fHasLifeBuoyLabel);
        moreFPanel.add(fHasLifeBuoy);
        moreFPanel.add(backMButton);
        moreFPanel.add(filterMButton);

        jPanel.add(left);
        jPanel.add(fPanel);
        jPanel.add(generalFPanel);
        jPanel.add(ETFPanel);
        jPanel.add(moreFPanel);
        add(jPanel);

        // Listeners --------------------------------------------------------------------
        generalFButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                visibilityManager(1);
            }
        });

        ETFButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                visibilityManager(2);
            }
        });
        
        moreFButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                visibilityManager(3);
            }
        });

        filterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                filterVehicles();
            }
        });

        filterGButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                filterVehicles();
            }
        });
        
        filterETButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                filterVehicles();
            }
        });
        
        filterMButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                filterVehicles();
            }
        });

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearFilters();
            }
        });

        backGButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                visibilityManager(0);
            }
        });

        backETButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                visibilityManager(0);
            }
        });

        backMButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                visibilityManager(0);
            }
        });

        fType.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) fType.getSelectedItem();
                switch (selectedItem) {
                    case "Any Vehicle":
                        vehicleType = 0;
                        moreFButton.setEnabled(false);
                        break;

                    case "Boats":
                        vehicleType = 1;
                        moreFButton.setEnabled(true);
                        fPropulsionType.setEnabled(true);
                        fHasLifeBuoy.setEnabled(false);
                        break;

                    case "Sail Boats":
                        vehicleType = 2;
                        moreFButton.setEnabled(true);
                        fPropulsionType.setEnabled(false);
                        fHasLifeBuoy.setEnabled(true);
                        break;
                }
            }
        });
        
//        addWindowListener(new java.awt.event.WindowAdapter() {
//            @Override
//            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
//                new AdminAccessOnly();
//            }
//        });

    }

    public static void main(String[] args) {
        new DragosFrame();
        // System.out.println(Color.BLACK + "\n" + Color.BLUE + "\n" + Color.CYAN + "\n" + Color.DARK_GRAY + "\n" + Color.GRAY + "\n" + Color.GREEN + "\n" + Color.LIGHT_GRAY + "\n" + Color.MAGENTA + "\n" + Color.ORANGE + "\n" + Color.PINK + "\n" + Color.RED + "\n" + Color.WHITE + "\n" + Color.YELLOW);
    }

    private void initVehicles() {
        // Boats
        Engine boatEngine1 = new Engine("V4", 300, 500, "Diesel");
        Engine boatEngine2 = new Engine("V6", 200, 0, "Petrol");

        Transmission boatTransmission1 = new Transmission("Automatic", 6);
        Transmission boatTransmission2 = new Transmission("Manual", 4);

        boats = new ArrayList<>();
        boats.add(new Boat(1, "Yamaha", "AR195", (short) 2021, Color.BLUE, 29999.50, 1350, boatEngine1, boatTransmission1, null, 200, true, 6.5, true, "Jet Propulsion"));
        boats.add(new Boat(2, "Sea Ray", "SPX 190", (short) 2023, Color.RED, 35499, 1450, boatEngine2, boatTransmission2, null, 150, true, 7.0, false, "Jet Propulsion"));
        boats.add(new Boat(3, "Bayliner", "Element", (short) 2020, Color.WHITE, 25000.0, 1500, boatEngine1, boatTransmission1, null, 300, false, 8.0, true, "Inboard"));
        boats.add(new Boat(4, "Boston Whaler", "Montauk", (short) 2021, Color.GRAY, 40000.0, 2000, boatEngine2, boatTransmission1, null, 400, true, 5.5, true, "Outboard"));
        boats.add(new Boat(5, "Tracker", "Pro Team", (short) 2022, Color.BLACK, 18000.0, 1200, boatEngine1, boatTransmission2, null, 250, false, 6.8, false, "Outboard"));
        boats.add(new Boat(6, "Lund", "Pro V", (short) 2023, Color.GREEN, 30000.0, 1400, boatEngine2, boatTransmission1, null, 500, true, 4.5, true, "Jet Propulsion"));
        boats.add(new Boat(7, "MasterCraft", "XT21", (short) 2020, Color.YELLOW, 50000.0, 2500, boatEngine1, boatTransmission2, null, 350, false, 7.2, false, "Inboard"));
        boats.add(new Boat(8, "Malibu", "M220", (short) 2019, Color.ORANGE, 70000.0, 3000, boatEngine2, boatTransmission1, null, 600, true, 3.9, true, "Outboard"));
        boats.add(new Boat(9, "Crestliner", "XFC", (short) 2023, Color.PINK, 22000.0, 1100, boatEngine1, boatTransmission2, null, 270, false, 6.0, false, "Jet Propulsion"));
        boats.add(new Boat(10, "Ranger", "RT198P", (short) 2021, Color.CYAN, 28000.0, 1300, boatEngine2, boatTransmission1, null, 320, true, 5.0, true, "Outboard"));

        // Sail Boats
        Engine sailBoatEngine1 = new Engine("V4", 100, 50, "Diesel");
        Engine sailBoatEngine2 = new Engine("V6", 200, 100, "Petrol");

        Transmission sailBoatTransmission1 = new Transmission("Manual", 6);
        Transmission sailBoatTransmission2 = new Transmission("Automatic", 5);

        sailBoats = new ArrayList<>();
        sailBoats.add(new SailBoat(3, "Catalina", "275 Sport", (short) 2021, Color.BLUE, 89999.99, 3200, sailBoatEngine1, sailBoatTransmission2, null, 600, true, 12.0, false, true));
        sailBoats.add(new SailBoat(4, "Jeanneau", "Model D", (short) 2020, Color.YELLOW, 22000.0, 1700, sailBoatEngine2, sailBoatTransmission1, null, 900, false, 9.8, true, true));
        sailBoats.add(new SailBoat(5, "Beneteau", "Model E", (short) 2019, Color.GRAY, 19000.0, 1600, sailBoatEngine1, sailBoatTransmission2, null, 400, true, 11.2, false, false));
        sailBoats.add(new SailBoat(6, "Catalina", "Model F", (short) 2021, Color.GREEN, 21000.0, 1550, sailBoatEngine2, sailBoatTransmission1, null, 800, true, 10.0, true, true));
        sailBoats.add(new SailBoat(7, "Pearson", "Model G", (short) 2023, Color.PINK, 23000.0, 1650, sailBoatEngine1, sailBoatTransmission2, null, 1000, false, 9.0, false, true));
        sailBoats.add(new SailBoat(8, "O'Day", "Model H", (short) 2022, Color.ORANGE, 17000.0, 1450, sailBoatEngine2, sailBoatTransmission1, null, 700, true, 10.5, true, false));
        sailBoats.add(new SailBoat(9, "Freedom", "Model I", (short) 2021, Color.CYAN, 24000.0, 1750, sailBoatEngine1, sailBoatTransmission2, null, 850, false, 8.7, false, true));
        sailBoats.add(new SailBoat(10, "Morgan", "Model J", (short) 2020, Color.MAGENTA, 26000.0, 1850, sailBoatEngine2, sailBoatTransmission1, null, 950, true, 9.5, true, true));
        sailBoats.add(new SailBoat(11, "Ericson", "Model K", (short) 2022, Color.DARK_GRAY, 20000.0, 1500, sailBoatEngine1, sailBoatTransmission2, null, 550, false, 10.0, false, false));
        sailBoats.add(new SailBoat(12, "Hanse", "Model L", (short) 2023, Color.LIGHT_GRAY, 27000.0, 1900, sailBoatEngine2, sailBoatTransmission1, null, 650, true, 9.2, true, true));
    }

    private void readVehicles(ArrayList<Boat> rBoats, ArrayList<SailBoat> rSailBoats) {
        availableVehicles = "";
        if (vehicleType == 1 || vehicleType == 0) {
            for (Boat boat : rBoats) {
                availableVehicles += boat + "\n~~~~~~~~~~~~~~~~~~~~\n\n";
            }
        }

        if (vehicleType == 2 || vehicleType == 0) {
            for (SailBoat sailBoat : rSailBoats) {
                availableVehicles += sailBoat + "\n~~~~~~~~~~~~~~~~~~~~\n\n";

            }
        }
        
        if(availableVehicles.equals(""))
        {
            vehicleText.setText("No vehicles found.");
        }
        else
        {
            vehicleText.setText(availableVehicles);
        }
        vehicleText.setCaretPosition(0);
        vehicleText.getCaret().setVisible(false);
    }

    private void filterVehicles() {
        ArrayList<Boat> tempBoat1, tempBoat2;
        ArrayList<SailBoat> tempSailBoat1, tempSailBoat2;
        tempBoat1 = boats;
        tempSailBoat1 = sailBoats;
        tempBoat2 = new ArrayList<>();
        tempSailBoat2 = new ArrayList<>();

        String id = fID.getText().trim();
        String brand = fBrand.getText().trim();
        String model = fModel.getText().trim();
        String year = fYear.getText().trim();
        String color = (String) fColor.getSelectedItem();
        String price = fPrice.getText().trim();
        String weight = fWeight.getText().trim();
        String engineType = fEngineType.getText().trim();
        String horsepower = fHorsepower.getText().trim();
        String fuelCapacity = fFuelCapacity.getText().trim();
        String typeOfFuel = fTypeOfFuel.getText().trim();
        String transmissionType = fTransmissionType.getText().trim();
        String numberOfGears = fNumberOfGears.getText().trim();
        String nauticalMiles = fNauticalMiles.getText().trim();
        String GPS = (String) fGPS.getSelectedItem();
        String accelerationTime = fAccelerationTime.getText().trim();
        String sonar = (String) fSonar.getSelectedItem();
        String propulsionType = fPropulsionType.getText().trim();
        String hasLifeBuoy = (String) fHasLifeBuoy.getSelectedItem();

        // General Filters
        if (!id.isEmpty()) {
            for (Boat boat : tempBoat1) {
                if (boat.getId() == Integer.parseInt(id)) {
                    tempBoat2.add(boat);
                }
            }
            for (SailBoat sailBoat : tempSailBoat1) {
                if (sailBoat.getId() == Integer.parseInt(id)) {
                    tempSailBoat2.add(sailBoat);
                }
            }
            tempBoat1 = tempBoat2;
            tempSailBoat1 = tempSailBoat2;
            tempBoat2 = new ArrayList<>();
            tempSailBoat2 = new ArrayList<>();
        }

        if (!brand.isEmpty()) {
            for (Boat boat : tempBoat1) {
                if (boat.getBrand().toLowerCase().equals(brand.toLowerCase())) {
                    tempBoat2.add(boat);
                }
            }
            for (SailBoat sailBoat : tempSailBoat1) {
                if (sailBoat.getBrand().toLowerCase().equals(brand.toLowerCase())) {
                    tempSailBoat2.add(sailBoat);
                }
            }
            tempBoat1 = tempBoat2;
            tempSailBoat1 = tempSailBoat2;
            tempBoat2 = new ArrayList<>();
            tempSailBoat2 = new ArrayList<>();
        }

        if (!model.isEmpty()) {
            for (Boat boat : tempBoat1) {
                if (boat.getModel().toLowerCase().equals(model.toLowerCase())) {
                    tempBoat2.add(boat);
                }
            }
            for (SailBoat sailBoat : tempSailBoat1) {
                if (sailBoat.getModel().toLowerCase().equals(model.toLowerCase())) {
                    tempSailBoat2.add(sailBoat);
                }
            }
            tempBoat1 = tempBoat2;
            tempSailBoat1 = tempSailBoat2;
            tempBoat2 = new ArrayList<>();
            tempSailBoat2 = new ArrayList<>();
        }

        if (!year.isEmpty()) {
            for (Boat boat : tempBoat1) {
                if (boat.getYear() >= Short.parseShort(year)) {
                    tempBoat2.add(boat);
                }
            }
            for (SailBoat sailBoat : tempSailBoat1) {
                if (sailBoat.getYear() >= Short.parseShort(year)) {
                    tempSailBoat2.add(sailBoat);
                }
            }
            tempBoat1 = tempBoat2;
            tempSailBoat1 = tempSailBoat2;
            tempBoat2 = new ArrayList<>();
            tempSailBoat2 = new ArrayList<>();
        }

        if (!color.equals("Any Color")) {
            for (Boat boat : tempBoat1) {
                if (boat.getColor() == normColor(color)) {
                    tempBoat2.add(boat);
                }
            }
            for (SailBoat sailBoat : tempSailBoat1) {
                if (sailBoat.getColor() == normColor(color)) {
                    tempSailBoat2.add(sailBoat);
                }
            }
            tempBoat1 = tempBoat2;
            tempSailBoat1 = tempSailBoat2;
            tempBoat2 = new ArrayList<>();
            tempSailBoat2 = new ArrayList<>();
        }

        if (!price.isEmpty()) {
            for (Boat boat : tempBoat1) {
                if (boat.getPrice() <= Double.parseDouble(price)) {
                    tempBoat2.add(boat);
                }
            }
            for (SailBoat sailBoat : tempSailBoat1) {
                if (sailBoat.getPrice() <= Double.parseDouble(price)) {
                    tempSailBoat2.add(sailBoat);
                }
            }
            tempBoat1 = tempBoat2;
            tempSailBoat1 = tempSailBoat2;
            tempBoat2 = new ArrayList<>();
            tempSailBoat2 = new ArrayList<>();
        }

        if (!weight.isEmpty()) {
            for (Boat boat : tempBoat1) {
                if (boat.getWeight() <= Integer.parseInt(weight)) {
                    tempBoat2.add(boat);
                }
            }
            for (SailBoat sailBoat : tempSailBoat1) {
                if (sailBoat.getWeight() <= Integer.parseInt(weight)) {
                    tempSailBoat2.add(sailBoat);
                }
            }
            tempBoat1 = tempBoat2;
            tempSailBoat1 = tempSailBoat2;
            tempBoat2 = new ArrayList<>();
            tempSailBoat2 = new ArrayList<>();
        }
        
        // E&T Filters
        if (!engineType.isEmpty()) {
            for (Boat boat : tempBoat1) {
                if (boat.getEngine().getType().toLowerCase().equals(engineType.toLowerCase())) {
                    tempBoat2.add(boat);
                }
            }
            for (SailBoat sailBoat : tempSailBoat1) {
                if (sailBoat.getEngine().getType().toLowerCase().equals(engineType.toLowerCase())) {
                    tempSailBoat2.add(sailBoat);
                }
            }
            tempBoat1 = tempBoat2;
            tempSailBoat1 = tempSailBoat2;
            tempBoat2 = new ArrayList<>();
            tempSailBoat2 = new ArrayList<>();
        }
        
        if (!horsepower.isEmpty()) {
            for (Boat boat : tempBoat1) {
                if (boat.getEngine().getHorsepower() >= Integer.parseInt(horsepower)) {
                    tempBoat2.add(boat);
                }
            }
            for (SailBoat sailBoat : tempSailBoat1) {
                if (sailBoat.getEngine().getHorsepower() >= Integer.parseInt(horsepower)) {
                    tempSailBoat2.add(sailBoat);
                }
            }
            tempBoat1 = tempBoat2;
            tempSailBoat1 = tempSailBoat2;
            tempBoat2 = new ArrayList<>();
            tempSailBoat2 = new ArrayList<>();
        }
        
        if (!fuelCapacity.isEmpty()) {
            for (Boat boat : tempBoat1) {
                if (boat.getEngine().getFuelCapacity() >= Integer.parseInt(fuelCapacity)) {
                    tempBoat2.add(boat);
                }
            }
            for (SailBoat sailBoat : tempSailBoat1) {
                if (sailBoat.getEngine().getFuelCapacity() >= Integer.parseInt(fuelCapacity)) {
                    tempSailBoat2.add(sailBoat);
                }
            }
            tempBoat1 = tempBoat2;
            tempSailBoat1 = tempSailBoat2;
            tempBoat2 = new ArrayList<>();
            tempSailBoat2 = new ArrayList<>();
        }
        
        if (!typeOfFuel.isEmpty()) {
            for (Boat boat : tempBoat1) {
                if (boat.getEngine().getTypeOfFuel().toLowerCase().equals(typeOfFuel.toLowerCase())) {
                    tempBoat2.add(boat);
                }
            }
            for (SailBoat sailBoat : tempSailBoat1) {
                if (sailBoat.getEngine().getTypeOfFuel().toLowerCase().equals(typeOfFuel.toLowerCase())) {
                    tempSailBoat2.add(sailBoat);
                }
            }
            tempBoat1 = tempBoat2;
            tempSailBoat1 = tempSailBoat2;
            tempBoat2 = new ArrayList<>();
            tempSailBoat2 = new ArrayList<>();
        }
        
        if (!transmissionType.isEmpty()) {
            for (Boat boat : tempBoat1) {
                if (boat.getTransmission().getType().toLowerCase().equals(transmissionType.toLowerCase())) {
                    tempBoat2.add(boat);
                }
            }
            for (SailBoat sailBoat : tempSailBoat1) {
                if (sailBoat.getTransmission().getType().toLowerCase().equals(transmissionType.toLowerCase())) {
                    tempSailBoat2.add(sailBoat);
                }
            }
            tempBoat1 = tempBoat2;
            tempSailBoat1 = tempSailBoat2;
            tempBoat2 = new ArrayList<>();
            tempSailBoat2 = new ArrayList<>();
        }
        
        if (!numberOfGears.isEmpty()) {
            for (Boat boat : tempBoat1) {
                if (boat.getTransmission().getNumberOfGears() >= Integer.parseInt(numberOfGears)) {
                    tempBoat2.add(boat);
                }
            }
            for (SailBoat sailBoat : tempSailBoat1) {
                if (sailBoat.getTransmission().getNumberOfGears() >= Integer.parseInt(numberOfGears)) {
                    tempSailBoat2.add(sailBoat);
                }
            }
            tempBoat1 = tempBoat2;
            tempSailBoat1 = tempSailBoat2;
            tempBoat2 = new ArrayList<>();
            tempSailBoat2 = new ArrayList<>();
        }
        
        // More Filters
        if (!nauticalMiles.isEmpty()) {
            for (Boat boat : tempBoat1) {
                if (boat.getNauticalMiles() <= Integer.parseInt(nauticalMiles)) {
                    tempBoat2.add(boat);
                }
            }
            for (SailBoat sailBoat : tempSailBoat1) {
                if (sailBoat.getNauticalMiles() <= Integer.parseInt(nauticalMiles)) {
                    tempSailBoat2.add(sailBoat);
                }
            }
            tempBoat1 = tempBoat2;
            tempSailBoat1 = tempSailBoat2;
            tempBoat2 = new ArrayList<>();
            tempSailBoat2 = new ArrayList<>();
        }
        
        if (!GPS.equals("Any")) {
            for (Boat boat : tempBoat1) {
                if (GPS.equals("Yes") && boat.getGps() == true) {
                    tempBoat2.add(boat);
                }
                else if (GPS.equals("No") && boat.getGps() == false) {
                    tempBoat2.add(boat);
                }
            }
            for (SailBoat sailBoat : tempSailBoat1) {
                if (GPS.equals("Yes") && sailBoat.getGps() == true) {
                    tempSailBoat2.add(sailBoat);
                }
                else if (GPS.equals("No") && sailBoat.getGps() == false) {
                    tempSailBoat2.add(sailBoat);
                }
            }
            tempBoat1 = tempBoat2;
            tempSailBoat1 = tempSailBoat2;
            tempBoat2 = new ArrayList<>();
            tempSailBoat2 = new ArrayList<>();
        }
        
        if (!accelerationTime.isEmpty()) {
            for (Boat boat : tempBoat1) {
                if (boat.getAccelerationTime() <= Double.parseDouble(accelerationTime)) {
                    tempBoat2.add(boat);
                }
            }
            for (SailBoat sailBoat : tempSailBoat1) {
                if (sailBoat.getAccelerationTime() <= Double.parseDouble(accelerationTime)) {
                    tempSailBoat2.add(sailBoat);
                }
            }
            tempBoat1 = tempBoat2;
            tempSailBoat1 = tempSailBoat2;
            tempBoat2 = new ArrayList<>();
            tempSailBoat2 = new ArrayList<>();
        }
        
        if (!sonar.equals("Any")) {
            for (Boat boat : tempBoat1) {
                if (sonar.equals("Yes") && boat.getSonar() == true) {
                    tempBoat2.add(boat);
                }
                else if (sonar.equals("No") && boat.getSonar() == false) {
                    tempBoat2.add(boat);
                }
            }
            for (SailBoat sailBoat : tempSailBoat1) {
                if (sonar.equals("Yes") && sailBoat.getSonar() == true) {
                    tempSailBoat2.add(sailBoat);
                }
                else if (sonar.equals("No") && sailBoat.getSonar() == false) {
                    tempSailBoat2.add(sailBoat);
                }
            }
            tempBoat1 = tempBoat2;
            tempSailBoat1 = tempSailBoat2;
            tempBoat2 = new ArrayList<>();
            tempSailBoat2 = new ArrayList<>();
        }
        
        if (!propulsionType.isEmpty()) {
            for (Boat boat : tempBoat1) {
                if (boat.getPropulsionType().toLowerCase().equals(propulsionType.toLowerCase())) {
                    tempBoat2.add(boat);
                }
            }
            tempBoat1 = tempBoat2;
            tempBoat2 = new ArrayList<>();
        }
        
        if (!hasLifeBuoy.equals("Any")) {
            for (SailBoat sailBoat : tempSailBoat1) {
                if (hasLifeBuoy.equals("Yes") && sailBoat.getHasLifeBuoy() == true) {
                    tempSailBoat2.add(sailBoat);
                }
                else if (hasLifeBuoy.equals("No") && sailBoat.getHasLifeBuoy() == false) {
                    tempSailBoat2.add(sailBoat);
                }
            }
            tempSailBoat1 = tempSailBoat2;
            tempSailBoat2 = new ArrayList<>();
        }
        readVehicles(tempBoat1, tempSailBoat1);
    }

    private void clearFilters() {
        vehicleType = 0;
        fType.setSelectedIndex(0);
        fID.setText("");
        fBrand.setText("");
        fModel.setText("");
        fYear.setText("");
        fColor.setSelectedIndex(0);
        fPrice.setText("");
        fWeight.setText("");
        
        fEngineType.setText("");
        fHorsepower.setText("");
        fFuelCapacity.setText("");
        fTypeOfFuel.setText("");
        fTransmissionType.setText("");
        fNumberOfGears.setText("");
        
        fNauticalMiles.setText("");
        fGPS.setSelectedIndex(0);
        fAccelerationTime.setText("");
        fSonar.setSelectedIndex(0);
        fPropulsionType.setText("");
        fHasLifeBuoy.setSelectedIndex(0);

        readVehicles(boats, sailBoats);
    }

    private void visibilityManager(int n) {
        switch (n) {
            case 0:
                fPanel.setVisible(true);
                generalFPanel.setVisible(false);
                ETFPanel.setVisible(false);
                moreFPanel.setVisible(false);
                break;

            case 1:
                fPanel.setVisible(false);
                generalFPanel.setVisible(true);
                break;

            case 2:
                fPanel.setVisible(false);
                ETFPanel.setVisible(true);
                break;

            case 3:
                fPanel.setVisible(false);
                moreFPanel.setVisible(true);
                break;
        }
    }

    private static Color normColor(String colorName) {
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
}
