package quest;

import game.Button;
import main.MainBut;
import main.variables;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Meat {

    public static JFrame f=null;
    public static JPanel p;
    public static JButton b1;
    public static JButton b2;
    public static JButton b3;
    public static boolean me_1=false,me_2=false,me_3=false;
    public  Image me1,me2,me3;
    public static int x1=10,x2=70,x3=140;

    public Meat(){

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
        if (!me_1){

            b1 = new JButton(){
                protected void paintComponent(Graphics g){
                    super.paintComponent(g);
                    me1= new ImageIcon("image/game3/task/task1.png").getImage();//кура
                    if(!me_1){
                        g.drawImage(me1,0,0,null);
                    }


                }
            };

            b1.setBounds(x1, 10, 60, 60);

            b1.setOpaque(false);
            b1.setContentAreaFilled(false);
            b1.setBorderPainted(false);

            if(!me_1)b1.setVisible(true);

            b1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    x1=1000;
                    b1.setVisible(false);
                    me_1=true;
                    p.repaint();
                    // variables.task1=variables.null_image;
                }
            });
            p.add(b1);
        }


        if (!me_2){

            b2 = new JButton(){
                protected void paintComponent(Graphics g){
                    super.paintComponent(g);
                    me2= new ImageIcon("image/game3/task/task1.png").getImage();//сосиски
                    if(!me_2){
                        g.drawImage(me2,0,0,null);
                    }


                }
            };

            b2.setBounds(x2, 10, 60, 60);

            b2.setOpaque(false);
            b2.setContentAreaFilled(false);
            b2.setBorderPainted(false);

            if(!me_2)b2.setVisible(true);

            b2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    x2=1000;
                    b2.setVisible(false);
                    me_2=true;
                    p.repaint();
                    // variables.task1=variables.null_image;
                }
            });
            p.add(b2);
        }
        if (!me_3){

            b3 = new JButton(){
                protected void paintComponent(Graphics g){
                    super.paintComponent(g);
                    me3= new ImageIcon("image/game3/task/task1.png").getImage();//колбасы
                    if(!me_3){
                        g.drawImage(me3,0,0,null);
                    }


                }
            };

            b3.setBounds(x3, 10, 60, 60);

            b3.setOpaque(false);
            b3.setContentAreaFilled(false);
            b3.setBorderPainted(false);

            if(!me_3)b3.setVisible(true);

            b3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    x3=1000;
                    b3.setVisible(false);
                    me_3=true;
                    p.repaint();
                    // variables.task1=variables.null_image;
                }
            });
            p.add(b3);
        }
/*
        ///////////////////////////////////////////////////////
        b1 = new MainBut();
        if(!me_1)b1.MenuButt(-25, "кура",10 ,10 , p);
        b1.setSize(60,60);
        b1.setOpaque(false);
        b1.setContentAreaFilled(false);
        b1.setBorderPainted(false);
        b1.img=variables.plastic;

        b1.w=variables.plastic.getWidth(null);
        b1.h=variables.plastic.getHeight(null);
        ////////////////////////////////////////////////////
        b2 = new MainBut();
        b2.MenuButt(-26, "сосиски", 70, 10, p);
        b2.setSize(60,60);
        b2.setOpaque(false);
        b2.setContentAreaFilled(false);
        b2.setBorderPainted(false);
        if(!me_2)b2.img=variables.glass;

        b2.w=variables.glass.getWidth(null);
        b2.h=variables.glass.getHeight(null);
        /////////////////////////////////////////////////////
        b3 = new MainBut();
        b3.MenuButt(-27, " колбасы",140, 10, p);
        b3.setSize(60,60);
        b3.setOpaque(false);
        b3.setContentAreaFilled(false);
        b3.setBorderPainted(false);
        if(!me_3)b3.img=variables.org;

        b3.w=variables.org.getWidth(null);
        b3.h=variables.org.getHeight(null);
        //////////////////////////////////////////////////////
*/

        p.setLayout(null);

        f.add(p);
        Button.but_close(p,f);
    }
}
