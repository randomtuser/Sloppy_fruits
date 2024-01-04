package view;

import model.model;
import view.allPanels.BalanceWindow;
import view.allPanels.*;
import view.tab.tabv4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.security.PublicKey;

public class Balance extends JFrame {
    BalanceWindow game;
    model m;
    public Balance(model m){
        this.m = m;
        game  = new BalanceWindow(m);

        this.add(game);





        Dimension resolution = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) resolution.getWidth();  // Casting double to int
        int height = (int) resolution.getHeight();  // Casting double to int
        this.setSize(width, height);
    }

    public void setActionListener(ActionListener listener){
        game.setActionListener(listener);
    }
    public void increaseBalanceLabel() {
        game.increaseBalanceLabel();
    }

    public int getBalance(){
        return game.getBalance();
    }
}
