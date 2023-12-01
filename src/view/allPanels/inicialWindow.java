package view.allPanels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class inicialWindow extends JPanel {
    JButton play, credits, leaderboard;

    public inicialWindow() {
        JLabel name = new JLabel("SLAPPY FRUITS");
        name.setFont(new Font("Serif", Font.BOLD, 80));
        name.setForeground(Color.decode("#800080"));
        buttonGeneral b= new buttonGeneral();
        play = b.createButton("PLAY", "play");
        credits =  b.createButton("CREDITS", "credits");
        leaderboard =  b.createButton("LEADERBOARD", "LEADERBOARD");

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(Color.decode("#D9D9D9"));

        name.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createRigidArea(new Dimension(0, 50)));
        add(name);
        add(Box.createRigidArea(new Dimension(0, 100)));
        add(play);
        add(Box.createRigidArea(new Dimension(0, 50)));
        add(credits);
        add(Box.createRigidArea(new Dimension(0, 50)));
        add(leaderboard);
        this.setBackground(Color.decode("#D9D9D9"));

    }



    public void setActionListener(ActionListener listener) {
        play.addActionListener(listener);
        credits.addActionListener(listener);
        leaderboard.addActionListener(listener);
    }


}
