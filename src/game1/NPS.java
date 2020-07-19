package game1;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.Timer;

public class NPS {
	Timer timeAnimm;
	public int x, y;
	public String str;
	public String [] strings;
	public Image img;
	public Image[] images;
	
	public NPS(int x, int y, Image img,Image[] images){
		this.x = x;
		this.y = y;
		this.img = img;
		this.images = images;
	}
	int i;
	void move(){
		for (int i=0;i<4;i++) {
			images[i] = new ImageIcon("image/1/enemy/enemy"+i+".png").getImage();
		}
		timeAnimm = new Timer (200,new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if(i<4) {
					
				}
			}
		});
		timeAnimm.start();
	}
	void expectation() {
		
	}
	void speak() {
		
	}
	
	void attack() {
		
	}
	
	void help() {
		
	}
}
