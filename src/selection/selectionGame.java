package selection;

import java.awt.Graphics;


import javax.swing.*;


import game.Button;
import game4.Choice;
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
	
	public int x=variables.width-1350, y=variables.height/2;
	public int x_1=variables.width-1030,
			   x_2=variables.width-710,
		       x_3=variables.width-390,
		       x_4=variables.width-150;
	
	
	public selectionGame(){
		if (variables.gameLvl == 1){
			Panel.player.time.stop();
		}
		if (variables.gameLvl == 3){
			game3.Panel.player.time.stop();
		}
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
		but3.img=variables.ball;
		but3.w=150;
		but3.h=50;

		but3.setOpaque(false);
		but3.setContentAreaFilled(false);
		but3.setBorderPainted(false);

		but6 = new MainBut() ;
	//	JButton b = new JButton(variables.m);
		
		but6.MenuButt(6,"Мини Игра 1", x, variables.height-variables.height*2/3, variables.MainPanel);
		//but6.setBounds( x, variables.height-variables.height*2/3,300,400);

		but6.img=variables.icon1;
		but6.w=400;
		but6.h=412;

		but6.setOpaque(false);
		but6.setContentAreaFilled(false);
		but6.setBorderPainted(false);

		
		
		but7 = new MainBut();
		but7.MenuButt(7,"Мини игра 2", x_1,  variables.height-variables.height*2/3, variables.MainPanel);
		but7.img=variables.icon2;
		but7.w=400;
		but7.h=412;

		but7.setOpaque(false);
		but7.setContentAreaFilled(false);
		but7.setBorderPainted(false);
		
		but8 = new MainBut();
		but8.MenuButt(8,"Мини игра 3", x_2,  variables.height-variables.height*2/3, variables.MainPanel);
		but8.img=variables.icon3;
		but8.w=400;
		but8.h=412;

		but8.setOpaque(false);
		but8.setContentAreaFilled(false);
		but8.setBorderPainted(false);
		
		but9 = new MainBut();
		but9.MenuButt(100,"Мини игра 4", x_3,  variables.height-variables.height*2/3, variables.MainPanel);
		but9.img=variables.icon4;
		but9.w=400;
		but9.h=412;

		but9.setOpaque(false);
		but9.setContentAreaFilled(false);
		but9.setBorderPainted(false);


		but6.setSize(400,412);
		but7.setSize(400,412);
		but8.setSize(400,412);
		but9.setSize(400,412);

//		but6.setSize(variables.width/4-10,variables.height/2);
//		but7.setSize(variables.width/4-10,variables.height/2);
//		but8.setSize(variables.width/4-10,variables.height/2);
//		but9.setSize(variables.width/4-10,variables.height/2);
	}
	void butFalse() {

		MainFrame.but.setVisible(false);
		MainFrame.but1.setVisible(false);
		MainFrame.but2.setVisible(false);

		//game3.Panel.but_set.setVisible(false);

		Button.but.setVisible(false);
		Button.but.remove(variables.MainPanel);
		Button.but_set.remove(variables.MainPanel);
		Button.but_set.setVisible(false);


		try {
			Button.but_set.setVisible(false);
		}
		catch(NullPointerException nullPointerException) {

		}

		try {
			Choice.q_b0.setVisible(false);
		}
		catch (NullPointerException nullPointerException){

		}
		Choice.q_b1.setVisible(false);
		Choice.q_b2.setVisible(false);
		Choice.q_b3.setVisible(false);
		Choice.q_b4.setVisible(false);
		Choice.q_b5.setVisible(false);
		Choice.q_b6.setVisible(false);
		Choice.q_b7.setVisible(false);
		Choice.q_b8.setVisible(false);
		Choice.q_b9.setVisible(false);

	}

}
