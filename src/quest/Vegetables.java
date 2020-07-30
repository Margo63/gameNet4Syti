package quest;

import game.Button;
import main.MainBut;
import main.variables;

import javax.swing.*;
import java.awt.*;

public class Vegetables {
    public static JFrame f;
    public static JPanel p;
    public static MainBut b1;
    public static MainBut b2;
    public static MainBut b3;
    public static MainBut b4;
    public static MainBut b5;
    public static boolean v_1=false,v_2=false,v_3=false,v_4=false,v_5=false;
    public Vegetables(){

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
        b1.MenuButt(-6, "помидоры",10 ,10 , p);
        b1.setSize(60,60);
        b1.setOpaque(false);
        b1.setContentAreaFilled(false);
        b1.setBorderPainted(false);
        if(!v_1)b1.img=variables.plastic;

        b1.w=variables.plastic.getWidth(null);
        b1.h=variables.plastic.getHeight(null);
        ////////////////////////////////////////////////////
        b2 = new MainBut();
        b2.MenuButt(-7, "огурцы", 70, 10, p);
        b2.setSize(60,60);
        b2.setOpaque(false);
        b2.setContentAreaFilled(false);
        b2.setBorderPainted(false);
        if(!v_2)b2.img=variables.glass;

        b2.w=variables.glass.getWidth(null);
        b2.h=variables.glass.getHeight(null);
        /////////////////////////////////////////////////////
        b3 = new MainBut();
        b3.MenuButt(-8, " морковь",140, 10, p);
        b3.setSize(60,60);
        b3.setOpaque(false);
        b3.setContentAreaFilled(false);
        b3.setBorderPainted(false);
        if(!v_3)b3.img=variables.org;

        b3.w=variables.org.getWidth(null);
        b3.h=variables.org.getHeight(null);
        //////////////////////////////////////////////////////
        b4 = new MainBut();
        b4.MenuButt(-9, "капуста", 210,10,  p);
        b4.setSize(60,60);
        b4.setOpaque(false);
        b4.setContentAreaFilled(false);
        b4.setBorderPainted(false);
        if(!v_4)b4.img=variables.m_2;

        b4.w=variables.m_2.getWidth(null);
        b4.h=variables.m_2.getHeight(null);
        //////////////////////////////////////////////////////
        b5 = new MainBut();
        b5.MenuButt(-10, "картошка", 10,70,  p);
        b5.setSize(60,60);
        b5.setOpaque(false);
        b5.setContentAreaFilled(false);
        b5.setBorderPainted(false);
        if(!v_5)b5.img=variables.m_2;

        b5.w=variables.m_2.getWidth(null);
        b5.h=variables.m_2.getHeight(null);

        p.setLayout(null);

        f.add(p);
        Button.but_close(p,f);
    }
}
