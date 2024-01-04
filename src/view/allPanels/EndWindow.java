package view.allPanels;

import model.model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class EndWindow extends JPanel {
    JButton restart, leaderboard;
    JLabel score, thanks;
    model m;
    public EndWindow(model m){
        this.m = m;
        JLabel name = new JLabel("GAME OVER");
        name.setFont(new Font("Serif", Font.BOLD, 60));
        name.setForeground(Color.decode("#800080"));

        thanks = new JLabel("thank you for playing (◍•ᴗ•◍)❤");
        thanks.setFont(new Font("Serif", Font.BOLD, 50));
        thanks.setForeground(Color.decode("#800080"));

        score = new JLabel(m.getUsername()+" your score is: "+ m.getScore());
        score.setFont(new Font("Serif", Font.BOLD, 50));
        score.setForeground(Color.decode("#800080"));



        buttonGeneral b = new buttonGeneral();
        restart = b.createButton("PLAY AGAIN", "play");
        leaderboard = b.createButton("LEADERBOARD", "LEADERBOARD");


        this.setBackground(Color.decode("#D9D9D9"));





        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        name.setAlignmentX(Component.CENTER_ALIGNMENT);
        restart.setAlignmentX(Component.CENTER_ALIGNMENT);
        leaderboard.setAlignmentX(Component.CENTER_ALIGNMENT);
        score.setAlignmentX(Component.CENTER_ALIGNMENT);
        thanks.setAlignmentX(Component.CENTER_ALIGNMENT);




        add(Box.createRigidArea(new Dimension(0, 50)));
        add(name);
        add(Box.createRigidArea(new Dimension(0, 50)));
        add(thanks);
        add(score);
        add(Box.createRigidArea(new Dimension(0, 100)));
        add(restart);
        add(Box.createRigidArea(new Dimension(0, 50)));
        add(leaderboard);


        this.setBackground(Color.decode("#D9D9D9"));
    }
    public void setActionListener(ActionListener listener){
        leaderboard.addActionListener(listener);
        restart.addActionListener(listener);
    }

    public void updateScore() {
        score.setText(m.getUsername()+" your score is: "+ m.getScore());
        score.revalidate();
        score.repaint();
    }





}
