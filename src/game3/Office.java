package game3;

import game.Button;
import game1.Inventory;
import main.MainBut;
import main.variables;

import javax.swing.*;
import java.awt.*;

public class Office {
   public static JFrame f_office;
   public static JPanel p_office;
   public static MainBut task_1;
   public static MainBut task_2;
   public static MainBut task_3;
   public static MainBut task_4;
   public static boolean t_1=false,t_2=false,t_3=false,t_4=false;
   public static int kol=0;

    public Office(){
        variables.gameLvl=-4;
        Button.but.setVisible(false);
    }

public static void of_frame(){
    if(kol<1){
        kol++;
        f_office= new JFrame();
        f_office.setUndecorated(true);
        f_office.setBounds(variables.width/2-variables.width/6,variables.height/2-variables.height/6,variables.width/3,variables.height/3);

    }
    f_office.setVisible(true);
    // f_blood.setFocusable(false);
    p_office =new JPanel() {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);


        }
    };
    p_office.setLayout(null);

   task_1=new MainBut();
   if(!t_1) task_1.MenuButt(29,"Задание 1",0,0,p_office);
    task_1.setBounds(0,0,variables.task1.getWidth(null),variables.task1.getHeight(null));
    task_1.img=variables.task1;

    task_1.w=variables.task1.getWidth(null);
    task_1.h=variables.task1.getHeight(null);

    task_2=new MainBut();
    if(!t_2) task_2.MenuButt(30,"Задание 2",0,60,p_office);
    task_2.setBounds(0,60,variables.task2.getWidth(null),variables.task2.getHeight(null));
    task_2.img=variables.task2;

    task_2.w=variables.task2.getWidth(null);
    task_2.h=variables.task2.getHeight(null);

    task_3=new MainBut();
    if(!t_3) task_3.MenuButt(31,"Задание 3",0,120,p_office);
    task_3.setBounds(0,120,variables.task3.getWidth(null),variables.task3.getHeight(null));
    task_3.img=variables.task3;

    task_3.w=variables.task3.getWidth(null);
    task_3.h=variables.task3.getHeight(null);

    task_4=new MainBut();
    if(!t_4) task_4.MenuButt(32,"Задание 4",0,180,p_office);
    task_4.setBounds(0,180,variables.task4.getWidth(null),variables.task4.getHeight(null));
    task_4.img=variables.task4;

    task_4.w=variables.task4.getWidth(null);
    task_4.h=variables.task4.getHeight(null);

    Button.but_close(p_office,f_office);
    f_office.add(p_office);
}
}
