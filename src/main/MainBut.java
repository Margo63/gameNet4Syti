package main;

import java.awt.Graphics;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import game.Button;
import game.Settings;
import game.lvl;
import game1.*;

import game3.Hospitale_Room;
import game3.House;
import game3.Office;
import game3.Shop;
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
					
					case 7:   System.out.println("В игру!");
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
					
					case 9: if(Container.cont2 && Trash.point_pap>0&&Trash.num1) { Container.point++;
					        Point.pl=true;
					        new Point();
					    	Trash.point_pap--;
					    	Trash.num1=false;
					    	Quest.b.setVisible(false);
					        }

						    //Quest.f_quest.dispose();
						    Quest.p_quest.repaint(); 
						    break;
						    
					case 10: if(Container.cont1 && Trash.point_pl>0&&Trash.num2) { Container.point++;
					         Point.pl=true;
					         new Point();
						     Trash.point_pl--;
						     Trash.num2=false;
						     Quest.b1.setVisible(false);
					         }

						     //Quest.f_quest.dispose();
					         Quest.p_quest.repaint(); 
					         break;
					         
					case 11: if(Container.cont3 && Trash.point_gl>0&&Trash.num5) { Container.point++;
					         Point.pl=true;
					         new Point();
						     Trash.point_gl--;
						     Trash.num5=false;
						     Quest.b2.setVisible(false);
					         }

                            // Quest.f_quest.dispose();
						     Quest.p_quest.repaint(); 
						     break;
						     
					case 12: if(Container.cont4 && Trash.point_org>0&&Trash.num4) { Container.point++;
					         Point.pl=true;
					         new Point();
					         Trash.point_org--;
					         Trash.num4=false;
					         Quest.b3.setVisible(false);

					}
					        // if(Trash.point_org>0) Trash.point_org--;
                            // Quest.f_quest.dispose();
						     Quest.p_quest.repaint();
						     break;
						     
					case 13: if(Container.cont5 && Trash.point_met>0&&Trash.num3) {
						     Container.point++; 
					         Point.pl=true;
					         new Point();
						     Trash.point_met--;
						     Trash.num3=false;
						     Quest.b4.setVisible(false);
					         }

					        // Quest.f_quest.dispose();
					         Quest.p_quest.repaint(); 
					         break;

					case 20:
						if(Container.cont4 && Trash.point_org>0&&Trash.num6) {
							Container.point++;
							Point.pl=true;
							new Point();
							Trash.point_org--;
							Trash.num6=false;
							Quest.b5.setVisible(false);
						}
						//if(Trash.point_org>0)Trash.point_org--;
						// Quest.f_quest.dispose();
						Quest.p_quest.repaint();
						break;

					case 21:
						if(Container.cont0 && Trash.point_no>0&&Trash.num7) {
							Container.point++;
							Point.pl=true;
							new Point();
							Trash.point_no--;
							Trash.num7=false;
							Quest.b6.setVisible(false);
						}
							Quest.p_quest.repaint();
						break;
					case 22:
						if(Container.cont0 && Trash.point_no>0&&Trash.num8) {
							Container.point++;
							Point.pl=true;
							new Point();
							Trash.point_no--;
							Trash.num8=false;
							Quest.b7.setVisible(false);
						}

						// Quest.f_quest.dispose();
						Quest.p_quest.repaint();
						break;
					case 23:
						if(Container.cont0 && Trash.point_no>0&&Trash.num9) {
							Container.point++;
							Point.pl=true;
							new Point();
							Trash.point_no--;
							Trash.num9=false;
							Quest.b8.setVisible(false);

						}

						// Quest.f_quest.dispose();
						Quest.p_quest.repaint();
						break;
					case 24:
						if(Container.cont2 && Trash.point_pap>0&&Trash.num10) {
							Container.point++;
							Point.pl=true;
							new Point();
							Trash.point_pap--;
							Trash.num10=false;
							Quest.b9.setVisible(false);

						}

						// Quest.f_quest.dispose();
						Quest.p_quest.repaint();
						break;
					case 25:
						if(Container.cont5 && Trash.point_met>0&&Trash.num11) {
							Container.point++;
							Point.pl=true;
							new Point();
							Trash.point_met--;
							Trash.num11=false;
							Quest.b10.setVisible(false);
						}

						// Quest.f_quest.dispose();
						Quest.p_quest.repaint();
						break;
					case 26:
						if(Container.cont0 && Trash.point_no>0&&Trash.num12) {
							Container.point++;
							Point.pl=true;
							new Point();
							Trash.point_no--;
							Trash.num12=false;
							Quest.b11.setVisible(false);
						}

						// Quest.f_quest.dispose();
						Quest.p_quest.repaint();
						break;
					case 27:
						if(Container.cont2 && Trash.point_pap>0&&Trash.num13) {
							Container.point++;
							Point.pl=true;
							new Point();
							Trash.point_pap--;
							Trash.num13=false;
							Quest.b12.setVisible(false);
						}

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
							  case 0: System.out.println("просто дом"); break;
							  case 1: System.out.println("Вошел в больницу");  new Hospitale_Room(); break;
							  case 2: System.out.println("Вошел в КЦВ");       new Office(); break;
							  case 3: System.out.println("Вошел в магазин");   new Shop();break;
						  }
						Lvl3_Frame.open_frame.dispose();
						Lvl3_Frame.open_panel.repaint();
						break;

					case 18:
						Lvl3_Frame.open_frame.dispose();
						Lvl3_Frame.open_panel.repaint();
						break;

                    case 19:
                        if(Hospitale_Room.type==1) Inventory.blood=true;
                        if(Hospitale_Room.type==2 && Inventory.blood==true) Inventory.blood=false;
                        if(Hospitale_Room.type==3) variables.gameLvl=-3;

                        //Hospitale_Room.f_blood.dispose();
						Hospitale_Room.f_blood.setVisible(false);
						Hospitale_Room.p_blood.repaint();
						System.out.println("close");
                        break;

					case 29:
						Office.t_1=true;
						Office.task_1.setVisible(false);
						Office.p_office.repaint();
                         break;
					case 30:
						Office.t_2=true;
						Office.task_2.setVisible(false);
						Office.p_office.repaint();
						break;
					case 31:
						Office.t_3=true;
						Office.task_3.setVisible(false);
						Office.p_office.repaint();
						break;
					case 32:
						Office.t_4=true;
						Office.task_4.setVisible(false);
						Office.p_office.repaint();
						break;
					case 28:
						new Settings();
                        break;

					case -1:

						break;

					
					
				}
			}
		});
			
				
				

		p.add(this); //добовляем кнопку на панель

	}

	/*деаем изображение на кнопке (если нужно)*/
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0, 0, w,h, null);
	}
}
