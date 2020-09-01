package game3;

import game1.Panel;
import main.variables;
import player.Player;

import java.awt.*;

public class Office_Room {
    public Image im;
    public int x, y;
    public boolean e_office=false;
    public boolean collisTrue2=false;
    public void Stand(int x,int y,Image im,boolean e_office){
       this.x=x;
       this.y=y;
       this.im=im;
       this.e_office=e_office;
}
public void coll(){
    if(game3.Panel.player.x- game3.Panel.player.directionX*5+ game3.Panel.player.pers.getWidth(null)>=x &&
            game3.Panel.player.x- game3.Panel.player.directionX*5<=x+im.getWidth(null) &&
            game3.Panel.player.y+ game3.Panel.player.directionY*5<y+im.getHeight(null) &&
            game3.Panel.player.y+ game3.Panel.player.directionY*5+ game3.Panel.player.pers.getHeight(null)>=y){

        collisTrue2=true;
        e_office=true;
        if(Player.ee){
            Office.of_frame();
            Player.ee=false;
        }


    }
    else{
        e_office=false;
        collisTrue2=false;
    }
}
    public void move() {
        x-=game3.Panel.player.directionX;
        y-=game3.Panel.player.directionY;
    }
}
