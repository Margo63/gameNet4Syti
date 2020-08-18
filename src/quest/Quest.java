package quest;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import game.Button;
import game1.*;
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
	Image image;
	JButton bb1=null,bb2=null,bb3=null,bb4=null,bb5=null,bb6=null,bb7=null,bb8=null,bb9=null,bb10=null,bb11,bb12,bb13;

	public static int container;
	JButton b_check;

	public static JFrame f_quest=null;
	public static JPanel p_quest;
	public  static int  kol;
 public  Quest(){



	 if(f_quest==null) {
		 f_quest = new JFrame();
		 f_quest.setUndecorated(true);
		 f_quest.setBounds(variables.width/2-variables.width/6,variables.height/2-variables.height/6,variables.width/3,variables.height/3);

	 }
	 f_quest.setVisible(true);
	 p_quest = new JPanel() {
			 protected void paintComponent(Graphics g) {
					super.paintComponent(g);
				 g.drawImage(variables.white_fon,  0, 0, variables.width,variables.height,   null);

				}
		 };



	  /*   if(Trash.num1){
	     	 b = new MainBut();
			 b.MenuButt(9, "", 10,10,  p_quest);
			 b.setSize(variables.m_2.getWidth(null),variables.m_2.getHeight(null));
			 b.setOpaque(false);
			 b.setContentAreaFilled(false);
			 b.setBorderPainted(false);
			 b.img=variables.m_2;

			 b.w=variables.m_2.getWidth(null);
			 b.h=variables.m_2.getHeight(null);
		 }

		///////////////////////////////////////////////////////
	 if(Trash.num2) {
		 b1 = new MainBut();
		 b1.MenuButt(10, "", variables.m_2.getWidth(null) + 10, 10, p_quest);
		 b1.setSize(variables.plastic.getWidth(null), variables.plastic.getHeight(null));
		 b1.setOpaque(false);
		 b1.setContentAreaFilled(false);
		 b1.setBorderPainted(false);
		 if (Trash.num2) b1.img = variables.plastic;

		 b1.w = variables.plastic.getWidth(null);
		 b1.h = variables.plastic.getHeight(null);
	 }
		 ////////////////////////////////////////////////////
	 if(Trash.num5) {
		 b2 = new MainBut();
		 b2.MenuButt(11, "", variables.plastic.getWidth(null) + variables.m_2.getWidth(null) + 10, 10, p_quest);
		 b2.setSize(variables.glass.getWidth(null), variables.glass.getHeight(null));
		 b2.setOpaque(false);
		 b2.setContentAreaFilled(false);
		 b2.setBorderPainted(false);
		 if (Trash.num5) b2.img = variables.glass;

		 b2.w = variables.glass.getWidth(null);
		 b2.h = variables.glass.getHeight(null);
	 }
		 /////////////////////////////////////////////////////
	 if(Trash.num4){
		 b3 = new MainBut();
		 b3.MenuButt(12, " ",variables.glass.getWidth(null)+variables.plastic.getWidth(null)+variables.m_2.getWidth(null)+10, 10, p_quest);
		 b3.setSize(variables.org.getWidth(null),variables.org.getHeight(null));
		 b3.setOpaque(false);
		 b3.setContentAreaFilled(false);
		 b3.setBorderPainted(false);
		 if(Trash.num4)b3.img=variables.org;

		 b3.w=variables.org.getWidth(null);
		 b3.h=variables.org.getHeight(null);
	 }

		 //////////////////////////////////////////////////////
	 if(Trash.num3){
		 b4= new MainBut();
		 b4.MenuButt(13, "", variables.org.getWidth(null)+variables.glass.getWidth(null)+variables.plastic.getWidth(null)+variables.m_2.getWidth(null)+10, 10, p_quest);
		 b4.setSize(variables.met.getWidth(null),variables.met.getHeight(null));
		 b4.setOpaque(false);
		 b4.setContentAreaFilled(false);
		 b4.setBorderPainted(false);
		 if(Trash.num3)b4.img=variables.met;

		 b4.w=variables.met.getWidth(null);
		 b4.h=variables.met.getHeight(null);
	 }

		 //////////////////////////////////////////////
	 if(Trash.num6) {
		 b5 = new MainBut();
		 b5.MenuButt(20, "", 10, variables.glass.getHeight(null) + 15, p_quest);
		 b5.setSize(variables.apple.getWidth(null), variables.apple.getHeight(null));
		 b5.setOpaque(false);
		 b5.setContentAreaFilled(false);
		 b5.setBorderPainted(false);
		 if (Trash.num6) b5.img = variables.apple;

		 b5.w = variables.apple.getWidth(null);
		 b5.h = variables.apple.getHeight(null);
	 }
	     //////////////////////////////////////////////
	 if(Trash.num7) {
		 b6 = new MainBut();
		 b6.MenuButt(21, "", variables.apple.getWidth(null) + 10, variables.glass.getHeight(null) + 15, p_quest);
		 b6.setSize(variables.cd.getWidth(null), variables.cd.getHeight(null));
		 b6.setOpaque(false);
		 b6.setContentAreaFilled(false);
		 b6.setBorderPainted(false);
		 if (Trash.num7) b6.img = variables.cd;

		 b6.w = variables.cd.getWidth(null);
		 b6.h = variables.cd.getHeight(null);
	 }
	     //////////////////////////////////////////////
		 if(Trash.num8) {
			 b7 = new MainBut();
			 b7.MenuButt(22, "", variables.apple.getWidth(null) + variables.cd.getWidth(null) + 10, variables.glass.getHeight(null) + 15, p_quest);
			 b7.setSize(variables.container.getWidth(null), variables.container.getHeight(null));
			 b7.setOpaque(false);
			 b7.setContentAreaFilled(false);
			 b7.setBorderPainted(false);
			 if (Trash.num8) b7.img = variables.container;

			 b7.w = variables.container.getWidth(null);
			 b7.h = variables.container.getHeight(null);
		 }
	     //////////////////////////////////////////////
	 if(Trash.num9) {
		 b8 = new MainBut();
		 b8.MenuButt(23, "", variables.apple.getWidth(null) + variables.cd.getWidth(null) + variables.container.getWidth(null) + 10, variables.glass.getHeight(null) + 15, p_quest);
		 b8.setSize(variables.plastic_bag.getWidth(null), variables.plastic_bag.getHeight(null));
		 b8.setOpaque(false);
		 b8.setContentAreaFilled(false);
		 b8.setBorderPainted(false);
		 if (Trash.num9) b8.img = variables.plastic_bag;

		 b8.w = variables.plastic_bag.getWidth(null);
		 b8.h = variables.plastic_bag.getHeight(null);
	 }
	     //////////////////////////////////////////////
	 if(Trash.num10) {
		 b9 = new MainBut();
		 b9.MenuButt(24, "", variables.apple.getWidth(null) + variables.cd.getWidth(null) + variables.container.getWidth(null) + variables.plastic_bag.getWidth(null) + 10, variables.glass.getHeight(null) + 15, p_quest);
		 b9.setSize(variables.cardboard.getWidth(null), variables.cardboard.getHeight(null));
		 b9.setOpaque(false);
		 b9.setContentAreaFilled(false);
		 b9.setBorderPainted(false);
		 if (Trash.num10) b9.img = variables.cardboard;

		 b9.w = variables.cardboard.getWidth(null);
		 b9.h = variables.cardboard.getHeight(null);
	 }
	     //////////////////////////////////////////////
	 if(Trash.num11) {
		 b10 = new MainBut();
		 b10.MenuButt(25, "", 10, variables.glass.getHeight(null) + variables.cardboard.getHeight(null) + 15, p_quest);
		 b10.setSize(variables.cap.getWidth(null), variables.cap.getHeight(null));
		 b10.setOpaque(false);
		 b10.setContentAreaFilled(false);
		 b10.setBorderPainted(false);
		 if (Trash.num11) b10.img = variables.cap;

		 b10.w = variables.cap.getWidth(null);
		 b10.h = variables.cap.getHeight(null);
	 }
	     //////////////////////////////////////////////
	 if(Trash.num12) {
		 b11 = new MainBut();
		 b11.MenuButt(26, "", variables.cap.getWidth(null) + 10, variables.glass.getHeight(null) + variables.cardboard.getHeight(null) + 15, p_quest);
		 b11.setSize(variables.chips.getWidth(null), variables.chips.getHeight(null));
		 b11.setOpaque(false);
		 b11.setContentAreaFilled(false);
		 b11.setBorderPainted(false);
		 if (Trash.num12) b11.img = variables.chips;

		 b11.w = variables.chips.getWidth(null);
		 b11.h = variables.chips.getHeight(null);
	 }
	     //////////////////////////////////////////////
	 if(Trash.num13) {
		 b12 = new MainBut();
		 b12.MenuButt(27, "", variables.cap.getWidth(null) + variables.chips.getWidth(null) + 10, variables.glass.getHeight(null) + variables.cardboard.getHeight(null) + 15, p_quest);
		 b12.setSize(variables.m_2.getWidth(null), variables.m_2.getHeight(null));
		 b12.setOpaque(false);
		 b12.setContentAreaFilled(false);
		 b12.setBorderPainted(false);
		 if (Trash.num13) b12.img = variables.m_2;

		 b12.w = variables.m_2.getWidth(null);
		 b12.h = variables.m_2.getHeight(null);
	 }
	     //////////////////////////////////////////////
*/
//1-пластик, 2-бумага, 3-стекло, 4-органический, 5-металл, 0-нельзя перерабатывать
	 obj(container,2,1,bb1,variables.m_2);
	 obj(container,1,2,bb2,variables.plastic);
	 obj(container,5,3,bb3,variables.met);
	 obj(container,4,4,bb4,variables.org);
	 obj(container,3,5,bb5,variables.glass);
	 obj(container,4,6,bb6,variables.apple);
	 obj(container,0,7,bb7,variables.cd);
	 obj(container,0,8,bb8,variables.container);
	 obj(container,0,9,bb9,variables.plastic_bag);
	 obj(container,2,10,bb10,variables.cardboard);
	 obj(container,5,11,bb11,variables.cap);
	 obj(container,0,12,bb12,variables.chips);
	 obj(container,2,13,bb13,variables.m_2);



		 p_quest.setLayout(null);

		 f_quest.add(p_quest);
	     Button.but_close(p_quest,f_quest);
  }



	public void obj(int cont , int type, int num, JButton bb,Image img) {


		bb = new JButton(){
			protected void paintComponent(Graphics g){
				super.paintComponent(g);

				switch (num){
					case 1:  if(Trash.num1){g.drawImage(img,0,0,variables.m_2.getWidth(null),variables.m_2.getHeight(null),null);}  break;
					case 2:  if(Trash.num2){g.drawImage(img,0,0,variables.plastic.getWidth(null),variables.plastic.getHeight(null),null);} break;
					case 3:  if(Trash.num3){g.drawImage(img,0,0,variables.met.getWidth(null),variables.met.getHeight(null),null);}break;
					case 4:  if(Trash.num4){g.drawImage(img,0,0,variables.org.getWidth(null),variables.org.getHeight(null),null);} break;
					case 5:  if(Trash.num5){g.drawImage(img,0,0,variables.glass.getWidth(null),variables.glass.getHeight(null),null);} break;
					case 6:  if(Trash.num6){g.drawImage(img,0,0,variables.apple.getWidth(null),variables.apple.getHeight(null),null);} break;
					case 7:  if(Trash.num7){g.drawImage(img,0,0,variables.cd.getWidth(null),variables.cd.getHeight(null),null);} break;
					case 8:  if(Trash.num8){g.drawImage(img,0,0,variables.container.getWidth(null),variables.container.getHeight(null),null);} break;
					case 9:  if(Trash.num9){g.drawImage(img,0,0,variables.plastic_bag.getWidth(null),variables.plastic_bag.getHeight(null),null);} break;
					case 10: if(Trash.num10){g.drawImage(img,0,0,variables.cardboard.getWidth(null),variables.cardboard.getHeight(null),null);} break;
					case 11: if(Trash.num11){g.drawImage(img,0,0,variables.cap.getWidth(null),variables.cap.getHeight(null),null);} break;
					case 12: if(Trash.num12){g.drawImage(img,0,0,variables.chips.getWidth(null),variables.chips.getHeight(null),null);} break;
					case 13: if(Trash.num13){g.drawImage(img,0,0,variables.m_2.getWidth(null),variables.m_2.getHeight(null),null);} break;
				}
			}
		};

		switch (num){
			case 1: bb.setBounds(10,10,variables.m_2.getWidth(null),variables.m_2.getHeight(null));break;
			case 2: bb.setBounds(variables.m_2.getWidth(null) + 10, 10,variables.plastic.getWidth(null),variables.plastic.getHeight(null)); break;
			case 3: bb.setBounds( variables.org.getWidth(null)+variables.glass.getWidth(null)+variables.plastic.getWidth(null)+variables.m_2.getWidth(null)+10, 10,variables.met.getWidth(null),variables.met.getHeight(null));break;
			case 4: bb.setBounds(variables.glass.getWidth(null)+variables.plastic.getWidth(null)+variables.m_2.getWidth(null)+10, 10,variables.org.getWidth(null),variables.org.getHeight(null));break;
			case 5: bb.setBounds(variables.plastic.getWidth(null) + variables.m_2.getWidth(null) + 10, 10,variables.glass.getWidth(null),variables.glass.getHeight(null)); break;
			case 6: bb.setBounds(10, variables.glass.getHeight(null) + 15,variables.apple.getWidth(null),variables.apple.getHeight(null)); break;
			case 7: bb.setBounds(variables.apple.getWidth(null) + 10, variables.glass.getHeight(null) + 15,variables.cd.getWidth(null),variables.cd.getHeight(null));break;
			case 8: bb.setBounds(variables.apple.getWidth(null) + variables.cd.getWidth(null) + 10, variables.glass.getHeight(null) + 15,variables.container.getWidth(null),variables.container.getHeight(null));break;
			case 9: bb.setBounds(variables.apple.getWidth(null) + variables.cd.getWidth(null) + variables.container.getWidth(null) + 10, variables.glass.getHeight(null) + 15,variables.plastic_bag.getWidth(null),variables.plastic_bag.getHeight(null));break;
			case 10:bb.setBounds(variables.apple.getWidth(null) + variables.cd.getWidth(null) + variables.container.getWidth(null) + variables.plastic_bag.getWidth(null) + 10, variables.glass.getHeight(null) + 15,variables.cardboard.getWidth(null),variables.cardboard.getHeight(null)); break;
			case 11:bb.setBounds(10, variables.glass.getHeight(null) + variables.cardboard.getHeight(null) + 15,variables.cap.getWidth(null),variables.cap.getHeight(null)); break;
			case 12:bb.setBounds(variables.cap.getWidth(null) + 10, variables.glass.getHeight(null) + variables.cardboard.getHeight(null) + 15,variables.chips.getWidth(null),variables.chips.getHeight(null)); break;
			case 13:bb.setBounds(variables.cap.getWidth(null) + variables.chips.getWidth(null) + 10, variables.glass.getHeight(null) + variables.cardboard.getHeight(null) + 15,variables.m_2.getWidth(null),variables.m_2.getHeight(null)); break;
		}
		bb.setOpaque(false);
		bb.setContentAreaFilled(false);
		bb.setBorderPainted(false);

       // this.image=img;
		bb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if(container == type){

					Point.pl=true;
					new Point();
					Container.point++;

					if(num==1){
						Trash.num1=false;
					}
					if(num==2){
						Trash.num2=false;
					}
					if(num==3){
						Trash.num3=false;
					}
					if(num==4){
						Trash.num4=false;
					}
					if(num==5){
						Trash.num5=false;
					}
					if(num==6){
						Trash.num6=false;
					}
					if(num==7){
						Trash.num7=false;
					}
					if(num==8){
						Trash.num8=false;
					}
					if(num==9){
						Trash.num9=false;
					}
					if(num==10){
						Trash.num10=false;
					}
					if(num==11){
						Trash.num11=false;
					}
					if(num==12){
						Trash.num12=false;
					}
					if(num==13){
						Trash.num13=false;
					}
					p_quest.repaint();
				}

				else{
					Minus.min=true;
					new Minus();

                            // image=variables.red;

					//switch (num){
					//	case 1: image=variables.red; break;
				//		case 2: break;
				//	}

                   Container.point--;
					p_quest.repaint();
				}
			}
		});
		p_quest.add(bb);
		bb.setVisible(true);

	}
}


