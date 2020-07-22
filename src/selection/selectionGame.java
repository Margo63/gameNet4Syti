package selection;

import java.awt.Graphics;


import javax.swing.*;


import game.Button;
import main.MainBut;
import main.MainFrame;
import main.variables;
import game1.Panel;


public class selectionGame {
	public static MainBut but3;
	public static MainBut but6;
	public static MainBut but7;
	public static MainBut but8;
	public static MainBut but9;
	
	public int x=variables.width-variables.width, y=variables.height/2;
	public int x_1=variables.width-variables.width*3/4,
			   x_2=variables.width-variables.width*2/4,
		       x_3=variables.width-variables.width/4,
		       x_4=variables.width-150;
	
	
	public selectionGame(){
		variables.gameLvl = -1;
		new main.variables();
		variables.fon=variables.fon1;
		variables.fx=0;
		variables.fy=0;
		button();


		variables.MainPanel.repaint();
		
		MainFrame.frame.setFocusable(true);
		variables.MainPanel.setFocusable(true);
		
	
		butFalse();
	}
	void panel() {

		variables.MainPanel = new JPanel(){
			protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
		}
		};
		variables.MainPanel.repaint();
	}
	void button() {

		but3 =new MainBut();
		but3.MenuButt(5, "Очки", variables.width/2-75,  100, variables.MainPanel);
		
		but6 = new MainBut() ;
	//	JButton b = new JButton(variables.m);
		
		but6.MenuButt(6,"Мини Игра 1", x, variables.height-variables.height*2/3, variables.MainPanel);
		but6.img=variables.m;
		but6.w=variables.width/4-10;
		but6.h=variables.height/2;
		but6.setOpaque(false);
		but6.setContentAreaFilled(false);
		but6.setBorderPainted(false);

		
		
		but7 = new MainBut();
		but7.MenuButt(7,"Мини игра 2", x_1,  variables.height-variables.height*2/3, variables.MainPanel);
		
		but8 = new MainBut();
		but8.MenuButt(8,"Мини игра 3", x_2,  variables.height-variables.height*2/3, variables.MainPanel);
		
		but9 = new MainBut();
		but9.MenuButt(9,"Мини игра 4", x_3,  variables.height-variables.height*2/3, variables.MainPanel);
		
	
	
		but6.setSize(variables.width/4-10,variables.height/2);
		but7.setSize(variables.width/4-10,variables.height/2);
		but8.setSize(variables.width/4-10,variables.height/2);
		but9.setSize(variables.width/4-10,variables.height/2);
	}
	void butFalse() {
		MainFrame.but.setVisible(false);
		MainFrame.but1.setVisible(false);
		MainFrame.but2.setVisible(false);
		Button.but.setVisible(false);
		Button.but_set.setVisible(false);

	}

}
