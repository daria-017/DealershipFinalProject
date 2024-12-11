package proiectjava.dealershipfinalproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LoginFrame {

    // Elemente GUI
    private JFrame frame;
    private JPanel leftPanel, rightPanel;
    private JLabel logoLabel, emailLabel, passwordLabel, copyrightLabel, titleLabel, signupLabel;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton loginButton, signUpButton;

    public LoginFrame() {
        // Inițializare fereastră principală
        frame = new JFrame("LOGIN");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLayout(null);
        frame.setResizable(false);

        // Panou dreapta (logo și copyright)
        rightPanel = new JPanel();
        rightPanel.setBackground(new Color(0, 102, 102));
        rightPanel.setBounds(0, 0, 400, 500);
        rightPanel.setLayout(null);

        // Logo
        logoLabel = new JLabel();
        ImageIcon logo = new ImageIcon("Dealership_logo_200px.png");
        logoLabel.setIcon(logo); // Schimbă calea dacă este necesar
        logoLabel.setBounds(100, 130, 200, 200); // Centrat pe panoul drept
        rightPanel.add(logoLabel);

        // Copyright
        copyrightLabel = new JLabel("copyright © Dealership. All rights reserved.", JLabel.CENTER);
        copyrightLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        copyrightLabel.setBackground(new Color(216, 214, 196)); // Culoare deschisă
        copyrightLabel.setForeground(new Color(0, 102, 102)); // Culoare deschisă 
        copyrightLabel.setBounds(0, 460, 400, 20); // Poziționat sub logo, centrat pe panoul drept
        rightPanel.add(copyrightLabel);

        // Panou stânga (formular login)
        leftPanel = new JPanel();
        leftPanel.setBackground(new Color(216, 214, 196));
        leftPanel.setBounds(400, 0, 400, 500);
        leftPanel.setLayout(null);

        // Titlu
        titleLabel = new JLabel("LOGIN");
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 36));
        titleLabel.setForeground(new Color(0, 102, 102));
        titleLabel.setBounds(140, 30, 200, 50);
        leftPanel.add(titleLabel);

        // Email label și text field
        emailLabel = new JLabel("Email");
        emailLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        emailLabel.setForeground(new Color(0, 102, 102)); // Se potrivește cu fundalul
        emailLabel.setBounds(40, 100, 100, 30);
        leftPanel.add(emailLabel);

        emailField = new JTextField();
        emailField.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        emailField.setBackground(new Color(216, 214, 196)); // Fundalul modificat
        emailField.setBounds(40, 130, 325, 40);
        leftPanel.add(emailField);

        // Password label și password field
        passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        passwordLabel.setForeground(new Color(0, 102, 102)); // Se potrivește cu fundalul
        passwordLabel.setBounds(40, 200, 100, 30);
        leftPanel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        passwordField.setBackground(new Color(216, 214, 196)); // Fundalul modificat
        passwordField.setBounds(40, 230, 325, 40);
        leftPanel.add(passwordField);

        // Login button
        loginButton = new JButton("Login");
        loginButton.setBackground(new Color(0, 102, 102));
        loginButton.setForeground(new Color(216, 214, 196));
        loginButton.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        loginButton.setBounds(155, 310, 90, 40);
        leftPanel.add(loginButton);

        // Label pentru Sign up
        signupLabel = new JLabel("I don't have an account.");
        signupLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        signupLabel.setForeground(new Color(0, 102, 102));
        signupLabel.setBounds(40, 360, 200, 30); // Poziționare sub butonul Login
        leftPanel.add(signupLabel);

        // Sign Up button
        signUpButton = new JButton("Sign up");
        signUpButton.setBackground(new Color(216, 214, 196));
        signUpButton.setForeground(new Color(0, 102, 102));
        signUpButton.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        signUpButton.setBounds(270, 360, 95, 40); // Poziționat lângă label
        leftPanel.add(signUpButton);

 loginButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());

        // Verificare autentificare pentru administrator
        if (email.equals("admin@dealership.company") && password.equals("AdminAccessOnly")) {
            JOptionPane.showMessageDialog(frame, "Admin login successful!");
            frame.dispose(); // Închide fereastra curentă
            new AdminAccessOnly(); // Deschide fereastra pentru administratori
           return;
        }

        // Verificare autentificare pentru utilizatorii obișnuiți
        boolean loginSuccess = false;
        try (BufferedReader reader = new BufferedReader(new FileReader("accounts.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userDetails = line.split(",");
                if (userDetails.length == 5 && userDetails[2].equals(email) && userDetails[3].equals(password)) {
                    loginSuccess = true;
                    break;
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(frame, "Error reading from file!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (loginSuccess) {
            JOptionPane.showMessageDialog(frame, "Login successful!");
            frame.dispose(); // Închide fereastra curentă
            MainFrame.main(null); // Deschide fereastra principală
        } else {
            JOptionPane.showMessageDialog(frame, "Invalid email or password!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
});


        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Închide fereastra curentă
                new CreateAccountFrame(); // Deschide fereastra de înregistrare
            }
        });

        // Adăugare panouri în fereastră
        frame.add(rightPanel);
        frame.add(leftPanel);

        // Afișare fereastră
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new LoginFrame();
    }
}
