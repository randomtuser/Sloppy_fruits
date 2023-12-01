package view;

import view.allPanels.BalanceWindow;
import view.allPanels.gameWindow;
import view.tab.tabv4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.security.PublicKey;

public class Balance extends JFrame {
    BalanceWindow game;
    public Balance(){
        game  = new BalanceWindow();

        this.add(game);





        Dimension resolution = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) resolution.getWidth();  // Casting double to int
        int height = (int) resolution.getHeight();  // Casting double to int
        this.setSize(width, height);
    }

    public void setActionListener(ActionListener listener){
        game.setActionListener(listener);
    }

}
