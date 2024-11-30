package proiectjava.dealershipfinalproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Dragos :>
 */
public class CreateAccountFrame extends javax.swing.JFrame {
    public CreateAccountFrame() {
        // Set up the frame
        setTitle("Create Account");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null); // Center the window on the screen
        setLayout(new GridLayout(7, 2, 10, 10));

        // Set background color
        getContentPane().setBackground(new Color(0, 102, 102));

        // Labels and fields
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setForeground(Color.WHITE); // Set text color
        JTextField nameField = new JTextField();

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setForeground(Color.WHITE);
        JTextField usernameField = new JTextField();

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setForeground(Color.WHITE);
        JTextField emailField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setForeground(Color.WHITE);
        JPasswordField passwordField = new JPasswordField();

        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordLabel.setForeground(Color.WHITE);
        JPasswordField confirmPasswordField = new JPasswordField();

        // Buttons
        JButton createAccountButton = new JButton("Create Account");
        JButton cancelButton = new JButton("Cancel");

        // Add components to the frame
        add(nameLabel);
        add(nameField);

        add(usernameLabel);
        add(usernameField);

        add(emailLabel);
        add(emailField);

        add(passwordLabel);
        add(passwordField);

        add(confirmPasswordLabel);
        add(confirmPasswordField);

        add(createAccountButton);
        add(cancelButton);

        // Add button action listeners
        createAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText().trim();
                String username = usernameField.getText().trim();
                String email = emailField.getText().trim();
                String password = new String(passwordField.getPassword());
                String confirmPassword = new String(confirmPasswordField.getPassword());

                if (name.isEmpty() || username.isEmpty() || email.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "All fields must be filled out!", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!password.equals(confirmPassword)) {
                    JOptionPane.showMessageDialog(null, "Passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Write to the file
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter("accounts.txt", true))) {
                        writer.write(name + "," + username + "," + email + "," + password);
                        writer.newLine();
                        JOptionPane.showMessageDialog(null, "Account created successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                        new LoginFrame();

                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Error writing to file!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the window
                new LoginFrame();
            }
        });

        // Add a custom close operation
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                new LoginFrame();
            }
        });

        // Make the frame visible
        setVisible(true);
    }
    public static void main(String[] args) {
        new CreateAccountFrame();
    }
}
