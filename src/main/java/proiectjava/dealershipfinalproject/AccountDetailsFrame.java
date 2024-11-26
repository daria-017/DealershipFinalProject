package proiectjava.dealershipfinalproject;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List; 

public class AccountDetailsFrame extends JFrame {
    private Customer customer; 
    
    public AccountDetailsFrame(Customer customer) {
        this.customer = customer;
        setTitle("Account Details");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());
        
        // Header:
        JLabel header = new JLabel("Owned Vehicles", JLabel.CENTER);
        header.setFont(new Font("Arial", Font.BOLD, 20));
        add(header, BorderLayout.NORTH);
        
        // Vehicle Tabel:
        String[] columnNames = { "ID", "Brand", "Model", "Year", "Color", "Price", "Weight"}; // parameters
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        
        JTable vehicleTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(vehicleTable);
        add(scrollPane, BorderLayout.CENTER);
        
        // Filling the table with customers:
        populateTable(tableModel, customer.getVehicles());
        
        setVisible(true);
    }
    
    private void populateTable(DefaultTableModel tableModel, List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            Object[] rowData = {
                vehicle.getId(),
                vehicle.getBrand(),
                vehicle.getModel(),
                vehicle.getYear(),
                vehicle.getColor(),
                vehicle.getPrice(),
                vehicle.getWeight(),
            };
            tableModel.addRow(rowData);
        }
    }
}

/*
Add button in MainFrame:

JButton accountDetailsButton = new JButton("Account Details");
accountDetailsButton.addActionListener(e -> {
    AccountDetailsFrame accountDetailsFrame = new AccountDetailsFrame(loggedInCustomer);
});
add(accountDetailsButton);

*/