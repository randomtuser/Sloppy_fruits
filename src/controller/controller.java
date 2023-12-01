package controller;

import view.Credits;
import view.Inicial;
import view.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controller {
    Inicial inicial;
    Settings settings  ;
    Credits credits;
    Leaderboard leaderboard;
    Game game;
    Balance balance;
    End end;
    public controller(Inicial inicial, Settings settings, Credits credits, Leaderboard leaderboard, Game game, Balance balance, End end){
        this.inicial = inicial;
        this.settings = settings;
        this.credits = credits;
        this.leaderboard = leaderboard;
        this.game = game;
        this.balance = balance;
        this.end = end;

        inicial.setActionListener(new MyActionListener());
        credits.setActionListener(new MyActionListener2());
        leaderboard.setActionListener(new MyActionListener3());
        settings.setActionListener(new MyActionListener4());
        game.setActionListener(new MyActionListener5());
        balance.setActionListener(new MyActionListener6());
        end.setActionListener(new MyActionListener7());



    }

    class MyActionListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            String event = e.getActionCommand();
            System.out.println(event);
            switch (event){
                case "exit":
                    System.exit(0);
                    break;
                case "play":
                    game.setVisible(true);
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
            System.out.println(event);
            switch (event){
                case "exit":
                    System.out.println("dla");
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
            System.out.println(event);
            switch (event){
                case "exit":
                    System.out.println("dla");
                    System.exit(0);
                    break;
                case "MENU":
                    credits.setVisible(false);
                    inicial.setVisible(true);
                    break;

            }
        }
    }
    class MyActionListener4 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String event = e.getActionCommand();
            System.out.println(event);
            switch (event){
                case "exit":
                    System.exit(0);
                    break;
                case "MENU":
                    settings.setVisible(false);
                    inicial.setVisible(true);
                    System.out.println("fasefj");
                    break;
                case "LEADERBOARD":
                    settings.setVisible(false);
                    leaderboard.setVisible(true);
                    break;
                case "start":
                    settings.setVisible(false);
                    game.setVisible(true);
                    break;

            }
        }
    }
    class MyActionListener5 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String event = e.getActionCommand();
            System.out.println(event);
            switch (event){
                case "exit":
                    System.exit(0);
                    break;
                case "MENU":
                    game.setVisible(false);
                    inicial.setVisible(true);
                    System.out.println("fasefj");
                    break;
                case "LEADERBOARD":
                    game.setVisible(false);
                    leaderboard.setVisible(true);
                    break;
                case "balanceManage":
                    game.setVisible(false);
                    balance.setVisible(true);
                    break;

            }
        }
    }
    class MyActionListener6 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String event = e.getActionCommand();
            switch (event){
                case "END":
                    balance.setVisible(false);
                    end.setVisible(true);
                    break;
                case "SAVE":
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
            System.out.println(event);
            switch (event){
                case "play":
                    end.setVisible(false);
                    settings.setVisible(true);
                    break;
                case "LEADERBOARD":
                    end.setVisible(false);
                    leaderboard.setVisible(true);
                    break;

            }
        }
    }
}
