package view;

import view.allPanels.inicialWindow;
import view.tab.tabV2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Inicial extends JFrame {
    tabV2 bar;
    inicialWindow b;
    public Inicial(){
        b = new inicialWindow();

        bar = new tabV2();
        this.setJMenuBar(bar);
        this.add(b);



        Dimension resolution = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) resolution.getWidth();  // Casting double to int
        int height = (int) resolution.getHeight();  // Casting double to int

        this.setVisible(true);
        this.setSize(width, height);


    }

    public void setActionListener(ActionListener listener){
        bar.setActionListener(listener);
        b.setActionListener(listener);
    }

}
