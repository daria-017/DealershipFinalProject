/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiectjava.dealershipfinalproject;

import javax.swing.JOptionPane;
import javax.swing.*;


public class MainFrame extends javax.swing.JFrame {

    /**
     * Constructor pentru a inițializa componentele.
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * Codul generat automat pentru inițializarea componentelor GUI.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        btnBuyVehicle = new javax.swing.JButton();
        btnSeeAccountDetails = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dealership");

        btnBuyVehicle.setText("Buy Vehicle");
        btnBuyVehicle.addActionListener(new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
              btnBuyVehicleActionPerformed(evt);
            }
        });
        //gyguyguygyu
        btnSeeAccountDetails.setText("See Account Details");
        btnSeeAccountDetails.addActionListener(new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
           btnSeeAccountDetailsActionPerformed(evt);
            }
        });
        JButton accountDetailsButton = new JButton("Account Details");
            accountDetailsButton.addActionListener(e -> {
                  AccountDetailsFrame accountDetailsFrame = new AccountDetailsFrame(loggedInCustomer);
            });
        add(accountDetailsButton);




        // Layout simplu pentru poziționarea butoanelor.
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuyVehicle, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(btnSeeAccountDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnBuyVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSeeAccountDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null); // Centrează fereastra pe ecran.
    }

    /**
     * Acțiune pentru butonul Buy Vehicle.
     */
    private void btnBuyVehicleActionPerformed(java.awt.event.ActionEvent evt) {
    System.out.println("Event source: " + evt.getSource());
    JOptionPane.showMessageDialog(this, "Buy Vehicle button clicked!");
}

private void btnSeeAccountDetailsActionPerformed(java.awt.event.ActionEvent evt) {
    System.out.println("Event source: " + evt.getSource());
    JOptionPane.showMessageDialog(this, "See Account Details button clicked!");
}

   /**
 * The main method to launch the application.
 *
 * @param args the command-line arguments (not used in this application)
 */
public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(() -> {
        new MainFrame().setVisible(true);
    });
}

    // Declarația variabilelor GUI.
    private javax.swing.JButton btnBuyVehicle;
    private javax.swing.JButton btnSeeAccountDetails;
}

