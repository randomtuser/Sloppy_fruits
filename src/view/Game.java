package view;
import view.allPanels.*;
import view.tab.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Game  extends JFrame {
    tabv5 bar;
    public Game(){
        gameWindow game  = new gameWindow();

        this.add(game);
        bar = new tabv5();
        this.setJMenuBar(bar);


        Dimension resolution = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) resolution.getWidth();  // Casting double to int
        int height = (int) resolution.getHeight();  // Casting double to int

        this.setSize(width, height);



    }
    public void setActionListener(ActionListener listener){
        bar.setActionListener(listener);
    }
}
