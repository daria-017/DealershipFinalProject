package proiectjava.dealershipfinalproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginClass{

    // Elemente GUI
    private JFrame frame;
    private JPanel leftPanel, rightPanel;
    private JLabel logoLabel, emailLabel, passwordLabel, copyrightLabel, titleLabel;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginClass() {
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
        logoLabel.setIcon(new ImageIcon("C:\\Users\\Daria\\Desktop\\An2-Sem1\\Java\\Dealership_logo_200px.png")); // Schimbă calea dacă este necesar
        logoLabel.setBounds(100, 130, 200, 200);
        rightPanel.add(logoLabel);

        // Copyright
        copyrightLabel = new JLabel("copyright © Dealership. All rights reserved.");
        copyrightLabel.setForeground(new Color(216, 214, 196));
        copyrightLabel.setBounds(10, 460, 380, 20);
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
        emailLabel.setBounds(40, 100, 100, 30);
        leftPanel.add(emailLabel);

        emailField = new JTextField();
        emailField.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        emailField.setBounds(40, 130, 325, 40);
        leftPanel.add(emailField);

        // Password label și password field
        passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        passwordLabel.setBounds(40, 200, 100, 30);
        leftPanel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        passwordField.setBounds(40, 230, 325, 40);
        leftPanel.add(passwordField);

        // Login button
        loginButton = new JButton("Login");
        loginButton.setBackground(new Color(0, 102, 102));
        loginButton.setForeground(new Color(216, 214, 196));
        loginButton.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        loginButton.setBounds(155, 310, 90, 40);
        leftPanel.add(loginButton);

        // Eveniment pentru login
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());

                // Simulare autentificare simplă
                if (email.equals("admin") && password.equals("admin")) {
                    JOptionPane.showMessageDialog(frame, "Login successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid email or password!", "Error", JOptionPane.ERROR_MESSAGE);
                }
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
        new LoginClass();
    }
}
