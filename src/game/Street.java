package game;

import game1.Container;
import game1.Minus;
import game1.Panel;
import game1.Point;
import main.variables;

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
				Panel.player.y+Panel.player.pers.getHeight(null)/6*5+Panel.player.directionY<y+im.getHeight(null) &&
				Panel.player.y+Panel.player.directionY+Panel.player.pers.getHeight(null)>=y)
		//	  Panel.player.x >= x &&
		//	  Panel.player.x <= x+im.getWidth(null) &&
		//	  Panel.player.y+ Panel.player.pers.getHeight(null)/2>=y &&
		//	  Panel.player.y+ Panel.player.pers.getHeight(null)<=y+im.getHeight(null))
	  {

		  switch(n) {

		  case 1:
		  	  variables.street_boolean=true;
			  variables.warning=false;


			//  System.out.println("not road" );
			  break;

		  case 2:
			  variables.warning=false;
			  variables.street_boolean=false;

//System.out.println("not road" );
			  break;

		  case 3:

			  variables.warning=true;
			  variables.street_boolean=false;

			  new Minus();
			  Container.point--;
			  Minus.min=true;
			//  System.out.println("road" );
			  	break;
		  }
		
		  
	  }
	  
	  else {
		  street = false;
		//  variables.warning=false;
	  }
	 
  }
  public void move_st() {


		x-=Panel.player.directionX;
		y-=Panel.player.directionY;


	}   
 

    
}
