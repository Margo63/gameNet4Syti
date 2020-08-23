package game1;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import game.Button;
import game3.Office;
import main.MainBut;
import main.variables;
import player.Player;

public class Car {
public static MainBut b1;	
public static MainBut b2;
public static MainBut b3;
public static Image im1,im2,im3;
JButton button1,button2,button3;
public static JPanel p;
public static JFrame f=null;
int h;
int kol=0;
public int x,y,type;
public Image img;
public int x1=0,x2=0,x3=0;
public boolean but1=false,but2=false,but3=false;
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

						 h = 1;
						if(Player.ee){
							frame();
						}

						 break;

					 case 2:
						 h = 2;
						 if(Player.ee){
						 	frame();
						 }
						 break;
				 }
			 }
		 else {
		 	e_car=false;


		 }
	
}
	public void car_move() {
		x-=Panel.player.directionX/3;
		y-=Panel.player.directionY/3;
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
				 
        	}
        };
		p.setLayout(null);
		if(h==1) {
/*

           if(!but1){
			   button1 = new JButton(){
				   protected void paintComponent(Graphics g){
					   im1=new ImageIcon("image/game3/task/task1.png").getImage();
					   g.drawImage(im1,0,0,null);

				   }
			   };



			   button1.setBounds(x1, 0, variables.task1.getWidth(null), variables.task1.getHeight(null));
			   button1.setOpaque(false);
			   button1.setContentAreaFilled(false);
			   button1.setBorderPainted(false);
			   button1.setVisible(true);
			   button1.addActionListener(new ActionListener() {
				   @Override
				   public void actionPerformed(ActionEvent e) {
					   //x2=1000;
					   button1.setVisible(false);
					   button2.setVisible(false);
					   button3.setVisible(false);
					   im1=variables.null_image;
					   im2=variables.null_image;
					   im3=variables.null_image;
					   x1=1000;
					   x2=1000;
					   x3=1000;
					   but1=true;
					   variables.car_panel=variables.mol;
					   //variables.task2=variables.null_image;
				   }
			   });
			   p.add(button1);

		   }
             if(!but2) {
				 button2 = new JButton() {
					 protected void paintComponent(Graphics g) {
						 im2 = new ImageIcon("image/game3/task/task2.png").getImage();
						 g.drawImage(im2, 0, 0, null);

					 }
				 };


				 button2.setBounds(x2, 60, variables.task1.getWidth(null), variables.task1.getHeight(null));
				 button2.setOpaque(false);
				 button2.setContentAreaFilled(false);
				 button2.setBorderPainted(false);
				 button2.setVisible(true);
				 button2.addActionListener(new ActionListener() {
					 @Override
					 public void actionPerformed(ActionEvent e) {
						 //x2=1000;
						 button1.setVisible(false);
						 button2.setVisible(false);
						 button3.setVisible(false);
						 im1 = variables.null_image;
						 im2 = variables.null_image;
						 im3 = variables.null_image;
						 x1 = 1000;
						 x2 = 1000;
						 x3 = 1000;
						 but2 = true;
						 variables.car_panel = variables.ok;

					 }
				 });
				 p.add(button2);
			 }
             if(!but3) {
				 button3 = new JButton() {
					 protected void paintComponent(Graphics g) {
						 im3 = new ImageIcon("image/game3/task/task3.png").getImage();
						 g.drawImage(im3, 0, 0, null);

					 }
				 };


				 button3.setBounds(x2, 120, variables.task1.getWidth(null), variables.task1.getHeight(null));
				 button3.setOpaque(false);
				 button3.setContentAreaFilled(false);
				 button3.setBorderPainted(false);
				 button3.setVisible(true);
				 button3.addActionListener(new ActionListener() {
					 @Override
					 public void actionPerformed(ActionEvent e) {
						 //x2=1000;
						 button1.setVisible(false);
						 button2.setVisible(false);
						 button3.setVisible(false);
						 im1 = variables.null_image;
						 im2 = variables.null_image;
						 im3 = variables.null_image;
						 x1 = 1000;
						 x2 = 1000;
						 x3 = 1000;
						 but3 = true;
						 variables.car_panel = variables.net;

					 }
				 });
				 p.add(button3);
			 }
*/

			b1 = new MainBut();
		    b1.MenuButt(14,"Сообщить владельцу",10 ,50 , p);
		    b1.setSize(f.getWidth()-20,50);
		    b1.img=variables.task1;

			b2 = new MainBut();
		    b2.MenuButt(15,"Оставить как есть",10 ,110 , p);
		    b2.setSize(f.getWidth()-20,50);
		    b2.img= variables.task2;

		    b3 = new MainBut();
		    b3.MenuButt(16,"Убрать самому",10 ,170 , p);
		    b3.setSize(f.getWidth()-20,50);
		    b3.img=variables.task3;


		}
		
		if (h==2) {

			b1 = new MainBut();
		    b1.MenuButt(14,"Позвонить владельцу",10 ,50 , p);
		    b1.setSize(f.getWidth()-20,50);
			b1.img=variables.task1;

			b2 = new MainBut();
		    b2.MenuButt(16,"Попробовать самому открыть машину",10 ,110 , p);
		    b2.setSize(f.getWidth()-20,50);
			b2.img=variables.task2;

		    b3 = new MainBut();
		    b3.MenuButt(15,"Оставить как есть",10 ,170 , p);
		    b3.setSize(f.getWidth()-20,50);
			b3.img=variables.task3;


		}
		
		f.add(p);
		Button.but_close(p,f);
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
