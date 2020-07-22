package game3;

import game.Button;
import game1.Inventory;
import main.MainBut;
import main.variables;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Hospitale_Room  {
    public static JPanel p_blood;
    public static JFrame f_blood;
    public static MainBut but_doc;
    public static int type=0; //1-начальный разговор 2-сбор крови в кабинете 3-дверь
     public Hospitale_Room(){
         but();
         variables.gameLvl=-2;
         variables.MainPanel.repaint();
     }
     public static void blood(){

         f_blood= new JFrame();
         f_blood.setUndecorated(true);
         f_blood.setBounds(variables.width/2-variables.width/6,variables.height/2-variables.height/6,variables.width/3,variables.height/3);
       //  f_blood.setVisible(true);
        // f_blood.setFocusable(false);
         p_blood =new JPanel() {
             protected void paintComponent(Graphics g) {
                 super.paintComponent(g);
           switch (type){
            case 1:  g.drawImage(variables.doc_ask, 0,0, null);  break;
            case 3:  g.drawImage(variables.door_ask, 0,0, null);  break;

          }
          if(type==2&&Inventory.blood==true) g.drawImage(variables.blood_ask, 0,0, null);
          if(type==2&&Inventory.blood==false) g.drawImage(variables.blood_ask2, 0,0, null);


             }
         };
         p_blood.setLayout(null);
         but_doc = new MainBut();
         but_doc.MenuButt(19,"OK",100,200,p_blood);
         but_doc.setSize(100,100);


         f_blood.add(p_blood);
     }

    void but(){
        Button.but.setVisible(false);
    }

}
