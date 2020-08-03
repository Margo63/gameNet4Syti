package game3;

import game.Button;
import main.MainBut;
import main.variables;
import quest.*;

import javax.swing.*;
import java.awt.*;

public class Flat {
    //1-квартира1  2-квартира2
    public static int type_frame;
    public int x, y;
    public Image image;
    public int type;
    public MainBut but_ask;
    public static  JFrame f_ask;
    public static JPanel p_ask;
    public  boolean collisTrue2=false;

    public Flat(int x,int y,Image image,int type) {

      this.image=image;
      this.x=x;
      this.y=y;
      this.type=type;
    }

    public void coll() {
        if (game3.Panel.player.x+game3.Panel.player.directionX*3+game3.Panel.player.pers.getWidth(null)-20>=x &&
                game3.Panel.player.x+game3.Panel.player.directionX*3-20<=x+image.getWidth(null) &&
                game3.Panel.player.y+game3.Panel.player.directionY*3<y+image.getHeight(null)-20 &&
                game3.Panel.player.y+game3.Panel.player.directionY*3+game3.Panel.player.pers.getHeight(null)>=y-20) {

            collisTrue2=true;
            type_frame=type;
            switch (type) {
                case 1: // type_frame=1;
                if(Fruit.f_4 && Vegetables.v_5  && Bread.b_3 && Milk.mi_1 && Grocery.g_2 && Meat.me_1 ) {

                    frame();

                }

                break;

                case 2:  //type_frame=2;

                    if(Fruit.f_3 && Vegetables.v_1  && Bread.b_1 && Milk.mi_4 && Grocery.g_7 && Meat.me_3 && Candy.c_3 ) {

                        frame();

                    }

                break;
            }





        }
        else{
           collisTrue2=false;
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



               // g.drawImage(variables.blood_ask,0,0,null);//отдать продукты
                switch(type_frame){
                    case 1:  g.drawImage(variables.blood_ask,0,0,null); break;//отдать продукты
                    case 2:  g.drawImage(variables.blood_ask,0,0,null); break;
                }




                   }
        };
        p_ask.setLayout(null);
        but_ask = new MainBut();
        but_ask.MenuButt(33,"OK",100,200,p_ask);



        f_ask.add(p_ask);
    }
}