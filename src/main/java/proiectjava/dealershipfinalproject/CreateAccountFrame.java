package proiectjava.dealershipfinalproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Dragos :>
 */
public class CreateAccountFrame extends javax.swing.JFrame {

    private JPanel jPanel1;
    private JPanel Right, Left;
    private JLabel copyright, logoLabel;
    private JLabel titlu, nameLabel, emailLabel, passwordLabel, confirmPasswordLabel, usernameLabel;
    private JTextField nameField, emailField, usernameField;
    private JPasswordField passwordField, confirmPasswordField;
    private JButton createAccountButton, cancelButton;
    private ImageIcon logoIcon;

    public CreateAccountFrame() {
        setTitle("Create Account");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setPreferredSize(new Dimension(800, 500));

        initComponents();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComponents() {
        jPanel1 = new JPanel();
        jPanel1.setLayout(null);
        jPanel1.setPreferredSize(new Dimension(800, 500));

        // Right panel
        Right = new JPanel();
        Right.setBackground(new Color(0, 102, 102));
        Right.setBounds(0, 0, 400, 500);
        Right.setLayout(null);

        logoIcon = new ImageIcon("logo200x.png"); // Logo placeholder
        logoLabel = new JLabel(logoIcon);
        logoLabel.setBounds(100, 100, 200, 200);

        copyright = new JLabel("© Dealership. All rights reserved.");
        copyright.setForeground(new Color(216, 214, 196));
        copyright.setBounds(100, 450, 200, 20);

        Right.add(logoLabel);
        Right.add(copyright);

        // Left panel
        Left = new JPanel();
        Left.setLayout(null);
        Left.setBackground(new Color(216, 214, 196));
        Left.setBounds(400, 0, 400, 500);

        titlu = new JLabel("SIGN UP");
        titlu.setFont(new Font("Segoe UI", Font.BOLD, 36));
        titlu.setForeground(new Color(0, 102, 102));
        titlu.setBounds(120, 20, 200, 50);

        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(30, 100, 100, 25);
        nameField = new JTextField();
        nameField.setBounds(30, 130, 340, 30);

        usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(30, 170, 100, 25);
        usernameField = new JTextField();
        usernameField.setBounds(30, 200, 340, 30);

        emailLabel = new JLabel("Email:");
        emailLabel.setBounds(30, 240, 100, 25);
        emailField = new JTextField();
        emailField.setBounds(30, 270, 340, 30);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(30, 310, 100, 25);
        passwordField = new JPasswordField();
        passwordField.setBounds(30, 340, 340, 30);

        confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordLabel.setBounds(30, 380, 150, 25);
        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBounds(30, 410, 340, 30);

        createAccountButton = new JButton("Create Account");
        createAccountButton.setBounds(60, 460, 120, 30);
        createAccountButton.setBackground(new Color(0, 102, 102));
        createAccountButton.setForeground(new Color(216, 214, 196));
        createAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleCreateAccount();
            }
        });

        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(220, 460, 120, 30);
        cancelButton.setBackground(new Color(216, 214, 196));
        cancelButton.setForeground(new Color(0, 102, 102));
        cancelButton.addActionListener(e -> dispose());

        Left.add(titlu);
        Left.add(nameLabel);
        Left.add(nameField);
        Left.add(usernameLabel);
        Left.add(usernameField);
        Left.add(emailLabel);
        Left.add(emailField);
        Left.add(passwordLabel);
        Left.add(passwordField);
        Left.add(confirmPasswordLabel);
        Left.add(confirmPasswordField);
        Left.add(createAccountButton);
        Left.add(cancelButton);

        jPanel1.add(Right);
        jPanel1.add(Left);
        add(jPanel1);
    }

    private void handleCreateAccount() {
        String name = nameField.getText().trim();
        String username = usernameField.getText().trim();
        String email = emailField.getText().trim();
        String password = new String(passwordField.getPassword());
        String confirmPassword = new String(confirmPasswordField.getPassword());

        if (name.isEmpty() || username.isEmpty() || email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields must be filled out!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("accounts.txt", true))) {
                writer.write(name + "," + username + "," + email + "," + password);
                writer.newLine();
                JOptionPane.showMessageDialog(this, "Account created successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error writing to file!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new CreateAccountFrame();
    }
}
