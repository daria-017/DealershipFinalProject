package proiectjava.dealershipfinalproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * @author Dragos :>
 */
public class CreateAccountFrame extends javax.swing.JFrame {

    private JPanel jPanel1;
    private JPanel Left, Right;
    private JLabel copyright, logoLabel;
    private JLabel titlu, nameLabel, emailLabel, passwordLabel, confirmPasswordLabel, usernameLabel, loginLabel;
    private JTextField nameField, emailField, usernameField;
    private JPasswordField passwordField, confirmPasswordField;
    private JButton createAccountButton, loginButton;
    private ImageIcon logoIcon;
    private JCheckBox showPasswordCheckBox, agreeCheckBox;

    private boolean agree = false;

    public CreateAccountFrame() {
        setTitle("Create Account");
        setPreferredSize(new Dimension(800, 710));
        setResizable(false);

        initComponents();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComponents() {
        jPanel1 = new JPanel();
        jPanel1.setLayout(null);
        jPanel1.setPreferredSize(new Dimension(800, 710));

        Left = new JPanel();
        Left.setBackground(new Color(0, 102, 102));
        Left.setBounds(0, 0, 400, 710);
        Left.setLayout(null);

        logoLabel = new JLabel();
        logoIcon = new ImageIcon("Dealership_logo_200px.png");
        logoLabel.setIcon(logoIcon);
        logoLabel.setBounds(100, 235, 200, 200);

        copyright = new JLabel("© Dealership. All rights reserved.");
        copyright.setForeground(new Color(216, 214, 196));
        copyright.setBounds(100, 610, 200, 20);

        Left.add(logoLabel);
        Left.add(copyright);

        Right = new JPanel();
        Right.setLayout(null);
        Right.setBackground(new Color(216, 214, 196));
        Right.setBounds(400, 0, 400, 710);

        titlu = new JLabel("SIGN UP");
        titlu.setFont(new Font("Segoe UI", Font.BOLD, 36));
        titlu.setForeground(new Color(0, 102, 102));
        titlu.setBounds(120, 35, 200, 50);

        nameLabel = new JLabel("Name");
        nameLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        nameLabel.setForeground(new Color(0, 102, 102));
        nameLabel.setBounds(30, 100, 100, 30);
        nameField = new JTextField();
        nameField.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        nameField.setBackground(new Color(216, 214, 196));
        nameField.setBounds(30, 130, 325, 40);

        usernameLabel = new JLabel("Username");
        usernameLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        usernameLabel.setForeground(new Color(0, 102, 102));
        usernameLabel.setBounds(30, 170, 100, 30);
        usernameField = new JTextField();
        usernameField.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        usernameField.setBackground(new Color(216, 214, 196));
        usernameField.setBounds(30, 200, 325, 40);

        emailLabel = new JLabel("Email");
        emailLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        emailLabel.setForeground(new Color(0, 102, 102));
        emailLabel.setBounds(30, 240, 100, 30);
        emailField = new JTextField();
        emailField.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        emailField.setBackground(new Color(216, 214, 196));
        emailField.setBounds(30, 270, 325, 40);

        passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        passwordLabel.setForeground(new Color(0, 102, 102));
        passwordLabel.setBounds(30, 310, 100, 30);
        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        passwordField.setBackground(new Color(216, 214, 196));
        passwordField.setBounds(30, 340, 325, 40);

        confirmPasswordLabel = new JLabel("Confirm Password");
        confirmPasswordLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        confirmPasswordLabel.setForeground(new Color(0, 102, 102));
        confirmPasswordLabel.setBounds(30, 380, 150, 30);
        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        confirmPasswordField.setBackground(new Color(216, 214, 196));
        confirmPasswordField.setBounds(30, 410, 325, 40);

        showPasswordCheckBox = new JCheckBox("Show Password");
        showPasswordCheckBox.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        showPasswordCheckBox.setForeground(new Color(0, 102, 102));
        showPasswordCheckBox.setBounds(30, 460, 150, 30);
        showPasswordCheckBox.setBackground(new Color(216, 214, 196));

        agreeCheckBox = new JCheckBox("Agree to our Terms and Conditions");
        agreeCheckBox.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        agreeCheckBox.setForeground(new Color(0, 102, 102));
        agreeCheckBox.setBounds(30, 485, 300, 30);
        agreeCheckBox.setBackground(new Color(216, 214, 196));

        createAccountButton = new JButton("Sign Up");
        createAccountButton.setBackground(new Color(0, 102, 102));
        createAccountButton.setForeground(new Color(216, 214, 196));
        createAccountButton.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        createAccountButton.setBounds(150, 530, 100, 50);

        loginLabel = new JLabel("Already have an account?");
        loginLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        loginLabel.setForeground(new Color(0, 102, 102));
        loginLabel.setBounds(40, 605, 200, 30);

        loginButton = new JButton("Login");
        loginButton.setBackground(new Color(216, 214, 196));
        loginButton.setForeground(new Color(0, 102, 102));
        loginButton.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        loginButton.setBounds(255, 600, 80, 40);

        createAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleCreateAccount(agree);
            }
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Login().setVisible(true);
            }
        });

        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                new Login().setVisible(true);
            }
        });

        agreeCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    agree = true;
                } else {
                    agree = false;
                }
            }
        });

        showPasswordCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    passwordField.setEchoChar((char) 0); // Show password
                    confirmPasswordField.setEchoChar((char) 0);
                } else {
                    passwordField.setEchoChar('•'); // Mask password
                    confirmPasswordField.setEchoChar('•');
                }
            }
        });

        KeyListener enterKeyListener = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // No action needed for keyTyped
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    handleCreateAccount(agree);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // No action needed for keyReleased
            }
        };

        nameField.addKeyListener(enterKeyListener);
        usernameField.addKeyListener(enterKeyListener);
        emailField.addKeyListener(enterKeyListener);
        passwordField.addKeyListener(enterKeyListener);
        confirmPasswordField.addKeyListener(enterKeyListener);

        Right.add(titlu);
        Right.add(nameLabel);
        Right.add(nameField);
        Right.add(usernameLabel);
        Right.add(usernameField);
        Right.add(emailLabel);
        Right.add(emailField);
        Right.add(passwordLabel);
        Right.add(passwordField);
        Right.add(confirmPasswordLabel);
        Right.add(confirmPasswordField);
        Right.add(showPasswordCheckBox);
        Right.add(agreeCheckBox);
        Right.add(createAccountButton);
        Right.add(loginLabel);
        Right.add(loginButton);

        jPanel1.add(Left);
        jPanel1.add(Right);
        add(jPanel1);
    }

    private void handleCreateAccount(boolean agree) {
        String name = nameField.getText().trim();
        String username = usernameField.getText().trim();
        String email = emailField.getText().trim();
        String password = new String(passwordField.getPassword());
        String confirmPassword = new String(confirmPasswordField.getPassword());
        int id = countAccounts();

        String usernameRegex = "^[a-zA-Z0-9._-]+$";
        String emailRegex = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\\.[a-zA-Z]{2,}$";

        if (name.isEmpty() || username.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields must be filled out!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!email.matches(emailRegex)) {
            JOptionPane.showMessageDialog(this, "Invalid email!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!username.matches(usernameRegex)) {
            JOptionPane.showMessageDialog(this, "Invalid username!\nContains illegal characters!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (username.length() <= 3) {
            JOptionPane.showMessageDialog(this, "Username too short!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        short passwordStrength = isPasswordStrong(password);
        if (passwordStrength != 0) {
            String passMessage = changePassMess(passwordStrength);
            int choice = JOptionPane.showConfirmDialog(
                    this,
                    passMessage,
                    "Weak Password",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE
            );

            if (choice == JOptionPane.NO_OPTION || choice == JOptionPane.CLOSED_OPTION) {
                return;
            }
        }
        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean dataExists = false;
        try (BufferedReader reader = new BufferedReader(new FileReader("accounts.txt"))) {
            if (checkForExistingData(reader, username, email)) {
                dataExists = true;
                return;
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error reading from file!", "Error", JOptionPane.ERROR_MESSAGE);
        }

        if (!agree) {
            JOptionPane.showMessageDialog(this, "You did not agree to our Terms and Conditions!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!dataExists) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("accounts.txt", true))) {
                writer.write(name + "," + username + "," + email + "," + password + "," + id);
                writer.newLine();
                JOptionPane.showMessageDialog(this, "Account created successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                new Login().setVisible(true);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error writing to file!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private short isPasswordStrong(String password) {
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        int n = password.length();

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }

        if ((hasUpper && hasLower && hasDigit && hasSpecialChar) && n >= 8) {
            return 0;
        }
        if (n >= 6) {
            return 1;
        }
        return 2;
    }

    private String changePassMess(short passwordStrength) {
        String passMessage = "An error has occurred!";
        switch (passwordStrength) {
            case 1:
                return "Moderate password!\nDo you wish to continue?";

            case 2:
                return "Weak password! Use at least 8 characters with letters, numbers, and special symbols!\nDo you wish to continue?";

            default:
                return "An error has occurred!";
        }
    }

    private boolean checkForExistingData(BufferedReader reader, String username, String email) throws IOException {
        String line;
        while ((line = reader.readLine()) != null) {
            if (isValidData(line, username, email)) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidData(String line, String username, String email) {
        String[] userData = line.split(",");
        if (userData.length < 5) {
            return false;
        }

        String existingUsername = userData[1].trim();
        String existingEmail = userData[2].trim();

        if (email.equalsIgnoreCase(existingEmail)) {
            JOptionPane.showMessageDialog(this, "Email already in use!", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }

        if (username.equalsIgnoreCase(existingUsername)) {
            JOptionPane.showMessageDialog(this, "Username already exists!", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }

        return false;
    }

    private int countAccounts() {
        int accountCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("accounts.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userData = line.split(",");
                if (userData.length >= 5) {
                    accountCount++;
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error reading from file!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return accountCount;
    }
    
    public static void main(String[] args)
    {
        new CreateAccountFrame();
    }
}
