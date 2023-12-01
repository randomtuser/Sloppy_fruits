package view.allPanels;

import javax.swing.*;
import java.awt.*;

public class buttonGeneral {
    public  buttonGeneral(){

    }
    JButton createButton(String text, String actionCommand) {
        JButton button = new JButton(text);
        button.setFont(new Font("Serif", Font.BOLD, 40));
        button.setBackground(Color.decode("#87CEEB"));
        button.setActionCommand(actionCommand);
        button.setPreferredSize(new Dimension(500, 100)); // Adjusted to a more reasonable size
        button.setMaximumSize(new Dimension(500, 100)); // Ensure maximum size is respected
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        return button;
    }
}
