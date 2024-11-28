package proiectjava.dealershipfinalproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class BuyVehicleFrame extends JFrame {

    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    ;
    private JLabel vehicleImageLabel;
    private JTextArea vehicleDetailsTextArea;
    private JComboBox<Vehicle> vehicleListDropdown;
    private JTextArea purchaseLog;

    public BuyVehicleFrame() {

        populateVehicles();

        //
        setTitle("Dealership Shop");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//"EXIT_ON_CLOSE opreste tot proiectul"
        setLayout(new BorderLayout());

        //Selecteaza vehicule
        vehicleListDropdown = new JComboBox<>(vehicles.toArray(new Vehicle[0]));
        vehicleListDropdown.addActionListener(e -> updateVehicleDisplay());//

        /* //asta de jos e la fel ca cel de sus cu ajutorul optiunii din netbeans
        vehicleListDropdown.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateVehicleDisplay();
            }
        });
         */
        // Detalii si imagine vehicule
        vehicleImageLabel = new JLabel();
        vehicleImageLabel.setHorizontalAlignment(JLabel.CENTER);

        vehicleDetailsTextArea = new JTextArea(5, 20);
        vehicleDetailsTextArea.setEditable(false);
        vehicleDetailsTextArea.setLineWrap(true);
        vehicleDetailsTextArea.setWrapStyleWord(true);
        JScrollPane detailsScrollPane = new JScrollPane(vehicleDetailsTextArea);

        // Cumparare
        JButton buyButton = new JButton("Buy");
        buyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                purchaseVehicle();
            }
        });
        //

        JButton downloadLogButton = new JButton("Download Purchase Log");
        downloadLogButton.addActionListener(e -> savePurchaseLog());//"asculta" butonul pentru input-ul utilizatorului

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(buyButton);
        buttonPanel.add(downloadLogButton);

        //Lista cumparaturi
        purchaseLog = new JTextArea(10, 40);
        purchaseLog.setEditable(false);
        JScrollPane logScrollPane = new JScrollPane(purchaseLog);

        //
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(vehicleListDropdown, BorderLayout.NORTH);
        topPanel.add(vehicleImageLabel, BorderLayout.CENTER);
        topPanel.add(detailsScrollPane, BorderLayout.SOUTH);

        add(topPanel, BorderLayout.CENTER);//adauga imagine, scroll,meniul dropdown de selectie al vehiculelor
        add(buttonPanel, BorderLayout.SOUTH);//adauga butonul de buy
        add(logScrollPane, BorderLayout.EAST); //adauga log-ul din dreapta cu cumparaturile

        // 
        updateVehicleDisplay();

        setVisible(true);
    }

    private void populateVehicles() {//aici introducem vehicule

        Transmission transmisia = new Transmission();
        vehicles.add(new Vehicle(
                1,
                "Toyota",
                "Corolla",
                (short) 2020,
                Color.BLUE,
                20000.0,
                1500,
                new Engine("", 0, 0, ""),
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
                new Engine("", 0, 0, ""),
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
                1600, new Engine("", 0, 0, ""),
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
                1600, new Engine("", 0, 0, ""),
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
                1600, new Engine("", 0, 0, ""),
                transmisia,
                new ImageIcon("car3.jpg"),
                0,
                0,
                false,
                false,
                false,
                "ggg"
        ));
    }

    private void updateVehicleDisplay() {
        Vehicle selectedVehicle = (Vehicle) vehicleListDropdown.getSelectedItem();
        if (selectedVehicle != null) {
            vehicleImageLabel.setIcon(selectedVehicle.getPhoto());//pune poza
            vehicleDetailsTextArea.setText(selectedVehicle.toString());
        }
    }

    private void purchaseVehicle() {
        Vehicle selectedVehicle = (Vehicle) vehicleListDropdown.getSelectedItem();
        if (selectedVehicle != null) {
            String logEntry = "Purchased: " + selectedVehicle.toString() + "\n";
            purchaseLog.append(logEntry);

            //Modifica purchases.txt
            try (FileOutputStream fos = new FileOutputStream("purchases.txt", true)) {
                fos.write(logEntry.getBytes());
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Nu a salvat log-ul: " + e.getMessage());//daca fisierul nu este,da throw la mesaj
            }
        }
    }

    private void savePurchaseLog() {
        JOptionPane.showMessageDialog(this, "Salvat in purchases.txt");
    }

}
