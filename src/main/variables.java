package main;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import all.collision;


public class variables {
	public static Image fon = new ImageIcon("image/fon_menu.jpg").getImage();//фон, который рисуем
	public static Image fonMenu = new ImageIcon("image/fon_menu.jpg").getImage(); //фон меню
	public static Image fon1 = new ImageIcon("image/background.png").getImage(); //фон уровня
	public static Image heart = new ImageIcon("image/life_2.png").getImage();
	public static Image m = new ImageIcon("image/icon1.png").getImage();
	public static Image black = new ImageIcon("image/kolba.png").getImage();
	public static Image girl = new ImageIcon("image/girl.png").getImage();

	public static Image close= new ImageIcon("image/close.png").getImage();
	public static Image white_fon= new ImageIcon("image/white_fon.png").getImage();
	public static Image minus= new ImageIcon("image/1/minus.png").getImage();
	

	
	//point
	public static Image num =new ImageIcon("image/point/num0.png").getImage();
	public static Image plus = new ImageIcon("image/1/plus.png").getImage();

	public static Image info1 = new ImageIcon("image/info1.png").getImage();
	public static Image info2 = new ImageIcon("image/info2.png").getImage();
	public static Image info3 = new ImageIcon("image/info3_1.png").getImage();
	public static Image info4 = new ImageIcon("image/info4.png").getImage();
	public static Image ttask1 = new ImageIcon("image/task1.png").getImage();
	public static Image ttask2 = new ImageIcon("image/task2.png").getImage();
	public static Image ttask3 = new ImageIcon("image/task3.png").getImage();
	public static Image ttask4 = new ImageIcon("image/task4.png").getImage();
	
	
	//lvl1
	public static Image street = new ImageIcon("image/road.png").getImage();

	public static Image gray_street = new ImageIcon("image/gray street.png").getImage();
	public static Image red = new ImageIcon(        "image/red.png").getImage();
	public static Image green = new ImageIcon(      "image/green.png").getImage();
	public static Image blue = new ImageIcon(       "image/house/house3.png").getImage();
	public static Image gray = new ImageIcon(       "image/house/house2.png").getImage();
	public static Image orange = new ImageIcon(     "image/house/house1.png").getImage();
	
	//мусор
	public static Image m_2= new ImageIcon("image/1/trash/paper.png").getImage();
	public static Image plastic= new ImageIcon("image/1/trash/plastic.png").getImage();
	public static Image met= new ImageIcon("image/1/trash/bank.png").getImage();
	public static Image glass= new ImageIcon("image/1/trash/glass.png").getImage();
	public static Image org= new ImageIcon("image/1/trash/banana.png").getImage();
	public static Image apple= new ImageIcon("image/1/trash/apple.png").getImage();
	public static Image cap= new ImageIcon("image/1/trash/cap.png").getImage();
	public static Image cardboard= new ImageIcon("image/1/trash/cardboard.png").getImage();
	public static Image cd= new ImageIcon("image/1/trash/cd.png").getImage();
	public static Image chips= new ImageIcon("image/1/trash/chips.png").getImage();
	public static Image container= new ImageIcon("image/1/trash/container.png").getImage();
	public static Image plastic_bag= new ImageIcon("image/1/trash/plastic_bag.png").getImage();

	public static Image light= new ImageIcon("image/5.png").getImage();

	//контейнер
	public static Image cont= new ImageIcon("image/1/cont_ev.png").getImage();
	public static Image cont_pap= new ImageIcon("image/1/cont_pap.png").getImage();
	public static Image cont_pl= new ImageIcon("image/1/cont_pl.png").getImage();
	public static Image cont_gl= new ImageIcon("image/1/cont_gl.png").getImage();
	public static Image cont_met= new ImageIcon("image/1/cont_m.png").getImage();
	public static Image cont_org= new ImageIcon("image/1/cont_b.png").getImage();
	public static Image cont_sim= new ImageIcon("image/1/cont_no.png").getImage();

	//машинки и переход
	public static Image tr= new ImageIcon("image/1/transition.png").getImage();
	public static Image car= new ImageIcon("image/1/car+dog_0.png").getImage();
	public static Image car_gasoline = new ImageIcon("image/1/car.png").getImage();

	//надписи для 1 уровня
	public static Image ok= new ImageIcon("image/1/Text/ok.png").getImage();
	public static Image net= new ImageIcon("image/1/Text/ne_stoyt.png").getImage();
	public static Image mol= new ImageIcon("image/1/Text/molodez.png").getImage();
	
	//lvl2
	public static Image park = new ImageIcon("image/park.jpg").getImage();
	public static Image bird = new ImageIcon("image/bird.png").getImage();
	public static Image cat = new ImageIcon("image/cat.jpeg").getImage();
	public static Image veterenar = new ImageIcon("image/hospital.png").getImage();
	public static Image city = new ImageIcon("image/city.jpg").getImage();
	public static Image home = new ImageIcon("image/home.png").getImage();
	
