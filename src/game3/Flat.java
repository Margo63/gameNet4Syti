package game3;

import game.Button;
import main.MainBut;
import main.variables;
import quest.Milk;

import javax.swing.*;
import java.awt.*;

public class Flat {
    //1-квартира1  2-квартира2

    public int x, y;
    public Image image;

    public MainBut but_ask;
    public static  JFrame f_ask;
    public static JPanel p_ask;
    public Flat(int x,int y,Image image) {

      this.image=image;
      this.x=x;
      this.y=y;
    }

    public void coll(int type) {
        if (Panel.player.x >= x/*-50*/ &&
                Panel.player.x <= x + image.getWidth(null)/*+50*/ &&
                Panel.player.y + Panel.player.pers.getHeight(null) / 2 >= y/*-50*/ &&
                Panel.player.y + Panel.player.pers.getHeight(null) / 2 <= y + image.getHeight(null)/*+50*/
        ) {
            frame();

            switch (type) {
                case 1:    break;
            }

            System.out.println("доктор");



        }
    }

    public void frame(){
        f_ask = new JFrame();
        f_ask.setUndecorated(true);
        f_ask.setBounds(variables.width/2-variables.width/6,variables.height/2-variables.height/6,variables.width/3,variables.height/3);
        f_ask.setVisible(true);
        p_ask = new JPanel(){
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);


                g.drawImage(variables.blood_ask,0,0,null);


                   }
        };
        p_ask.setLayout(null);
        but_ask = new MainBut();
        but_ask.MenuButt(33,"OK",100,200,p_ask);



        f_ask.add(p_ask);
    }
}