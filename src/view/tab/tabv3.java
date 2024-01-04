package view.tab;

import javax.swing.*;
import java.awt.event.ActionListener;

public class tabv3 extends JMenuBar {
    private JMenu LEADERBOARD, MENU, EXIT, archive;
    private static JMenuItem LEADERBOARDshow, MENUshow;
    private JMenuItem exitItem;

    public tabv3(){
        archive = new JMenu("APP");
        exitItem = new JMenuItem("Exit");
        exitItem.setActionCommand("exit");
        archive.add(exitItem);
        this.add(archive);



        MENU = new JMenu("MENU");
        MENUshow = new JMenuItem("return to menu");
        MENUshow.setActionCommand("MENU");
        MENU.add(MENUshow);
        this.add(MENU);

    }

    public void setActionListener(ActionListener listener){
        MENUshow.addActionListener(listener);

        exitItem.addActionListener(listener);
    }
}

