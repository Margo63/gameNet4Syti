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
				Panel.player.x+Panel.player.directionX*3+Panel.player.pers.getWidth(null)-20>=x &&
				Panel.player.x+Panel.player.directionX*3-20<=x+img.getWidth(null) &&
				Panel.player.y+Panel.player.directionY*3<y+img.getHeight(null)-20 &&
				Panel.player.y+Panel.player.directionY*3+Panel.player.pers.getHeight(null)>=y-20) {
			collisTrue = true;	
		}
		else{
			collisTrue = false;
		}

	}
	public void move() {
		x-=Panel.player.directionX/3;
		y-=Panel.player.directionY/3;
	}

}
