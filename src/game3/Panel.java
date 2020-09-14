package game3;
import game.Button;
import game.Settings;
import game.Street;
import main.MainBut;
import main.MainFrame;
import main.variables;
import player.Player;
import selection.selectionGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel {
	public static Player player;
    public static House hospital;
    public static House office;
    public static House shop;
    public static House gray;
    public static Street3 street;
    public static Street3 gray_street;
	public static Street3 gray_street2;
	public static Doctor doctor;
	public static Doctor door;
	public static Doctor doc_blood;
	public static Office_Room stand;

	public static Shop_Room milk;
	public static Shop_Room bread;
	public static Shop_Room egg;
	public static Shop_Room fruit;
	public static Shop_Room vegetables;
	public static Shop_Room grocery;
	public static Shop_Room meat;

	public static Flat flat1;
	public static Flat flat2;
	public static Flat flat3;
	public static Flat flat4;
	public static Flat flat5;
	public static Flat flat6;
	//public static JButton but_set=null;
	//public static JButton but_back;


	int s=variables.height-variables.street.getHeight(null)-variables.gray_street.getHeight(null)+70;
	int gs=variables.height-variables.gray_street.getHeight(null) +70;
	int gs2=variables.height-variables.street.getHeight(null)-2*variables.gray_street.getHeight(null) +70;

	int house_gray=variables.height-variables.street.getHeight(null)-2*variables.gray_street.getHeight(null)-variables.gray.getHeight(null) +70;;
	int house_shop=variables.height-variables.street.getHeight(null)-2*variables.gray_street.getHeight(null)-variables.shop.getHeight(null) +70;;
	int house_hospitale=variables.height-variables.street.getHeight(null)-2*variables.gray_street.getHeight(null)-variables.hospital.getHeight(null) +70;;
	int house_office=variables.height-variables.street.getHeight(null)-2*variables.gray_street.getHeight(null)-variables.office.getHeight(null) +70;;

	public Panel() {
		
		player =new player.Player();
		player.array = variables.playerAnim;
		player.pers = variables.player;
		player.x = 0;
		player.y = gs2;
		player.arrayD = variables.playerAnimmDown;
		player.arrayR = variables.playerAnimmRight;
		player.arrayL = variables.playerAnimmLeft;
		player.arrayU = variables.playerAnimmUp;
		new player.Player();
	//

	Button.button();
	Button.but_setting();


	but();
	house();
    doc();
    door();
	office();
	department();
	flat();
	}
void but() {
	selectionGame.but3.setVisible(false);
	selectionGame.but7.setVisible(false);
	selectionGame.but6.setVisible(false);
	selectionGame.but8.setVisible(false);
	selectionGame.but9.setVisible(false);


	try {
		Button.but_3.setVisible(false);
	}
	catch(NullPointerException nullPointerException) {

	}
//if(but_set==null) {
//	but_set = new JButton() {
//
//		protected void paintComponent(Graphics g) {
//			super.paintComponent(g);
//
//			g.drawImage(variables.zadanie, 0, 0, variables.MainPanel);
//
//		}
//
//	};
//}
//	but_set.setOpaque(false);
//	but_set.setBorderPainted(false);
//	but_set.setContentAreaFilled(false);
//
//	but_set.setBounds(variables.width-300,0,150,50);
//	if(variables.gameLvl==3) {
//		but_set.setVisible(true);
//	}
//
//
//
//	but_set.addActionListener(new ActionListener() {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//
//			new Settings();
//
//
//		}
//	});
//    variables.MainPanel.add(but_set);
   	variables.MainPanel.repaint();
	MainFrame.frame.setFocusable(true);
}
void house(){
	hospital =  new House(-10,house_hospitale,variables.hospital,1,false);
	office   =  new House(variables.hospital.getWidth(null),house_office,variables.office,2,false);
	shop     =  new House(variables.hospital.getWidth(null)+variables.office.getWidth(null),house_shop,variables.shop,3,false);
	gray     =  new House(variables.hospital.getWidth(null)+variables.office.getWidth(null)+variables.shop.getWidth(null),house_gray,variables.gray,0,false);

	street =       new Street3       (variables.street,     -10,s,3);
	gray_street =  new Street3       (variables.gray_street,-10,gs,2);
	gray_street2 = new Street3       (variables.gray_street,-10,gs2,2);


}
void doc(){
	doctor= new Doctor();
	for (int i = 0; i<5; i++) {
	doctor.images[i] =
				new ImageIcon("image/game3/doc"+i+".png").getImage();
	}
	doctor.x=100;
	doctor.y=400;
	doctor.image = doctor.images[0];
	doctor.animation();


	doc_blood = new Doctor();
	for(int k=0;k<5;k++){
	doc_blood.images[k]= new ImageIcon("image/game3/d"+k+".png").getImage();
	doc_blood.x=700;
	doc_blood.y=300;
	doc_blood.image=doctor.images[0];
	doc_blood.animation();

	}


}
void door(){
	door= new Doctor();
	door.x=100;
	door.y=100;
	door.image = variables.door;
}

void office(){
	stand = new Office_Room();
	stand.Stand(500,400,variables.stand,false);
}

void flat(){
	flat1 = new Flat(900,100,variables.door,1,false);
	flat2 = new Flat(700,100,variables.door,2,false);
	flat3 = new Flat(550,100,variables.door,3,false);
	flat4 = new Flat(400,100,variables.door,4,false);
	flat5 = new Flat(250,100,variables.door,5,false);
	flat6 = new Flat(100,100,variables.door,5,false);


}

 void department(){
	grocery= new Shop_Room(0,0,variables.grocery_stand,1,false);
	milk= new Shop_Room(250,0,variables.milk_stand,2,false);
	bread= new Shop_Room(500,0,variables.bread_stand,3,false);
	meat= new Shop_Room(750,0,variables.meat_stand,4,false);
	egg= new Shop_Room(0,600,variables.egg_stand,5,false);
	vegetables= new Shop_Room(250,600,variables.vegetables_stand,6,false);
	fruit= new Shop_Room(500,600,variables.fruit_stand,7,false);
 }

}
