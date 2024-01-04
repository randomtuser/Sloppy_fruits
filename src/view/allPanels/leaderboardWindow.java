package view.allPanels;

import model.model;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class leaderboardWindow extends JPanel {
    JLabel players;
    model m;
    public leaderboardWindow(model m){
        this.m = m;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel title = new JLabel("LEADERBOARD");
        title.setFont(new Font("Serif", Font.BOLD, 80));
        title.setForeground(Color.decode("#800080"));

        JLabel j1 = new JLabel("TOP 10 PLAYERS");
        j1.setFont(new Font("Serif", Font.PLAIN, 40));
        j1.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));


        if(m.getUsers().isEmpty()){
            players = new JLabel("play a game to show players", SwingConstants.CENTER);
        }
        else
            players = new JLabel(displayPlayers(), SwingConstants.CENTER);
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


    public String displayPlayers() {
        StringBuilder all = new StringBuilder("<html>");
        for (Map.Entry<String, Integer> entry : m.getUsers().entrySet()) {
            all.append(entry.getKey()).append(": ").append(entry.getValue()).append("<br>");
        }
        all.append("</html>");
        return String.valueOf(all);
    }


    public void display() {
        System.out.println(displayPlayers());
        if(m.getUsers().isEmpty()){
            players.setText("play a game to show players");
        }
        else
            players.setText(displayPlayers());
        players.revalidate();
        players.repaint();
    }

    public void clearPlayers(){
        players.setText("");
    }


}
