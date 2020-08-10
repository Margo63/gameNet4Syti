package quest;

import game.Button;
import main.MainBut;
import main.variables;

import javax.swing.*;
import java.awt.*;

public class Grocery {

    public static JFrame f;
    public static JPanel p;
    public static MainBut b1;
    public static MainBut b2;
    public static MainBut b3;
    public static MainBut b4;
    public static MainBut b5;
    public static MainBut b6;
    public static MainBut b7;
    public static boolean g_1=false,g_2=false,g_3=false,g_4=false,g_5=false,g_6=false,g_7=false;
    public static int kol=0;

    public Grocery(){
      if(kol<1){
          kol++;
          f = new JFrame();
          f.setUndecorated(true);
          f.setBounds(variables.width/2-variables.width/6,variables.height/2-variables.height/6,variables.width/3,variables.height/3);

      }
        f.setVisible(true);
        p = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(variables.white_fon,  0, 0, variables.width,variables.height,   null);

            }
        };


        ///////////////////////////////////////////////////////
        b1 = new MainBut();
        b1.MenuButt(-11, "греча",10 ,10 , p);
        b1.setSize(60,60);
        b1.setOpaque(false);
        b1.setContentAreaFilled(false);
        b1.setBorderPainted(false);
        if(!g_1)b1.img=variables.plastic;

        b1.w=variables.plastic.getWidth(null);
        b1.h=variables.plastic.getHeight(null);
        ////////////////////////////////////////////////////
        b2 = new MainBut();
        b2.MenuButt(-12, "рис", 70, 10, p);
        b2.setSize(60,60);
        b2.setOpaque(false);
        b2.setContentAreaFilled(false);
        b2.setBorderPainted(false);
        if(!g_2)b2.img=variables.glass;

        b2.w=variables.glass.getWidth(null);
        b2.h=variables.glass.getHeight(null);
        /////////////////////////////////////////////////////
        b3 = new MainBut();
        b3.MenuButt(-13, " овсянка",140, 10, p);
        b3.setSize(60,60);
        b3.setOpaque(false);
        b3.setContentAreaFilled(false);
        b3.setBorderPainted(false);
        if(!g_3)b3.img=variables.org;

        b3.w=variables.org.getWidth(null);
        b3.h=variables.org.getHeight(null);
        //////////////////////////////////////////////////////
        b4 = new MainBut();
        b4.MenuButt(-14, "макароны", 210,10,  p);
        b4.setSize(60,60);
        b4.setOpaque(false);
        b4.setContentAreaFilled(false);
        b4.setBorderPainted(false);
        if(!g_4)b4.img=variables.m_2;

        b4.w=variables.m_2.getWidth(null);
        b4.h=variables.m_2.getHeight(null);
        //////////////////////////////////////////////////////
        b5 = new MainBut();
        b5.MenuButt(-15, "чай", 10,70,  p);
        b5.setSize(60,60);
        b5.setOpaque(false);
        b5.setContentAreaFilled(false);
        b5.setBorderPainted(false);
        if(!g_5)b5.img=variables.m_2;

        b5.w=variables.m_2.getWidth(null);
        b5.h=variables.m_2.getHeight(null);
        //////////////////////////////////////////////////////
        b6 = new MainBut();
        b6.MenuButt(-16, "сахар", 70,70,  p);
        b6.setSize(60,60);
        b6.setOpaque(false);
        b6.setContentAreaFilled(false);
        b6.setBorderPainted(false);
        if(!g_6)b6.img=variables.m_2;

        b6.w=variables.m_2.getWidth(null);
        b6.h=variables.m_2.getHeight(null);
        //////////////////////////////////////////////////////
        b7 = new MainBut();
        b7.MenuButt(-17, "кофе", 140,70,  p);
        b7.setSize(60,60);
        b7.setOpaque(false);
        b7.setContentAreaFilled(false);
        b7.setBorderPainted(false);
        if(!g_7)b7.img=variables.m_2;

        b7.w=variables.m_2.getWidth(null);
        b7.h=variables.m_2.getHeight(null);
        p.setLayout(null);

        f.add(p);
        Button.but_close(p,f);
    }
}
