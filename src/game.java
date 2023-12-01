import controller.controller;
import view.Inicial;
import view.*;

import javax.swing.*;
import java.awt.*;

public class game {
    public static void main(String[] args) {
        Settings settigns = new Settings();
        Inicial inicial = new Inicial();
        Credits credits = new Credits();
        Leaderboard leaderboard = new Leaderboard();
        Game game = new Game();
        Balance balance = new Balance();
        End end = new End();
        new controller(inicial, settigns, credits, leaderboard, game, balance, end);

    }



}
