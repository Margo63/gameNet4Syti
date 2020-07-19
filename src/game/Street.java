package game;

import game1.Panel;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Street {
	public	Image im;
	public	int x,y;
	int n;
public static boolean street=false;
	 
	 
  public   Street(Image im,int x,int y, int n){
	    this.im=im;
	    this.x=x;
	    this.y=y;
	    this.n=n;
}
  public void st_col() {
	  if(Panel.player.x-Panel.player.directionX*5+Panel.player.pers.getWidth(null)>=x &&
				Panel.player.x-Panel.player.directionX*5<=x+im.getWidth(null) &&
				Panel.player.y+Panel.player.directionY*5<y+im.getHeight(null) &&
				Panel.player.y+Panel.player.directionY*5+Panel.player.pers.getHeight(null)>=y )
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
		x-=Panel.player.directionX/3;
		y-=Panel.player.directionY/3;
		
	}   
 

    
}
