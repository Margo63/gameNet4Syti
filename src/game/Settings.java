package game;

import game3.Office;
import main.variables;

import javax.swing.*;
import java.awt.*;

public class Settings {
public static JFrame f_setting;
public static JPanel p_setting;


    public Settings(){
        f_setting= new JFrame();
        f_setting.setUndecorated(true);
        f_setting.setBounds(variables.width/2-variables.width/6,variables.height/2-variables.height/6,variables.width/3,variables.height/3);
        f_setting.setVisible(true);
        p_setting = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                switch(variables.gameLvl){
                    case 1: g.drawImage(variables.blood_ask,0,0,null); break;
                    case 3:  if(Office.t_1) g.drawImage(variables.napravlenie,0,0,75,100,null);
                             if(Office.t_2) g.drawImage(variables.napravlenie,80,0,75,100,null);
                             if(Office.t_3) g.drawImage(variables.napravlenie,160,0,75,100,null);
                             if(Office.t_4) g.drawImage(variables.napravlenie,240,0,75,100,null);

                        break;
                }

                if(variables.gameLvl>-7&&variables.gameLvl<-1){
                    if(Office.t_1) g.drawImage(variables.napravlenie,0,0,75,100,null);
                    if(Office.t_2) g.drawImage(variables.napravlenie,80,0,75,100,null);
                    if(Office.t_3) g.drawImage(variables.napravlenie,160,0,75,100,null);
                    if(Office.t_4) g.drawImage(variables.napravlenie,240,0,75,100,null);
                }
            }
        };
      f_setting.add(p_setting);
      p_setting.setLayout(null);
      Button.but_close(p_setting,f_setting);
    }
}
