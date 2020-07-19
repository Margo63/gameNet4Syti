package game2;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import main.variables;


public class Bird {
	 public Image image;
	 public int x,y;
	 Image [] images = new Image [7];
	 Timer time;
	 int i =0;
	void animation() {
		 time= new Timer(300, new ActionListener() {
			  @Override
			  public void actionPerformed(ActionEvent e) {
				  if (i<5) {
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



/*
public Bird(Image im,int x,int y,int var,int q) {
	this.im=im;
	this.x=x;
	this.y=y;
	this.var=var;//1-дом, 2-ветеренар, 3-птичка, 4-врач,5-кот
}


public void coll_lvl2() {
	
	
if(Panel.player.x-Panel.player.directionX*5+Panel.player.pers.getWidth(null)>=x &&
		Panel.player.x-Panel.player.directionX*5<=x+im.getWidth(null) &&
		Panel.player.y+Panel.player.directionY*5<y+im.getHeight(null) &&
		Panel.player.y+Panel.player.directionY*5+Panel.player.pers.getHeight(null)>=y) {
	
	switch(var) {
	case 1: break;
	case 2: break;
	case 3:  x=10;y=10;/*new Quest2();*/ //break;
/*	case 4: break;
	case 5:
	//Quest2.b_cat= new MainBut();
//	Quest2.b_cat.MenuButt(11, "Да", 0, 0, Quest2.pq); 
	break;
	}
}

}*/