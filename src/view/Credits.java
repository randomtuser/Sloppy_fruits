        package view;

        import view.allPanels.creditsWindow;
        import view.tab.tab;

        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionListener;

        public class Credits extends JFrame {
            tab bar;
            creditsWindow creditsWindow;
            public Credits(){
                creditsWindow  = new creditsWindow();

                this.add(creditsWindow);
                bar = new tab();
                this.setJMenuBar(bar);


                Dimension resolution = Toolkit.getDefaultToolkit().getScreenSize();
                int width = (int) resolution.getWidth();  // Casting double to int
                int height = (int) resolution.getHeight();  // Casting double to int

                this.setSize(width, height);



            }
            public void setActionListener(ActionListener listener){
                bar.setActionListener(listener);
            }

        }
