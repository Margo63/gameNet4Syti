package game1;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import game.Button;
import game3.Office;
import main.MainBut;
import main.Time_Police;
import main.variables;
import player.Player;

public class Car {

public static ImageIcon image;
public static Image im1,im2,im3,iim1,iim2,iim3;
JButton button1,button2,button3,bbutton1,bbutton2,bbutton3;
public static JPanel p,p2;
public static JFrame f=null,f2=null;
int h;

public int x,y,type;
public Image img;
public int x1=5,x2=5,x3=5;
public boolean but1=false,but2=false,but3=false;
public int xx1=5,xx2=5,xx3=5;
public boolean bbut1=false,bbut2=false,bbut3=false;
public  boolean e_car=false;


    public Car(Image im,int x,int y,int type_car,boolean e_car){
       this.e_car=e_car;
       this.img=im;
       this.x=x;
       this.y=y;
       this.type=type_car;    //1-машина с бензином,  2-машина с собакой
    }
	public void car_coll() {
		 if(Panel.player.x-Panel.player.directionX*5+Panel.player.pers.getWidth(null)>=x &&
					Panel.player.x-Panel.player.directionX*5<=x+img.getWidth(null) &&
					Panel.player.y+Panel.player.directionY*5<y+img.getHeight(null) &&
					Panel.player.y+Panel.player.directionY*5+Panel.player.pers.getHeight(null)>=y) {


                 e_car=true;

				 switch (type) {
					 case 1:

						if(Player.ee){
							frame();
						}

						 break;

					 case 2:
						 if(Player.ee){
						 	frame_2();
						 }
						 break;
				 }
			 }
		 else {
		 	e_car=false;


		 }
	
}
	public void car_move() {
		x-=Panel.player.directionX/5;
		y-=Panel.player.directionY/5;
	}
	
	public void frame() {

    	Player.ee=false;

		variables.car_panel=variables.null_image;
		if(f==null){
			f= new JFrame();
			f.setUndecorated(true);
			f.setBounds(variables.width/2-variables.width/6,variables.height/2-variables.height/6,variables.width/3,variables.height/3);

		}

		f.setVisible(true);
	        p =new JPanel() {
        	protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(variables.white_fon,  0,0, variables.width,variables.height,   null);
				 g.drawImage(variables.car_panel, 0,0,variables.width/3,variables.height/3, null);
				g.drawImage(variables.line2,  f.getWidth()-2, 0, 2,variables.height,   null);
				g.drawImage(variables.line2,  0, 0, 2,variables.height,   null);
				g.drawImage(variables.line1,  0, 0, variables.width,2,   null);
				g.drawImage(variables.line1,  0, f.getHeight()-2, variables.width,2,   null);
				 
        	}
        };
		p.setLayout(null);






