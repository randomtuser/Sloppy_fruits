package view.tab;

import javax.swing.*;
import java.awt.event.ActionListener;

public class tabV2 extends JMenuBar {

    private JMenu archive;
    private JMenuItem exitItem; // JMenuItem for the exit action

    public tabV2(){
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

