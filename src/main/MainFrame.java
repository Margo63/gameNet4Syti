package main;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import game1.Instance;
import game1.Light;
import game1.Panel;
import game1.Point;
import game1.Trash;

import player.Player;
import quest.Quest;




public class MainFrame{

	public static MainBut but;
	public static MainBut but1;
	public static MainBut but2;

	public static JFrame frame;
	public static int lighty=variables.height-variables.height/3-variables.height/6-variables.light.getHeight(null);
	public static int lightx=300;
	public MainFrame(){
		createFrame(); 
		
	}
	void instance(){
		but = new MainBut(); 
		but.MenuButt(1, "Начать игру", variables.width/2-75, 200, variables.MainPanel); 
		
		but1 = new MainBut();
		but1.MenuButt(2, "Информация", variables.width/2-75, 300, variables.MainPanel);
		
		but2 = new MainBut();
		but2.MenuButt(3, "Закрыть игру", variables.width/2-75,  400, variables.MainPanel);

	}
	public void createFrame() {
		frame = new JFrame();
		frame.setUndecorated(true); 
		frame.setSize(variables.width, variables.height);
	
		variables.MainPanel = new JPanel(){ 
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				switch(variables.gameLvl) {
					case 0: //начальное меню
						g.drawImage(variables.fon, variables.fx, variables.fy, variables.width, variables.height, null);break;
					case -1://выбор мини-игры
						g.drawImage(variables.fonMenu, 0, 0, variables.width, variables.height, null);
						g.drawImage(variables.heart, variables.xh, variables.yh,  null);
						break;
					case 1://первая игра
						painGame1(g); //метод, где задана отрисовка
						break;
					case 2:
						painGame2(g);
						break;
					case 3:
						painGame3(g);
						break;

					case 4:
						painGame4(g);
						break;

					case -2:
                        paintHospitale(g);
						break;
					case -3:
						paintBlood(g);
						break;

					case -4:
						paintOffice(g);
						break;

					case -5:
						paintShop(g);
						break;

					case -6:
						paintFlat(g);
						break;
				}
				
			
			}
		};

