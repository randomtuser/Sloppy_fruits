package view;

import model.model;
import view.allPanels.*;
import view.tab.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Leaderboard extends JFrame {
    tabv3 bar;
    leaderboardWindow leaderboardWindow;
    model m;
    public Leaderboard(model m){
        this.m = m;
        leaderboardWindow = new leaderboardWindow(m);

        bar = new tabv3();
        this.setJMenuBar(bar);
        this.add(leaderboardWindow);



        Dimension resolution = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) resolution.getWidth();  // Casting double to int
        int height = (int) resolution.getHeight();  // Casting double to int


        this.setSize(width, height);


    }
    public void setActionListener(ActionListener listener){
        bar.setActionListener(listener);
    }


    public void display(){
        leaderboardWindow.display();
    }
    public void clearPlayers(){
        leaderboardWindow.clearPlayers();
    }
}
