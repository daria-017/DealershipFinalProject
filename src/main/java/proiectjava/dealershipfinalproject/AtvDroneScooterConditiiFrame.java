/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proiectjava.dealershipfinalproject;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author hcosm
 */
public class AtvDroneScooterConditiiFrame extends javax.swing.JFrame {

    Atv[] atvs = new Atv[10];
    Scooter[] scooters = new Scooter[10];
    Drone[] drones= new Drone[10];

    /**
     * Creates new form AtvDroneScooterConditiiFrame
     */
    public AtvDroneScooterConditiiFrame() {
        initComponents();

        atvs[0] = new Atv(1, "Honda", "TRX250", (short) 2020, Color.RED, 3000.0, 180,
                new Engine("Petrol", 250, 25, "Single-cylinder"),
                new Transmission("Manual", 5),
                new ImageIcon("atv1.jpg"), "Utility", false, true, 30, "Independent");

        atvs[1] = new Atv(2, "Yamaha", "Raptor 700R", (short) 2021, Color.BLUE, 9000.0, 200,
                new Engine("Petrol", 686, 45, "Single-cylinder"),
                new Transmission("Automatic", 4),
                new ImageIcon("atv2.jpg"), "Sport", false, true, 20, "Dual-A-arm");

        atvs[2] = new Atv(3, "Can-Am", "Outlander 450", (short) 2022, Color.BLACK, 6500.0, 400,
                new Engine("Petrol", 427, 38, "Single-cylinder"),
                new Transmission("CVT", 0),
                new ImageIcon("atv3.jpg"), "Utility", true, false, 40, "Trailing Arm");

        atvs[3] = new Atv(4, "Polaris", "Sportsman 570", (short) 2019, Color.GREEN, 7000.0, 300,
                new Engine("Petrol", 567, 44, "ProStar"),
                new Transmission("Automatic", 0),
                new ImageIcon("atv4.jpg"), "Utility", false, true, 50, "Independent Rear");

        atvs[4] = new Atv(5, "Suzuki", "QuadSport Z400", (short) 2020, Color.YELLOW, 6000.0, 280,
                new Engine("Petrol", 398, 38, "Single-cylinder"),
                new Transmission("Manual", 5),
                new ImageIcon("atv5.jpg"), "Sport", false, true, 15, "Swing Arm");

        atvs[5] = new Atv(6, "Kawasaki", "Brute Force 300", (short) 2021, Color.ORANGE, 5000.0, 320,
                new Engine("Petrol", 271, 20, "Single-cylinder"),
                new Transmission("CVT", 0),
                new ImageIcon("atv6.jpg"), "Utility", true, false, 25, "Independent Rear");

        atvs[6] = new Atv(3, "Can-Am", "Outlander 450", (short) 2022, Color.BLACK, 6500.0, 400,
                new Engine("Petrol", 427, 38, "Single-cylinder"),
                new Transmission("CVT", 0),
                new ImageIcon("atv3.jpg"), "Utility", true, false, 40, "Trailing Arm");

        atvs[7] = new Atv(4, "Polaris", "Sportsman 570", (short) 2019, Color.GREEN, 7000.0, 300,
                new Engine("Petrol", 567, 44, "ProStar"),
                new Transmission("Automatic", 0),
                new ImageIcon("atv4.jpg"), "Utility", false, true, 50, "Independent Rear");

        atvs[8] = new Atv(5, "Suzuki", "QuadSport Z400", (short) 2020, Color.YELLOW, 6000.0, 280,
                new Engine("Petrol", 398, 38, "Single-cylinder"),
                new Transmission("Manual", 5),
                new ImageIcon("atv5.jpg"), "Sport", false, true, 15, "Swing Arm");

        atvs[9] = new Atv(6, "Kawasaki", "Brute Force 300", (short) 2021, Color.ORANGE, 5000.0, 320,
                new Engine("Petrol", 271, 20, "Single-cylinder"),
                new Transmission("CVT", 0),
                new ImageIcon("atv6.jpg"), "Utility", true, false, 25, "Independent Rear");

//scooters
        scooters[0] = new Scooter(1, "Vespa", "Primavera", (short) 2020, Color.RED, 4000.0, 120,
                new Engine("Electric", 1, 10, "Single"), new Transmission("Automatic", 1),
                new ImageIcon("scooter1.jpg"), "Electric", true, false, false, 50);

        scooters[1] = new Scooter(2, "Honda", "PCX", (short) 2021, Color.BLACK, 3700.0, 135,
                new Engine("Petrol", 2, 15, "Single Cylinder"), new Transmission("Automatic", 1),
                new ImageIcon("scooter2.jpg"), "Gasoline", true, false, true, 80);

        scooters[2] = new Scooter(3, "Yamaha", "NMAX", (short) 2022, Color.BLUE, 4500.0, 140,
                new Engine("Petrol", 2, 20, "Single Cylinder"), new Transmission("Automatic", 1),
                new ImageIcon("scooter3.jpg"), "Hybrid", true, true, true, 90);

        scooters[3] = new Scooter(4, "Suzuki", "Burgman", (short) 2019, Color.GRAY, 5000.0, 150,
                new Engine("Petrol", 2, 18, "Single Cylinder"), new Transmission("Automatic", 1),
                new ImageIcon("scooter4.jpg"), "Gasoline", false, true, true, 85);

        scooters[4] = new Scooter(5, "BMW", "C 400 GT", (short) 2023, Color.WHITE, 7000.0, 170,
                new Engine("Petrol", 4, 30, "Twin Cylinder"), new Transmission("Automatic", 2),
                new ImageIcon("scooter5.jpg"), "Touring", true, false, false, 100);

        scooters[5] = new Scooter(6, "Kymco", "Like 125", (short) 2020, Color.GREEN, 2500.0, 110,
                new Engine("Electric", 1, 8, "Single"), new Transmission("Automatic", 1),
                new ImageIcon("scooter6.jpg"), "Electric", false, false, false, 45);

        scooters[6] = new Scooter(1, "Vespa", "Primavera", (short) 2020, Color.RED, 4000.0, 120,
                new Engine("Electric", 1, 10, "Single"), new Transmission("Automatic", 1),
                new ImageIcon("scooter1.jpg"), "Electric", true, false, false, 50);

        scooters[7] = new Scooter(2, "Honda", "PCX", (short) 2021, Color.BLACK, 3700.0, 135,
                new Engine("Petrol", 2, 15, "Single Cylinder"), new Transmission("Automatic", 1),
                new ImageIcon("scooter2.jpg"), "Gasoline", true, false, true, 80);

        scooters[8] = new Scooter(3, "Yamaha", "NMAX", (short) 2022, Color.BLUE, 4500.0, 140,
                new Engine("Petrol", 2, 20, "Single Cylinder"), new Transmission("Automatic", 1),
                new ImageIcon("scooter3.jpg"), "Hybrid", true, true, true, 90);

        scooters[9] = new Scooter(4, "Suzuki", "Burgman", (short) 2019, Color.GRAY, 5000.0, 150,
                new Engine("Petrol", 2, 18, "Single Cylinder"), new Transmission("Automatic", 1),
                new ImageIcon("scooter4.jpg"), "Gasoline", false, true, true, 85);

//drones
        drones[0] = new Drone(1, "DJI", "Phantom 4", (short) 2021, Color.WHITE, 1500.0, 1380,
                new Engine("Electric", 4, 40, "Quadcopter"), new Transmission("None", 0),
                new ImageIcon("drone1.jpg"), 4, true, "Medium", true, 6);

        drones[1] = new Drone(2, "Parrot", "Anafi", (short) 2020, Color.BLACK, 1000.0, 500,
                new Engine("Electric", 2, 25, "Quadcopter"), new Transmission("None", 0),
                new ImageIcon("drone2.jpg"), 2, false, "Small", false, 4);

        drones[2] = new Drone(3, "Autel Robotics", "Evo Lite+", (short) 2022, Color.ORANGE, 2000.0, 820,
                new Engine("Electric", 4, 50, "Quadcopter"), new Transmission("None", 0),
                new ImageIcon("drone3.jpg"), 4, true, "Large", true, 8);

        drones[3] = new Drone(4, "Skydio", "X2", (short) 2021, Color.GRAY, 1200.0, 1100,
                new Engine("Electric", 6, 60, "Hexacopter"), new Transmission("None", 0),
                new ImageIcon("drone4.jpg"), 6, true, "Large", true, 10);

        drones[4] = new Drone(5, "Ryze Tech", "Tello", (short) 2019, Color.YELLOW, 200.0, 150,
                new Engine("Electric", 2, 10, "Mini"), new Transmission("None", 0),
                new ImageIcon("drone5.jpg"), 2, false, "Small", false, 2);

        drones[5] = new Drone(6, "Hubsan", "Zino Mini", (short) 2023, Color.BLUE, 800.0, 300,
                new Engine("Electric", 4, 30, "Quadcopter"), new Transmission("None", 0),
                new ImageIcon("drone6.jpg"), 4, false, "Medium", false, 5);

        drones[6] = new Drone(2, "Parrot", "Anafi", (short) 2020, Color.BLACK, 1000.0, 500,
                new Engine("Electric", 2, 25, "Quadcopter"), new Transmission("None", 0),
                new ImageIcon("drone2.jpg"), 2, false, "Small", false, 4);

        drones[7] = new Drone(3, "Autel Robotics", "Evo Lite+", (short) 2022, Color.ORANGE, 2000.0, 820,
                new Engine("Electric", 4, 50, "Quadcopter"), new Transmission("None", 0),
                new ImageIcon("drone3.jpg"), 4, true, "Large", true, 8);

        drones[8] = new Drone(4, "Skydio", "X2", (short) 2021, Color.GRAY, 1200.0, 1100,
                new Engine("Electric", 6, 60, "Hexacopter"), new Transmission("None", 0),
                new ImageIcon("drone4.jpg"), 6, true, "Large", true, 10);

        drones[9] = new Drone(1, "DJI", "Phantom 4", (short) 2021, Color.WHITE, 1500.0, 1380,
                new Engine("Electric", 4, 40, "Quadcopter"), new Transmission("None", 0),
                new ImageIcon("drone1.jpg"), 4, true, "Medium", true, 6);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        atvPanel = new javax.swing.JPanel();
        atvTitle = new javax.swing.JLabel();
        atvTraits2 = new javax.swing.JLabel();
        atvTraits1 = new javax.swing.JLabel();
        atvCombo = new javax.swing.JComboBox<>();
        atvTextField1 = new javax.swing.JTextField();
        atvButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        atvTextArea = new javax.swing.JTextArea();
        dronePanel = new javax.swing.JPanel();
        droneTitle = new javax.swing.JLabel();
        droneTraits2 = new javax.swing.JLabel();
        droneTraits1 = new javax.swing.JLabel();
        droneTextField1 = new javax.swing.JTextField();
        droneTextField2 = new javax.swing.JTextField();
        droneButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        droneTextArea = new javax.swing.JTextArea();
        scooterPanel = new javax.swing.JPanel();
        scooterTitle = new javax.swing.JLabel();
        scooterTraits1 = new javax.swing.JLabel();
        scooterTraits2 = new javax.swing.JLabel();
        scooterCombo = new javax.swing.JComboBox<>();
        scooterTextField1 = new javax.swing.JTextField();
        scooterButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        scooterTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundPanel.setBackground(new java.awt.Color(0, 102, 102));

        atvPanel.setBackground(new java.awt.Color(216, 214, 196));

        atvTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        atvTitle.setForeground(new java.awt.Color(0, 102, 102));
        atvTitle.setText("Atv");

        atvTraits2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        atvTraits2.setForeground(new java.awt.Color(0, 102, 102));
        atvTraits2.setText("Capacitate incarcatura:");

        atvTraits1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        atvTraits1.setForeground(new java.awt.Color(0, 102, 102));
        atvTraits1.setText("Tip suspensie:");

        atvCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manual", "Automatic" }));
        atvCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atvComboActionPerformed(evt);
            }
        });

        atvTextField1.setText("0");
        atvTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atvTextField1ActionPerformed(evt);
            }
        });

        atvButton.setText("Introdu");
        atvButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atvButtonActionPerformed(evt);
            }
        });

        atvTextArea.setColumns(20);
        atvTextArea.setRows(5);
        jScrollPane2.setViewportView(atvTextArea);

        javax.swing.GroupLayout atvPanelLayout = new javax.swing.GroupLayout(atvPanel);
        atvPanel.setLayout(atvPanelLayout);
        atvPanelLayout.setHorizontalGroup(
            atvPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atvPanelLayout.createSequentialGroup()
                .addGroup(atvPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(atvPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(atvTitle))
                    .addGroup(atvPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(atvPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(atvTraits2)
                            .addComponent(atvTraits1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(atvPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(atvCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(atvTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(atvButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(atvPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(atvPanelLayout.createSequentialGroup()
                    .addGap(312, 312, 312)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addGap(22, 22, 22)))
        );
        atvPanelLayout.setVerticalGroup(
            atvPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atvPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atvTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(atvPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atvTraits1)
                    .addComponent(atvCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(atvPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(atvTraits2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(atvPanelLayout.createSequentialGroup()
                        .addComponent(atvTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(atvButton)
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(atvPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(atvPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        dronePanel.setBackground(new java.awt.Color(216, 214, 196));

        droneTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        droneTitle.setForeground(new java.awt.Color(0, 102, 102));
        droneTitle.setText("Drone");

        droneTraits2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        droneTraits2.setForeground(new java.awt.Color(0, 102, 102));
        droneTraits2.setText("Numar senzori max.:");

        droneTraits1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        droneTraits1.setForeground(new java.awt.Color(0, 102, 102));
        droneTraits1.setText("Pret max:");

        droneTextField1.setText("0");

        droneTextField2.setText("0");

        droneButton.setText("Introdu");
        droneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                droneButtonActionPerformed(evt);
            }
        });

        droneTextArea.setColumns(20);
        droneTextArea.setRows(5);
        jScrollPane1.setViewportView(droneTextArea);

        javax.swing.GroupLayout dronePanelLayout = new javax.swing.GroupLayout(dronePanel);
        dronePanel.setLayout(dronePanelLayout);
        dronePanelLayout.setHorizontalGroup(
            dronePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dronePanelLayout.createSequentialGroup()
                .addGroup(dronePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dronePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(dronePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(droneTraits2)
                            .addComponent(droneTraits1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dronePanelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(droneTitle)))
                        .addGap(49, 49, 49)
                        .addGroup(dronePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(droneTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(droneTextField2)))
                    .addGroup(dronePanelLayout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(droneButton)))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        dronePanelLayout.setVerticalGroup(
            dronePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dronePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dronePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(dronePanelLayout.createSequentialGroup()
                        .addComponent(droneTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(dronePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(droneTraits1)
                            .addComponent(droneTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dronePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(droneTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(droneTraits2))
                        .addGap(18, 18, 18)
                        .addComponent(droneButton)
                        .addGap(0, 71, Short.MAX_VALUE)))
                .addContainerGap())
        );

        scooterPanel.setBackground(new java.awt.Color(216, 214, 196));

        scooterTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        scooterTitle.setForeground(new java.awt.Color(0, 102, 102));
        scooterTitle.setText("Scooter");

        scooterTraits1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        scooterTraits1.setForeground(new java.awt.Color(0, 102, 102));
        scooterTraits1.setText("Offroad:");

        scooterTraits2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        scooterTraits2.setForeground(new java.awt.Color(0, 102, 102));
        scooterTraits2.setText("An fabricatie min.:");

        scooterCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "true", "false", " " }));
        scooterCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scooterComboActionPerformed(evt);
            }
        });

        scooterTextField1.setText("0");

        scooterButton.setText("Introdu");
        scooterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scooterButtonActionPerformed(evt);
            }
        });

        scooterTextArea.setColumns(20);
        scooterTextArea.setRows(5);
        jScrollPane3.setViewportView(scooterTextArea);

        javax.swing.GroupLayout scooterPanelLayout = new javax.swing.GroupLayout(scooterPanel);
        scooterPanel.setLayout(scooterPanelLayout);
        scooterPanelLayout.setHorizontalGroup(
            scooterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scooterPanelLayout.createSequentialGroup()
                .addGroup(scooterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(scooterPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(scooterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scooterTraits2)
                            .addGroup(scooterPanelLayout.createSequentialGroup()
                                .addComponent(scooterTraits1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(69, 69, 69)))
                        .addGap(51, 51, 51)
                        .addGroup(scooterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scooterTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scooterCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(scooterPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(scooterButton))))
                    .addGroup(scooterPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scooterTitle)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addContainerGap())
        );
        scooterPanelLayout.setVerticalGroup(
            scooterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scooterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(scooterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(scooterPanelLayout.createSequentialGroup()
                        .addComponent(scooterTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(scooterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(scooterTraits1)
                            .addComponent(scooterCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(scooterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(scooterTraits2)
                            .addComponent(scooterTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scooterButton)
                        .addGap(0, 65, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scooterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dronePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(atvPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atvPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(dronePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scooterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 String atvselectedItem = "";
    private void atvComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atvComboActionPerformed
        atvselectedItem = (String) atvCombo.getSelectedItem();


    }//GEN-LAST:event_atvComboActionPerformed
    String atvcerinta1 = "";
    private void atvButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atvButtonActionPerformed
        String atvtotalitate = "";
        for (Atv atv : atvs) {

            if (atv.respectaCerinta(atvselectedItem, Integer.parseInt(atvTextField1.getText()))) {
                atvtotalitate += atv.toString();
            }
            atvTextArea.setText(atvtotalitate);

        }


    }//GEN-LAST:event_atvButtonActionPerformed

    private void atvTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atvTextField1ActionPerformed
        atvcerinta1 = evt.toString();

    }//GEN-LAST:event_atvTextField1ActionPerformed

    private void droneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_droneButtonActionPerformed
        String dronetotalitate = "";
        for (Drone drone : drones) {

            if (!drone.respectaCerinta(Double.parseDouble(droneTextField1.getText()), Integer.parseInt(droneTextField2.getText())))
                dronetotalitate += drone.toString();
            
            droneTextArea.setText(dronetotalitate);

            //  if(!drone.respectaCerinta(1000 ,6)) 
        }
    }//GEN-LAST:event_droneButtonActionPerformed

    private void scooterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scooterButtonActionPerformed
        String scootertotalitate = "";
        for (Scooter scooter : scooters) {

            if (scooter.respectaCerinta(scooterselectedItem,Short.parseShort(scooterTextField1.getText()))) 
                 scootertotalitate += scooter.toString();
                 
            scooterTextArea.setText(scootertotalitate);

        }

    }//GEN-LAST:event_scooterButtonActionPerformed
boolean scooterselectedItem=true;
    private void scooterComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scooterComboActionPerformed
         scooterselectedItem = Boolean.parseBoolean((String)scooterCombo.getSelectedItem());
    }//GEN-LAST:event_scooterComboActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AtvDroneScooterConditiiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtvDroneScooterConditiiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtvDroneScooterConditiiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtvDroneScooterConditiiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtvDroneScooterConditiiFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atvButton;
    private javax.swing.JComboBox<String> atvCombo;
    private javax.swing.JPanel atvPanel;
    private javax.swing.JTextArea atvTextArea;
    private javax.swing.JTextField atvTextField1;
    private javax.swing.JLabel atvTitle;
    private javax.swing.JLabel atvTraits1;
    private javax.swing.JLabel atvTraits2;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton droneButton;
    private javax.swing.JPanel dronePanel;
    private javax.swing.JTextArea droneTextArea;
    private javax.swing.JTextField droneTextField1;
    private javax.swing.JTextField droneTextField2;
    private javax.swing.JLabel droneTitle;
    private javax.swing.JLabel droneTraits1;
    private javax.swing.JLabel droneTraits2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton scooterButton;
    private javax.swing.JComboBox<String> scooterCombo;
    private javax.swing.JPanel scooterPanel;
    private javax.swing.JTextArea scooterTextArea;
    private javax.swing.JTextField scooterTextField1;
    private javax.swing.JLabel scooterTitle;
    private javax.swing.JLabel scooterTraits1;
    private javax.swing.JLabel scooterTraits2;
    // End of variables declaration//GEN-END:variables
}
