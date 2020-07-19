package main;

import java.awt.Graphics;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import game.Button;
import game.lvl;
import game1.*;

import game3.Hospitale_Room;
import game3.House;
import make_out.Fmini3;
import quest.Lvl3_Frame;
import quest.Quest;
import selection.selectionGame;;


public class MainBut extends JButton { 
	public Image img;
	public JPanel p;
    public    int w,h;

	public MainBut() {
	}


	public void MenuButt(int cl, String str, int x, int y, JPanel p){
		this.p=p;
		this.setText(str);
		this.setBounds(x, y, 150, 50); 
		this.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(cl){
					case 1:  new selectionGame();  break;
					case 2:  new Interface.infoFrame(); break;
					case 3:  System.exit(0); break;
					case 4:  Interface.infoFrame.frameI.dispose(); break;
					case 5:   new Interface.infoFrame(); break;
					
					case 6:   new Panel(); variables.gameLvl=1; variables.MainPanel.repaint(); 
					          new MainTimer(); 
					          break;
					
					case 7:   System.out.println("� ����!");
							  variables.gameLvl= 2;
						      //Button.button_3();
							  new game2.Panel();
					          break;
					
					case 8:  variables.gameLvl = 3;




						try {
							Button.but_3.setVisible(false);
						}
						catch(NullPointerException nullPointerException) {


						}

					         System.out.println("game");

					         new game3.Panel();
						     variables.MainPanel.repaint();
						break;
					
					case 9: if(Container.cont2 && Trash.point_pap>0) { Container.point++; 
					        Point.pl=true;
					        new Point();}
						    if(Trash.point_pap>0)Trash.point_pap--;
						    //Quest.f_quest.dispose();
						    Quest.p_quest.repaint(); 
						    break;
						    
					case 10: if(Container.cont1 && Trash.point_pl>0) { Container.point++;
					         Point.pl=true;
					         new Point();}
						     if(Trash.point_pl>0)Trash.point_pl--;
						     //Quest.f_quest.dispose();
					         Quest.p_quest.repaint(); 
					         break;
					         
					case 11: if(Container.cont3 && Trash.point_gl>0) { Container.point++;
					         Point.pl=true;
					         new Point();}
					         if(Trash.point_gl>0)Trash.point_gl--;
                            // Quest.f_quest.dispose();
						     Quest.p_quest.repaint(); 
						     break;
						     
					case 12: if(Container.cont4 && Trash.point_org>0) { Container.point++;
					         Point.pl=true;
					         new Point();}
					         if(Trash.point_org>0) Trash.point_org--;
                            // Quest.f_quest.dispose();
						     Quest.p_quest.repaint();
						     break;
						     
					case 13: if(Container.cont5 && Trash.point_met>0) {
						     Container.point++; 
					         Point.pl=true;
					         new Point();
					         }
					         if(Trash.point_met>0)Trash.point_met--;
					        // Quest.f_quest.dispose();
					         Quest.p_quest.repaint(); 
					         break;
					         
					case 14:
						Container.point++; 
						Point.pl=true;
				        new Point();
				        Car.b1.setVisible(false);
				        Car.b2.setVisible(false);
				        Car.b3.setVisible(false);
				        variables.car_panel=variables.mol;
				        //Car.f.dispose();
				        Car.p.repaint();
						break;
						
					case 15:
						Car.b1.setVisible(false);
				        Car.b2.setVisible(false);
				        Car.b3.setVisible(false);
				        variables.car_panel=variables.ok;
                        //Car.f.dispose();
				        Car.p.repaint();
						break;
					
					case 16:
						Car.b1.setVisible(false);
				        Car.b2.setVisible(false);
				        Car.b3.setVisible(false);
				        variables.car_panel=variables.net;
                        //Car.f.dispose();
				        Car.p.repaint();
						break;

					case 17:

                        Button.button_3();

                        try {
                            Button.but_3.setVisible(true);
                        }
                        catch(NullPointerException nullPointerException) {
                            MainBut but_3 = new MainBut();
                            variables.MainPanel.add(but_3);
                        }


                          switch(House.w_h){
							  case 0: System.out.println("������ ���"); break;
							  case 1: System.out.println("����� � ��������");  new Hospitale_Room(); break;
							  case 2: System.out.println("����� � ���"); break;
							  case 3: System.out.println("����� � �������"); break;
						  }
						break;

					case 18:
						Lvl3_Frame.open_frame.dispose();
						Lvl3_Frame.open_panel.repaint();
						break;

                    case 19:
                        if(Hospitale_Room.type==1) Inventory.blood=1;
                        if(Hospitale_Room.type==2) Inventory.blood=0;
						if(Hospitale_Room.type==3) variables.gameLvl=-3;
                        break;
					
					
				}
			}
		});
			
				
				

		p.add(this); //��������� ������ �� ������

	}

	/*����� ����������� �� ������ (���� �����)*/
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0, 0, w,h, null);
	}
}
