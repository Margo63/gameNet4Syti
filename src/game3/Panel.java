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
    public static Street street;
    public static Street gray_street;
	public static Street gray_street2;
	public static Doctor doctor;
	public static Doctor door;
	public static Doctor doc_blood;

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


	but();
	house();
    doc();
    door();
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
	hospital = new House(1,1,variables.hospital,1);
	shop = new House(900,house_shop,variables.shop,3);
	office = new House(600,1,variables.office,2);
	gray = new House(300,house_gray,variables.gray,0);

	street = new Street(variables.street,0,s,2);
	gray_street = new Street(variables.gray_street,0,gs,2);
	gray_street2 = new Street(variables.gray_street,0,gs2,2);


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

}
