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
		/*������� ������*/
		MainFrame.but.setVisible(false);
		MainFrame.but1.setVisible(false);
		MainFrame.but2.setVisible(false);

		new main.variables();
		
	
		
		
		variables.MainPanel.repaint();
	
		//������������� ����� �� �����
		//����� ��������� ������������ � ���������
		main.MainFrame.frame.setFocusable(true); 
		main.MainFrame.frame.addKeyListener (new KeyAdapter() {
			public void keyPressed (KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
					System.exit(0); //��������� ���� �� Esc
					/*������ ��������, �� ������ �������� ��� ���� �����, ��� ����������
					 * ���� � ��������: ������� ���� ��� ���*/
					
				}
				
			}
		
		});
		if (variables.gameLvl ==1) { //��������� �������
		 //��������� �����
			variables.fon = variables.fon1;
		}
		
		
		if (variables.gameLvl ==2) { //��������� �������
			new Panel(); //��������� �����
		}
		if (variables.gameLvl ==3) { //��������� �������
			 //��������� �����
		}
		if (variables.gameLvl ==4) { //��������� �������
			new Fmini3(); //��������� �����
		}
		if (variables.gameLvl ==5) { //��������� �������
			new Fmini4(); //��������� �����
		}
		
	}
	
}
