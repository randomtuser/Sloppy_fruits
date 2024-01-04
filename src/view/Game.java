package view;
import model.*;
import view.allPanels.*;
import view.tab.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class Game  extends JFrame {
    tabv5 bar;
    model m;
    WestWindowGame game;
    eastPanelGame east;
    public Game(model m){
        this.m = m;
        game  = new WestWindowGame(m);
        NorthPanelGame north = new NorthPanelGame();
        east = new eastPanelGame(m);
        add(north, "North");
        add(east, "East");
        add(game, "West");
        bar = new tabv5();
        this.setJMenuBar(bar);


        Dimension resolution = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) resolution.getWidth();  // Casting double to int
        int height = (int) resolution.getHeight();  // Casting double to int

        this.setSize(width, height);



    }
    public void setActionListener(ActionListener listener){
        bar.setActionListener(listener);
        east.setActionListener(listener);
    }

    public void updateBalanceLabel() {
        east.updateBalanceLabel();

    }
    public void setMouseListenerLabel1(MouseListener listener){
        game.setMouseListenerLabel1(listener);
    }
    public void setMouseListenerLabel2(MouseListener listener){
        game.setMouseListenerLabel2(listener);
    }
    public void setMouseListenerLabel3(MouseListener listener){
        game.setMouseListenerLabel3(listener);
    }

    public void updatePics(String permited) {
        game.updatePics(permited);
    }
    public void changeTheme() {
        game.changeTheme();
    }

    public  void selectedL1(){
        game.selectedL1();
    }
    public  void unselectedL1(){
        game.unselectedL1();

    }

    public  void selectedL2(){
        game.selectedL2();
    }
    public  void unselectedL2(){
        game.unselectedL2();

    }
    public  void selectedL3(){
        game.selectedL3();
    }
    public  void unselectedL3(){
        game.unselectedL3();

    }

}
