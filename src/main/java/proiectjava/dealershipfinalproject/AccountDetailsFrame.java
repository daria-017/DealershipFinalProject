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
        
        // Vehicle Table with only one column:
        String[] columnNames = {"Vehicle Details"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        JTable vehicleTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(vehicleTable);
        add(scrollPane, BorderLayout.CENTER);
        
        // Filling the table with purchases from the file:
        List<Vehicle> vehicles = loadVehiclesFromFile();
        if (vehicles.isEmpty()) {
            tableModel.addRow(new Object[]{"No vehicles!"});
        } else {
            populateTable(tableModel, vehicles);
        }
        
        setVisible(true);
    }
    
    private void populateTable(DefaultTableModel tableModel, List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            String vehicleDetails = "ID: " + vehicle.getId() + "\n" +
                                    "Brand: " + vehicle.getBrand() + "\n" +
                                    "Model: " + vehicle.getModel() + "\n" +
                                    "Year: " + vehicle.getYear() + "\n" +
                                    "Color: " + vehicle.getColor() + "\n" +
                                    "Price: " + vehicle.getPrice() + "\n" +
                                    "Weight: " + vehicle.getWeight();
            tableModel.addRow(new Object[]{vehicleDetails});
        }
    }
    
    private List<Vehicle> loadVehiclesFromFile() {
    List<Vehicle> vehicles = new ArrayList<>();
    File file = new File("purchases.txt");

    if (!file.exists()) {
        System.out.println("File not found: purchases.txt");
        return vehicles; // Empty list if the file doesn't exist
    }

    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println("Read line: " + line); // Debugging: Print the line being read
            if (line.startsWith("Purchased: ")) {
                Vehicle vehicle = parseVehicle(line);
                if (vehicle != null) {
                    vehicles.add(vehicle);
                } else {
                    System.out.println("Error parsing vehicle: " + line); // Debugging: Print error if parsing fails
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
        // Debugging: Print the raw line
        System.out.println("Parsing line: " + line);

        // Parse vehicle details from the line
        String[] idParts = line.split("id: ");
        int id = Integer.parseInt(idParts[1].split(" brand:")[0].trim()); // Parse ID as an int

        String[] brandParts = line.split("brand: ");
        String brand = brandParts[1].split(" model:")[0].trim();

        String[] modelParts = line.split("model: ");
        String model = modelParts[1].split(" year:")[0].trim();

        String[] yearParts = line.split("year: ");
        short year = Short.parseShort(yearParts[1].split(" color:")[0].trim()); // Cast to short for year
        
        // Extract color string and parse it to a Color object
        String[] colorParts = line.split("color: ");
        String colorString = colorParts[1].split(" price:")[0].trim();
        Color color = parseColor(colorString); // Parse the color string
        
        // Parse price and weight
        String[] priceParts = line.split("price: ");
        double price = Double.parseDouble(priceParts[1].split(" weight:")[0].trim());

        String[] weightParts = line.split("weight(in kg): ");
        int weight = Integer.parseInt(weightParts[1].split("engine")[0].trim());

        // Return the Vehicle object
        return new Vehicle(id, brand, model, year, color, price, weight, null, null, null);
    } catch (Exception e) {
        System.err.println("Error parsing line: " + line);
        e.printStackTrace(); // Debugging: Print the stack trace to identify issues
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

    public static void main(String[] args) {
        // Create a simple customer object for testing
        Customer testCustomer = new Customer("Prenume", "Nume", 123, null);

        // Create an AccountDetailsFrame passing the customer object
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AccountDetailsFrame(testCustomer);
            }
        });
    }
}
