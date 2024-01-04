package view.allPanels;

import javax.swing.*;
import java.awt.*;

public class creditsWindow  extends JPanel {
    public creditsWindow(){
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel title = new JLabel("CREDITS");
        title.setFont(new Font("Serif", Font.BOLD, 80));
        title.setForeground(Color.decode("#800080"));

        JLabel j1 = new JLabel("<html>App designed as a project at University of Valencia, during the subject User interfaces. School year 2023/2024</html>");        j1.setFont(new Font("Serif", Font.PLAIN, 40));
        j1.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));

        JLabel j = new JLabel("@Isabella & Tilen 2023", SwingConstants.CENTER);
        j.setFont(new Font("Serif", Font.PLAIN, 40));

        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        j1.setAlignmentX(Component.CENTER_ALIGNMENT);
        j.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(Box.createRigidArea(new Dimension(0, 50)));
        add(title);
        add(Box.createRigidArea(new Dimension(0, 100)));
        add(j1);
        add(Box.createRigidArea(new Dimension(0, 50)));
        add(j);


        this.setBackground(Color.decode("#D9D9D9"));


    }

}
