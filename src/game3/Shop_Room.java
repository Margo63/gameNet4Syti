package game3;

import quest.Fruit;

import java.awt.*;

public class Shop_Room {
    public  int x,y,type; //1-бакалея 2-молоко 3-хлеб 4-мясо 5-яйцо 6-овощи 7-фрукты
    public Image im;

    Shop_Room(int x,int y,Image im,int type){
        this.x=x;
        this.y=y;
        this.type=type;
        this.im=im;


    }
  public void  coll(){
        if(game3.Panel.player.x+game3.Panel.player.directionX*3+game3.Panel.player.pers.getWidth(null)-20>=x &&
                game3.Panel.player.x+game3.Panel.player.directionX*3-20<=x+im.getWidth(null) &&
                game3.Panel.player.y+game3.Panel.player.directionY*3<y+im.getHeight(null)-20 &&
                game3.Panel.player.y+game3.Panel.player.directionY*3+game3.Panel.player.pers.getHeight(null)>=y-20){
            switch(type){
                case 1:  break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 6: break;
                case 7: new Fruit();  break;

            }
        }
    }


}
