package quest;

import game.Button;
import main.MainBut;
import main.variables;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grocery {

    public static JFrame f=null;
    public static JPanel p;
    public static JButton b1;
    public static JButton b2;
    public static JButton b3;
    public static JButton b4;
    public static JButton b5;
    public static JButton b6;
    public static JButton b7;
    public static boolean g_1=false,g_2=false,g_3=false,g_4=false,g_5=false,g_6=false,g_7=false;
    public  Image g1,g2,g3,g4,g5,g6,g7;
    public static int x1=10,x2=70,x3=140,x4=210,x5=10,x6=70,x7=140;

    public Grocery(){
      if(f==null){

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
        }; if (!g_1){

            b1 = new JButton(){
                protected void paintComponent(Graphics g){
                    super.paintComponent(g);
                    g1= new ImageIcon("image/game3/task/task1.png").getImage();
                    if(!g_1){
                        g.drawImage(g1,0,0,null);
                    }


                }
            };

            b1.setBounds(x1, 10, 60, 60);

            b1.setOpaque(false);
            b1.setContentAreaFilled(false);
            b1.setBorderPainted(false);

            if(!g_1)b1.setVisible(true);

            b1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    x1=1000;
                    b1.setVisible(false);
                    g_1=true;
                    p.repaint();
                    // variables.task1=variables.null_image;
                }
            });
            p.add(b1);
        }


        if (!g_2){

            b2 = new JButton(){
                protected void paintComponent(Graphics g){
                    super.paintComponent(g);
                    g2= new ImageIcon("image/game3/task/task1.png").getImage();
                    if(!g_2){
                        g.drawImage(g2,0,0,null);
                    }


                }
            };

            b2.setBounds(x2, 10, 60, 60);

            b2.setOpaque(false);
            b2.setContentAreaFilled(false);
            b2.setBorderPainted(false);

            if(!g_2)b2.setVisible(true);

            b2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    x2=1000;
                    b2.setVisible(false);
                    g_2=true;
                    p.repaint();
                    // variables.task1=variables.null_image;
                }
            });
            p.add(b2);
        }
        if (!g_3){

            b3 = new JButton(){
                protected void paintComponent(Graphics g){
                    super.paintComponent(g);
                    g3= new ImageIcon("image/game3/task/task1.png").getImage();
                    if(!g_3){
                        g.drawImage(g3,0,0,null);
                    }


                }
            };

            b3.setBounds(x3, 10, 60, 60);

            b3.setOpaque(false);
            b3.setContentAreaFilled(false);
            b3.setBorderPainted(false);

            if(!g_3)b3.setVisible(true);

            b3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    x3=1000;
                    b3.setVisible(false);
                    g_3=true;
                    p.repaint();
                    // variables.task1=variables.null_image;
                }
            });
            p.add(b3);
        }
        if (!g_4){

            b4 = new JButton(){
                protected void paintComponent(Graphics g){
                    super.paintComponent(g);
                    g4= new ImageIcon("image/q.jpg").getImage();
                    if(!g_4){
                        g.drawImage(g4,0,0,null);
                    }


                }
            };

            b4.setBounds(x4, 10, 60, 60);

            b4.setOpaque(false);
            b4.setContentAreaFilled(false);
            b4.setBorderPainted(false);

            if(!g_4)b4.setVisible(true);

            b4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    x4=1000;
                    b4.setVisible(false);
                    g_4=true;
                    p.repaint();
                    // variables.task1=variables.null_image;
                }
            });
            p.add(b4);
        }
        if (!g_5){

            b5 = new JButton(){
                protected void paintComponent(Graphics g){
                    super.paintComponent(g);
                    g5= new ImageIcon("image/q.jpg").getImage();
                    if(!g_5){
                        g.drawImage(g5,0,0,null);
                    }


                }
            };

            b5.setBounds(x5, 70, 60, 60);

            b5.setOpaque(false);
            b5.setContentAreaFilled(false);
            b5.setBorderPainted(false);

            if(!g_5)b5.setVisible(true);

            b5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    x5=1000;
                    b5.setVisible(false);
                    g_5=true;
                    p.repaint();
                }
            });
            p.add(b5);
        }
        if (!g_6){

            b6 = new JButton(){
                protected void paintComponent(Graphics g){
                    super.paintComponent(g);
                    g6= new ImageIcon("image/q.jpg").getImage();
                    if(!g_6){
                        g.drawImage(g6,0,0,null);
                    }


                }
            };

            b6.setBounds(x6, 70, 60, 60);

            b6.setOpaque(false);
            b6.setContentAreaFilled(false);
            b6.setBorderPainted(false);

            if(!g_6)b6.setVisible(true);

            b6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    x6=1000;
                    b6.setVisible(false);
                    g_6=true;
                    p.repaint();
                    // variables.task1=variables.null_image;
                }
            });
            p.add(b6);
        }
        if (!g_7){

            b7 = new JButton(){
                protected void paintComponent(Graphics g){
                    super.paintComponent(g);
                    g7= new ImageIcon("image/q.jpg").getImage();
                    if(!g_7){
                        g.drawImage(g7,0,0,null);
                    }


                }
            };

            b7.setBounds(x7, 70, 60, 60);

            b7.setOpaque(false);
            b7.setContentAreaFilled(false);
            b7.setBorderPainted(false);

            if(!g_7)b7.setVisible(true);

            b7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    x7=1000;
                    b7.setVisible(false);
                    g_7=true;
                    p.repaint();
                }
            });
            p.add(b7);
        }

/*
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

 */
        p.setLayout(null);

        f.add(p);
        Button.but_close(p,f);
    }
}
