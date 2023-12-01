package view;

import view.allPanels.*;
import view.tab.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Settings extends JFrame {
    tabv4 bar;
    settingsWindow  settings;
    public Settings(){
          settings = new settingsWindow();

        bar = new tabv4();
        this.setJMenuBar(bar);
        this.add(settings);



        Dimension resolution = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) resolution.getWidth();  // Casting double to int
        int height = (int) resolution.getHeight();  // Casting double to int


        this.setSize(width, height);



        }
    public void setActionListener(ActionListener listener){
        bar.setActionListener(listener);
        settings.setActionListener(listener);
    }

}
