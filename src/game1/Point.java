package game1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import main.variables;

public class Point {
public static Timer tt;
public static boolean pl;
public static int plus_x=100,plus_y=300;


  public Point(){
	  
	  if (tt != null && tt.isRunning()) return;
	  
	 tt= new Timer(10, new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
			 
			 plus_y--;
			 if(plus_y<200) {
				 pl=false;
				 plus_y=300;
			 }
			 variables.MainPanel.repaint();
		  }
	 });
	 tt.start();
}

}
