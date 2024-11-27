package proiectjava.dealershipfinalproject;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BuyVehicleFrame extends JFrame {
    private ArrayList<Vehicle> vehicles;  //facem arraylist pt fiecare 
    private JLabel vehicleImageLabel;
    private JTextArea vehicleDetailsTextArea;
    private JComboBox<Vehicle> vehicleListDropdown;
    private JTextArea purchaseLog;

    public BuyVehicleFrame() {
    vehicles = new ArrayList<>();
        populateVehicles();

        // JFrame setup
        setTitle("Vehicle Marketplace");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        // Dropdown to select vehicles
        vehicleListDropdown = new JComboBox<>(vehicles.toArray(new Vehicle[0]));
        vehicleListDropdown.addActionListener(e -> updateVehicleDisplay());

        // Vehicle details and image
        vehicleImageLabel = new JLabel();
        vehicleImageLabel.setHorizontalAlignment(JLabel.CENTER);

        vehicleDetailsTextArea = new JTextArea(5, 20);
        vehicleDetailsTextArea.setEditable(false);
        vehicleDetailsTextArea.setLineWrap(true);
        vehicleDetailsTextArea.setWrapStyleWord(true);
        JScrollPane detailsScrollPane = new JScrollPane(vehicleDetailsTextArea);

        // Buttons
        JButton buyButton = new JButton("Buy");
        buyButton.addActionListener(e -> purchaseVehicle());

        JButton downloadLogButton = new JButton("Download Purchase Log");
        downloadLogButton.addActionListener(e -> savePurchaseLog());

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(buyButton);
        buttonPanel.add(downloadLogButton);

        // Purchase log
        purchaseLog = new JTextArea(10, 40);
        purchaseLog.setEditable(false);
        JScrollPane logScrollPane = new JScrollPane(purchaseLog);

        // Layout components
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(vehicleListDropdown, BorderLayout.NORTH);
        topPanel.add(vehicleImageLabel, BorderLayout.CENTER);
        topPanel.add(detailsScrollPane, BorderLayout.SOUTH);

        add(topPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        add(logScrollPane, BorderLayout.EAST);

        // Display the first vehicle
        updateVehicleDisplay();

        setVisible(true);
    }

    private void populateVehicles() {
        
        Transmission transmisia=new Transmission();
        vehicles.add(new Vehicle(
                1,
                "Toyota",
                "Corolla",
                (short) 2020,
                Color.BLUE,
                20000.0,
                1500,
                new Engine("",0,0,""),
                transmisia,
                new ImageIcon("car1.jpg")
        ));
        vehicles.add(new Vehicle(
                2,
                "Honda",
                "Civic",
                (short) 2021,
                Color.RED,
                22000.0,
                1400,
                 new Engine("",0,0,""),
                transmisia,
                new ImageIcon("car2.jpg")
        ));
        vehicles.add(new Vehicle(
                3,
                "Ford",
                "Mustang",
                (short) 2022,
                Color.BLACK,
                30000.0,
                1600,   new Engine("",0,0,""),
                 transmisia,
                new ImageIcon("car3.jpg")
        ));
                vehicles.add(new Vehicle(
                3,
                "Ford",
                "Mustang",
                (short) 2022,
                Color.BLACK,
                30000.0,
                1600,   new Engine("",0,0,""),
                 transmisia,
                new ImageIcon("car3.jpg")
        ));
                //exemplu de Clasa Car adaugata cu toti parametrii aici
                        vehicles.add(new Car(
                3,
                "Ford",
                "Mustang",
                (short) 2022,
                Color.BLACK,
                30000.0,
                1600,   new Engine("",0,0,""),
                 transmisia,
                new ImageIcon("car3.jpg")
                                ,0
                                ,0
        ,false
        ,false
        ,false
        ,"ggg"
        ));
    }

    private void updateVehicleDisplay() {
        Vehicle selectedVehicle = (Vehicle) vehicleListDropdown.getSelectedItem();
        if (selectedVehicle != null) {
            vehicleImageLabel.setIcon(selectedVehicle.getPhoto());
            vehicleDetailsTextArea.setText(selectedVehicle.toString());
        }
    }

    private void purchaseVehicle() {
        Vehicle selectedVehicle = (Vehicle) vehicleListDropdown.getSelectedItem();
        if (selectedVehicle != null) {
            String logEntry = "Purchased: " + selectedVehicle.toString() + "\n";
            purchaseLog.append(logEntry);

            // Append to purchases.txt file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("purchases.txt", true))) {
                writer.write(logEntry);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error saving purchase log: " + e.getMessage());
            }
        }
    }

    private void savePurchaseLog() {
        JOptionPane.showMessageDialog(this, "The purchase log has been saved as purchases.txt in your project folder.");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(BuyVehicleFrame::new);
    }
}
