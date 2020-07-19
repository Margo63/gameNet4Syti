package game;

import java.awt.Image;



import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import game1.Panel;
import main.MainFrame;
import main.variables;

import make_out.Fmini3;
import make_out.Fmini4;


public class lvl {
	
	
	
	public lvl(){
		/*убираем кнопки*/
		MainFrame.but.setVisible(false);
		MainFrame.but1.setVisible(false);
		MainFrame.but2.setVisible(false);

		new main.variables();
		
	
		
		
		variables.MainPanel.repaint();
	
		//устанавливаем фокус на фрейм
		//иначе слушатель подключается с задержкой
		main.MainFrame.frame.setFocusable(true); 
		main.MainFrame.frame.addKeyListener (new KeyAdapter() {
			public void keyPressed (KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
					System.exit(0); //закрываем игру на Esc
					/*вместо закрытия, вы можете добавить еще один фрейм, как диалоговое
					 * окно с вопросом: закрыть игру или нет*/
					
				}
				
			}
		
		});
		if (variables.gameLvl ==1) { //проверяем уровень
		 //запускаем класс
			variables.fon = variables.fon1;
		}
		
		
		if (variables.gameLvl ==2) { //проверяем уровень
			new Panel(); //запускаем класс
		}
		if (variables.gameLvl ==3) { //проверяем уровень
			 //запускаем класс
		}
		if (variables.gameLvl ==4) { //проверяем уровень
			new Fmini3(); //запускаем класс
		}
		if (variables.gameLvl ==5) { //проверяем уровень
			new Fmini4(); //запускаем класс
		}
		
	}
	
}
