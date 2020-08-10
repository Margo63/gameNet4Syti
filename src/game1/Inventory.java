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

import game.Button;
import game3.Department;
import game3.Office;
import main.MainBut;
import main.variables;
import quest.*;

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
	public static int x_inventory;
	public static int kol=0;
	public static boolean blood=false;
public Inventory(){
	if(kol<1){
		f = new JFrame();
		kol++;
		f.setUndecorated(true);
		f.setMinimumSize(new Dimension(variables.width/3,variables.height/2));

		f.setFocusable(true);
		}






	
	
     	
	
	
 p= new JPanel() {
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(variables.white_fon,  0, 0, variables.width,variables.height,   null);
			if(variables.gameLvl==1) {
			    if(Trash.num1)	g.drawImage(variables.m_2,     0, 0, null);
				if(Trash.num2)  g.drawImage(variables.plastic, 0,    variables.m_2.getHeight(null), null);
				if(Trash.num3)  g.drawImage(variables.met,     0, variables.m_2.getHeight(null)+variables.plastic.getHeight(null), null);
				if(Trash.num4)  g.drawImage(variables.org,     0, variables.m_2.getHeight(null)+variables.plastic.getHeight(null)+variables.met.getHeight(null), null);
				if(Trash.num5)  g.drawImage(variables.glass,   0, variables.m_2.getHeight(null)+variables.plastic.getHeight(null)+variables.met.getHeight(null)+variables.org.getHeight(null), null);

				if(Trash.num6)  g.drawImage(variables.apple,      100, 0, null);
				if(Trash.num7)  g.drawImage(variables.cd,         100,    variables.apple.getHeight(null), null);
				if(Trash.num8)  g.drawImage(variables.container,  100, variables.apple.getHeight(null)+variables.cd.getHeight(null), null);
				if(Trash.num9)  g.drawImage(variables.plastic_bag,100, variables.apple.getHeight(null)+variables.cd.getHeight(null)+variables.container.getHeight(null), null);
				if(Trash.num10)  g.drawImage(variables.cardboard,  100, variables.apple.getHeight(null)+variables.cd.getHeight(null)+variables.container.getHeight(null)+variables.plastic_bag.getHeight(null), null);

				if(Trash.num11)  g.drawImage(variables.cap,   200, 0, null);
				if(Trash.num12)  g.drawImage(variables.chips, 200, variables.cap.getHeight(null), null);
				if(Trash.num13)	g.drawImage(variables.m_2,    200, variables.cap.getHeight(null)+variables.chips.getHeight(null), null);


			//	img(Trash.point_pap,g,variables.plastic.getWidth(null)+10,0);
			//	img(Trash.point_pl,g, variables.plastic.getWidth(null)+10,variables.m_2.getHeight(null));
			//	img(Trash.point_met,g,variables.plastic.getWidth(null)+10,variables.m_2.getHeight(null)+variables.plastic.getHeight(null));
			//	img(Trash.point_org,g,variables.plastic.getWidth(null)+10,variables.m_2.getHeight(null)+variables.plastic.getHeight(null)+variables.met.getHeight(null));
			//	img(Trash.point_gl,g, variables.plastic.getWidth(null)+10,variables.m_2.getHeight(null)+variables.plastic.getHeight(null)+variables.met.getHeight(null)+variables.org.getHeight(null));

				//img(Trash.point_card,g,130,variables.apple.getHeight(null)+variables.cd.getHeight(null)+variables.container.getHeight(null)+variables.plastic_bag.getHeight(null));
			
			}
			if(variables.gameLvl==2) {
				g.drawImage(variables.bird, 0, 50, null);
			}
			if(variables.gameLvl==3||(variables.gameLvl<-1&&variables.gameLvl>-6)){
			    if(blood)	g.drawImage(variables.napravlenie,0,0,150,100,null);
			    if(Office.t_1) g.drawImage(variables.napravlenie,0,0,75,100,null);
				if(Office.t_2) g.drawImage(variables.napravlenie,80,0,75,100,null);
				if(Office.t_3) g.drawImage(variables.napravlenie,160,0,75,100,null);
				if(Office.t_4) g.drawImage(variables.napravlenie,240,0,75,100,null);


				if(Fruit.f_1) g.drawImage(variables.napravlenie,0,  0,60,60,null);
				if(Fruit.f_2) g.drawImage(variables.napravlenie,70, 0,60,60,null);
				if(Fruit.f_3) g.drawImage(variables.napravlenie,140,0,60,60,null);
				if(Fruit.f_4) g.drawImage(variables.napravlenie,210,0,60,60,null);
				if(Fruit.f_5) g.drawImage(variables.napravlenie,280,0,60,60,null);

				if(Vegetables.v_1) g.drawImage(variables.plastic_bag,0,  70,60,60,null);
				if(Vegetables.v_2) g.drawImage(variables.chips,      70, 70,60,60,null);
				if(Vegetables.v_3) g.drawImage(variables.car,        140,70,60,60,null);
				if(Vegetables.v_4) g.drawImage(variables.cardboard,  210,70,60,60,null);
				if(Vegetables.v_5) g.drawImage(variables.container,  280,70,60,60,null);

				if(Grocery.g_1) g.drawImage(variables.plastic_bag,   0,  140,60,60,null);
				if(Grocery.g_2) g.drawImage(variables.chips,         70, 140,60,60,null);
				if(Grocery.g_3) g.drawImage(variables.car,           140,140,60,60,null);
				if(Grocery.g_4) g.drawImage(variables.cardboard,     210,140,60,60,null);
				if(Grocery.g_5) g.drawImage(variables.container,     280,140,60,60,null);
				if(Grocery.g_6) g.drawImage(variables.plastic_bag,   0,  210,60,60,null);
				if(Grocery.g_7) g.drawImage(variables.chips,         70, 210,60,60,null);

				if(Milk.mi_1) g.drawImage(variables.car,             140,210,60,60,null);
				if(Milk.mi_2) g.drawImage(variables.cardboard,       210,210,60,60,null);
				if(Milk.mi_3) g.drawImage(variables.container,       280,210,60,60,null);
				if(Milk.mi_4) g.drawImage(variables.container,       0,  280,60,60,null);

				if(Bread.b_1) g.drawImage(variables.chips,           70, 280,60,60,null);
				if(Bread.b_2) g.drawImage(variables.car,             140,280,60,60,null);
				if(Bread.b_3) g.drawImage(variables.cardboard,       210,280,60,60,null);

				if(Meat.me_1) g.drawImage(variables.chips,           280, 280,60,60,null);
				if(Meat.me_2) g.drawImage(variables.car,             0,350,60,60,null);
				if(Meat.me_3) g.drawImage(variables.cardboard,       70,350,60,60,null);

				if(Candy.c_1) g.drawImage(variables.chips,           140, 350,60,60,null);
				if(Candy.c_2) g.drawImage(variables.car,             210,350,60,60,null);
				if(Candy.c_3) g.drawImage(variables.cardboard,       280,350,60,60,null);


			}

		   if(variables.gameLvl==-5){



		   }
		}
	};
	Button.but_close(p,f);
     f.add(p);
	/*if(variables.gameLvl==-5) {
		Button.but_close(Department.p_im, f);
		f.add(Department.p_im);
	}*/
	p.setLayout(null);


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
	
}
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
	 
}*/
 

}
