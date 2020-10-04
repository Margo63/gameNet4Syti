package game3;

import game1.Panel;
import main.variables;
import player.Player;
import quest.Lvl3_Frame;

import java.awt.Image;

import javax.swing.JPanel;

public class House {
public int x,y,house;//house-переменная типов домов; 0-обычный дом 1-больница 2-коордиационный центр волонтеров 3-магазин
public Image image;
public boolean collisTrue2=false;
   public static int w_h=0;//what house для определения типа дома при столкновении;
	public  boolean e_house=false;

	House(int x,int y,Image image,int house,boolean e_house){
		this.e_house=e_house;
		this.x=x;
		this.y=y;
		this.house=house;
		this.image=image;
	}
	 public void coll() {
		if (game3.Panel.player.x+game3.Panel.player.directionX*3>=x &&
				game3.Panel.player.x+game3.Panel.player.directionX*3-game3.Panel.player.pers.getWidth(null)<=x+image.getWidth(null) &&
				game3.Panel.player.y+game3.Panel.player.directionY*3<y+image.getHeight(null)-game3.Panel.player.pers.getHeight(null) &&
				game3.Panel.player.y+game3.Panel.player.directionY*3+game3.Panel.player.pers.getHeight(null)/2>=y-game3.Panel.player.pers.getHeight(null)){

			e_house=true;
            collisTrue2=true;



			if(Player.ee){
				new Lvl3_Frame();
				switch(house){
					case 0: System.out.println("house"); w_h=0; break;
					case 1: System.out.println("hospitale");w_h=1; break;
					case 2: System.out.println("office"); w_h=2;break;
					case 3: System.out.println("shop");w_h=3; break;
				}
			}




		}
		else{
			collisTrue2=false;
			e_house=false;
		}
		 
	 }
	public void move() {
		x-=game3.Panel.player.directionX;
		y-=game3.Panel.player.directionY;
	}
}
