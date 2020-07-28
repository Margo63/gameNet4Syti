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

    public Office(){
        variables.gameLvl=-4;
        Button.but.setVisible(false);
    }

public static void of_frame(){
    f_office= new JFrame();
    f_office.setUndecorated(true);
    f_office.setBounds(variables.width/2-variables.width/6,variables.height/2-variables.height/6,variables.width/3,variables.height/3);
    f_office.setVisible(true);
    // f_blood.setFocusable(false);
    p_office =new JPanel() {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);


        }
    };
    p_office.setLayout(null);

   task_1=new MainBut();
   task_1.MenuButt(29,"Задание 1",0,0,p_office);

    task_2=new MainBut();
    task_2.MenuButt(30,"Задание 2",160,0,p_office);

    task_3=new MainBut();
    task_3.MenuButt(31,"Задание 3",0,60,p_office);

    task_4=new MainBut();
    task_4.MenuButt(32,"Задание 4",160,60,p_office);


    f_office.add(p_office);
}
}
