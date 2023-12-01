package view.allPanels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class settingsWindow extends JPanel {
    JTextField nameArea;
    JRadioButton first, second, third, YES, NO;
    JButton start;
    public settingsWindow(){
        this.setLayout(new GridLayout(8, 1)); // 7 rows for components and spacing, 1 column
        JLabel settings = new JLabel("SETTINGS", SwingConstants.CENTER);
        settings.setFont(new Font("Serif", Font.BOLD, 80));
        settings.setForeground(Color.decode("#800080"));


        this.add(settings);
        this.add(Box.createRigidArea(new Dimension(0, 50)));

        // Name section
        JLabel nameLabel = new JLabel("Enter your name:");
        nameLabel.setFont(new Font("Serif", Font.BOLD, 40));
        nameArea = new JTextField();
        nameArea.setPreferredSize(new Dimension(200, 40)); // Set desired width and height
        JPanel namePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        namePanel.add(nameLabel);
        namePanel.add(nameArea);

        this.add(namePanel);

        // Theme section
        JLabel chooseLabel = new JLabel("Choose your theme:");
        chooseLabel.setFont(new Font("Serif", Font.BOLD, 40));
        JPanel choosePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        choosePanel.add(chooseLabel);
        first = new JRadioButton("FRUITS");
        first.setFont(new Font("Serif", Font.BOLD, 30));
        second = new JRadioButton("HALLOWEN");
        second.setFont(new Font("Serif", Font.BOLD, 30));
        third = new JRadioButton("TREES");
        third.setFont(new Font("Serif", Font.BOLD, 30));
        ButtonGroup group = new ButtonGroup();
        group.add(first);
        group.add(second);
        group.add(third);
        choosePanel.add(first);
        choosePanel.add(second);
        choosePanel.add(third);

        this.add(choosePanel);

        // Wizard section
        JLabel chooseWizard = new JLabel("Use wizard:");
        chooseWizard.setFont(new Font("Serif", Font.BOLD, 40));
        JPanel wizardPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        wizardPanel.add(chooseWizard);
        YES = new JRadioButton("YES");
        YES.setFont(new Font("Serif", Font.BOLD, 30));
        NO = new JRadioButton("NO");
        NO.setFont(new Font("Serif", Font.BOLD, 30));
        ButtonGroup groupWizard = new ButtonGroup();
        groupWizard.add(YES);
        groupWizard.add(NO);
        wizardPanel.add(YES);
        wizardPanel.add(NO);
        this.add(wizardPanel);

        // Start button section
        start = new JButton("PLAY");
        start.setFont(new Font("Serif", Font.BOLD, 40));
        start.setBackground(Color.decode("#87CEEB"));
        start.setPreferredSize(new Dimension(300, 80)); // Set the preferred size of the button
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        start.setActionCommand("start");

        buttonPanel.add(start);
        this.add(buttonPanel);

    }


    public void setActionListener(ActionListener listener){
        start.addActionListener(listener);

    }
}
