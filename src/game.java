import controller.controller;
import model.model;
import view.Inicial;
import view.*;

import javax.swing.*;
import java.awt.*;

public class game {
    public static void main(String[] args) {
        model m = new model();
        Settings settigns = new Settings();
        Inicial inicial = new Inicial();
        Credits credits = new Credits();
        Leaderboard leaderboard = new Leaderboard(m);
        Game game = new Game(m);
        Balance balance = new Balance(m);
        End end = new End(m);
        new controller(m,inicial, settigns, credits, leaderboard, game, balance, end);

    }



}
