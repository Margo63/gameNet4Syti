package game1;

import java.awt.Image;

public class Home {
	public int x, y;
	public Image img;
	public boolean collisTrue = false;
	
	Home(int x, int y, Image img){
		this.x = x;
		this.y = y;
		this.img = img;
	}
	public void collision(){
		if (
				Panel.player.x+Panel.player.directionX*3>=x &&
				Panel.player.x+Panel.player.directionX*3-Panel.player.pers.getWidth(null)<=x+img.getWidth(null) &&
				Panel.player.y+Panel.player.directionY*3<y+img.getHeight(null)-Panel.player.pers.getHeight(null) &&
				Panel.player.y+Panel.player.directionY*3+Panel.player.pers.getHeight(null)/2>=y-Panel.player.pers.getHeight(null)) {
			collisTrue = true;	
		}
		else{
			collisTrue = false;
		}

	}
	public void move() {
		x-=Panel.player.directionX;
		y-=Panel.player.directionY;
	}

}
