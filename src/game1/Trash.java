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
	
	
	public int x, y,type;
	public static int point_pl=0,point_pap=0,point_gl=0,point_met=0,point_org=0; //кол-во собраного мусора
	public static int point_card=0,point_not=0,point_cont=0,point_cd=0;
	public Image img;
	
	public boolean collTrue = false;
	//public static boolean  pap=true,gl=false,met=false,org=false,pl=false ;
	
 Trash(int x, int y, Image img,int type){
	 
	 this.x = x;
	 this.y = y;
	 this.img = img;
	 this.type= type;
	 //type 1-plastic,2-paper,3-glass,4-organic,5-metal,0-not
 }
 public void trash_coll(){
	 if(Panel.player.x-Panel.player.directionX*5+Panel.player.pers.getWidth(null)>=x &&
				Panel.player.x-Panel.player.directionX*5<=x+img.getWidth(null) &&
				Panel.player.y+Panel.player.directionY*5<y+img.getHeight(null) &&
				Panel.player.y+Panel.player.directionY*5+Panel.player.pers.getHeight(null)>=y
			 ) {
		 
		 
		 switch(type) {
		 case 1: point_pl++;   break;
		 case 2: point_pap++; point_card++;  break;
		 case 3: point_gl++;   break;
		 case 4: point_org++;  break;
		 case 5: point_met++;  break;
		 
		 }
		  Inventory.p.repaint();
	x=-1000;
		 
		
	 }
		else{

	 }

	}
 public void move_trash() {
	 
		x-=Panel.player.directionX/3;
		y-=Panel.player.directionY/3;
	}
 
 
 
 
}
