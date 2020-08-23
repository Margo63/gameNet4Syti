package quest;

import game.Button;
import main.MainBut;
import main.variables;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Milk {

    public static JFrame f=null;
    public static JPanel p;
    public static JButton b1;
    public static JButton b2;
    public static JButton b3;
    public static JButton b4;
    public static boolean mi_1=false,mi_2=false,mi_3=false,mi_4=false;
    public  Image mi1,mi2,mi3,mi4;
    public static int x1=10,x2=70,x3=140,x4=210;

    public Milk(){
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
        };

        if (!mi_1){

            b1 = new JButton(){
                protected void paintComponent(Graphics g){
                    super.paintComponent(g);
                    mi1= new ImageIcon("image/game3/task/task1.png").getImage();//сметана
                    if(!mi_1){
                        g.drawImage(mi1,0,0,null);
                    }


                }
            };

            b1.setBounds(x1, 10, 60, 60);

            b1.setOpaque(false);
            b1.setContentAreaFilled(false);
            b1.setBorderPainted(false);

            if(!mi_1)b1.setVisible(true);

            b1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    x1=1000;
                    b1.setVisible(false);
                    mi_1=true;
                    p.repaint();
                    // variables.task1=variables.null_image;
                }
            });
            p.add(b1);
        }


        if (!mi_2){

            b2 = new JButton(){
                protected void paintComponent(Graphics g){
                    super.paintComponent(g);
                    mi2= new ImageIcon("image/game3/task/task1.png").getImage();//йогурт
                    if(!mi_2){
                        g.drawImage(mi2,0,0,null);
                    }


                }
            };

            b2.setBounds(x2, 10, 60, 60);

            b2.setOpaque(false);
            b2.setContentAreaFilled(false);
            b2.setBorderPainted(false);

            if(!mi_2)b2.setVisible(true);

            b2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    x2=1000;
                    b2.setVisible(false);
                    mi_2=true;
                    p.repaint();
                    // variables.task1=variables.null_image;
                }
            });
            p.add(b2);
        }
        if (!mi_3){

            b3 = new JButton(){
                protected void paintComponent(Graphics g){
                    super.paintComponent(g);
                    mi3= new ImageIcon("image/game3/task/task1.png").getImage();//молоко
                    if(!mi_3){
                        g.drawImage(mi3,0,0,null);
                    }


                }
            };

            b3.setBounds(x3, 10, 60, 60);

            b3.setOpaque(false);
            b3.setContentAreaFilled(false);
            b3.setBorderPainted(false);

            if(!mi_3)b3.setVisible(true);

            b3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    x3=1000;
                    b3.setVisible(false);
                    mi_3=true;
                    p.repaint();
                    // variables.task1=variables.null_image;
                }
            });
            p.add(b3);
        }
        if (!mi_4){

            b4 = new JButton(){
                protected void paintComponent(Graphics g){
                    super.paintComponent(g);
                    mi4= new ImageIcon("image/q.jpg").getImage();//творог
                    if(!mi_4){
                        g.drawImage(mi4,0,0,null);
                    }


                }
            };

            b4.setBounds(x4, 10, 60, 60);

            b4.setOpaque(false);
            b4.setContentAreaFilled(false);
            b4.setBorderPainted(false);

            if(!mi_4)b4.setVisible(true);

            b4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    x4=1000;
                    b4.setVisible(false);
                    mi_4=true;
                    p.repaint();
                    // variables.task1=variables.null_image;
                }
            });
            p.add(b4);
        }

/*
        ///////////////////////////////////////////////////////
        b1 = new MainBut();
        b1.MenuButt(-18, "сметана",10 ,10 , p);
        b1.setSize(60,60);
        b1.setOpaque(false);
        b1.setContentAreaFilled(false);
        b1.setBorderPainted(false);
        if(!mi_1)b1.img=variables.plastic;

        b1.w=variables.plastic.getWidth(null);
        b1.h=variables.plastic.getHeight(null);
        ////////////////////////////////////////////////////
        b2 = new MainBut();
        b2.MenuButt(-19, "йогурт", 70, 10, p);
        b2.setSize(60,60);
        b2.setOpaque(false);
        b2.setContentAreaFilled(false);
        b2.setBorderPainted(false);
        if(!mi_2)b2.img=variables.glass;

        b2.w=variables.glass.getWidth(null);
        b2.h=variables.glass.getHeight(null);
        /////////////////////////////////////////////////////
        b3 = new MainBut();
        b3.MenuButt(-20, " молоко",140, 10, p);
        b3.setSize(60,60);
        b3.setOpaque(false);
        b3.setContentAreaFilled(false);
        b3.setBorderPainted(false);
        if(!mi_3)b3.img=variables.org;

        b3.w=variables.org.getWidth(null);
        b3.h=variables.org.getHeight(null);
        //////////////////////////////////////////////////////
        b4 = new MainBut();
        b4.MenuButt(-21, "творог", 210,10,  p);
        b4.setSize(60,60);
        b4.setOpaque(false);
        b4.setContentAreaFilled(false);
        b4.setBorderPainted(false);
        if(!mi_4)b4.img=variables.m_2;

        b4.w=variables.m_2.getWidth(null);
        b4.h=variables.m_2.getHeight(null);
        //////////////////////////////////////////////////////
*/

        p.setLayout(null);

        f.add(p);
        Button.but_close(p,f);
    }
}
