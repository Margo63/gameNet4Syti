package game1;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

import all.collision;

import game.Button;
import main.MainBut;
import main.MainFrame;
import main.variables;
import player.Player;
import selection.selectionGame;


public class Panel {

    public static MainBut but;
	public static int x=variables.width-150;
	public static Player player;
	public Panel() {

		new variables();
		variables();
		//obj();
		but();
		Button.button();
		Button.but_setting();



	    new Light();
		new Instance(); //экземпляры объектов
		
		player =new player.Player();
		player.array = variables.playerAnim;
		player.pers = variables.player;
		player.x = 0;
		player.y = Instance.gray_street2.y;
		player.arrayD = variables.playerAnimmDown;
		player.arrayR = variables.playerAnimmRight;
		player.arrayL = variables.playerAnimmLeft;
		player.arrayU = variables.playerAnimmUp;
		new player.Player();
		
		
	
		
	}
	 
	
	void variables() {
	
	
	//	variables.sx=-150;
	//	variables.sy=-230;
	//	variables.gsx=-150;
	//	variables.gsy=-230;
		
		variables.fx=0;
		variables.fy=0;
		x=variables.width-150;
		
	
		
		
		
   /*  	variables.bird_x=150;
		variables.bird_y=400;
		variables.vet_x=700;
		variables.vet_y=300;
		variables.home_x=0;
		variables.home_y=300;*/
		
	}
	

	
	void obj(int cont ,int type,int num,JButton b) {
		b= new JButton(){
			protected void paintComponent(Graphics g){
				super.paintComponent(g);
				switch (num){
					case 1:  break;
					case 2: break;
					case 3: break;
					case 4: break;
					case 5: break;
					case 6: break;
					case 7: break;
					case 8: break;
					case 9: break;
					case 10: break;
					case 11: break;
					case 12: break;
					case 13: break;
				}
			}
		};
		if(cont==type){
			switch(num){
				case 1: b.setVisible(false); break;
			}
		}
		else{

		}
		
	}
	public static void but() {
		selectionGame.but3.setVisible(false);
		selectionGame.but7.setVisible(false);
		selectionGame.but6.setVisible(false);
		selectionGame.but8.setVisible(false);
		selectionGame.but9.setVisible(false);

		//Button.but.setVisible(true);
		//Button.but_set.setVisible(true);

	/*	but = new MainBut();
		but.MenuButt(1, "Назад", x,  0, variables.MainPanel);
		but.setVisible(true);
		
		variables.MainPanel.add(but);
		variables.MainPanel.repaint();
		//variables.MainPanel.setLayout(null);
		but.setFocusable(false);*/
		MainFrame.frame.setFocusable(true);
	}
	
	
	
}
