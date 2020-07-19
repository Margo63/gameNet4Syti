package game2;

import java.awt.Image;

import javax.swing.ImageIcon;

import main.MainFrame;
import main.variables;

public class Dialogue {
	public Image image= new ImageIcon("image/game2/dialog/0.png").getImage();
	Image [] images = new Image [4];
	public int x = MainFrame.frame.getWidth()/2-image.getWidth(null), 
			y= MainFrame.frame.getHeight()/2-image.getHeight(null);
	public int NUMBER;
	public int check;

	public static Boolean dialogTrue = false;

	public Dialogue(){
		for (int i=0; i<4; i++) {
			images[i] = new ImageIcon("image/game2/dialog/"+i+".png").getImage();
		}
	}
	
	public void show() {

		image = images[NUMBER];
		variables.MainPanel.repaint();
	}


}