		variables.MainPanel.setLayout(null); 
		instance();
		frame.add(variables.MainPanel); 
		frame.setVisible(true); 
	}
	
	
	void painGame1(Graphics g) {

		g.drawImage(variables.white_fon,  0, 0, variables.width,variables.height,   null);


		g.drawImage(Instance.gray_street.im, Instance.gray_street.x, Instance.gray_street.y, null);
		g.drawImage(Instance.gray_street2.im, Instance.gray_street2.x, Instance.gray_street2.y,  null);
		g.drawImage(Instance.street.im,      Instance.street.x, Instance.street.y,    null);
		
//		g.drawImage(Instance.green.img, Instance.green.x, Instance.green.y, null);
		g.drawImage(Instance.blue.img, Instance.blue.x, Instance.blue.y, null);
		g.drawImage(Instance.gray.img, Instance.gray.x, Instance.gray.y, null);
//		g.drawImage(Instance.red.img, Instance.red.x, Instance.red.y, null);
		g.drawImage(Instance.orange.img, Instance.orange.x, Instance.orange.y, null);
		
		g.drawImage(Instance.paper.img, Instance.paper.x, Instance.paper.y, null);
		g.drawImage(Instance.paper_2.img, Instance.paper_2.x, Instance.paper_2.y, null);
		g.drawImage(Instance.plastic.img, Instance.plastic.x, Instance.plastic.y, null);
		g.drawImage(Instance.org.img, Instance.org.x, Instance.org.y, null);
		g.drawImage(Instance.met.img, Instance.met.x, Instance.met.y, null);
		g.drawImage(Instance.glass.img, Instance.glass.x, Instance.glass.y, null);

		g.drawImage(Instance.apple.img, Instance.apple.x, Instance.apple.y, null);
		g.drawImage(Instance.cd.img, Instance.cd.x, Instance.cd.y, null);
		g.drawImage(Instance.chips.img, Instance.chips.x, Instance.chips.y, null);
		g.drawImage(Instance.container.img, Instance.container.x, Instance.container.y, null);
		g.drawImage(Instance.cardboard.img, Instance.cardboard.x, Instance.cardboard.y, null);
		g.drawImage(Instance.cap.img, Instance.cap.x, Instance.cap.y, null);
		g.drawImage(Instance.plastic_bag.img, Instance.plastic_bag.x, Instance.plastic_bag.y, null);
		
		g.drawImage(Instance.transition.im, Instance.transition.x, Instance.transition.y, null);

		
		g.drawImage(Instance.cont_pap.img, Instance.cont_pap.x, Instance.cont_pap.y, null);
		g.drawImage(Instance.cont_pl.img, Instance.cont_pl.x, Instance.cont_pl.y, null);
		g.drawImage(Instance.cont_gl.img, Instance.cont_gl.x, Instance.cont_gl.y, null);
		g.drawImage(Instance.cont_org.img, Instance.cont_org.x, Instance.cont_org.y, null);
		g.drawImage(Instance.cont_met.img, Instance.cont_met.x, Instance.cont_met.y, null);
		g.drawImage(Instance.cont_sim.img, Instance.cont_sim.x, Instance.cont_sim.y, null);
		
		g.drawImage(Instance.car1.img,Instance.car1.x,Instance.car1.y, null);
		g.drawImage(Instance.car2.img,Instance.car2.x,Instance.car2.y, null);
		
		g.drawImage(Light.light, Light.x,Light.y,  null);


		g.drawImage(variables.light, lightx,lighty,  null);

		g.drawImage(Panel.player.pers, Panel.player.x, Panel.player.y,  null);
		
	   if(Point.pl)   g.drawImage(variables.plus, Point.plus_x, Point.plus_y,  null);
		
	}
	
    void painGame2(Graphics g) {
	g.drawImage(variables.park,0,0, variables.width,variables.height, null);
	g.drawImage(game2.Panel.player.pers, game2.Panel.player.x, game2.Panel.player.y,  null);
	g.drawImage(game2.Panel.bird.image, game2.Panel.bird.x, game2.Panel.bird.y,  null);
	g.drawImage(game2.Panel.cat.image, game2.Panel.cat.x, game2.Panel.cat.y,  null);
	g.drawImage(game2.Panel.owl.image, game2.Panel.owl.x, game2.Panel.owl.y,  null);
	g.drawImage(game2.Panel.raven.image, game2.Panel.raven.x, game2.Panel.raven.y,  null);
	

		if(game2.Dialogue.dialogTrue) {
			g.drawImage(game2.Panel.player.dialog.image, game2.Panel.player.dialog.x, game2.Panel.player.dialog.y,  null);	
		}	

    }
	
    void painGame3(Graphics g) {
      g.drawImage(game3.Panel.street.im,       game3.Panel.street.x,       game3.Panel.street.y,  variables.street.getWidth(null),variables.height/3,      null);
      g.drawImage(game3.Panel.gray_street.im,  game3.Panel.gray_street.x,  game3.Panel.gray_street.y, variables.gray_street.getWidth(null),variables.height/12,  null);
      g.drawImage(game3.Panel.gray_street2.im, game3.Panel.gray_street2.x, game3.Panel.gray_street2.y, variables.gray_street.getWidth(null),variables.height/12,  null);

      g.drawImage(game3.Panel.hospital.image, game3.Panel.hospital.x, game3.Panel.hospital.y, null);
      g.drawImage(game3.Panel.shop.image, game3.Panel.shop.x, game3.Panel.shop.y, null);
      g.drawImage(game3.Panel.office.image, game3.Panel.office.x, game3.Panel.office.y, null);
      g.drawImage(game3.Panel.gray.image, game3.Panel.gray.x, game3.Panel.gray.y, null);


      g.drawImage(game3.Panel.player.pers, game3.Panel.player.x, game3.Panel.player.y,  null);
   }
	
    void paintHospitale(Graphics g){
      g.drawImage(variables.hos_room,0,0,variables.width,variables.height,null);
      g.drawImage(game3.Panel.doctor.image, game3.Panel.doctor.x,game3.Panel.doctor.y,null);
      g.drawImage(game3.Panel.door.image, game3.Panel.door.x,game3.Panel.door.y,null);
      g.drawImage(game3.Panel.player.pers, game3.Panel.player.x, game3.Panel.player.y,  null);
	}

	void paintBlood(Graphics g){
	  g.drawImage(variables.hos_room2,0,0,variables.width,variables.height,null);
	  g.drawImage(game3.Panel.doc_blood.image, game3.Panel.doc_blood.x,game3.Panel.doc_blood.y,null);
		if(Point.pl)   g.drawImage(variables.plus, Point.plus_x, Point.plus_y,  null);
	  g.drawImage(game3.Panel.player.pers, game3.Panel.player.x, game3.Panel.player.y,  null);
	}

	void paintOffice(Graphics g){
		g.drawImage(variables.of_room,0,0,variables.width,variables.height,null);
		g.drawImage(game3.Panel.stand.im,game3.Panel.stand.x,game3.Panel.stand.y,null);
		g.drawImage(game3.Panel.player.pers, game3.Panel.player.x, game3.Panel.player.y,  null);
	}
	void paintShop(Graphics g){
		g.drawImage(variables.shop_room,0,0,variables.width,variables.height,null);

		g.drawImage(game3.Panel.milk.im,game3.Panel.milk.x,game3.Panel.milk.y,null);
		g.drawImage(game3.Panel.bread.im,game3.Panel.bread.x,game3.Panel.bread.y,null);
		g.drawImage(game3.Panel.meat.im,game3.Panel.meat.x,game3.Panel.meat.y,null);
		g.drawImage(game3.Panel.vegetables.im,game3.Panel.vegetables.x,game3.Panel.vegetables.y,null);
		g.drawImage(game3.Panel.fruit.im,game3.Panel.fruit.x,game3.Panel.fruit.y,null);
		g.drawImage(game3.Panel.egg.im,game3.Panel.egg.x,game3.Panel.egg.y,null);
		g.drawImage(game3.Panel.grocery.im,game3.Panel.grocery.x,game3.Panel.grocery.y,null);

		g.drawImage(game3.Panel.player.pers, game3.Panel.player.x, game3.Panel.player.y,  null);
	}

	void paintFlat(Graphics g){
		g.drawImage(variables.flat_room,0,0,variables.width,variables.height,null);

		g.drawImage(game3.Panel.flat1.image, game3.Panel.flat1.x,game3.Panel.flat1.y,null);
		g.drawImage(game3.Panel.flat2.image, game3.Panel.flat2.x,game3.Panel.flat2.y,null);
		g.drawImage(game3.Panel.flat3.image, game3.Panel.flat3.x,game3.Panel.flat3.y,null);

		g.drawImage(game3.Panel.player.pers, game3.Panel.player.x, game3.Panel.player.y,  null);
	}

	void painGame4(Graphics g)
	{

		g.drawImage(variables.fon1,0,0,variables.width,variables.height,  null);
	}
}