	public static int bird_x=150,bird_y=400;
	public static int vet_x=700,vet_y=300;
	public static int home_x=0,home_y=300;
	
	//lvl3
	public static Image hospital = new ImageIcon("image/hospital.png").getImage();
	public static Image office = new ImageIcon("image/office.jpg").getImage();
	public static Image shop = new ImageIcon("image/house/shop.png").getImage();

	//больница
	public static Image hos_room = new ImageIcon("image/hj.jpg").getImage();
	public static Image hos_room2 = new ImageIcon("image/game3/s1200.jpg").getImage();
	public static Image doctor = new ImageIcon("image/veterenar.jpg").getImage();
	public static Image door = new ImageIcon("image/game3/door.jpg").getImage();

	public static Image napravlenie = new ImageIcon("image/game3/napravlenie.jpg").getImage();

	//dialog hospitale
	public static Image blood_ask = new ImageIcon("image/game3/text/b.png").getImage();
	public static Image blood_ask2 = new ImageIcon("image/game3/text/blood2.png").getImage();
	public static Image doc_ask = new ImageIcon("image/game3/text/blood.png").getImage();
	public static Image door_ask = new ImageIcon("image/game3/text/door.png").getImage();

	//КЦВ
	public static Image of_room = new ImageIcon("image/s1200.jpg").getImage();
	public static Image stand = new ImageIcon("image/hospital.jpg").getImage();
	public static Image task1 = new ImageIcon("image/game3/task/task1.png").getImage();
	public static Image task2 = new ImageIcon("image/game3/task/task2.png").getImage();
	public static Image task3 = new ImageIcon("image/game3/task/task3.png").getImage();
	public static Image task4 = new ImageIcon("image/game3/task/task4.png").getImage();
	//магазин
	public static Image shop_room = new ImageIcon("image/q.jpg").getImage();

	public static Image milk_stand = new ImageIcon("image/game3/shop/milk.png").getImage();
	public static Image grocery_stand = new ImageIcon("image/game3/shop/bakaleya.png").getImage();
	public static Image meat_stand = new ImageIcon("image/game3/shop/meat.png").getImage();
	public static Image egg_stand = new ImageIcon("image/game3/shop/egg.png").getImage();
	public static Image fruit_stand = new ImageIcon("image/game3/shop/fruits.png").getImage();
	public static Image vegetables_stand = new ImageIcon("image/game3/shop/vegetables.png").getImage();
	public static Image bread_stand = new ImageIcon("image/game3/shop/bread.png").getImage();

	public static Image flat_room = new ImageIcon("image/q.jpg").getImage();
	
	public static Image infImg = null;
	public static Image null_image = null;
	public static Image car_panel = null;
	public static JPanel MainPanel ;//панель

	public static Boolean directions=true;
	
	public static int directionX=0;
	public static int directionY=0;
	

	
	//получим размер экрана компьютера
			static Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
			public static int width = (int)size.getWidth(); //ширина экрана
			public static int height = (int) size.getHeight(); //высота экрана
			public static int fx=0;
			public static int fy=0;
			public static int yh=0;
			public static int xh=width-heart.getWidth(null);
			
			
	//уровень
	public static int gameLvl = 0;
	public static boolean e=false;
	public static boolean dog1=false,dog2=false;
	
	
	//персонаж
	public static Image player = new ImageIcon("image/1/pers/e1.png").getImage(); //персонаж
	public static int x = player.getWidth(MainPanel);
	
	/*высчитываем y в соответствии с размером экрана пользователя*/
	public static int y = height - player.getHeight(null)-100; 
	public static Image [] playerAnim = new Image[7];//массив с изображениями
	public static Image[] playerAnimmRight= new Image[7];
	public static Image[] playerAnimmLeft= new Image[7];
	public static Image[] playerAnimmUp= new Image[7];
	public static Image[] playerAnimmDown= new Image[7];
	

	
	

	public variables(){
	int a;
		for (int i = 1; i<7; i++) {
			playerAnim[i-1] = new ImageIcon("image/1/pers/e" +i+ ".png").getImage();
			playerAnimmRight[i-1]= new ImageIcon("image/1/pers/r"+i+".png").getImage();
			playerAnimmLeft[i-1]= new ImageIcon("image/1/pers/l"+i+".png").getImage();
			playerAnimmUp[i-1]= new ImageIcon("image/1/pers/f"+i+".png").getImage();
			playerAnimmDown[i-1]= new ImageIcon("image/1/pers/b"+i+".png").getImage();
		}
		for (int i=0;i<6;i++){
			//playerAnimmRight[i]= new ImageIcon("image/girl/r"+i+".png").getImage();
			//playerAnimmLeft[i]= new ImageIcon("image/girl/l"+i+".png").getImage();
		}
		
		
	}
	
}
