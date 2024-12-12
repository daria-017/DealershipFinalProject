package proiectjava.dealershipfinalproject;

import java.awt.Color;
import javax.swing.DefaultListModel;

public class CarTruckMotorcycleConditiiFrame extends javax.swing.JFrame {
    private final Car[] cars;
    private final Truck[] trucks;
    private final Motorcycle[] motorcycles;
    DefaultListModel<Car> carDefaultListModel = new DefaultListModel<>();
    DefaultListModel<String> carListModel = new DefaultListModel<>();
    DefaultListModel<Truck> truckDefaultListModel = new DefaultListModel<>();
    DefaultListModel<String> truckListModel = new DefaultListModel<>();
    DefaultListModel<Motorcycle> motorcycleDefaultListModel = new DefaultListModel<>();
    DefaultListModel<String> motorcycleListModel = new DefaultListModel<>();

    public CarTruckMotorcycleConditiiFrame() {
        initComponents();
        Engine carEngine1 = new Engine("V6", 200, 60, "Diesel");
        Engine carEngine2 = new Engine("V4", 120, 40, "Diesel");
        Engine carEngine3 = new Engine("V8", 300, 80, "Benzina");
        Engine carEngine4 = new Engine("V6", 300, 60, "Petrol");
        Engine carEngine5 = new Engine("V8", 450, 70, "Petrol");
        Engine carEngine6 = new Engine("Electric", 200, 100, "Electric");
        Engine carEngine7 = new Engine("V4", 180, 50, "Petrol");
        Engine carEngine8 = new Engine("Inline-6", 350, 65, "Diesel");
        Engine carEngine9 = new Engine("Hybrid", 250, 55, "Hybrid");
        Engine carEngine10 = new Engine("Boxer-4", 220, 45, "Petrol");
        
        Transmission carTransmission1 = new Transmission("Automatic", 6);
        Transmission carTransmission2 = new Transmission("Manual", 6);
        Transmission carTransmission3 = new Transmission("Automatic", 5);
        Transmission carTransmission4 = new Transmission("Automatic", 8);
        Transmission carTransmission5 = new Transmission("Manual", 6);
        Transmission carTransmission6 = new Transmission("CVT", 0);
        Transmission carTransmission7 = new Transmission("Automatic", 10);
        Transmission carTransmission8 = new Transmission("Manual", 5);
        Transmission carTransmission9 = new Transmission("Semi-Automatic", 7);
        Transmission carTransmission10 = new Transmission("Dual-Clutch", 9);
        
        this.cars = new Car[10];
        cars[0] = new Car(1, "Toyota", "Camry", (short) 2022, Color.BLUE, 25000.99, 1500, carEngine1, carTransmission1, null, 12000, 240, false, true, true, "Sedan");
        cars[1] = new Car(2, "Ford", "Mustang", (short) 2023, Color.RED, 45000.50, 1600, carEngine2, carTransmission2, null, 8000, 260, true, true, true, "Coupe");
        cars[2] = new Car(3, "Tesla", "Model S", (short) 2021, Color.WHITE, 75000.00, 2000, carEngine3, carTransmission3, null, 15000, 250, false, true, true, "Sedan");
        cars[3] = new Car(4, "Honda", "Civic", (short) 2020, Color.GRAY, 22000.00, 1300, carEngine4, carTransmission4, null, 18000, 220, false, true, false, "Hatchback");
        cars[4] = new Car(5, "BMW", "X5", (short) 2024, Color.BLACK, 60000.00, 2500, carEngine5, carTransmission5, null, 5000, 240, false, true, true, "SUV");
        cars[5] = new Car(6, "Toyota", "Prius", (short) 2022, Color.GREEN, 28000.00, 1400, carEngine6, carTransmission6, null, 10000, 180, false, true, true, "Hatchback");
        cars[6] = new Car(7, "Subaru", "Impreza", (short) 2021, Color.GREEN, 30000.00, 1450, carEngine7, carTransmission7, null, 15000, 220, false, true, true, "Sedan");
        cars[7] = new Car(8, "Lucid", "Air", (short) 2023, Color.RED, 80000.00, 2200, carEngine8, carTransmission8, null, 1200, 320, false, true, true, "Sedan");
        cars[8] = new Car(9, "Lamborghini", "Huracan", (short) 2023, Color.YELLOW, 200000.00, 1550, carEngine9, carTransmission9, null, 3000, 325, false, true, true, "Coupe");
        cars[9] = new Car(10, "Mazda", "RX-8", (short) 2009, Color.RED, 15000.00, 1300, carEngine10, carTransmission10, null, 50000, 230, true, true, false, "Coupe");
    
        this.trucks = new Truck[10];
        trucks[0] = new Truck(17, "Ford", "F-250", (short) 2023, Color.BLACK, 55000.00, 3500, carEngine1, carTransmission1, null, 18000, 7500, 1700, false, true);
        trucks[1] = new Truck(18, "Chevrolet", "Silverado 2500", (short) 2022, Color.BLUE, 60000.00, 4000, carEngine2, carTransmission2, null, 22000, 8000, 1800, true, true);
        trucks[2] = new Truck(19, "Ram", "3500", (short) 2021, Color.GRAY, 65000.00, 4500, carEngine3, carTransmission3, null, 25000, 8500, 1900, true, false);
        trucks[3] = new Truck(20, "GMC", "Sierra 3500", (short) 2020, Color.RED, 70000.00, 4600, carEngine4, carTransmission4, null, 28000, 9000, 2000, false, true);
        trucks[4] = new Truck(21, "Toyota", "Tundra", (short) 2023, Color.GREEN, 75000.00, 4000, carEngine5, carTransmission5, null, 30000, 9500, 2100, true, false);
        trucks[5] = new Truck(22, "Ford", "Super Duty", (short) 2022, Color.RED, 80000.00, 4700, carEngine6, carTransmission6, null, 32000, 10000, 2200, false, true);
        trucks[6] = new Truck(23, "Chevrolet", "Colorado ZR2", (short) 2021, Color.ORANGE, 70000.00, 3800, carEngine7, carTransmission7, null, 29000, 10500, 2300, true, true);
        trucks[7] = new Truck(24, "Nissan", "Frontier", (short) 2020, Color.BLUE, 50000.00, 3300, carEngine8, carTransmission8, null, 31000, 11000, 2400, true, false);
        trucks[8] = new Truck(25, "Ram", "2500 Power Wagon", (short) 2023, Color.BLUE, 85000.00, 4800, carEngine9, carTransmission9, null, 35000, 11500, 2500, false, true);
        trucks[9] = new Truck(26, "GMC", "Canyon", (short) 2022, Color.WHITE, 60000.00, 3500, carEngine10, carTransmission10, null, 33000, 12000, 2600, true, false);
        
        this.motorcycles = new Motorcycle[10];
        motorcycles[0] = new Motorcycle(17, "Honda", "CBR1000RR", (short) 2023, Color.BLACK, 18000.00, 250, carEngine1, carTransmission1, null, 12000, 180, false, true, "Sport");
        motorcycles[1] = new Motorcycle(18, "Kawasaki", "Ninja ZX-10R", (short) 2022, Color.GREEN, 19000.00, 260, carEngine2, carTransmission2, null, 15000, 190, true, true, "Sport");
        motorcycles[2] = new Motorcycle(19, "Suzuki", "GSX-R1000", (short) 2021, Color.BLUE, 17000.00, 240, carEngine3, carTransmission3, null, 18000, 175, true, false, "Sport");
        motorcycles[3] = new Motorcycle(20, "BMW", "S1000RR", (short) 2020, Color.RED, 20000.00, 280, carEngine4, carTransmission4, null, 20000, 200, false, true, "Sport");
        motorcycles[4] = new Motorcycle(21, "Ducati", "Panigale V4", (short) 2023, Color.GREEN, 25000.00, 300, carEngine5, carTransmission5, null, 25000, 220, true, false, "Sport");
        motorcycles[5] = new Motorcycle(22, "Triumph", "Speed Triple 1200", (short) 2022, Color.BLACK, 19000.00, 280, carEngine6, carTransmission6, null, 22000, 210, false, true, "Street");
        motorcycles[6] = new Motorcycle(23, "KTM", "RC 390", (short) 2021, Color.ORANGE, 7000.00, 150, carEngine7, carTransmission7, null, 25000, 140, true, true, "Sport");
        motorcycles[7] = new Motorcycle(24, "Yamaha", "MT-09", (short) 2020, Color.BLUE, 9000.00, 180, carEngine8, carTransmission8, null, 27000, 160, true, false, "Street");
        motorcycles[8] = new Motorcycle(25, "Harley-Davidson", "Iron 883", (short) 2023, Color.RED, 11000.00, 190, carEngine9, carTransmission9, null, 28000, 170, false, true, "Cruiser");
        motorcycles[9] = new Motorcycle(26, "Honda", "Rebel 500", (short) 2022, Color.WHITE, 7000.00, 160, carEngine10, carTransmission10, null, 29000, 150, true, false, "Cruiser");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        carPanel = new javax.swing.JPanel();
        carTitle = new javax.swing.JLabel();
        carLabel1 = new javax.swing.JLabel();
        carComboBox = new javax.swing.JComboBox<>();
        carLabel2 = new javax.swing.JLabel();
        carTextField = new javax.swing.JTextField();
        carScrollPane = new javax.swing.JScrollPane();
        carList = new javax.swing.JList<>();
        carProceedButton = new javax.swing.JButton();
        truckPanel = new javax.swing.JPanel();
        truckTitle = new javax.swing.JLabel();
        truckLabel1 = new javax.swing.JLabel();
        truckComboBox = new javax.swing.JComboBox<>();
        truckLabel2 = new javax.swing.JLabel();
        truckTextField = new javax.swing.JTextField();
        truckScrollPane = new javax.swing.JScrollPane();
        truckList = new javax.swing.JList<>();
        truckProceedButton = new javax.swing.JButton();
        motorcyclePanel = new javax.swing.JPanel();
        motorcycleTitle = new javax.swing.JLabel();
        motorcycleLabel1 = new javax.swing.JLabel();
        motorcycleComboBox = new javax.swing.JComboBox<>();
        motorcycleLabel2 = new javax.swing.JLabel();
        motorcycleTextField = new javax.swing.JTextField();
        motorcycleScrollPane = new javax.swing.JScrollPane();
        motorcycleList = new javax.swing.JList<>();
        motorcycleProceedButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conditii");
        setMaximumSize(new java.awt.Dimension(600, 540));
        setMinimumSize(new java.awt.Dimension(600, 540));
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(0, 102, 102));
        mainPanel.setMaximumSize(new java.awt.Dimension(600, 540));
        mainPanel.setMinimumSize(new java.awt.Dimension(600, 540));
        mainPanel.setPreferredSize(new java.awt.Dimension(600, 540));

