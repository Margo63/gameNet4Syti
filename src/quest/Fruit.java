package quest;

import game.Button;
import game1.Trash;
import main.MainBut;
import main.variables;

import javax.swing.*;
import java.awt.*;

public class Fruit {
    public  JFrame f;
    public JPanel p;
    public MainBut b1;
    public MainBut b2;
    public MainBut b3;
    public MainBut b4;
    public MainBut b5;

    Fruit(){
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
        b1.MenuButt(10, "",variables.m_2.getWidth(null)+10 ,10 , p);
        b1.setSize(variables.plastic.getWidth(null),variables.plastic.getHeight(null));
        b1.setOpaque(false);
        b1.setContentAreaFilled(false);
        b1.setBorderPainted(false);
        if(Trash.num2)b1.img=variables.plastic;

        b1.w=variables.plastic.getWidth(null);
        b1.h=variables.plastic.getHeight(null);
        ////////////////////////////////////////////////////
        b2 = new MainBut();
        b2.MenuButt(11, "", variables.plastic.getWidth(null)+variables.m_2.getWidth(null)+10, 10, p);
        b2.setSize(variables.glass.getWidth(null),variables.glass.getHeight(null));
        b2.setOpaque(false);
        b2.setContentAreaFilled(false);
        b2.setBorderPainted(false);
        if(Trash.num5)b2.img=variables.glass;

        b2.w=variables.glass.getWidth(null);
        b2.h=variables.glass.getHeight(null);
        /////////////////////////////////////////////////////
        b3 = new MainBut();
        b3.MenuButt(12, " ",variables.glass.getWidth(null)+variables.plastic.getWidth(null)+variables.m_2.getWidth(null)+10, 10, p);
        b3.setSize(variables.org.getWidth(null),variables.org.getHeight(null));
        b3.setOpaque(false);
        b3.setContentAreaFilled(false);
        b3.setBorderPainted(false);
        if(Trash.num4)b3.img=variables.org;

        b3.w=variables.org.getWidth(null);
        b3.h=variables.org.getHeight(null);
        //////////////////////////////////////////////////////
        b4 = new MainBut();
        b4.MenuButt(9, "", 10,10,  p);
        b4.setSize(variables.m_2.getWidth(null),variables.m_2.getHeight(null));
        b4.setOpaque(false);
        b4.setContentAreaFilled(false);
        b4.setBorderPainted(false);
        if(Trash.num1) b4.img=variables.m_2;

        b4.w=variables.m_2.getWidth(null);
        b4.h=variables.m_2.getHeight(null);
        //////////////////////////////////////////////////////
        b5 = new MainBut();
        b5.MenuButt(9, "", 10,10,  p);
        b5.setSize(variables.m_2.getWidth(null),variables.m_2.getHeight(null));
        b5.setOpaque(false);
        b5.setContentAreaFilled(false);
        b5.setBorderPainted(false);
        if(Trash.num1) b4.img=variables.m_2;

        b5.w=variables.m_2.getWidth(null);
        b5.h=variables.m_2.getHeight(null);

        p.setLayout(null);

        f.add(p);
        Button.but_close(p,f);
    }
}
