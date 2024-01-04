package view.tab;

import javax.swing.*;
import java.awt.event.ActionListener;

public class tab extends JMenuBar {
    private JMenu LEADERBOARD, MENU, EXIT, archive;
    private static JMenuItem LEADERBOARDshow, MENUshow;
    private JMenuItem exitItem;

    public tab(){
        archive = new JMenu("APP");
        exitItem = new JMenuItem("Exit");
        exitItem.setActionCommand("exit");
        archive.add(exitItem);
        this.add(archive);

        LEADERBOARD = new JMenu("LEADERBOARD");
        LEADERBOARDshow = new JMenuItem("show leaderboard");
        LEADERBOARDshow.setActionCommand("LEADERBOARD");
        LEADERBOARD.add(LEADERBOARDshow);
        this.add(LEADERBOARD);

        MENU = new JMenu("MENU");
        MENUshow = new JMenuItem("return to menu");
        MENUshow.setActionCommand("MENU");
        MENU.add(MENUshow);
        this.add(MENU);

    }

    public void setActionListener(ActionListener listener){
        MENUshow.addActionListener(listener);
        LEADERBOARDshow.addActionListener(listener);
        exitItem.addActionListener(listener);
    }
}

