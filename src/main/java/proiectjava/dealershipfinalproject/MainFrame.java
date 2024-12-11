package proiectjava.dealershipfinalproject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import java.awt.Font;
import javax.swing.ImageIcon;

public class MainFrame extends JFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Frame");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        final int MIN_WIDTH = 150;
        final int MIN_HEIGHT = 50;
        final int MAX_WIDTH = 150;
        final int MAX_HEIGHT = 50;

        class HoverButton extends JButton {

            private boolean isPressed = false;
            private boolean isHovered = false;
            private Color baseColor = new Color(0, 102, 102);
            private Color hoverColor = baseColor.darker();

            public HoverButton(String text) {
                super(text);
                addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        isHovered = true;
                        repaint();
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        isHovered = false;
                        repaint();
                    }
                });

                setContentAreaFilled(false);
                setForeground(Color.WHITE);
            }

            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                Color shadowColor = new Color(0, 0, 0, 70);

                if (getModel().isPressed()) {
                    isPressed = true;
                } else {
                    isPressed = false;
                }

                int shrinkOffset = isPressed ? 2 : 0;

                if (isPressed) {
                    g2.setColor(shadowColor);
                    g2.fillRoundRect(shrinkOffset + 2, shrinkOffset + 2, getWidth() - shrinkOffset * 2, getHeight() - shrinkOffset, 36, 35); // Bottom shadow
                }

                Color buttonColor = isHovered ? hoverColor : baseColor;

                g2.setColor(buttonColor);
                g2.fillRoundRect(shrinkOffset, shrinkOffset, getWidth() - shrinkOffset * 2, getHeight() - shrinkOffset * 2, 30, 30); // Rounded edges

                g2.setColor(getForeground());
                g2.setFont(getFont());
                int textX = shrinkOffset + (getWidth() - shrinkOffset * 2 - g.getFontMetrics().stringWidth(getText())) / 2;
                int textY = shrinkOffset + (getHeight() - shrinkOffset * 0 + g.getFontMetrics().getAscent()) / 2 - 2;
                g2.drawString(getText(), textX, textY);
            }

            @Override
            protected void paintBorder(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                int shrinkOffset = isPressed ? 2 : 0;

                g2.setColor(Color.DARK_GRAY);
                g2.drawRoundRect(shrinkOffset, shrinkOffset, getWidth() - shrinkOffset * 2 - 1, getHeight() - shrinkOffset * 2 - 1, 30, 30);
            }
        }

        JLabel headerLabel = new JLabel("SELECT AN OPTION", JLabel.CENTER);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 30));
        headerLabel.setForeground(new java.awt.Color(0, 102, 102));

        HoverButton accountDetailsButton = new HoverButton("Account Details");
        HoverButton buyVehicleButton = new HoverButton("Buy A Vehicle");

        
        accountDetailsButton.addActionListener(e -> {
            //AccountDetails vechi
//            AccountDetailsFrame accountDetailsFrame = new AccountDetailsFrame();
//            accountDetailsFrame.setVisible(true);
   //AccountDetails redesign
    AccountDetails accountDetails = new AccountDetails();
    accountDetails.setVisible(true);
        });

        buyVehicleButton.addActionListener(e -> {
            
//BuyVehicleFrame vechi
//            BuyVehicleFrame buyVehicleFrame = new BuyVehicleFrame();
//            buyVehicleFrame.setVisible(true);

//BuyVehicleFrame redesign
            BuyVehicleDesignNou buyVehicleFrame = new BuyVehicleDesignNou();
        
        });

        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(null);
        headerLabel.setBounds(0, 50, 400, 40);
        rightPanel.setBackground(new Color(216, 214, 196));
        rightPanel.add(headerLabel);

        rightPanel.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                int panelWidth = rightPanel.getWidth();
                int panelHeight = rightPanel.getHeight();

                int buttonWidth = Math.min(Math.max((int) (panelWidth * 0.5), MIN_WIDTH), MAX_WIDTH);
                int buttonHeight = Math.min(Math.max((int) (panelHeight * 0.2), MIN_HEIGHT), MAX_HEIGHT);
                int buttonX = (panelWidth - buttonWidth) / 2;
                int buttonY = (panelHeight - buttonHeight) / 2 - 40; // Below header

                accountDetailsButton.setBounds(buttonX, buttonY + 65, buttonWidth, buttonHeight);
                buyVehicleButton.setBounds(buttonX, buttonY, buttonWidth, buttonHeight);
            }
        });

        rightPanel.add(accountDetailsButton);
        rightPanel.add(buyVehicleButton);

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(new Color(0, 102, 102));
//
        ImageIcon imageIcon = new ImageIcon("Dealership_logo_200px.png");
        JLabel imageLabel = new JLabel(imageIcon);

        imageLabel.setBounds(100, 125, 200, 200);
        frame.add(imageLabel);
//
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel);

        splitPane.setDividerLocation(400);
        splitPane.setDividerSize(0);

        frame.setLayout(null);
        frame.add(splitPane);
        splitPane.setBounds(0, 0, frame.getWidth(), frame.getHeight());

        frame.setVisible(true);

    }
}
