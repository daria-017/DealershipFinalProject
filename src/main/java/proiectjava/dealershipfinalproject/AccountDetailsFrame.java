package proiectjava.dealershipfinalproject;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AccountDetailsFrame extends JFrame {
    
    public AccountDetailsFrame(Customer customer) {
        setTitle("Account Details");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());
        
        // Header:
        JLabel header = new JLabel("Owned Vehicles", JLabel.CENTER);
        header.setFont(new Font("Arial", Font.BOLD, 20));
        add(header, BorderLayout.NORTH);
        
        // Vehicle Table:
        String[] columnNames = {"ID", "Brand", "Model", "Year", "Color", "Price", "Weight"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        JTable vehicleTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(vehicleTable);
        add(scrollPane, BorderLayout.CENTER);
        
        // Filling the table with purchases from the file:
        List<Vehicle> vehicles = loadVehiclesFromFile();
        if (vehicles.isEmpty()) {
            tableModel.addRow(new Object[]{"No vehicles!", "", "", "", "", "", ""});
        } else {
            populateTable(tableModel, vehicles);
        }
        
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
    
    private List<Vehicle> loadVehiclesFromFile() {
        List<Vehicle> vehicles = new ArrayList<>();
        File file = new File("purchases.txt");
        
        if (!file.exists()) {
            return vehicles; // Empty list if the file doesn't exist
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Purchased: ")) {
                    Vehicle vehicle = parseVehicle(line);
                    if (vehicle != null) {
                        vehicles.add(vehicle);
                    }
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error reading purchases.txt: " + e.getMessage(),
                    "File Error", JOptionPane.ERROR_MESSAGE);
        }
        return vehicles;
    }
    
    private Vehicle parseVehicle(String line) {
    try {
        // Parse vehicle details from the line
        int id = Integer.parseInt(line.split("id: ")[1].split(" brand:")[0].trim()); // Parse ID as an int
        String brand = line.split("brand: ")[1].split(" model:")[0].trim();
        String model = line.split("model: ")[1].split(" year:")[0].trim();
        short year = Short.parseShort(line.split("year: ")[1].split(" color:")[0].trim()); // Cast to short for year
        
        // Extract color string and parse it to a Color object
        String colorString = line.split("color: ")[1].split(" price:")[0].trim();
        Color color = parseColor(colorString); // Parse the color string
        
        double price = Double.parseDouble(line.split("price: ")[1].split(" weight:")[0].trim());
        int weight = Integer.parseInt(line.split("weight: ")[1].split("engine")[0].trim());
        
        return new Vehicle(id, brand, model, year, color, price, weight, null, null, null); // Return the Vehicle
    } catch (Exception e) {
        System.err.println("Error parsing line: " + line);
    }
    return null; // Return null for invalid lines
}

private Color parseColor(String colorString) {
    // Remove the "java.awt.Color[r=,g=,b=]" part to extract RGB values
    colorString = colorString.replace("java.awt.Color[r=", "").replace("g=", "").replace("b=", "").replace("]", "");
    
    // Split by commas to get individual color components
    String[] rgb = colorString.split(",");
    
    // Parse the RGB values
    int red = Integer.parseInt(rgb[0].trim());
    int green = Integer.parseInt(rgb[1].trim());
    int blue = Integer.parseInt(rgb[2].trim());
    
    return new Color(red, green, blue); // Return the Color object
}



}
