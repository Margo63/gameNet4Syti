package make_out;

import java.awt.Graphics;


import javax.swing.JPanel;

import all.collision;
//import enemy.Knights;
import main.MainBut;
import main.MainFrame;
import main.variables;
import player.Player;
//import selection.Lvl1;
import selection.selectionGame;

public class Fmini3 {
	public static collision red;
	public static collision green;
	public static collision blue;
	public static collision gray;
	public static collision orange;
public static MainBut but;
	public static int x;
	
	public Fmini3() {
	//	variables.sx=-150;
	//	variables.sy=-230;
	//	variables.gsx=-150;
	//	variables.gsy=-230;
		
		x=variables.width-150;
		
		//variables.fon=variables.gray_street;
			
			red=new collision(variables.red);
			red.x=350;
			red.y=-320;
		
			green=new collision(variables.green);
			green.x=720;
			green.y=70;
			
			blue=new collision(variables.blue);
			blue.x=650;
			blue.y=-420;
			
			gray=new collision(variables.hospital);
			gray.x=970;
			gray.y=270;
			
			orange=new collision(variables.office);
			orange.x=7;
			orange.y=-95;
			
			selectionGame.but3.setVisible(false);
			selectionGame.but7.setVisible(false);
			selectionGame.but6.setVisible(false);
			selectionGame.but8.setVisible(false);
			selectionGame.but9.setVisible(false);

			but = new MainBut();
			but.MenuButt(10, "Назад", x,  0, variables.MainPanel);
		variables.MainPanel = new JPanel(){ //рисуем на панели, которая объявлена в variables
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
			
				
			
				
			
				if (variables.gameLvl == 4) {
					
				/*	g.drawImage(variables.gray_street, variables.gsx, variables.gsy, variables.gray_street.getWidth(null)*3/2, variables.gray_street.getHeight(null)*3/2, null);
					g.drawImage(variables.street,      variables.sx,  variables.sy,  variables.street.getWidth(null)*3/2,      variables.street.getHeight(null)*3/2,      null);
					

					g.drawImage(variables.green,  green.x,  green.y,    variables.green.getWidth(null)*3/2,  variables.green.getHeight(null)*3/2,  null);
					g.drawImage(variables.blue,   blue.x,   blue.y,     variables.blue.getWidth(null)*3/2,   variables.blue.getHeight(null)*3/2,   null);
					
					g.drawImage(variables.hospital,   gray.x,   gray.y,     variables.blue.getWidth(null)*3/2,   variables.gray.getHeight(null)*3/2,   null);
					
					g.drawImage(variables.red,    red.x,    red.y,      variables.red.getWidth(null)*3/2,    variables.red.getHeight(null)*3/2,    null);
					
					g.drawImage(variables.office, orange.x, orange.y,   variables.blue.getWidth(null)*3/2, variables.orange.getHeight(null)*3/2, null);
					
					g.drawImage(variables.player, variables.x, variables.y,  null);
					*/
				}
				
			}
		};
		//Lvl1.but.setVisible(true);
		but.setVisible(true);
		variables.MainPanel.add(but);
		
		variables.MainPanel.repaint();
		
		variables.MainPanel.setLayout(null);
		
		
		
		
		
		main.MainFrame.frame.add(variables.MainPanel);
		Player player =new player.Player();
		
		MainFrame.frame.setFocusable(true);
		
		but.setFocusable(false);
		//new Knights();
	
		new player.Player();
	}
}
