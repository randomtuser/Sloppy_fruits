package view.allPanels;

import javax.swing.*;
import java.awt.*;

public class NorthPanelGame extends JPanel {
    public NorthPanelGame() {
        JLabel leverName = new JLabel("PULL THE LEVEL");
        leverName.setFont(new Font("Serif", Font.BOLD, 80));
        leverName.setForeground(Color.decode("#800080"));
        this.add(leverName);
    }
}
