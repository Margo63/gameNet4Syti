package game2;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import main.variables;

public class Raven {
	 public Image image;
	 public int x,y;
	 Image [] images = new Image [10];
	 Timer time;
	 int i =0;
	void animation() {
		 time= new Timer(300, new ActionListener() {
			  @Override
			  public void actionPerformed(ActionEvent e) {
				  i++;
				if (i<4) {
					x-=5;
				}
				else if(i<8) {
					x+=5;
				}
				else {
					i=0;
				}
				
				  image = images[i];
				  variables.MainPanel.repaint();
			  }
		  });
		 time.start();
	}
}
