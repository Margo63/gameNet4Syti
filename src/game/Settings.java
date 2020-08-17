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
        f_setting.setBounds(variables.width/2-variables.width/6,variables.height/2-variables.height/6,variables.width/3+50,variables.height/3);
        f_setting.setVisible(true);
        p_setting = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                switch(variables.gameLvl){
                    case 1: g.drawImage(variables.info1,0,0,variables.width/3,variables.height/3,null); break;
                    case 2: g.drawImage(variables.info2,0,0,variables.width/3,variables.height/3,null); break;
                    case 3: g.drawImage(variables.info3,0,0,variables.width/3,variables.height/3,null);
                             if(Office.t_1) g.drawImage(variables.ttask1,0,30,variables.width/3,variables.height/3/14,null);
                             if(Office.t_2) g.drawImage(variables.ttask2,0,60,variables.width/3,variables.height/3 /6,null);
                             if(Office.t_3) g.drawImage(variables.ttask3,0,120,variables.width/3,variables.height/3 /6,null);
                             if(Office.t_4) g.drawImage(variables.ttask4,0,180,variables.width/3,variables.height/3/14,null);

                        break;
                    case 4: g.drawImage(variables.info4,0,0,variables.width/3,variables.height/3,null); break;
                }

                if(variables.gameLvl>-7&&variables.gameLvl<-1){
                    if(Office.t_1) g.drawImage(variables.ttask1,0,30, variables.width/3,variables.height/3/14  ,null);
                    if(Office.t_2) g.drawImage(variables.ttask2,0,60, variables.width/3,variables.height/3 /6 ,null);
                    if(Office.t_3) g.drawImage(variables.ttask3,0,120,variables.width/3,variables.height/3/6  ,null);
                    if(Office.t_4) g.drawImage(variables.ttask4,0,180,variables.width/3,variables.height/3 /14,null);
                }
            }
        };
      f_setting.add(p_setting);
      p_setting.setLayout(null);
      Button.but_close(p_setting,f_setting);
    }
}
