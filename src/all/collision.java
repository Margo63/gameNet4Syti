package all;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

import main.variables;
import player.Player;



public class collision {
Timer timer;
public static boolean move=true;
 Image image; 
 Image image_s;
public  int x;
public int y;

 public  collision(Image image){
	this.image=image;
	
}

public void right() {
	
//	if(variables.gameLvl==2) {
	if(variables.x +variables.player.getWidth(null)>=x &&
			variables.x <= x+ image.getWidth(null)	&&
			variables.y >= y - image.getHeight(null) &&
			variables.y <= y +image.getHeight(null)) {
		move=false;	
		//System.out.println("stop");
		//System.out.println(x);
		//System.out.println(variables.x);
	}
	else {
		move=true; 

	}
	}
	
//}

	
public void street(Image image_s){ 
	this.image_s=image_s;
	}
	

}
