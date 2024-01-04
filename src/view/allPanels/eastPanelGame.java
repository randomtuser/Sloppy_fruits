package view.allPanels;

import model.model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class eastPanelGame extends JPanel{

    JLabel currentBalanceLabel;
    JButton lever, changeBalance;
    model m ;


    public eastPanelGame(model m) {
        this.m = m;


        JPanel controllerPart = new JPanel(new GridLayout(4,1));

        currentBalanceLabel = new JLabel("CURRENT BALANCE: " + m.getBalance());
        System.out.println( m.getBalance());
        currentBalanceLabel.setFont(new Font("Serif", Font.BOLD, 40));
        JPanel currentBalancePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        currentBalancePanel.add(currentBalanceLabel);
        controllerPart.add(currentBalancePanel);




        lever = new JButton("PULL ME");
        lever.setFont(new Font("Serif", Font.BOLD, 50));
        lever.setForeground(Color.RED);
        lever.setActionCommand("lever");
        JPanel leverPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        leverPanel.add(lever);
        controllerPart.add(leverPanel);

        controllerPart.add(Box.createRigidArea(new Dimension(100,150)));


        changeBalance = new JButton("SETTINGS");
        changeBalance.setFont(new Font("Serif", Font.BOLD, 30));
        changeBalance.setForeground(Color.decode("#808080"));
        changeBalance.setActionCommand("balanceManage");
        JPanel changeBalancePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        changeBalancePanel.add(changeBalance);
        controllerPart.add(changeBalancePanel);





        add(controllerPart);

    }

    public void updateBalanceLabel() {
        currentBalanceLabel.setText("CURRENT BALANCE: " + m.getBalance());
        currentBalanceLabel.revalidate();
        currentBalanceLabel.repaint();
    }

    public void setActionListener(ActionListener listener){
        lever.addActionListener(listener);
        changeBalance.addActionListener(listener);

    }




}
