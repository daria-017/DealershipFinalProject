package proiectjava.dealershipfinalproject;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AccountDetailsFrame extends JFrame {

    public AccountDetailsFrame() {
        setTitle("Account Details");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        // Header:
        JLabel header = new JLabel("Owned Vehicles", JLabel.CENTER);
        header.setFont(new Font("Arial", Font.BOLD, 20));
        add(header, BorderLayout.NORTH);

        // Vehicle Table with only one column:
        String[] columnNames = {"Vehicle Details"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        JTable vehicleTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(vehicleTable);
        add(scrollPane, BorderLayout.CENTER);

        // Filling the table with raw data from the file:
        List<String> vehicleData = loadVehicleDataFromFile();
        if (vehicleData.isEmpty()) {
            tableModel.addRow(new Object[]{"No vehicles!"});
        } else {
            populateTable(tableModel, vehicleData);
        }

        setVisible(true);
    }

    private void populateTable(DefaultTableModel tableModel, List<String> vehicleData) {
        for (String data : vehicleData) {
            tableModel.addRow(new Object[]{data});
        }
    }

    private List<String> loadVehicleDataFromFile() {
        List<String> vehicleData = new ArrayList<>();
        File file = new File("purchases.txt");

        if (!file.exists()) {
            System.out.println("File not found: purchases.txt");
            return vehicleData; // Empty list if the file doesn't exist
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read line: " + line); // Debugging: Print the line being read
                if (line.startsWith("Purchased: ")) {
                    vehicleData.add(line); // Add the raw line directly to the list
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error reading purchases.txt: " + e.getMessage(),
                    "File Error", JOptionPane.ERROR_MESSAGE);
        }
        return vehicleData;
    }
/*
    public static void main(String[] args) {
        // Launch the frame
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AccountDetailsFrame();
            }
        });
    }
*/
}
