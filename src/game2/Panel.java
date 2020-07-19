package game2;

import javax.swing.ImageIcon;

import game.Button;
import main.MainFrame;
import main.variables;
import player.Player;
import selection.selectionGame;

public class Panel {
	public static Bird bird;
	public static Player player;
	public static Cat cat;
	public static Owl owl;
	public static Raven raven;
	
	
	public Panel() {
		
		player =new player.Player();
		player.array = variables.playerAnim;
		player.pers = variables.player;
		player.x = 0;
		player.y = 400;
		player.arrayD = variables.playerAnimmDown;
		player.arrayR = variables.playerAnimmRight;
		player.arrayL = variables.playerAnimmLeft;
		player.arrayU = variables.playerAnimmUp;
		new player.Player();
		
		owl = new Owl();
		owl.x = MainFrame.frame.getWidth() - 250;
		owl.y = 300;
		
		bird();
		but();
		cat();
		raven();
	}
	void bird(){
	
		bird = new Bird();
		for (int i = 0; i<6; i++) {
			bird.images[i] = 
					new ImageIcon("image/game2/bird"+i+".png").getImage();
		}
		bird.x = 300;
		bird.y = 420;
		bird.image = bird.images[0];
		bird.animation();
		
	}
	void cat() {
		cat = new Cat();
		for (int i = 0; i<7; i++) {
			cat.images[i] = 
					new ImageIcon("image/game2/cat"+i+".png").getImage();
		}
		cat.x = 350;
		cat.y = 400;
		cat.image = cat.images[0];
		cat.animation();
	}
	
	void raven() {
		raven = new Raven();
		for (int i = 0; i<10; i++) {
			raven.images[i] = 
					new ImageIcon("image/game2/bird_attach"+i+".png").getImage();
		}
		raven.x = MainFrame.frame.getWidth() - 250;
		raven.y = 100;
		raven.image = raven.images[0];
		raven.animation();
	}
	
	void but() {
		selectionGame.but3.setVisible(false);
		selectionGame.but7.setVisible(false);
		selectionGame.but6.setVisible(false);
		selectionGame.but8.setVisible(false);
		selectionGame.but9.setVisible(false);

		Button.button();

	
		variables.MainPanel.repaint();
		variables.MainPanel.setLayout(null);

		MainFrame.frame.setFocusable(true);
	}

}
