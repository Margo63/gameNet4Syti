package game2;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import main.variables;

public class Cat {
	 public Image image;
	 public int x,y;
	 Image [] images = new Image [7];
	 Timer time;
	 int i =0;
	void animation() {
		 time= new Timer(300, new ActionListener() {
			  @Override
			  public void actionPerformed(ActionEvent e) {
				  if (i<6) {
					i++;
				  }
				  else {
					  i = 0;
				  }
				  image = images[i];
				  variables.MainPanel.repaint();
			  }
		  });
		 time.start();
	}

}
