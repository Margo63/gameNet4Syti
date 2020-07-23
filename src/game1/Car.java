package game1;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;

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

public int x,y,type;
public Image img;
public Car(Image im,int x,int y,int type_car){
this.img=im;
this.x=x;
this.y=y;
this.type=type_car;    //1-������ � ��������,  2-������ � �������
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
		f= new JFrame();
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
		    b1.MenuButt(14,"�������� ���������",10 ,50 , p);
		    b1.setSize(f.getWidth()-20,50);
		
			b2 = new MainBut();
		    b2.MenuButt(15,"�������� ��� ����",10 ,110 , p);
		    b2.setSize(f.getWidth()-20,50);
		    
		    b3 = new MainBut();
		    b3.MenuButt(16,"������ ������",10 ,170 , p);
		    b3.setSize(f.getWidth()-20,50);
		}
		
		if (h==2) {
			b1 = new MainBut();
		    b1.MenuButt(14,"��������� ���������",10 ,50 , p);
		    b1.setSize(f.getWidth()-20,50);
		    
			b2 = new MainBut();
		    b2.MenuButt(16,"����������� ������ ������� ������",10 ,110 , p);
		    b2.setSize(f.getWidth()-20,50);
		    
		    b3 = new MainBut();
		    b3.MenuButt(15,"�������� ��� ����",10 ,170 , p);
		    b3.setSize(f.getWidth()-20,50);
		}
		
		f.add(p);
		Button.but_close(p,f);
	}
	
}
