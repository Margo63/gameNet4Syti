package game3;

import game.Button;
import game1.Instance;
import game1.Inventory;
import main.MainBut;
import main.variables;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Office {
   public static JFrame f_office = null;
   public static JPanel p_office;
   public static Image task1;
   public static Image task2;
   public static Image task3;
   public static Image task4;
   public static JButton task_1;
   public static JButton task_2;
   public static JButton task_3;
   public static JButton task_4;
   public static boolean t_1=false,t_2=true,t_3=false,t_4=false;
   public static int x1=0,x2=0,x3=0,x4=0;
   public static int kol=0;
   public static boolean check;

    public Office(){
        variables.gameLvl=-4;
        Button.but.setVisible(false);
    }

public static void of_frame(){

        check=true;

    if (f_office==null){
        f_office= new JFrame();
        f_office.setUndecorated(true);
        f_office.setBounds(variables.width/2-variables.width/6,variables.height/2-variables.height/6,variables.width/3,variables.height/3);
    }


    f_office.setVisible(true);
    p_office =new JPanel() {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(variables.fon, 0, 0, null);
             g.drawImage(variables.white_fon,0,0,variables.width/3,variables.height/3,null);

        }
    };
    p_office.setLayout(null);

        if (!t_1){

            task_1 = new JButton(){
                protected void paintComponent(Graphics g){
                    super.paintComponent(g);
                    task1= new ImageIcon("image/game3/task/task1.png").getImage();
                    if(!t_1){
                        g.drawImage(task1,0,0,null);
                    }


                }
            };

            task_1.setBounds(x1, 0, variables.task1.getWidth(null), variables.task1.getHeight(null));

            task_1.setOpaque(false);
            task_1.setContentAreaFilled(false);
            task_1.setBorderPainted(false);

            if(!t_1)task_1.setVisible(true);

            task_1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    x1=1000;
                    task_1.setVisible(false);
                    Office.t_1=true;
                    Office.p_office.repaint();
                    variables.task1=variables.null_image;
                }
            });
            p_office.add(task_1);
        }




        if (!t_2){
            task_2 = new JButton(){
                protected void paintComponent(Graphics g){
                    task2= new ImageIcon("image/game3/task/task2.png").getImage();
                    g.drawImage(variables.task2,0,0,null);

                }
            };



            task_2.setBounds(x2, 60, variables.task1.getWidth(null), variables.task1.getHeight(null));
            task_2.setOpaque(false);
            task_2.setContentAreaFilled(false);
            task_2.setBorderPainted(false);
            task_2.setVisible(true);
            task_2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    x2=1000;
                    task_2.setVisible(false);
                    Office.t_2=true;
                    Office.p_office.repaint();
                    variables.task2=variables.null_image;
                }
            });
            p_office.add(task_2);
        }



        if (!t_3){
            task_3 = new JButton(){
                protected void paintComponent(Graphics g){
                    task3= new ImageIcon("image/game3/task/task3.png").getImage();
                    g.drawImage(variables.task3,0,0,null);

                }
            };



            task_3.setBounds(x3, 120, variables.task3.getWidth(null), variables.task1.getHeight(null));
            task_3.setOpaque(false);
            task_3.setContentAreaFilled(false);
            task_3.setBorderPainted(false);
            task_3.setVisible(true);
            task_3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    variables.task3=variables.null_image;
                    x3=1000;
                    task_3.setVisible(false);
                    Office.t_3=true;
                    Office.p_office.repaint();
                }
            });
            p_office.add(task_3);
        }



    if (!t_4){
        task_4 = new JButton(){
            protected void paintComponent(Graphics g){
                task4= new ImageIcon("image/game3/task/task4.png").getImage();
                g.drawImage(variables.task4,0,0,null);

            }
        };



        task_4.setBounds(x4, 180, variables.task4.getWidth(null), variables.task4.getHeight(null));
        task_4.setOpaque(false);
        task_4.setContentAreaFilled(false);
        task_4.setBorderPainted(false);
        task_4.setVisible(true);
        task_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                variables.task4=variables.null_image;
                x4=1000;
                task_4.setVisible(false);
                Office.t_4=true;
                Office.p_office.repaint();
            }
        });
        p_office.add(task_4);
    }




    Button.but_close(p_office,f_office);
    f_office.add(p_office);
}
}
