package view.allPanels;

import model.model;
import view.Balance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class BalanceWindow extends JPanel{
    JTextField addBalance;
    JButton returnAndSave, end;
    model m;
    JLabel currentBalanceLabel;
    public BalanceWindow(model m){
        this.m = m;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel balanceName = new JLabel("BALANCE CONFIGURATOR", SwingConstants.CENTER);
        balanceName.setFont(new Font("Serif", Font.BOLD, 80));
        balanceName.setForeground(Color.decode("#800080"));
        balanceName.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        this.add(balanceName);
        this.add(Box.createRigidArea(new Dimension(0, 50)));





        JLabel addBalanceLabel = new JLabel("ADD BALANCE:");
        addBalanceLabel.setFont(new Font("Serif", Font.BOLD, 40));
        addBalance = new JTextField("1");
        addBalance.setPreferredSize(new Dimension(200, 40));
        addBalance.setActionCommand("addBalance");
        JPanel namePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        namePanel.add(addBalanceLabel);
        namePanel.add(addBalance);
        this.add(namePanel);

        currentBalanceLabel = new JLabel("CURRENT BALANCE: "+ m.getBalance());
        currentBalanceLabel.setFont(new Font("Serif", Font.BOLD, 40));
        JPanel currentBalancePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        currentBalancePanel.add(currentBalanceLabel);
        this.add(currentBalancePanel);






        this.add(Box.createRigidArea(new Dimension(0, 50)));


        returnAndSave = new JButton("SAVE");
        returnAndSave.setFont(new Font("Serif", Font.BOLD, 40));
        returnAndSave.setBackground(Color.decode("#87CEEB"));
        returnAndSave.setPreferredSize(new Dimension(300, 80));
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        returnAndSave.setActionCommand("SAVE");
        buttonPanel.add(returnAndSave);
        buttonPanel.setBorder((BorderFactory.createEmptyBorder(0, 40, 0, 10)));
        this.add(buttonPanel);

        end = new JButton("END GAME");
        end.setFont(new Font("Serif", Font.BOLD, 40));
        end.setBackground(Color.decode("#87CEEB"));
        end.setPreferredSize(new Dimension(300, 80));
        JPanel buttonPanelend = new JPanel(new FlowLayout(FlowLayout.CENTER));
        end.setActionCommand("END");
        buttonPanelend.add(end);
        buttonPanelend.setBorder((BorderFactory.createEmptyBorder(0, 40, 0, 40)));
        this.add(buttonPanelend);

    }
    public void setActionListener(ActionListener listener){
        returnAndSave.addActionListener(listener);
        end.addActionListener(listener);
    }

    public void increaseBalanceLabel() {
        currentBalanceLabel.setText("CURRENT BALANCE: " + m.getBalance());
        currentBalanceLabel.revalidate();
        currentBalanceLabel.repaint();
    }
    public int getBalance(){
        return Integer.parseInt(addBalance.getText());
    }
}
