package game3;

import main.variables;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Doctor {
    public Image image;
    public int x,y;
    Image [] images = new Image [5];
    Timer time;
    int i =0;
    public boolean collisTrue2=false;
    //1-��������� �������� 2-���� ����� � �������� 3-����� 4-��������1  5-��������2
    void animation() {
        time= new Timer(300, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (i<4) {
                    i++;
                }
                else {
                    i = 0;
                }
                image = images[i];
                variables.MainPanel.repaint();
            }
        });
        time.start();
    }

    public void coll(int type){
        if(game3.Panel.player.x+game3.Panel.player.directionX*3+game3.Panel.player.pers.getWidth(null)-20>=x &&
                game3.Panel.player.x+game3.Panel.player.directionX*3-20<=x+image.getWidth(null) &&
                game3.Panel.player.y+game3.Panel.player.directionY*3<y+image.getHeight(null)-20 &&
                game3.Panel.player.y+game3.Panel.player.directionY*3+game3.Panel.player.pers.getHeight(null)>=y-20
        ){
            collisTrue2=true;
            switch(type){
                case 1:   Hospitale_Room.type=1;  Hospitale_Room.blood();  break;
                case 2:   Hospitale_Room.type=2;  Hospitale_Room.blood();  break;
                case 3:   Hospitale_Room.type=3;  Hospitale_Room.blood();  break;
                case 4:    break;
            }

            System.out.println("������");
            //Hospitale_Room.f_blood.setVisible(true);
            //Hospitale_Room.f_blood.setFocusable(false);



        }
        else{

            collisTrue2=false;


        }
      /*  if(Panel.player.x >= game3.Panel.door.x-50 &&
                Panel.player.x <= game3.Panel.door.x+game3.Panel.door.image.getWidth(null)+50 &&
                Panel.player.y+Panel.player.pers.getHeight(null)/2>=game3.Panel.door.y-50 &&
                Panel.player.y+Panel.player.pers.getHeight(null)/2<=game3.Panel.door.y+game3.Panel.door.image.getHeight(null)+50
        ){
            Hospitale_Room.type=3;
            Hospitale_Room.blood();
        }*/
    }
}
