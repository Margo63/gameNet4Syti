package game3;

import game1.Container;
import game1.Minus;
import game1.Panel;
import main.variables;

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
        if( //game3.Panel.player.x- game3.Panel.player.directionX*5+ game3.Panel.player.pers.getWidth(null)>=x &&
            //    game3.Panel.player.x- game3.Panel.player.directionX*5<=x+im.getWidth(null) &&
            //    game3.Panel.player.y+ game3.Panel.player.directionY*5<y+im.getHeight(null) &&
            //    game3.Panel.player.y+ game3.Panel.player.directionY*5+ game3.Panel.player.pers.getHeight(null)>=y

                game3.Panel.player.x >= x &&
                game3.Panel.player.x <= x+im.getWidth(null) &&
                game3.Panel.player.y+ game3.Panel.player.pers.getHeight(null)/2>=y &&
                game3.Panel.player.y+game3.Panel.player.pers.getHeight(null)/2<=y+im.getHeight(null))
        {
            switch(n) {
                case 1:
                    variables.street_boolean=true;
                    System.out.println("street="+street);

                    variables.warning=false;

                    break;

                case 2:
                    variables.warning=false;
                    variables.street_boolean=false;


                    break;

                case 3:
                    variables.warning=true;
                    variables.street_boolean=false;
                    new Minus();
                    Container.point--;
                    Minus.min=true;

                    break;
            }


        }

        else {
            street = false;
        }

    }
    public void move_st() {
        x-= game3.Panel.player.directionX;
        y-= game3.Panel.player.directionY;

    }


}
