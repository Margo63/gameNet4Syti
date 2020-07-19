package quest;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import game1.Container;
import game1.Instance;
import game1.Trash;
import main.MainBut;
import main.variables;

public class Quest {

	public static MainBut b;
	public static MainBut b1;
	public static MainBut b2;
	public static MainBut b3;
	public static MainBut b4;
	public static JFrame f_quest;
	public static JPanel p_quest;
	int kol;
 public  Quest(){
	  f_quest = new JFrame();
		 f_quest.setUndecorated(true);
		 f_quest.setBounds(variables.width/2-variables.width/6,variables.height/2-variables.height/6,variables.width/3,variables.height/3);
		 f_quest.setVisible(true);
		 p_quest = new JPanel() {
			 protected void paintComponent(Graphics g) {
					super.paintComponent(g);
					img(Trash.point_pap,g,0,0);
					img(Trash.point_pl,g,variables.m_2.getWidth(null)+10,0);
					img(Trash.point_gl,g,variables.plastic.getWidth(null)+variables.m_2.getWidth(null)+10,0);
					img(Trash.point_org,g,variables.glass.getWidth(null)+variables.plastic.getWidth(null)+variables.m_2.getWidth(null)+10,0);
					img(Trash.point_met,g,variables.org.getWidth(null)+variables.glass.getWidth(null)+variables.plastic.getWidth(null)+variables.m_2.getWidth(null)+10,0);
			
				}
		 };
		 JLabel quest= new JLabel();
		 quest.setText("Какой мусор вы хотите выбросить?");
		 quest.setLocation(10,90);
		 quest.setVisible(true);
		 
		 
		 b = new MainBut();
		 b.MenuButt(9, "", 10,50,  p_quest);
		 b.setSize(variables.m_2.getWidth(null),variables.m_2.getHeight(null));
		 b.img=variables.m_2;
		 b.w=variables.m_2.getWidth(null);
		 b.h=variables.m_2.getHeight(null);
		
		 b1 = new MainBut();
		 b1.MenuButt(10, "",variables.m_2.getWidth(null)+10 ,50 , p_quest);
		 b1.setSize(variables.plastic.getWidth(null),variables.plastic.getHeight(null));
		 b1.img=variables.plastic;
	     b1.w=variables.plastic.getWidth(null);
	     b1.h=variables.plastic.getHeight(null);
		 
		 b2 = new MainBut();
		 b2.MenuButt(11, "Стекло", variables.plastic.getWidth(null)+variables.m_2.getWidth(null)+10, 50, p_quest);
		 b2.setSize(variables.glass.getWidth(null),variables.glass.getHeight(null));
		 b2.img=variables.glass;
    	 b2.w=variables.glass.getWidth(null);
	     b2.h=variables.glass.getHeight(null);
		 
		 b3 = new MainBut();
		 b3.MenuButt(12, "Бытовые отходы",variables.glass.getWidth(null)+variables.plastic.getWidth(null)+variables.m_2.getWidth(null)+10, 50, p_quest);
		 b3.setSize(variables.org.getWidth(null),variables.org.getHeight(null));
		 b3.img=variables.org;
	     b3.w=variables.org.getWidth(null);
	     b3.h=variables.org.getHeight(null);
		 
		 b4= new MainBut();
		 b4.MenuButt(13, "Металл", variables.org.getWidth(null)+variables.glass.getWidth(null)+variables.plastic.getWidth(null)+variables.m_2.getWidth(null)+10, 50, p_quest);
		 b4.setSize(variables.met.getWidth(null),variables.met.getHeight(null));
		 b4.img=variables.met;
	     b4.w=variables.met.getWidth(null);
	     b4.h=variables.met.getHeight(null);
		 
		 p_quest.setLayout(null);
		 p_quest.add(quest);
		 f_quest.add(p_quest);
		 
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
	 
 }
}
