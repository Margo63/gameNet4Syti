package game3;

import game1.Panel;

import java.awt.*;

public class Office_Room {
    public Image im;
    public int x, y;
    public void Stand(int x,int y,Image im){
this.x=x;
this.y=y;
this.im=im;
}
public void coll(){
    if(game3.Panel.player.x- game3.Panel.player.directionX*5+ game3.Panel.player.pers.getWidth(null)>=x &&
            game3.Panel.player.x- game3.Panel.player.directionX*5<=x+im.getWidth(null) &&
            game3.Panel.player.y+ game3.Panel.player.directionY*5<y+im.getHeight(null) &&
            game3.Panel.player.y+ game3.Panel.player.directionY*5+ game3.Panel.player.pers.getHeight(null)>=y){
System.out.println("столкнулся");
 Office.of_frame();
    }
}
}
