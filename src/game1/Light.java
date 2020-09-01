package game1;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.Timer;

import game.Street;
import main.variables;

public class Light {

	public static Image light = new ImageIcon("image/1/s0.png").getImage();
	public static Image lights[]= new Image[4];
	public static  Timer time_light;
	int i;
	int n=1200;
	public static int x=650, y=variables.height-variables.height/3-variables.height/12-light.getHeight(null)+70;;
	
	Light() {

		
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
					  light=lights[i];
					  i++;
					// System.out.println(i);
					 // System.out.println(Street.street);
					  
					  if((i==3||i==4) && variables.street_boolean) {

						  new Point();
						//  variables.MainPanel.repaint();


						  Point.pl=true;
						 Container.point++;
						  Street.street=false;
						 
						
						
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
					  light=lights[0];
					  i=0;
				  }
				 variables.MainPanel.repaint(); 
			  }
		  });
		  time_light.start();
	  }
}
