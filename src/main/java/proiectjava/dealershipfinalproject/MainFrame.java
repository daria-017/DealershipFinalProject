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

public class MainFrame extends JFrame {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Main Frame");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final int MIN_WIDTH = 150;
        final int MIN_HEIGHT = 50;
        final int MAX_WIDTH = 150;
        final int MAX_HEIGHT = 50;

        // HoverButton class
        class HoverButton extends JButton {
            private boolean isPressed = false;
            private boolean isHovered = false; // Hover state
            private Color baseColor = new Color(0, 102, 102); // Default teal color
            private Color hoverColor = baseColor.darker(); // Darker teal for hover

            public HoverButton(String text) {
                super(text);

                // Add mouse listeners for hover effect
                addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        isHovered = true;
                        repaint(); // Trigger repaint on hover
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        isHovered = false;
                        repaint(); // Trigger repaint on hover exit
                    }
                });

                // Set up visual properties
                setContentAreaFilled(false);
                setFocusPainted(false);
                setOpaque(false);
                setForeground(Color.WHITE);
            }

            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Shadow color
                Color shadowColor = new Color(0, 0, 0, 70);

                if (getModel().isPressed()) {
                    isPressed = true;
                } else {
                    isPressed = false;
                }

                // Adjust size when pressed
                int shrinkOffset = isPressed ? 2 : 0;

                // Draw shadow (if pressed)
                if (isPressed) {
                    g2.setColor(shadowColor);
                    g2.fillRoundRect(shrinkOffset + 2, shrinkOffset + 2, getWidth() - shrinkOffset * 2, getHeight() - shrinkOffset, 36, 35); // Bottom shadow
                }

                // Determine the button's background color
                Color buttonColor = isHovered ? hoverColor : baseColor;

                // Draw rounded background
                g2.setColor(buttonColor);
                g2.fillRoundRect(shrinkOffset, shrinkOffset, getWidth() - shrinkOffset * 2, getHeight() - shrinkOffset * 2, 30, 30); // Rounded edges

                // Draw text
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

                // Adjust size when pressed
                int shrinkOffset = isPressed ? 2 : 0;

                // Draw rounded border
                g2.setColor(Color.DARK_GRAY);
                g2.drawRoundRect(shrinkOffset, shrinkOffset, getWidth() - shrinkOffset * 2 - 1, getHeight() - shrinkOffset * 2 - 1, 30, 30);
            }
        }

        // Create the header label with "SELECT AN OPTION"
        JLabel headerLabel = new JLabel("SELECT AN OPTION", JLabel.CENTER);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 30));  // Set large, bold font
        headerLabel.setForeground(new java.awt.Color(0, 102, 102));  // Optional: set text color

        // Create buttons
        HoverButton accountDetailsButton = new HoverButton("Account Details");
        HoverButton buyVehicleButton = new HoverButton("Buy A Vehicle");

        accountDetailsButton.addActionListener(e -> {
             AccountDetailsFrame accountDetailsFrame = new AccountDetailsFrame();
             accountDetailsFrame.setVisible(true);
        });
        buyVehicleButton.addActionListener(e -> {
             BuyVehicleFrame buyVehicleFrame = new BuyVehicleFrame();
             buyVehicleFrame.setVisible(true);
        });

        // Create the panel for the right side (buttons and header)
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(null);  // Absolute positioning for custom layout
        headerLabel.setBounds(0, 50, 400, 40); // Place header at the top of the right panel
        rightPanel.setBackground(new Color(216, 214, 196));
        rightPanel.add(headerLabel);

        // Adjust button sizes dynamically and position header
        rightPanel.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                int panelWidth = rightPanel.getWidth();
                int panelHeight = rightPanel.getHeight();

                // Set button size and position
                int buttonWidth = Math.min(Math.max((int) (panelWidth * 0.5), MIN_WIDTH), MAX_WIDTH); 
                int buttonHeight = Math.min(Math.max((int) (panelHeight * 0.2), MIN_HEIGHT), MAX_HEIGHT); 
                int buttonX = (panelWidth - buttonWidth) / 2; 
                int buttonY = (panelHeight - buttonHeight) / 2 -40; // Below header

                accountDetailsButton.setBounds(buttonX, buttonY + 65, buttonWidth, buttonHeight);
                buyVehicleButton.setBounds(buttonX, buttonY, buttonWidth, buttonHeight);
            }
        });

        // Add buttons to the right panel
        rightPanel.add(accountDetailsButton);
        rightPanel.add(buyVehicleButton);

        // Create the left panel (image side)
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(new Color(0, 128, 128)); // Same teal as buttons

        // Create split pane
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel);
        splitPane.setDividerLocation(400); // Split the frame 50/50 by default
        splitPane.setDividerSize(0); // Remove the divider

        // Add split pane to the frame
        frame.setLayout(null);
        frame.add(splitPane);
        splitPane.setBounds(0, 0, frame.getWidth(), frame.getHeight());

        // Make the frame visible
        frame.setVisible(true);
    }
}
