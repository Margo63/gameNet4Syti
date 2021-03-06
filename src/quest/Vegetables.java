package quest;

import game.Button;
import game3.Office;
import main.MainBut;
import main.variables;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vegetables {
    public static JFrame f=null;
    public static JPanel p;
    public static JButton b1;
    public static JButton b2;
    public static JButton b3;
    public static JButton b4;
    public static JButton b5;
    public static boolean v_1=false,v_2=false,v_3=false,v_4=false,v_5=false;
    public int x1=10,x2=70,x3=140,x4=210,x5=10;
    public static int kol=0;
    public static Image v1,v2,v3,v4,v5;

    public Vegetables(){

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


        ///////////////////////////////////////////////////////
        if (!v_1){

            b1 = new JButton(){
                protected void paintComponent(Graphics g){
                    super.paintComponent(g);
                    v1= new ImageIcon("image/game3/task/task1.png").getImage();//помидоры
                    if(!v_1){
                        g.drawImage(v1,0,0,null);
                    }


                }
            };

            b1.setBounds(x1, 10, 60, 60);

            b1.setOpaque(false);
            b1.setContentAreaFilled(false);
            b1.setBorderPainted(false);

            if(!v_1)b1.setVisible(true);

            b1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    x1=1000;
                    b1.setVisible(false);
                    v_1=true;
                    p.repaint();
                   // variables.task1=variables.null_image;
                }
            });
            p.add(b1);
        }


        if (!v_2){

            b2 = new JButton(){
                protected void paintComponent(Graphics g){
                    super.paintComponent(g);
                    v2= new ImageIcon("image/game3/task/task1.png").getImage();//огурцы
                    if(!v_2){
                        g.drawImage(v2,0,0,null);
                    }


                }
            };

            b2.setBounds(x2, 10, 60, 60);

            b2.setOpaque(false);
            b2.setContentAreaFilled(false);
            b2.setBorderPainted(false);

            if(!v_2)b2.setVisible(true);

            b2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    x2=1000;
                    b2.setVisible(false);
                    v_2=true;
                    p.repaint();
                    // variables.task1=variables.null_image;
                }
            });
            p.add(b2);
        }
        if (!v_3){

            b3 = new JButton(){
                protected void paintComponent(Graphics g){
                    super.paintComponent(g);
                    v3= new ImageIcon("image/game3/task/task1.png").getImage();//морковь
                    if(!v_3){
                        g.drawImage(v3,0,0,null);
                    }


                }
            };

            b3.setBounds(x3, 10, 60, 60);

            b3.setOpaque(false);
            b3.setContentAreaFilled(false);
            b3.setBorderPainted(false);

            if(!v_3)b3.setVisible(true);

            b3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    x3=1000;
                    b3.setVisible(false);
                    v_3=true;
                    p.repaint();
                    // variables.task1=variables.null_image;
                }
            });
            p.add(b3);
        }
        if (!v_4){

            b4 = new JButton(){
                protected void paintComponent(Graphics g){
                    super.paintComponent(g);
                    v4= new ImageIcon("image/q.jpg").getImage();//капуста
                    if(!v_4){
                        g.drawImage(v4,0,0,null);
                    }


                }
            };

            b4.setBounds(x4, 10, 60, 60);

            b4.setOpaque(false);
            b4.setContentAreaFilled(false);
            b4.setBorderPainted(false);

            if(!v_4)b4.setVisible(true);

            b4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    x4=1000;
                    b4.setVisible(false);
                    v_4=true;
                    p.repaint();
                    // variables.task1=variables.null_image;
                }
            });
            p.add(b4);
        }
        if (!v_5){

            b5 = new JButton(){
                protected void paintComponent(Graphics g){
                    super.paintComponent(g);
                    v5= new ImageIcon("image/q.jpg").getImage();//картошка
                    if(!v_5){
                        g.drawImage(v5,0,0,null);
                    }


                }
            };

            b5.setBounds(x5, 70, 60, 60);

            b5.setOpaque(false);
            b5.setContentAreaFilled(false);
            b5.setBorderPainted(false);

            if(!v_5)b5.setVisible(true);

            b5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    x5=1000;
                    b5.setVisible(false);
                    v_5=true;
                    p.repaint();
                }
            });
            p.add(b5);
        }

    /*    b1 = new MainBut();
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
*/
        p.setLayout(null);

        f.add(p);
        Button.but_close(p,f);
    }
}
