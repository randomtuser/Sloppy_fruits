package view.allPanels;

import model.model;

    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.Objects;
    public class WestWindowGame extends JPanel {
        ImageIcon imageIcon, imageIconFake, imageIcon1Fake, imageIcon2Fake, imageIconFakeB, imageIcon1FakeB, imageIcon2FakeB ;
        ImageIcon imageIcon1 ;
        ImageIcon imageIcon2 ;
        JLabel currentBalanceLabel;
        JButton lever, changeBalance;
        model m ;
        JPanel fruitRowMiddle;
        private JLabel label1;
        private JLabel label2;
        private JLabel label3;
        private JLabel label1B;
        private JLabel label2B;
        private JLabel label3B;
        private JLabel label1T;
        private JLabel label2T;
        private JLabel label3T;
        int size = 125;
        JPanel fruitRowBottom, fruitRowTop;
        int currentPic1;
        int currentPic2;
        int currentPic3;


        public WestWindowGame(model m){
            this.m = m;
            this.setLayout(new GridLayout(3,2) );
            this.add(Box.createRigidArea(new Dimension(50,150)));

            fruitRowTop = new JPanel(new GridLayout(1,3));
            //fake images
            imageIconFake = (ImageIcon) m.imageIcon()[0];
            imageIcon1Fake = (ImageIcon) m.imageIcon()[0];
            imageIcon2Fake = (ImageIcon) m.imageIcon()[0];

            // Scale the image to fit
            Image imageFake = imageIconFake.getImage();
            Image scaledImageFake = imageFake.getScaledInstance(size, size, Image.SCALE_SMOOTH);
            imageIconFake = new ImageIcon(scaledImageFake);
            Image image1Fake = imageIcon1Fake.getImage();
            Image scaledImage1Fake = image1Fake.getScaledInstance(size, size, Image.SCALE_SMOOTH);
            imageIcon1Fake = new ImageIcon(scaledImage1Fake);
            Image image2Fake = imageIcon2Fake.getImage();
            Image scaledImage2Fake = image2Fake.getScaledInstance(size, size, Image.SCALE_SMOOTH);
            imageIcon2Fake = new ImageIcon(scaledImage2Fake);

            // Add the image to a label and add it to the panel
            JPanel panel1Fake = new JPanel();
            label1T = new JLabel(imageIconFake);
            panel1Fake.add(label1T);
            JPanel panel2Fake = new JPanel();
            label2T = new JLabel(imageIcon1Fake);
            panel2Fake.add(label2T);
            JPanel panel3Fake = new JPanel();
            label3T = new JLabel(imageIcon2Fake);
            panel3Fake.add(label3T);
            fruitRowTop.add(panel1Fake);
            fruitRowTop.add(panel2Fake);
            fruitRowTop.add(panel3Fake);
            this.add(fruitRowTop);


            this.add(Box.createRigidArea(new Dimension(50,0)));

            fruitRowMiddle = new JPanel(new GridLayout(1,3));
          //  fruitRowMiddle.setBorder(BorderFactory.createLineBorder(Color.lightGray, 5));



            //images
            imageIcon = (ImageIcon) m.imageIcon()[0];
            imageIcon1 = (ImageIcon) m.imageIcon()[0];
            imageIcon2 = (ImageIcon) m.imageIcon()[0];

           // Scale the image to fit
            Image image = imageIcon.getImage();
            Image scaledImage = image.getScaledInstance(size, size, Image.SCALE_SMOOTH);
            imageIcon = new ImageIcon(scaledImage);
            Image image1 = imageIcon1.getImage();
            Image scaledImage1 = image1.getScaledInstance(size, size, Image.SCALE_SMOOTH);
            imageIcon1 = new ImageIcon(scaledImage1);
            Image image2 = imageIcon2.getImage();
            Image scaledImage2 = image2.getScaledInstance(size, size, Image.SCALE_SMOOTH);
            imageIcon2 = new ImageIcon(scaledImage2);

            // Add the image to a label and add it to the panel
            JPanel panel1 = new JPanel();
             label1 = new JLabel(imageIcon);
            panel1.add(label1);
            JPanel panel2 = new JPanel();
             label2 = new JLabel(imageIcon1);
            panel2.add(label2);
            JPanel panel3 = new JPanel();
             label3 = new JLabel(imageIcon2);
            panel3.add(label3);
            fruitRowMiddle.add(panel1);
            fruitRowMiddle.add(panel2);
            fruitRowMiddle.add(panel3);
            this.add(fruitRowMiddle);

            this.add(Box.createRigidArea(new Dimension(50,0)));


            //fake images
            fruitRowBottom = new JPanel(new GridLayout(1,3));

            imageIconFakeB = (ImageIcon) m.imageIcon()[0];
            imageIcon1FakeB = (ImageIcon) m.imageIcon()[0];
            imageIcon2FakeB = (ImageIcon) m.imageIcon()[0];

            // Scale the image to fit
            Image imageFakeB = imageIconFakeB.getImage();
            Image scaledImageFakeB = imageFakeB.getScaledInstance(size, size, Image.SCALE_SMOOTH);
            imageIconFakeB = new ImageIcon(scaledImageFakeB);
            Image image1FakeB = imageIcon1FakeB.getImage();
            Image scaledImage1FakeB = image1FakeB.getScaledInstance(size, size, Image.SCALE_SMOOTH);
            imageIcon1FakeB = new ImageIcon(scaledImage1FakeB);
            Image image2FakeB = imageIcon2FakeB.getImage();
            Image scaledImage2FakeB = image2FakeB.getScaledInstance(size, size, Image.SCALE_SMOOTH);
            imageIcon2FakeB = new ImageIcon(scaledImage2FakeB);

            // Add the image to a label and add it to the panel
            JPanel panel1FakeB = new JPanel();
            label1B = new JLabel(imageIconFakeB);
            panel1FakeB.add(label1B);
            JPanel panel2FakeB = new JPanel();
            label2B = new JLabel(imageIcon1FakeB);
            panel2FakeB.add(label2B);
            JPanel panel3FakeB = new JPanel();
            label3B = new JLabel(imageIcon2FakeB);
            panel3FakeB.add(label3B);
            fruitRowBottom.add(panel1FakeB);
            fruitRowBottom.add(panel2FakeB);
            fruitRowBottom.add(panel3FakeB);
            this.add(fruitRowBottom);



        }



        public void updatePics(String permited) {
            if(!m.getHelp() ||   Objects.equals(permited, "")){
                Object[] newImage = m.imageIcon();
                imageIcon = (ImageIcon) newImage[0];
                int n = (int) newImage[1];
                Object[] newImage1  = m.imageIcon();
                imageIcon1 = (ImageIcon) newImage1[0];
                int n1 = (int) newImage1[1];
                Object[] newImage2  = m.imageIcon();
                imageIcon2 = (ImageIcon) newImage2[0];
                int n2 = (int) newImage2[1];
                currentPic1 = n;
                currentPic2 = n1;
                currentPic3 = n2;
                m.calculate(n, n1, n2);

                label1.setIcon(new ImageIcon(imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
                label2.setIcon(new ImageIcon(imageIcon1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
                label3.setIcon(new ImageIcon(imageIcon2.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));

                fruitRowMiddle.revalidate();
                fruitRowMiddle.repaint();
            }else if(Objects.equals(permited, "1")){
                Object[] newImage = m.imageIcon();
                imageIcon = (ImageIcon) newImage[0];
                int n = (int) newImage[1];
                currentPic1 = n;
                m.calculate(n, currentPic2, currentPic3);

                label1.setIcon(new ImageIcon(imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
                label2.setIcon(new ImageIcon(imageIcon1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
                label3.setIcon(new ImageIcon(imageIcon2.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));

                fruitRowMiddle.revalidate();
                fruitRowMiddle.repaint();
            }else if(Objects.equals(permited, "2")){

                Object[] newImage1  = m.imageIcon();
                imageIcon1 = (ImageIcon) newImage1[0];
                int n1 = (int) newImage1[1];


                currentPic2 = n1;
                m.calculate(currentPic1, n1, currentPic3);

                label1.setIcon(new ImageIcon(imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
                label2.setIcon(new ImageIcon(imageIcon1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
                label3.setIcon(new ImageIcon(imageIcon2.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));

                fruitRowMiddle.revalidate();
                fruitRowMiddle.repaint();
            }else if(Objects.equals(permited, "3")){

                Object[] newImage2  = m.imageIcon();
                imageIcon2 = (ImageIcon) newImage2[0];
                int n2 = (int) newImage2[1];
                currentPic3 = n2;
                m.calculate(currentPic1, currentPic2, n2);

                label1.setIcon(new ImageIcon(imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
                label2.setIcon(new ImageIcon(imageIcon1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
                label3.setIcon(new ImageIcon(imageIcon2.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));

                fruitRowMiddle.revalidate();
                fruitRowMiddle.repaint();
            }





        }

        public void changeTheme() {
            Object[] newImage = m.imageIcon();
            imageIcon = (ImageIcon) newImage[0];
            int n = (int) newImage[1];
            Object[] newImage1  = m.imageIcon();
            imageIcon1 = (ImageIcon) newImage1[0];
            int n1 = (int) newImage1[1];
            Object[] newImage2  = m.imageIcon();
            imageIcon2 = (ImageIcon) newImage2[0];
            int n2 = (int) newImage2[1];
            currentPic1 = n;
            currentPic2 = n1;
            currentPic3 = n2;


            label1.setIcon(new ImageIcon(imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
            label2.setIcon(new ImageIcon(imageIcon1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
            label3.setIcon(new ImageIcon(imageIcon2.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));

            newImage = m.imageIcon();
            imageIconFakeB =(ImageIcon) newImage[0];
            newImage = m.imageIcon();
            imageIcon1FakeB =(ImageIcon) newImage[0];
            newImage = m.imageIcon();
            imageIcon2FakeB = (ImageIcon) newImage[0];

            newImage = m.imageIcon();
            imageIconFake = (ImageIcon) newImage[0];
            newImage = m.imageIcon();
            imageIcon1Fake = (ImageIcon) newImage[0];
            newImage = m.imageIcon();
            imageIcon2Fake = (ImageIcon) newImage[0];




            label1T.setIcon(new ImageIcon(imageIconFake.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
            label2T.setIcon(new ImageIcon(imageIcon1Fake.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
            label3T.setIcon(new ImageIcon(imageIcon2Fake.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));



            label1B.setIcon(new ImageIcon(imageIconFakeB.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
            label2B.setIcon(new ImageIcon(imageIcon1FakeB.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
            label3B.setIcon(new ImageIcon(imageIcon2FakeB.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));

            fruitRowTop.revalidate();
            fruitRowTop.repaint();
            fruitRowBottom.revalidate();
            fruitRowBottom.repaint();
            fruitRowMiddle.revalidate();
            fruitRowMiddle.repaint();
        }


        public void setMouseListenerLabel1(MouseListener listener){
            label1.addMouseListener(listener);

        }
        public void setMouseListenerLabel2(MouseListener listener){
            label2.addMouseListener(listener);

        }
        public void setMouseListenerLabel3(MouseListener listener){
            label3.addMouseListener(listener);

        }




    public  void selectedL1(){
            label1.setBorder(BorderFactory.createLineBorder(Color.magenta, 5));
    }
    public  void unselectedL1(){
        label1.setBorder(BorderFactory.createLineBorder(Color.white, 0));
        }
        public  void selectedL2(){
            label2.setBorder(BorderFactory.createLineBorder(Color.magenta, 5));
        }
        public  void unselectedL2(){
            label2.setBorder(BorderFactory.createLineBorder(Color.white, 0));
        }
        public  void selectedL3(){
            label3.setBorder(BorderFactory.createLineBorder(Color.magenta, 5));
        }
        public  void unselectedL3(){
            label3.setBorder(BorderFactory.createLineBorder(Color.white, 0));
        }




    }


