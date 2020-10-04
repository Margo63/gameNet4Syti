package main;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.Timer;

import game1.Container;
import selection.selectionGame;

public class MainTimer {
	
	public static Timer t;
	public static int time;
	
	
	 public MainTimer() {
		 
		 t= new Timer(3, new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
				  
				time++;
			
				if(time==1000) {
				//	new selectionGame();  //если время закончилось, открывается меню
					t.stop();
				time=0;
				}				  
			  }
		 });
		 t.start();
	}
}
