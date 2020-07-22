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
	public static MainBut b5;
	public static MainBut b6;
	public static MainBut b7;
	public static MainBut b8;
	public static MainBut b9;
	public static MainBut b10;
	public static MainBut b11;
	public static MainBut b12;

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
					//img(Trash.point_pap,g,0,0);
			    	//img(Trash.point_pl,g,variables.m_2.getWidth(null)+10,0);
					//img(Trash.point_gl,g,variables.plastic.getWidth(null)+variables.m_2.getWidth(null)+10,0);
					//img(Trash.point_org,g,variables.glass.getWidth(null)+variables.plastic.getWidth(null)+variables.m_2.getWidth(null)+10,0);
					//img(Trash.point_met,g,variables.org.getWidth(null)+variables.glass.getWidth(null)+variables.plastic.getWidth(null)+variables.m_2.getWidth(null)+10,0);
			
				}
		 };
		 JLabel quest= new JLabel();
		 quest.setText("Какой мусор вы хотите выбросить?");
		 quest.setLocation(10,90);
		 quest.setVisible(true);
		 
		 
		 b = new MainBut();
		 b.MenuButt(9, "", 10,10,  p_quest);
		 b.setSize(variables.m_2.getWidth(null),variables.m_2.getHeight(null));
     	 b.setOpaque(false);
	     b.setContentAreaFilled(false);
	     b.setBorderPainted(false);
		 if(Trash.num1) b.img=variables.m_2;

		 b.w=variables.m_2.getWidth(null);
		 b.h=variables.m_2.getHeight(null);
		///////////////////////////////////////////////////////
		 b1 = new MainBut();
		 b1.MenuButt(10, "",variables.m_2.getWidth(null)+10 ,10 , p_quest);
		 b1.setSize(variables.plastic.getWidth(null),variables.plastic.getHeight(null));
	     b1.setOpaque(false);
	     b1.setContentAreaFilled(false);
	     b1.setBorderPainted(false);
	     if(Trash.num2)b1.img=variables.plastic;

	     b1.w=variables.plastic.getWidth(null);
	     b1.h=variables.plastic.getHeight(null);
		 ////////////////////////////////////////////////////
		 b2 = new MainBut();
		 b2.MenuButt(11, "", variables.plastic.getWidth(null)+variables.m_2.getWidth(null)+10, 10, p_quest);
		 b2.setSize(variables.glass.getWidth(null),variables.glass.getHeight(null));
	     b2.setOpaque(false);
	     b2.setContentAreaFilled(false);
	     b2.setBorderPainted(false);
	     if(Trash.num5)b2.img=variables.glass;

    	 b2.w=variables.glass.getWidth(null);
	     b2.h=variables.glass.getHeight(null);
		 /////////////////////////////////////////////////////
		 b3 = new MainBut();
		 b3.MenuButt(12, " ",variables.glass.getWidth(null)+variables.plastic.getWidth(null)+variables.m_2.getWidth(null)+10, 10, p_quest);
		 b3.setSize(variables.org.getWidth(null),variables.org.getHeight(null));
	     b3.setOpaque(false);
	     b3.setContentAreaFilled(false);
	     b3.setBorderPainted(false);
	     if(Trash.num4)b3.img=variables.org;

	     b3.w=variables.org.getWidth(null);
	     b3.h=variables.org.getHeight(null);
		 //////////////////////////////////////////////////////
		 b4= new MainBut();
		 b4.MenuButt(13, "", variables.org.getWidth(null)+variables.glass.getWidth(null)+variables.plastic.getWidth(null)+variables.m_2.getWidth(null)+10, 10, p_quest);
		 b4.setSize(variables.met.getWidth(null),variables.met.getHeight(null));
	     b4.setOpaque(false);
	     b4.setContentAreaFilled(false);
	     b4.setBorderPainted(false);
	     if(Trash.num3)b4.img=variables.met;

	     b4.w=variables.met.getWidth(null);
	     b4.h=variables.met.getHeight(null);
		 //////////////////////////////////////////////
	     b5= new MainBut();
	     b5.MenuButt(20, "", 10, variables.glass.getHeight(null)+15, p_quest);
	     b5.setSize(variables.apple.getWidth(null),variables.apple.getHeight(null));
	     b5.setOpaque(false);
	     b5.setContentAreaFilled(false);
	     b5.setBorderPainted(false);
	     if(Trash.num6)b5.img=variables.apple;

	     b5.w=variables.apple.getWidth(null);
	     b5.h=variables.apple.getHeight(null);
	     //////////////////////////////////////////////
	     b6= new MainBut();
	     b6.MenuButt(21, "",variables.apple.getWidth(null)+10, variables.glass.getHeight(null)+15, p_quest);
	     b6.setSize(variables.cd.getWidth(null),variables.cd.getHeight(null));
	     b6.setOpaque(false);
	     b6.setContentAreaFilled(false);
	     b6.setBorderPainted(false);
	     if(Trash.num7)b6.img=variables.cd;

	     b6.w=variables.cd.getWidth(null);
	     b6.h=variables.cd.getHeight(null);
	     //////////////////////////////////////////////
	     b7= new MainBut();
	     b7.MenuButt(22, "", variables.apple.getWidth(null)+variables.cd.getWidth(null)+10, variables.glass.getHeight(null)+15, p_quest);
	     b7.setSize(variables.container.getWidth(null),variables.container.getHeight(null));
	     b7.setOpaque(false);
	     b7.setContentAreaFilled(false);
	     b7.setBorderPainted(false);
	     if(Trash.num8)b7.img=variables.container;

	     b7.w=variables.container.getWidth(null);
	     b7.h=variables.container.getHeight(null);
	     //////////////////////////////////////////////
	     b8= new MainBut();
	     b8.MenuButt(23, "", variables.apple.getWidth(null)+variables.cd.getWidth(null)+variables.container.getWidth(null)+10, variables.glass.getHeight(null)+15, p_quest);
	     b8.setSize(variables.plastic_bag.getWidth(null),variables.plastic_bag.getHeight(null));
	     b8.setOpaque(false);
	     b8.setContentAreaFilled(false);
	     b8.setBorderPainted(false);
	     if(Trash.num9)b8.img=variables.plastic_bag;

	     b8.w=variables.plastic_bag.getWidth(null);
	     b8.h=variables.plastic_bag.getHeight(null);
	     //////////////////////////////////////////////
	     b9= new MainBut();
	     b9.MenuButt(24, "", variables.apple.getWidth(null)+variables.cd.getWidth(null)+variables.container.getWidth(null)+variables.plastic_bag.getWidth(null)+10, variables.glass.getHeight(null)+15, p_quest);
	     b9.setSize(variables.cardboard.getWidth(null),variables.cardboard.getHeight(null));
	     b9.setOpaque(false);
	     b9.setContentAreaFilled(false);
	     b9.setBorderPainted(false);
	     if(Trash.num10)b9.img=variables.cardboard;

	     b9.w=variables.cardboard.getWidth(null);
	     b9.h=variables.cardboard.getHeight(null);
	     //////////////////////////////////////////////
	     b10= new MainBut();
	     b10.MenuButt(25, "", 10, variables.glass.getHeight(null)+variables.cardboard.getHeight(null)+15, p_quest);
	     b10.setSize(variables.cap.getWidth(null),variables.cap.getHeight(null));
	     b10.setOpaque(false);
	     b10.setContentAreaFilled(false);
	     b10.setBorderPainted(false);
	     if(Trash.num11)b10.img=variables.cap;

	     b10.w=variables.cap.getWidth(null);
	     b10.h=variables.cap.getHeight(null);
	     //////////////////////////////////////////////
	     b11= new MainBut();
	     b11.MenuButt(26, "", variables.cap.getWidth(null)+10, variables.glass.getHeight(null)+variables.cardboard.getHeight(null)+15, p_quest);
	     b11.setSize(variables.chips.getWidth(null),variables.chips.getHeight(null));
	     b11.setOpaque(false);
	     b11.setContentAreaFilled(false);
	     b11.setBorderPainted(false);
	     if(Trash.num12)b11.img=variables.chips;

	     b11.w=variables.chips.getWidth(null);
	     b11.h=variables.chips.getHeight(null);
	     //////////////////////////////////////////////
	     b12= new MainBut();
	     b12.MenuButt(27, "", variables.cap.getWidth(null)+variables.chips.getWidth(null)+10, variables.glass.getHeight(null)+variables.cardboard.getHeight(null)+15, p_quest);
	     b12.setSize(variables.m_2.getWidth(null),variables.m_2.getHeight(null));
	     b12.setOpaque(false);
	     b12.setContentAreaFilled(false);
	     b12.setBorderPainted(false);
	     if(Trash.num13)b12.img=variables.m_2;

	     b12.w=variables.m_2.getWidth(null);
	     b12.h=variables.m_2.getHeight(null);
	     //////////////////////////////////////////////
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
