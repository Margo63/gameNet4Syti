package quest;

import game.Button;
import main.MainBut;
import main.variables;

import javax.swing.*;
import java.awt.*;

public class Egg {
    public JFrame f;
    public JPanel p;
    public MainBut b1;
    public MainBut b2;
    public MainBut b3;
    public MainBut b4;
    public MainBut b5;

    public Egg(){

        f = new JFrame();
        f.setUndecorated(true);
        f.setBounds(variables.width/2-variables.width/6,variables.height/2-variables.height/6,variables.width/3,variables.height/3);
        f.setVisible(true);
        p = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(variables.white_fon,  0, 0, variables.width,variables.height,   null);

            }
        };


        ///////////////////////////////////////////////////////
        b1 = new MainBut();
        b1.MenuButt(-1, "яйца",10 ,10 , p);
        b1.setSize(60,60);
        b1.setOpaque(false);
        b1.setContentAreaFilled(false);
        b1.setBorderPainted(false);
        b1.img=variables.plastic;

        b1.w=variables.plastic.getWidth(null);
        b1.h=variables.plastic.getHeight(null);
        ////////////////////////////////////////////////////


        p.setLayout(null);

        f.add(p);
        Button.but_close(p,f);
    }
}
