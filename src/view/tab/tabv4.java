package view.tab;

import javax.swing.*;
import java.awt.event.ActionListener;

public class tabv4 extends JMenuBar {
    private JMenu LEADERBOARD, MENU, EXIT, archive, balance ;
    private static JMenuItem LEADERBOARDshow, MENUshow, balanceManage;
    private JMenuItem exitItem;

    public tabv4(){
        archive = new JMenu("APP");
        exitItem = new JMenuItem("Exit");
        exitItem.setActionCommand("exit");
        archive.add(exitItem);
        this.add(archive);






    }

    public void setActionListener(ActionListener listener){

        exitItem.addActionListener(listener);
    }
}