			if (!but1){

				button1 = new JButton(){
					protected void paintComponent(Graphics g){
						super.paintComponent(g);
						im1= new ImageIcon("image/1/c3.png").getImage();//багет
						if(!but1){
							g.drawImage(im1,0,0,null);
						}

						//g.drawImage(new ImageIcon("image/game3/task/task1.png").getImage(),0,0,null);
					}
				};

				button1.setBounds(x1, 5, 300, 50);

				button1.setOpaque(false);
				button1.setContentAreaFilled(false);
				button1.setBorderPainted(false);

				button1.setVisible(true);

				button1.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						x1=1000;
						button1.setVisible(false);
						but1=true;
						im1=variables.null_image;


						x2=1000;
						button2.setVisible(false);
						but2=true;
						im2=variables.null_image;


						x3=1000;
						button3.setVisible(false);
						but3=true;
						im3=variables.null_image;

						variables.car_panel=variables.mol;

						p.repaint();
					}
				});
				p.add(button1);
			}
			if (!but2){

				button2 = new JButton(){
					protected void paintComponent(Graphics g){
						super.paintComponent(g);
						im2= new ImageIcon("image/1/c2.png").getImage();//багет
						if(!but2){
							g.drawImage(im2,0,0,null);
						}

						//g.drawImage(new ImageIcon("image/game3/task/task1.png").getImage(),0,0,null);
					}
				};

				button2.setBounds(x2, 65, 300, 50);

				button2.setOpaque(false);
				button2.setContentAreaFilled(false);
				button2.setBorderPainted(false);

				button2.setVisible(true);

				button2.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {


						x1=1000;
						button1.setVisible(false);
						but1=true;
						im1=variables.null_image;
						x2=1000;
						button2.setVisible(false);
						but2=true;
						im2=variables.null_image;
						x3=1000;
						button3.setVisible(false);
						but3=true;
						im3=variables.null_image;

						variables.car_panel=variables.ok;
						p.repaint();
					}
				});
				p.add(button2);
			}

           if (!but3){

            button3 = new JButton(){
                protected void paintComponent(Graphics g){
                    super.paintComponent(g);
                    im3= new ImageIcon("image/1/c1.png").getImage();//багет
                    if(!but3){
                     g.drawImage(im3,0,0,null);
                    }

					//g.drawImage(new ImageIcon("image/game3/task/task1.png").getImage(),0,0,null);
                }
            };

           button3.setBounds(x3, 125, 300, 50);

            button3.setOpaque(false);
			button3.setContentAreaFilled(false);
			button3.setBorderPainted(false);

            button3.setVisible(true);

				button3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
					x1=1000;
					button1.setVisible(false);
					but1=true;
					im1=variables.null_image;
					x2=1000;
					button2.setVisible(false);
					but2=true;
					im2=variables.null_image;
					x3=1000;
					button3.setVisible(false);
					but3=true;
					im3=variables.null_image;

					variables.car_panel=variables.net;
					p.repaint();
                }
            });
            p.add(button3);
    }


		
		f.add(p);
		Button.but_close(p,f);
	}
	public void frame_2() {

		Player.ee=false;

		variables.car_panel=variables.null_image;
		if(f2==null){
			f2= new JFrame();
			f2.setUndecorated(true);
			f2.setBounds(variables.width/2-variables.width/6,variables.height/2-variables.height/6,variables.width/3,variables.height/3);

		}

		f2.setVisible(true);
		p2 =new JPanel() {
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(variables.white_fon,  0,0, variables.width,variables.height,   null);
				g.drawImage(variables.car_panel, 0,0,variables.width/3,variables.height/3, null);
				g.drawImage(variables.line2,  f2.getWidth()-2, 0, 2,variables.height,   null);
				g.drawImage(variables.line2,  0, 0, 2,variables.height,   null);
				g.drawImage(variables.line1,  0, 0, variables.width,2,   null);
				g.drawImage(variables.line1,  0, f2.getHeight()-2, variables.width,2,   null);

			}
		};
		p2.setLayout(null);

		//if(h==1) {




			if (!bbut1){

				bbutton1 = new JButton(){
					protected void paintComponent(Graphics g){
						super.paintComponent(g);
						iim1= new ImageIcon("image/1/cc1.png").getImage();//багет
						if(!bbut1){
							g.drawImage(iim1,0,0,null);
						}

						//g.drawImage(new ImageIcon("image/game3/task/task1.png").getImage(),0,0,null);
					}
				};

				bbutton1.setBounds(xx1, 5, 350, 50);

				bbutton1.setOpaque(false);
				bbutton1.setContentAreaFilled(false);
				bbutton1.setBorderPainted(false);

				bbutton1.setVisible(true);

				bbutton1.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						xx1=1000;
						bbutton1.setVisible(false);
						bbut1=true;
						iim1=variables.null_image;
						xx2=1000;
						bbutton2.setVisible(false);
						bbut2=true;
						iim2=variables.null_image;
						xx3=1000;
						bbutton3.setVisible(false);
						bbut3=true;
						iim3=variables.null_image;

						variables.car_panel=variables.mol;

						p2.repaint();
					}
				});
				p2.add(bbutton1);
			}
			if (!bbut2){

				bbutton2 = new JButton(){
					protected void paintComponent(Graphics g){
						super.paintComponent(g);
						iim2= new ImageIcon("image/1/cc2.png").getImage();//багет
						if(!bbut2){
							g.drawImage(iim2,0,0,null);
						}

						//g.drawImage(new ImageIcon("image/game3/task/task1.png").getImage(),0,0,null);
					}
				};

				bbutton2.setBounds(xx2, 65, 350, 100);

				bbutton2.setOpaque(false);
				bbutton2.setContentAreaFilled(false);
				bbutton2.setBorderPainted(false);

				bbutton2.setVisible(true);

				bbutton2.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
                        time.stop();
						Instance.car2.img=variables.carr;

						xx1=1000;
						bbutton1.setVisible(false);
						bbut1=true;
						iim1=variables.null_image;
						xx2=1000;
						bbutton2.setVisible(false);
						bbut2=true;
						iim2=variables.null_image;
						xx3=1000;
						bbutton3.setVisible(false);
						bbut3=true;
						iim3=variables.null_image;




						variables.car_panel=variables.police;

						new Time_Police();
						p2.repaint();
						variables.MainPanel.repaint();
					}
				});
				p2.add(bbutton2);
			}

			if (!bbut3){

				bbutton3 = new JButton(){
					protected void paintComponent(Graphics g){
						super.paintComponent(g);
						iim3= new ImageIcon("image/1/c2.png").getImage();//багет
						if(!bbut3){
							g.drawImage(iim3,0,0,null);
						}

						//g.drawImage(new ImageIcon("image/game3/task/task1.png").getImage(),0,0,null);
					}
				};

				bbutton3.setBounds(xx3, 185, 350, 50);

				bbutton3.setOpaque(false);
				bbutton3.setContentAreaFilled(false);
				bbutton3.setBorderPainted(false);

				bbutton3.setVisible(true);

				bbutton3.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						xx1=1000;
						bbutton1.setVisible(false);
						bbut1=true;
						iim1=variables.null_image;
						xx2=1000;
						bbutton2.setVisible(false);
						bbut2=true;
						iim2=variables.null_image;
						xx3=1000;
						bbutton3.setVisible(false);
						bbut3=true;
						iim3=variables.null_image;

						variables.car_panel=variables.ok;
						p2.repaint();
					}
				});
				p2.add(bbutton3);
			}


		f2.add(p2);
		Button.but_close(p2,f2);
	}



int i ;
Timer time;

Image [] images = new Image [7];


	void animation() {
		time= new Timer(300, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (i<5) {
					i++;
				}
				else {
					i = 0;
				}
				img = images[i];
				variables.MainPanel.repaint();
			}
		});
		time.start();
	}
	
}
