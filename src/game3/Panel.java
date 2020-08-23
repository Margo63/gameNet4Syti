package game3;
import game.Button;
import game.Street;
import main.MainBut;
import main.MainFrame;
import main.variables;
import player.Player;
import selection.selectionGame;

import javax.swing.*;

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

	int s=variables.height-variables.height/3-variables.height/12;
	int gs=variables.height-variables.height/12;
	int gs2 = variables.height-variables.height/3-variables.height/6;
	int house_gray=variables.height-variables.height/3-variables.height/6-variables.gray.getHeight(null);
	int house_shop=variables.height-variables.height/3-variables.height/6-variables.shop.getHeight(null);
	
public Panel() {
		
		player =new player.Player();
		player.array = variables.playerAnim;
		player.pers = variables.player;
		player.x = 0;
		player.y = 400;
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

   	variables.MainPanel.repaint();
	MainFrame.frame.setFocusable(true);
}
void house(){
	hospital = new House(1,1,variables.hospital,1,false);
	shop = new House(600,house_shop,variables.shop,3,false);
	office = new House(300,1,variables.office,2,false);
	gray = new House(1000,house_gray,variables.gray,0,false);

	street = new Street3(variables.street,0,s,2);
	gray_street = new Street3(variables.gray_street,0,gs,2);
	gray_street2 = new Street3(variables.gray_street,0,gs2,2);


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
	stand.Stand(500,400,variables.stand);
}

void flat(){
	flat1= new Flat(900,100,variables.door,1);
	flat2 = new Flat(700,100,variables.door,2);
	flat3 = new Flat(550,100,variables.door,3);
	flat4 = new Flat(400,100,variables.door,4);
	flat5 = new Flat(250,100,variables.door,5);
	flat6 = new Flat(100,100,variables.door,5);


}

 void department(){
	grocery= new Shop_Room(0,0,variables.grocery_stand,1);
	milk= new Shop_Room(250,0,variables.milk_stand,2);
	bread= new Shop_Room(500,0,variables.bread_stand,3);
	meat= new Shop_Room(750,0,variables.meat_stand,4);
	egg= new Shop_Room(0,600,variables.egg_stand,5);
	vegetables= new Shop_Room(250,600,variables.vegetables_stand,6);
	fruit= new Shop_Room(500,600,variables.fruit_stand,7);
 }

}
