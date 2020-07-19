package game1;

import java.awt.Dimension;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.MainBut;
import main.variables;

public class Inventory {
	Image imm = new ImageIcon("image/park.png").getImage();
	public static 	JPanel p;
	public static Number pap;
	public static Number pl;
	public static Number met;
	public static Number gl;
	public static Number org;
	public static JLabel l,l2,l3,l4,l5;
	public static JFrame f;
	public static int blood=0;
public Inventory(){
	f = new JFrame();
	f.setUndecorated(true); 
	f.setMinimumSize(new Dimension(variables.width/3,variables.height/2));

	f.setFocusable(true);

	
	
     	
	
	
 p= new JPanel() {
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			if(variables.gameLvl==1) {
				g.drawImage(variables.m_2,     0, 0, null);
				g.drawImage(variables.plastic, 0,    variables.m_2.getHeight(null), null);
				g.drawImage(variables.met,     0, variables.m_2.getHeight(null)+variables.plastic.getHeight(null), null);
				g.drawImage(variables.org,     0, variables.m_2.getHeight(null)+variables.plastic.getHeight(null)+variables.met.getHeight(null), null);
				g.drawImage(variables.glass,   0, variables.m_2.getHeight(null)+variables.plastic.getHeight(null)+variables.met.getHeight(null)+variables.org.getHeight(null), null);

				g.drawImage(variables.apple,      120, 0, null);
				g.drawImage(variables.cd,         120,    variables.apple.getHeight(null), null);
				g.drawImage(variables.container,  120, variables.apple.getHeight(null)+variables.cd.getHeight(null), null);
				g.drawImage(variables.plastic_bag,120, variables.apple.getHeight(null)+variables.cd.getHeight(null)+variables.container.getHeight(null), null);
				g.drawImage(variables.cardboard,  120, variables.apple.getHeight(null)+variables.cd.getHeight(null)+variables.container.getHeight(null)+variables.plastic_bag.getHeight(null), null);

				g.drawImage(variables.cap,   240, 0, null);
				g.drawImage(variables.chips, 240, variables.chips.getHeight(null), null);


				img(Trash.point_pap,g,variables.plastic.getWidth(null)+10,0);
				img(Trash.point_pl,g, variables.plastic.getWidth(null)+10,variables.m_2.getHeight(null));
				img(Trash.point_met,g,variables.plastic.getWidth(null)+10,variables.m_2.getHeight(null)+variables.plastic.getHeight(null));
				img(Trash.point_org,g,variables.plastic.getWidth(null)+10,variables.m_2.getHeight(null)+variables.plastic.getHeight(null)+variables.met.getHeight(null));
				img(Trash.point_gl,g, variables.plastic.getWidth(null)+10,variables.m_2.getHeight(null)+variables.plastic.getHeight(null)+variables.met.getHeight(null)+variables.org.getHeight(null));

				img(Trash.point_card,g,130,variables.apple.getHeight(null)+variables.cd.getHeight(null)+variables.container.getHeight(null)+variables.plastic_bag.getHeight(null));
			
			}
			if(variables.gameLvl==2) {
				g.drawImage(variables.bird, 0, 50, null);
			}
			if(variables.gameLvl==3||variables.gameLvl==-2||variables.gameLvl==-3){
			if(blood==1)	g.drawImage(variables.napravlenie,0,0,150,100,null);
			}
		}
	};
	
	f.add(p);
	

}


/*
void equipment(Image im,int x,int y, int kol) {
	this.imm=im;
}

void num() {
	pap = new Number(l,Trash.point_pap,p);
	pl = new Number(l2,Trash.point_pl,p);
	met = new Number(l3,Trash.point_met,p);
	org = new Number(l4,Trash.point_org,p);
	gl = new Number(l5,Trash.point_gl,p);
	
}*/
void img(int kol,Graphics g,int x,int y) {
	if(kol==0) g.drawImage(variables.num0, x, y,variables.num0.getWidth(null)/2,variables.num0.getHeight(null)/2, null);
	if(kol==1) g.drawImage(variables.num1, x, y,variables.num1.getWidth(null)/2,variables.num1.getHeight(null)/2, null);
	if(kol==2) g.drawImage(variables.num2, x, y,variables.num2.getWidth(null)/2,variables.num2.getHeight(null)/2, null);
	if(kol==3) g.drawImage(variables.num3, x, y,variables.num3.getWidth(null)/2,variables.num3.getHeight(null)/2, null);
	if(kol==4) g.drawImage(variables.num4, x, y,variables.num4.getWidth(null)/2,variables.num4.getHeight(null)/2, null);
	if(kol==5) g.drawImage(variables.num5, x, y,variables.num5.getWidth(null)/2,variables.num5.getHeight(null)/2, null);
	if(kol==6) g.drawImage(variables.num6, x, y,variables.num6.getWidth(null)/2,variables.num6.getHeight(null)/2, null);
	if(kol==7) g.drawImage(variables.num7, x, y,variables.num7.getWidth(null)/2,variables.num7.getHeight(null)/2, null);
	if(kol==8) g.drawImage(variables.num8, x, y,variables.num8.getWidth(null)/2,variables.num8.getHeight(null)/2, null);
	if(kol==9) g.drawImage(variables.num9, x, y,variables.num9.getWidth(null)/2,variables.num9.getHeight(null)/2, null);
	 
}
 

}
