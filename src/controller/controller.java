package controller;

import model.model;
import view.Credits;
import view.Inicial;
import view.*;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Objects;

public class controller {
    Inicial inicial;
    Settings settings  ;
    Credits credits;
    Leaderboard leaderboard;
    Game game;
    Balance balance;
    End end;
    model m;
    public controller(model m,Inicial inicial, Settings settings, Credits credits, Leaderboard leaderboard, Game game, Balance balance, End end){
        this.inicial = inicial;
        this.settings = settings;
        this.credits = credits;
        this.leaderboard = leaderboard;
        this.game = game;
        this.balance = balance;
        this.end = end;
        this.m = m;
        inicial.setActionListener(new MyActionListener());
        credits.setActionListener(new MyActionListener2());
        leaderboard.setActionListener(new MyActionListener3());
        settings.setActionListener(new MyActionListenerSettings());
        game.setActionListener(new MyActionListenerGame());
        balance.setActionListener(new MyActionListenerBalance());
        end.setActionListener(new MyActionListener7());
        game.setMouseListenerLabel1(new MyMouseListenerGame());
        game.setMouseListenerLabel2(new MyMouseListenerGameL2());
        game.setMouseListenerLabel3(new MyMouseListenerGameL3());


        settings.activateHelp(new HelpListener());
        settings.deactivateHelp(new HelpListenerBye());




    }
    class MyActionListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            String event = e.getActionCommand();
            switch (event){
                case "exit":
                    System.exit(0);
                    break;
                case "play":
                    settings.setVisible(true);
                    inicial.setVisible(false);
                    break;
                case "credits":
                    credits.setVisible(true);
                    inicial.setVisible(false);
                    break;
                case "LEADERBOARD":
                    leaderboard.setVisible(true);
                    inicial.setVisible(false);
                    break;


            }
        }
    }
    class MyActionListener2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String event = e.getActionCommand();
            switch (event){
                case "exit":
                    System.exit(0);
                    break;
                case "LEADERBOARD":
                    credits.setVisible(false);
                    leaderboard.setVisible(true);
                    break;
                case "MENU":
                    credits.setVisible(false);
                    inicial.setVisible(true);
                    break;

            }
        }
    }
    class MyActionListener3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String event = e.getActionCommand();
            switch (event){
                case "exit":
                    System.exit(0);
                    break;
                case "MENU":
                    credits.setVisible(false);
                    inicial.setVisible(true);
                    break;

            }
        }
    }
    class MyActionListenerSettings implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String event = e.getActionCommand();
            switch (event){
                case "exit":
                    System.exit(0);
                    break;
                case "MENU":
                    settings.setVisible(false);
                    inicial.setVisible(true);
                    break;
                case "LEADERBOARD":
                    settings.setVisible(false);
                    leaderboard.setVisible(true);
                    break;
                case "start":
                    int  balance = settings.getBalance();
                    String username = settings.getUsername();
                    String theme = settings.getTheme();

                    if(Objects.equals(username, "")){
                        settings.setWarning("please enter your username");
                    }
                    else if(balance <= 0)
                        settings.setWarning("please enter a valid number");
                    else{
                        System.out.println(m.getHelp());

                        m.setUsername(username);
                        m.setTheme(theme);
                        m.setBalance(balance);
                        game.changeTheme();
                        game.updateBalanceLabel();
                        settings.setVisible(false);
                        game.setVisible(true);


                    }




                    break;


            }
        }
    }
    class MyActionListenerGame implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String event = e.getActionCommand();
            switch (event){
                case "exit":
                    System.exit(0);
                    break;
                case "MENU":
                    game.setVisible(false);
                    inicial.setVisible(true);
                    break;
                case "LEADERBOARD":
                    game.setVisible(false);
                    leaderboard.setVisible(true);
                    break;
                case "balanceManage":
                    balance.increaseBalanceLabel();
                    game.setVisible(false);
                    balance.setVisible(true);
                    break;
                case "lever":
                    balance.increaseBalanceLabel();

                    game.updatePics(m.getPermited());
                    game.updateBalanceLabel();
                    if(m.getBalance() == 0){
                        end.updateScore();
                        m.endGame();
                        leaderboard.display();
                        game.setVisible(false);
                        end.setVisible(true);
                    }
                    break;

            }
        }
    }
    class MyActionListenerBalance implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String event = e.getActionCommand();
            switch (event){
                case "END":
                    end.updateScore();
                    m.endGame();
                    leaderboard.display();
                    balance.setVisible(false);
                    end.setVisible(true);


                    break;
                case "SAVE":

                    int  balanceNumber = balance.getBalance();

                    m.addBalance(balanceNumber);
                    balance.increaseBalanceLabel();
                    game.updateBalanceLabel();

                    balance.setVisible(false);
                    game.setVisible(true);
                    break;

            }
        }
    }
    class MyActionListener7 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String event = e.getActionCommand();
            switch (event){
                case "play":
                    end.setVisible(false);
                    settings.setVisible(true);
                    break;
                case "LEADERBOARD":
                    leaderboard.clearPlayers();
                    leaderboard.display();
                    end.setVisible(false);
                    leaderboard.setVisible(true);
                    break;

            }
        }
    }
    class MyMouseListenerGame implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            if(m.getHelp()){
                if(Objects.equals(m.getPermited(), "1")){
                    m.SetPermit("");
                    game.unselectedL1();
                }
                else if(Objects.equals(m.getPermited(), "")){
                    m.SetPermit("1");
                    game.selectedL1();
                }
            }



        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }


    private class HelpListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            m.setHelp(true);
        }
    }

    private class HelpListenerBye implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            m.setHelp(false);
        }
    }

    private class MyMouseListenerGameL2 implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
            if(m.getHelp()){
                if(Objects.equals(m.getPermited(), "2")){
                    m.SetPermit("");
                    game.unselectedL2();
                }
                else if(Objects.equals(m.getPermited(), "")){
                    m.SetPermit("2");
                    game.selectedL2();
                }
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

    private class MyMouseListenerGameL3 implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
            if(m.getHelp()){
                if(Objects.equals(m.getPermited(), "3")){
                    m.SetPermit("");
                    game.unselectedL3();
                }
                else if(Objects.equals(m.getPermited(), "")){
                    m.SetPermit("3");
                    game.selectedL3();
                }
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
}
