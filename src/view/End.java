package view;

import model.model;
import view.allPanels.BalanceWindow;
import view.allPanels.EndWindow;
import view.tab.tabv4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class End extends JFrame {
    tabv4 bar;
    EndWindow end;
    model m;
    public End(model m){
        this.m = m;
        end  = new EndWindow(m);

        this.add(end);
        bar = new tabv4();
        this.setJMenuBar(bar);




        Dimension resolution = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) resolution.getWidth();  // Casting double to int
        int height = (int) resolution.getHeight();  // Casting double to int
        this.setSize(width, height);
    }

    public void setActionListener(ActionListener listener){
        end.setActionListener(listener);
    }

    public void updateScore(){
        end.updateScore();
    }


}
