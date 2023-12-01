package view.allPanels;

import javax.swing.*;
import java.awt.*;

public class leaderboardWindow extends JPanel {
    JLabel players;
    public leaderboardWindow(){
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel title = new JLabel("LEADERBOARD");
        title.setFont(new Font("Serif", Font.BOLD, 80));
        title.setForeground(Color.decode("#800080"));

        JLabel j1 = new JLabel("TOP 10 PLAYERS");
        j1.setFont(new Font("Serif", Font.PLAIN, 40));
        j1.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));

        players = new JLabel("play a game to show players", SwingConstants.CENTER);
        players.setFont(new Font("Serif", Font.PLAIN, 20));


        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        j1.setAlignmentX(Component.CENTER_ALIGNMENT);
        players.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(Box.createRigidArea(new Dimension(0, 50)));
        add(title);
        add(Box.createRigidArea(new Dimension(0, 100)));
        add(j1);
        add(Box.createRigidArea(new Dimension(0, 50)));
        add(players);

    }


    //to change players
    public void displayPlayers(String text){
        players.setText(text);
    }
}
