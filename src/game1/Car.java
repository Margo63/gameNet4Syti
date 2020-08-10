package game1;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import game.Button;
import main.MainBut;
import main.variables;

public class Car {
public static MainBut b1;	
public static MainBut b2;
public static MainBut b3;
public static JPanel p;
public static JFrame f;
int h;
int kol=0;
public int x,y,type;
public Image img;


    public Car(Image im,int x,int y,int type_car){

    	this.img=im;
       this.x=x;
       this.y=y;
       this.type=type_car;    //1-машина с бензином,  2-машина с собакой
    }
	public void car_coll() {
		 if(Panel.player.x-Panel.player.directionX*5+Panel.player.pers.getWidth(null)>=x &&
					Panel.player.x-Panel.player.directionX*5<=x+img.getWidth(null) &&
					Panel.player.y+Panel.player.directionY*5<y+img.getHeight(null) &&
					Panel.player.y+Panel.player.directionY*5+Panel.player.pers.getHeight(null)>=y) {
			 
			 switch(type) {
			 case 1:
			h=1;
			 frame();
			
				 break;
				 
			 case 2:
				 h=2;
				 frame();
				 break;
			 }
			 
			 
		 }
	
}
	public void car_move() {
		x-=Panel.player.directionX/3;
		y-=Panel.player.directionY/3;
	}
	
	public void frame() {
		variables.car_panel=variables.null_image;
		if(kol<1){
			f= new JFrame();
				kol++;
		}

		f.setUndecorated(true);
		f.setBounds(variables.width/2-variables.width/6,variables.height/2-variables.height/6,variables.width/3,variables.height/3);
		f.setVisible(true);
	        p =new JPanel() {
        	protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(variables.white_fon,  0, 0, variables.width,variables.height,   null);
				 g.drawImage(variables.car_panel, 0,0, null);
				 
        	}
        };
		p.setLayout(null);
		if(h==1) {
			b1 = new MainBut();
		    b1.MenuButt(14,"Сообщить владельцу",10 ,50 , p);
		    b1.setSize(f.getWidth()-20,50);
		
			b2 = new MainBut();
		    b2.MenuButt(15,"Оставить как есть",10 ,110 , p);
		    b2.setSize(f.getWidth()-20,50);
		    
		    b3 = new MainBut();
		    b3.MenuButt(16,"Убрать самому",10 ,170 , p);
		    b3.setSize(f.getWidth()-20,50);
		}
		
		if (h==2) {
			b1 = new MainBut();
		    b1.MenuButt(14,"Позвонить владельцу",10 ,50 , p);
		    b1.setSize(f.getWidth()-20,50);
		    
			b2 = new MainBut();
		    b2.MenuButt(16,"Попробовать самому открыть машину",10 ,110 , p);
		    b2.setSize(f.getWidth()-20,50);
		    
		    b3 = new MainBut();
		    b3.MenuButt(15,"Оставить как есть",10 ,170 , p);
		    b3.setSize(f.getWidth()-20,50);
		}
		
		f.add(p);
		Button.but_close(p,f);
	}



int i ;
Timer time;

Image [] images = new Image [7];


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
				img = images[i];
				variables.MainPanel.repaint();
			}
		});
		time.start();
	}
	
}
