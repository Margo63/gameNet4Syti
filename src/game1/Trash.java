package game1;

import java.awt.Graphics;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.MainBut;
import main.variables;
import quest.Quest;

public class Trash {
/*	public static Image m= new ImageIcon("image/1/musor.png").getImage();
	public static Image m_2= new ImageIcon("image/1/bum.png").getImage();
	public static Image plastic= new ImageIcon("image/1/plastic.jpg").getImage();
	public static Image cont_pap= new ImageIcon("image/1/cont_pap.png").getImage();*/
	
	
	public int x, y,type,number;
	public static int point_pl=0,point_pap=0,point_gl=0,point_met=0,point_org=0,point_no=0; //кол-во собраного мусора
	public Image img;
	public static boolean num1=false,num2=false,num3=false,num4=false,num5=false,num6=false,num7=false,num8=false,num9=false,num10=false,num11=false,num12=false,num13=false;
	public boolean collTrue = false;
	//public static boolean  pap=true,gl=false,met=false,org=false,pl=false ;
	
 Trash(int x, int y, Image img,int type,int number){
	 
	 this.x = x;
	 this.y = y;
	 this.img = img;
	 this.type= type;
	 this.number = number;
	 //type 1-plastic,2-paper,3-glass,4-organic,5-metal,0-not
 }
 public void trash_coll(){
	 if(Panel.player.x-Panel.player.directionX*5+Panel.player.pers.getWidth(null)>=x &&
				Panel.player.x-Panel.player.directionX*5<=x+img.getWidth(null) &&
				Panel.player.y+Panel.player.directionY*5<y+img.getHeight(null) &&
				Panel.player.y+Panel.player.directionY*5+Panel.player.pers.getHeight(null)>=y
			 ) {

		 
		 switch(type) {
		     case 0: point_no++;   break;
		     case 1: point_pl++;   break;
		     case 2: point_pap++;  break;
		     case 3: point_gl++;   break;
		     case 4: point_org++;  break;
		     case 5: point_met++;  break;

		 
		 }

		 switch(number){
			 case 1:   num1=true; img = new ImageIcon("").getImage();  break;
			 case 2:   num2=true; img = new ImageIcon("").getImage(); break;
			 case 3:   num3=true; img = new ImageIcon("").getImage(); break;
			 case 4:   num4=true;  img = new ImageIcon("").getImage();break;
			 case 5:   num5=true;  img = new ImageIcon("").getImage();break;
			 case 6:   num6=true;  img = new ImageIcon("").getImage();break;
			 case 7:   num7=true;  img = new ImageIcon("").getImage();break;
			 case 8:   num8=true;  img = new ImageIcon("").getImage();break;
			 case 9:   num9=true;  img = new ImageIcon("").getImage();break;
			 case 10:  num10=true; img = new ImageIcon("").getImage();break;
			 case 11:  num11=true; img = new ImageIcon("").getImage();break;
			 case 12:  num12=true; img = new ImageIcon("").getImage();break;
			 case 13:  num13=true; img = new ImageIcon("").getImage(); break;
		 }
		 x=1000000000;
		 y=1000000000;
		  Inventory.p.repaint();

		 
		
	 }
		else{

	 }

	}
 public void move_trash() {
	 
		x-=Panel.player.directionX/5;
		y-=Panel.player.directionY/5;
	}
 
 
 
 
}
