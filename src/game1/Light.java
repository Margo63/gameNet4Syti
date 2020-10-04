package game1;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.Timer;

import game.Street;
import main.variables;

public class Light {

	public static Image image = new ImageIcon("image/1/s0.png").getImage();
	public static Image lights[]= new Image[4];
	public static  Timer time_light;
	int i;
	int n=1200;
	public static int xx=650, y=variables.height-variables.street.getHeight(null)-variables.gray_street.getHeight(null)*2-variables.tr.getHeight(null);
	
	Light(/*int x,int y,Image image*/) {
//		this.xx=x;
//		this.y=y;
//		this.image=image;
		
		for(int i=0;i<4;i++) {
			lights[i] = new ImageIcon("image/1/s"+i+".png").getImage();
		}
		
		 traffic_lights() ; 
		
		if (time_light != null && time_light.isRunning()) return;		 
	}
	  public void traffic_lights() {
		  
			
		  time_light = new Timer (3000,new ActionListener() {
			  public void actionPerformed (ActionEvent e) {
				  if(i<4) {
					  image=lights[i];
					  i++;
					// System.out.println(i);
					 // System.out.println(Street.street);
					  
					  if((i==3||i==4) && variables.street_boolean) {

						  new Point();
						//  variables.MainPanel.repaint();


						  Point.pl=true;
						 Container.point++;
						 // Street.street=false;
						//  variables.street_boolean=false;
						
						
						 n=30;
					  }
					  else{
					  	if(variables.street_boolean) {
					  		//System.out.println("dfhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
							new Minus();
							Container.point--;
							Minus.min = true;
						}
					  }
				  }
				
				  
				  else {
					  image=lights[0];
					  i=0;
				  }
				 variables.MainPanel.repaint(); 
			  }
		  });
		  time_light.start();
	  }

	  public void light_move(){
		  xx-=Panel.player.directionX/5;
		  y-=Panel.player.directionY/5;
	  }
}
