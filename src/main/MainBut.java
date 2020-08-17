package main;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import game.Button;
import game.Settings;
import game.lvl;
import game1.*;

import game1.Container;
import game1.Panel;
import game1.Point;
import game3.*;

import game4.Choice;
import make_out.Fmini3;
import quest.*;
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
					case 1:  //System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA Choice.trueButChoice " + Choice.trueButChoice);
						if(Choice.trueButChoice){
						//	System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
							Choice.trueButChoice = false;
							Choice.q_b0.setVisible(false);
							Choice.q_b1.setVisible(false);
							Choice.q_b2.setVisible(false);
							Choice.q_b3.setVisible(false);
							Choice.q_b4.setVisible(false);
							Choice.q_b5.setVisible(false);
							Choice.q_b6.setVisible(false);
							Choice.q_b7.setVisible(false);
							Choice.q_b8.setVisible(false);
							Choice.q_b9.setVisible(false);
						}
						new selectionGame();
							 break;
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

					         new game3.Panel();
						     variables.MainPanel.repaint();
						break;


					case 100: variables.gameLvl=4;
					          new game4.Choice();
					          variables.MainPanel.repaint();

					      break;

					case 9: if(Container.cont2 && Trash.point_pap>0 && Trash.num1) {
						    Container.point++;
					        Point.pl=true;
					        new Point();
					    	Trash.point_pap--;
					    	Trash.num1=false;
					    	Quest.b.setVisible(false);
					        }


						    //Quest.f_quest.dispose();
						    Quest.p_quest.repaint();

					       if(Container.cont2 && Trash.point_pap<=0){

						   }
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
							Quest.b12.img=variables.null_image;
						}

						// Quest.f_quest.dispose();
						Quest.p_quest.repaint();
						break;

					case 14:
						Container.point++;
						Point.pl=true;
				        new Point();


				       // Car.b1.setVisible(false);
				      //  Car.b2.setVisible(false);
				       // Car.b3.setVisible(false);

						Car.p.remove(Car.b1);
						Car.p.remove(Car.b2);
						Car.p.remove(Car.b3);

				        variables.car_panel=variables.mol;

				        //Car.f.dispose();
				        Car.p.repaint();
						break;

					case 15:
						Car.f.remove(Car.b1);
						Car.f.remove(Car.b2);
						Car.f.remove(Car.b3);
				        variables.car_panel=variables.ok;

                        //Car.f.dispose();
				        Car.p.repaint();
						break;

					case 16:
						Car.f.remove(Car.b1);
						Car.f.remove(Car.b2);
						Car.f.remove(Car.b3);
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
							  case 0: System.out.println("просто дом"); if(Office.t_2||Office.t_3||Office.t_4)

								  variables.gameLvl=-6;
								  Button.but.setVisible(false);
								  variables.MainPanel.repaint();

								  break;
							  case 1: System.out.println("Вошел в больницу");  if(Office.t_1)


							  	new Hospitale_Room(); break;
							  case 2: System.out.println("Вошел в КЦВ");       new Office(); break;
							  case 3: System.out.println("Вошел в магазин");   if(Office.t_2||Office.t_3)
								   new Shop();break;
						  }
						Lvl3_Frame.open_frame.dispose();
						//Lvl3_Frame.open_panel.repaint();
						break;

					case 18:
						Lvl3_Frame.open_frame.dispose();
						//Lvl3_Frame.open_panel.repaint();
						break;

                    case 19:
						if(Hospitale_Room.type==1) Inventory.blood=true;
                        if(Hospitale_Room.type==2 && Inventory.blood==true) {
                            Inventory.blood=false;

                            Container.point++;
                            Point.pl=true;
                            new Point();
                            Office.t_1=false;
                            Office.x1=0;
                            Office.p_office.repaint();
							Office.task_1.repaint();

                        }
                        if(Hospitale_Room.type==3) variables.gameLvl=-3;

                        Hospitale_Room.f_blood.dispose();
						//Hospitale_Room.f_blood.setVisible(false);

						//System.out.println("close");
                        break;

				/*	case 29:
						Office.t_1=true;
						Office.task_1.img=variables.fon1;

						Office.p_office.repaint();
                         break;
					case 30:
						Office.t_2=true;
						Office.task_2.img=variables.fon1;
						variables.task1=variables.fon1;
						Office.p_office.repaint();
						break;
					case 31:
						Office.t_3=true;
						Office.task_3.img=variables.fon1;
						Office.p_office.repaint();
						break;
					case 32:
						Office.t_4=true;
						Office.task_4.img=variables.fon1;
						Office.p_office.repaint();
						break;
*/
					case 33:
						Flat.f_ask.dispose();
						Flat.f_dog.dispose();

						switch(Flat.type_frame){
							case 1:

								Fruit.f_4=false;   Vegetables.v_5=false;Bread.b_3=false;Milk.mi_1=false;Grocery.g_2=false;Meat.me_1=false;
								Container.point++;
								Point.pl=true;
								new Point();
								Office.t_2=false;

							break;
							case 2:

								Fruit.f_3=false;  Vegetables.v_1=false;   Bread.b_1=false;  Milk.mi_4=false;  Grocery.g_7=false;  Meat.me_3=false;  Candy.c_3=false;
								Container.point++;
								Point.pl=true;
								new Point();
								Office.t_3=false;

							break;

						}


						break;




					case -1:
						Fruit.f_1=true;
						Fruit.b1.setVisible(false);
						Fruit.p.repaint();
						break;

					case -2:
						Fruit.f_2=true;
                        Fruit.b2.setVisible(false);
						Fruit.p.repaint();
						break;

					case -3:
						Fruit.f_3=true;
                        Fruit.b3.setVisible(false);
						Fruit.p.repaint();
						break;

					case -4:
						Fruit.f_4=true;
                        Fruit.b4.setVisible(false);
						Fruit.p.repaint();
						break;

					case -5:
						Fruit.f_5=true;
                        Fruit.b5.setVisible(false);
						Fruit.p.repaint();
						break;

					case -6:
						Vegetables.v_1=true;
						Vegetables.b1.setVisible(false);
						Vegetables.p.repaint();
						break;

					case -7:
						Vegetables.v_2=true;
						Vegetables.b2.setVisible(false);
						Vegetables.p.repaint();
						break;

					case -8:
						Vegetables.v_3=true;
						Vegetables.b3.setVisible(false);
						Vegetables.p.repaint();
						break;

					case -9:
						Vegetables.v_4=true;
						Vegetables.b4.setVisible(false);
						Vegetables.p.repaint();
						break;

					case -10:
						Vegetables.v_5=true;
						Vegetables.b5.setVisible(false);
						Vegetables.p.repaint();
						break;

					case -11:
						Grocery.g_1=true;
						Grocery.b1.setVisible(false);
						Grocery.p.repaint();
						break;

					case -12:
						Grocery.g_2=true;
						Grocery.b2.setVisible(false);
						Grocery.p.repaint();
						break;

					case -13:
						Grocery.g_3=true;
						Grocery.b3.setVisible(false);
						Grocery.p.repaint();
						break;

					case -14:
						Grocery.g_4=true;
						Grocery.b4.setVisible(false);
						Grocery.p.repaint();
						break;

					case -15:
						Grocery.g_5=true;
						Grocery.b5.setVisible(false);
						Grocery.p.repaint();
						break;

					case -16:
						Grocery.g_6=true;
						Grocery.b6.setVisible(false);
						Grocery.p.repaint();
						break;

					case -17:
						Grocery.g_7=true;
						Grocery.b7.setVisible(false);
						Grocery.p.repaint();
						break;

					case -18:
						Milk.mi_1=true;
						Milk.b1.setVisible(false);
						Milk.p.repaint();
						break;

					case -19:
						Milk.mi_2=true;
						Milk.b2.setVisible(false);
						Milk.p.repaint();
						break;

					case -20:
						Milk.mi_3=true;
						Milk.b3.setVisible(false);
						Milk.p.repaint();
						break;

					case -21:
						Milk.mi_4=true;
						Milk.b4.setVisible(false);
						Milk.p.repaint();
						break;

					case -22:
						Bread.b_1=true;
						Bread.b1.setVisible(false);
						Bread.p.repaint();
						break;

					case -23:
						Bread.b_2=true;
						Bread.b2.setVisible(false);
						Bread.p.repaint();
						break;

					case -24:
						Bread.b_3=true;
						Bread.b3.setVisible(false);
						Bread.p.repaint();
						break;

					case -25:
						Meat.me_1=true;
						Meat.b1.setVisible(false);
						Meat.p.repaint();
						break;

					case -26:
						Meat.me_2=true;
						Meat.b2.setVisible(false);
						Meat.p.repaint();
						break;

					case -27:
						Meat.me_3=true;
						Meat.b3.setVisible(false);
						Meat.p.repaint();
						break;

					case -28:
						Candy.c_1=true;
						Candy.b1.setVisible(false);
						Candy.p.repaint();
						break;

					case -29:
						Candy.c_2=true;
						Candy.b2.setVisible(false);
						Candy.p.repaint();
						break;

					case -30:
						Candy.c_3=true;
						Candy.b3.setVisible(false);
						Candy.p.repaint();
						break;

					case 28:
						new Settings();
                        break;




				}
			}
		});




		p.add(this); //добовляем кнопку на панель

	}

	public void Product(int x,int y,Image im,JPanel p){

	}

	/*деаем изображение на кнопке (если нужно)*/
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0, 0, w,h, null);
	}
}
