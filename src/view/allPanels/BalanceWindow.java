package view.allPanels;

import view.Balance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class BalanceWindow extends JPanel{
    JTextField addBalance;
    JTextField withdrawBalance;
    JButton returnAndSave, end;
    public BalanceWindow(){
        this.setLayout(new GridLayout(8, 1)); // 7 rows for components and spacing, 1 column
        JLabel balanceName = new JLabel("BALANCE CONFIGURATOR", SwingConstants.CENTER);
        balanceName.setFont(new Font("Serif", Font.BOLD, 80));
        balanceName.setForeground(Color.decode("#800080"));
        this.add(balanceName);
        this.add(Box.createRigidArea(new Dimension(0, 50)));




        JPanel allPanel = new JPanel(new GridLayout(2,1));

        JLabel addBalanceLabel = new JLabel("ADD BALANCE:");
        addBalanceLabel.setFont(new Font("Serif", Font.BOLD, 40));
        addBalance = new JTextField();
        addBalance.setPreferredSize(new Dimension(200, 40)); // Set desired width and height
        JPanel namePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        namePanel.add(addBalanceLabel);
        namePanel.add(addBalance);
        allPanel.add(namePanel);


        JLabel currentBalanceLabel = new JLabel("CURRENT BALANCE:");
        currentBalanceLabel.setFont(new Font("Serif", Font.BOLD, 40));
        JPanel currentBalancePanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        currentBalancePanel.add(currentBalanceLabel);
        allPanel.add(currentBalancePanel);


        JLabel withdrawBalanceLabel = new JLabel("WITHDRAW BALANCE:");
        withdrawBalanceLabel.setFont(new Font("Serif", Font.BOLD, 40));
        withdrawBalance = new JTextField();
        withdrawBalance.setPreferredSize(new Dimension(200, 40));
        JPanel withdrawBalancePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        withdrawBalancePanel.add(withdrawBalanceLabel);
        withdrawBalancePanel.add(withdrawBalance);
        allPanel.add(withdrawBalancePanel);
        allPanel.setBorder((BorderFactory.createEmptyBorder(0, 40, 0, 40)));
        this.add(allPanel);



        this.add(Box.createRigidArea(new Dimension(0, 50)));


        returnAndSave = new JButton("SAVE");
        returnAndSave.setFont(new Font("Serif", Font.BOLD, 40));
        returnAndSave.setBackground(Color.decode("#87CEEB"));
        returnAndSave.setPreferredSize(new Dimension(300, 80)); // Set the preferred size of the button
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        returnAndSave.setActionCommand("SAVE");
        buttonPanel.add(returnAndSave);
        buttonPanel.setBorder((BorderFactory.createEmptyBorder(0, 40, 0, 40)));
        this.add(buttonPanel);

        end = new JButton("END GAME");
        end.setFont(new Font("Serif", Font.BOLD, 40));
        end.setBackground(Color.decode("#87CEEB"));
        end.setPreferredSize(new Dimension(300, 80)); // Set the preferred size of the button
        JPanel buttonPanelend = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        end.setActionCommand("END");
        buttonPanelend.add(end);
        buttonPanelend.setBorder((BorderFactory.createEmptyBorder(0, 40, 0, 40)));
        this.add(buttonPanelend);

    }
    public void setActionListener(ActionListener listener){
        returnAndSave.addActionListener(listener);
        end.addActionListener(listener);
    }
}
