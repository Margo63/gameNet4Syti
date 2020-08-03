package game3;

import game1.Panel;

import java.awt.*;

public class Street3 {
    public Image im;
    public	int x,y;
    int n;
    public static boolean street=false;


    public   Street3(Image im,int x,int y, int n){
        this.im=im;
        this.x=x;
        this.y=y;
        this.n=n;
    }
    public void st_col() {
        if(game3.Panel.player.x- game3.Panel.player.directionX*5+ game3.Panel.player.pers.getWidth(null)>=x &&
                game3.Panel.player.x- game3.Panel.player.directionX*5<=x+im.getWidth(null) &&
                game3.Panel.player.y+ game3.Panel.player.directionY*5<y+im.getHeight(null) &&
                game3.Panel.player.y+ game3.Panel.player.directionY*5+ game3.Panel.player.pers.getHeight(null)>=y )
        {
            switch(n) {
                case 1:   street=true;
                    break;
                case 2:
                    break;
            }


        }

        else {
            street = false;
        }

    }
    public void move_st() {
        x-= game3.Panel.player.directionX/3;
        y-= game3.Panel.player.directionY/3;

    }


}
