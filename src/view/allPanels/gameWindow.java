package view.allPanels;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class gameWindow extends JPanel {
    ImageIcon imageIcon ;
    ImageIcon imageIcon1 ;
    ImageIcon imageIcon2 ;

    JButton lever;

    public gameWindow(){
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel leverName = new JLabel("PULL THE LEVEL");
        leverName.setFont(new Font("Serif", Font.BOLD, 80));
        leverName.setForeground(Color.decode("#800080"));
        leverName.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(leverName);




        JPanel fruitRowTop = new JPanel(new GridLayout(1,3));
        JPanel fruitRowMiddle = new JPanel(new GridLayout(1,3));
        JPanel fruitRowBottom = new JPanel(new GridLayout(1,3));

        fruitRowMiddle.setBorder(BorderFactory.createLineBorder(Color.lightGray, 5));
        // Load the image using getResource
         imageIcon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/pictures/fruit/h1.png")));
         imageIcon1 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/pictures/fruit/h2.png")));
         imageIcon2 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/pictures/fruit/h3.png")));

       // Scale the image to fit
        Image image = imageIcon.getImage();
        Image scaledImage = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(scaledImage);
        Image image1 = imageIcon1.getImage();
        Image scaledImage1 = image1.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        imageIcon1 = new ImageIcon(scaledImage1);
        Image image2 = imageIcon2.getImage();
        Image scaledImage2 = image2.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        imageIcon2 = new ImageIcon(scaledImage2);

        // Add the image to a label and add it to the panel
        JLabel imageLabel = new JLabel(imageIcon);
        fruitRowMiddle.add(imageLabel);
        JLabel imageLabel1 = new JLabel(imageIcon1);
        fruitRowMiddle.add(imageLabel1);
        JLabel imageLabel2 = new JLabel(imageIcon2);
        fruitRowMiddle.add(imageLabel2);







        JPanel gamingArea = new JPanel(new GridLayout(1,2));
        gamingArea.add(fruitRowMiddle);
        JPanel controllerPart = new JPanel(new GridLayout(2,1));
        JLabel currentBalanceLabel = new JLabel("CURRENT BALANCE:");
        currentBalanceLabel.setFont(new Font("Serif", Font.BOLD, 40));
        JPanel currentBalancePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        currentBalancePanel.add(currentBalanceLabel);
        controllerPart.add(currentBalancePanel);

        lever = new JButton("PULL ME");
        lever.setFont(new Font("Serif", Font.BOLD, 50));
        lever.setForeground(Color.decode("#808080"));
        JPanel leverPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        leverPanel.add(lever);
        controllerPart.add(leverPanel);

        gamingArea.add(controllerPart);

        this.add(gamingArea);


    }


}
