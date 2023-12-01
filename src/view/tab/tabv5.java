package view.tab;

import javax.swing.*;
import java.awt.event.ActionListener;

public class tabv5 extends JMenuBar {
    private JMenu LEADERBOARD, MENU, EXIT, archive, balance ;
    private static JMenuItem LEADERBOARDshow, MENUshow, balanceManage;
    private JMenuItem exitItem;

    public tabv5(){
        archive = new JMenu("FILE");
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


        balance = new JMenu("BALANCE/END THE GAME");
        balanceManage = new JMenuItem("manage balance");
        balanceManage.setActionCommand("balanceManage");
        balance.add(balanceManage);
        this.add(balance);

    }

    public void setActionListener(ActionListener listener){
        MENUshow.addActionListener(listener);
        LEADERBOARDshow.addActionListener(listener);
        exitItem.addActionListener(listener);
        balanceManage.addActionListener(listener);
    }
}