        carPanel.setBackground(new java.awt.Color(216, 214, 196));
        carPanel.setMaximumSize(new java.awt.Dimension(99, 160));
        carPanel.setMinimumSize(new java.awt.Dimension(99, 160));
        carPanel.setPreferredSize(new java.awt.Dimension(99, 160));

        carTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        carTitle.setForeground(new java.awt.Color(0, 102, 102));
        carTitle.setText("Car");

        carLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        carLabel1.setForeground(new java.awt.Color(0, 102, 102));
        carLabel1.setText("Decapotabila:");

        carComboBox.setBackground(new java.awt.Color(0, 102, 102));
        carComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        carComboBox.setForeground(new java.awt.Color(216, 214, 196));
        carComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "True", "False" }));

        carLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        carLabel2.setForeground(new java.awt.Color(0, 102, 102));
        carLabel2.setText("Max. mileage:");

        carTextField.setBackground(new java.awt.Color(0, 102, 102));
        carTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        carTextField.setForeground(new java.awt.Color(216, 214, 196));
        carTextField.setText("Enter mileage");

        carList.setBackground(new java.awt.Color(0, 102, 102));
        carList.setForeground(new java.awt.Color(216, 214, 196));
        carList.setModel(carListModel);
        carScrollPane.setViewportView(carList);

        carProceedButton.setBackground(new java.awt.Color(0, 102, 102));
        carProceedButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        carProceedButton.setForeground(new java.awt.Color(216, 214, 196));
        carProceedButton.setText("Proceed");
        carProceedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carProceedButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout carPanelLayout = new javax.swing.GroupLayout(carPanel);
        carPanel.setLayout(carPanelLayout);
        carPanelLayout.setHorizontalGroup(
            carPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carPanelLayout.createSequentialGroup()
                .addGroup(carPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(carPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(carPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(carPanelLayout.createSequentialGroup()
                                .addComponent(carLabel1)
                                .addGap(31, 31, 31)
                                .addComponent(carComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(carTitle)
                            .addGroup(carPanelLayout.createSequentialGroup()
                                .addComponent(carLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(carTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(carPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(carProceedButton)))
                .addGap(18, 18, 18)
                .addComponent(carScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        carPanelLayout.setVerticalGroup(
            carPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(carPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addGroup(carPanelLayout.createSequentialGroup()
                        .addComponent(carTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(carPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(carLabel1)
                            .addComponent(carComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(carPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(carLabel2)
                            .addComponent(carTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(carProceedButton)))
                .addContainerGap())
        );

        truckPanel.setBackground(new java.awt.Color(216, 214, 196));
        truckPanel.setPreferredSize(new java.awt.Dimension(99, 160));

        truckTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        truckTitle.setForeground(new java.awt.Color(0, 102, 102));
        truckTitle.setText("Truck");

        truckLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        truckLabel1.setForeground(new java.awt.Color(0, 102, 102));
        truckLabel1.setText("Backup Sound:");

        truckComboBox.setBackground(new java.awt.Color(0, 102, 102));
        truckComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        truckComboBox.setForeground(new java.awt.Color(216, 214, 196));
        truckComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "True", "False" }));
        truckComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                truckComboBoxActionPerformed(evt);
            }
        });

        truckLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        truckLabel2.setForeground(new java.awt.Color(0, 102, 102));
        truckLabel2.setText("Max. weight:");

        truckTextField.setBackground(new java.awt.Color(0, 102, 102));
        truckTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        truckTextField.setForeground(new java.awt.Color(216, 214, 196));
        truckTextField.setText("Enter weight");
        truckTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                truckTextFieldActionPerformed(evt);
            }
        });

        truckList.setBackground(new java.awt.Color(0, 102, 102));
        truckList.setForeground(new java.awt.Color(216, 214, 196));
        truckList.setModel(truckListModel);
        truckScrollPane.setViewportView(truckList);

        truckProceedButton.setBackground(new java.awt.Color(0, 102, 102));
        truckProceedButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        truckProceedButton.setForeground(new java.awt.Color(216, 214, 196));
        truckProceedButton.setText("Proceed");
        truckProceedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                truckProceedButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout truckPanelLayout = new javax.swing.GroupLayout(truckPanel);
        truckPanel.setLayout(truckPanelLayout);
        truckPanelLayout.setHorizontalGroup(
            truckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(truckPanelLayout.createSequentialGroup()
                .addGroup(truckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(truckPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(truckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(truckLabel2)
                            .addComponent(truckLabel1)
                            .addComponent(truckTitle))
                        .addGap(24, 24, 24)
                        .addGroup(truckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(truckComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(truckTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(truckPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(truckProceedButton)))
                .addGap(18, 18, 18)
                .addComponent(truckScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        truckPanelLayout.setVerticalGroup(
            truckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(truckPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(truckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(truckScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addGroup(truckPanelLayout.createSequentialGroup()
                        .addComponent(truckTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(truckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(truckLabel1)
                            .addComponent(truckComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(truckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(truckLabel2)
                            .addComponent(truckTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(truckProceedButton)))
                .addContainerGap())
        );

        motorcyclePanel.setBackground(new java.awt.Color(216, 214, 196));
        motorcyclePanel.setPreferredSize(new java.awt.Dimension(99, 160));

        motorcycleTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        motorcycleTitle.setForeground(new java.awt.Color(0, 102, 102));
        motorcycleTitle.setText("Motorcycle");

        motorcycleLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        motorcycleLabel1.setForeground(new java.awt.Color(0, 102, 102));
        motorcycleLabel1.setText("ABS:");

        motorcycleComboBox.setBackground(new java.awt.Color(0, 102, 102));
        motorcycleComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        motorcycleComboBox.setForeground(new java.awt.Color(216, 214, 196));
        motorcycleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "True", "False" }));
        motorcycleComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motorcycleComboBoxActionPerformed(evt);
            }
        });

        motorcycleLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        motorcycleLabel2.setForeground(new java.awt.Color(0, 102, 102));
        motorcycleLabel2.setText("Max. mileage:");

        motorcycleTextField.setBackground(new java.awt.Color(0, 102, 102));
        motorcycleTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        motorcycleTextField.setForeground(new java.awt.Color(216, 214, 196));
        motorcycleTextField.setText("Enter mileage");
        motorcycleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motorcycleTextFieldActionPerformed(evt);
            }
        });

        motorcycleList.setBackground(new java.awt.Color(0, 102, 102));
        motorcycleList.setForeground(new java.awt.Color(216, 214, 196));
        motorcycleList.setModel(motorcycleListModel);
        motorcycleScrollPane.setViewportView(motorcycleList);

        motorcycleProceedButton.setBackground(new java.awt.Color(0, 102, 102));
        motorcycleProceedButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        motorcycleProceedButton.setForeground(new java.awt.Color(216, 214, 196));
        motorcycleProceedButton.setText("Proceed");
        motorcycleProceedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motorcycleProceedButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout motorcyclePanelLayout = new javax.swing.GroupLayout(motorcyclePanel);
        motorcyclePanel.setLayout(motorcyclePanelLayout);
        motorcyclePanelLayout.setHorizontalGroup(
            motorcyclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(motorcyclePanelLayout.createSequentialGroup()
                .addGroup(motorcyclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(motorcyclePanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(motorcycleProceedButton))
                    .addGroup(motorcyclePanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(motorcyclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(motorcycleTitle)
                            .addGroup(motorcyclePanelLayout.createSequentialGroup()
                                .addGroup(motorcyclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(motorcycleLabel2)
                                    .addComponent(motorcycleLabel1))
                                .addGap(24, 24, 24)
                                .addGroup(motorcyclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(motorcycleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(motorcycleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(motorcycleScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        motorcyclePanelLayout.setVerticalGroup(
            motorcyclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(motorcyclePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(motorcyclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(motorcycleScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addGroup(motorcyclePanelLayout.createSequentialGroup()
                        .addComponent(motorcycleTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(motorcyclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(motorcycleLabel1)
                            .addComponent(motorcycleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(motorcyclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(motorcycleLabel2)
                            .addComponent(motorcycleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(motorcycleProceedButton)))
                .addContainerGap())
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(motorcyclePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addComponent(truckPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addComponent(carPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(carPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(truckPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(motorcyclePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carProceedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carProceedButtonActionPerformed
        // TODO add your handling code here:
        String convertibleChoice = (String) carComboBox.getSelectedItem();
        Boolean convertibleChoiceBoolean = Boolean.parseBoolean(convertibleChoice);
        String mileageChoice = carTextField.getText();
        Integer mileageChoiceInteger = Integer.parseInt(mileageChoice);
        
        carDefaultListModel.clear(); // remove old elements for new generated state
        for(Car car : cars) {
            if(convertibleChoiceBoolean == car.isIsConvertible() && mileageChoiceInteger < car.getMileage()) {
                carDefaultListModel.addElement(car);
            }
        }
        
        carListModel.clear();
        for(int i = 0; i < carDefaultListModel.size(); i++) {
            Car car = carDefaultListModel.getElementAt(i);
            carListModel.addElement(car.toString());
        }
    }//GEN-LAST:event_carProceedButtonActionPerformed
    
    
    
    private void truckProceedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_truckProceedButtonActionPerformed
        // TODO add your handling code here:
        String backupSoundChoice = (String) truckComboBox.getSelectedItem();
        Boolean backupSoundChoiceBoolean = Boolean.parseBoolean(backupSoundChoice);
        String weightChoice = truckTextField.getText();
        Integer weightChoiceInteger = Integer.parseInt(weightChoice);
        
        truckDefaultListModel.clear();
        for(Truck truck : trucks) {
            if(backupSoundChoiceBoolean == truck.isBackupSound() && weightChoiceInteger < truck.getMaxWeight()) {
                truckDefaultListModel.addElement(truck);
            }
        }
        
        truckListModel.clear();
        for(int i = 0; i < truckDefaultListModel.size(); i++) {
            Truck truck = truckDefaultListModel.getElementAt(i);
            truckListModel.addElement(truck.toString());
        }
    }//GEN-LAST:event_truckProceedButtonActionPerformed

    private void truckComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_truckComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_truckComboBoxActionPerformed

    private void truckTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_truckTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_truckTextFieldActionPerformed

    private void motorcycleComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motorcycleComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_motorcycleComboBoxActionPerformed

    private void motorcycleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motorcycleTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_motorcycleTextFieldActionPerformed

    private void motorcycleProceedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motorcycleProceedButtonActionPerformed
        // TODO add your handling code here:
        String absChoice = (String) motorcycleComboBox.getSelectedItem();
        Boolean absChoiceBoolean = Boolean.parseBoolean(absChoice);
        String mileageChoice = motorcycleTextField.getText();
        Integer mileageChoiceInteger = Integer.parseInt(mileageChoice);
        
        motorcycleDefaultListModel.clear(); // remove old elements for new generated state
        for(Motorcycle motorcycle : motorcycles) {
            if(absChoiceBoolean == motorcycle.isAbs() && mileageChoiceInteger < motorcycle.getMileage()) {
                motorcycleDefaultListModel.addElement(motorcycle);
            }
        }
        
        motorcycleListModel.clear();
        for(int i = 0; i < motorcycleDefaultListModel.size(); i++) {
            Motorcycle motorcycle = motorcycleDefaultListModel.getElementAt(i);
            motorcycleListModel.addElement(motorcycle.toString());
        }
    }//GEN-LAST:event_motorcycleProceedButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(CarTruckMotorcycleConditiiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarTruckMotorcycleConditiiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarTruckMotorcycleConditiiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarTruckMotorcycleConditiiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarTruckMotorcycleConditiiFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> carComboBox;
    private javax.swing.JLabel carLabel1;
    private javax.swing.JLabel carLabel2;
    private javax.swing.JList<String> carList;
    private javax.swing.JPanel carPanel;
    private javax.swing.JButton carProceedButton;
    private javax.swing.JScrollPane carScrollPane;
    private javax.swing.JTextField carTextField;
    private javax.swing.JLabel carTitle;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JComboBox<String> motorcycleComboBox;
    private javax.swing.JLabel motorcycleLabel1;
    private javax.swing.JLabel motorcycleLabel2;
    private javax.swing.JList<String> motorcycleList;
    private javax.swing.JPanel motorcyclePanel;
    private javax.swing.JButton motorcycleProceedButton;
    private javax.swing.JScrollPane motorcycleScrollPane;
    private javax.swing.JTextField motorcycleTextField;
    private javax.swing.JLabel motorcycleTitle;
    private javax.swing.JComboBox<String> truckComboBox;
    private javax.swing.JLabel truckLabel1;
    private javax.swing.JLabel truckLabel2;
    private javax.swing.JList<String> truckList;
    private javax.swing.JPanel truckPanel;
    private javax.swing.JButton truckProceedButton;
    private javax.swing.JScrollPane truckScrollPane;
    private javax.swing.JTextField truckTextField;
    private javax.swing.JLabel truckTitle;
    // End of variables declaration//GEN-END:variables
}
