package player;

import java.awt.Image;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.Timer;

import game1.*;
import game2.Dialogue;
import game3.Hospitale_Room;
import game3.Office;
import main.MainFrame;
import main.variables;


public class Player {

	//boolean pass=true;
	public Image pers;
	public Image[] array;
	public Image[] arrayL;
	public Image[] arrayR;
	public Image[] arrayU;
	public Image[] arrayD;

	public int x;
	public int directionX = 10;
	public int directionY = 0;
	public int y;
    public static boolean ee=false;
	int key = 0;

	
	public Player(){
	
		main.MainFrame.frame.addKeyListener (new KeyAdapter() {
			public void keyPressed (KeyEvent e) {
				
				//прописываем движение вперед
				if (e.getKeyCode() == KeyEvent.VK_D && variables.x+variables.player.getWidth(null)<variables.width &&variables.x>0 /*&& pass*/) {

                     if((variables.gameLvl==1&&Instance.gray.x+Instance.gray.img.getWidth(null)>x-pers.getWidth(null))||variables.gameLvl!=1) {

	                     directionX = 10;
	                     directionY = 0;
	                     array = arrayR;
	                     if (time != null && time.isRunning()) return;

	                     timeAnim();
                       }
						
				}
				if (e.getKeyCode()== KeyEvent.VK_A && variables.x-variables.player.getWidth(null)/10 >0 /*&& pass*/) {
					if((variables.gameLvl==1&&x-pers.getWidth(null)>=Instance.gray_street.x)||variables.gameLvl!=1) {

						directionX = -10;
						directionY = 0;
						array = arrayL;
						if (time != null && time.isRunning()) return;
						timeAnim();
					}
				}
				if (e.getKeyCode()==KeyEvent.VK_W && variables.y>0 /*&& pass*/) {
					directionX = 0;
					directionY = -10;
					array = arrayU;
					if (time != null && time.isRunning()) return;
					timeAnim(); 
				}
				if (e.getKeyCode()==KeyEvent.VK_S && variables.y<variables.height-variables.player.getHeight(null)/*&& pass*/) {
					if((variables.gameLvl==1 && y+pers.getHeight(null)<Instance.gray_street.y+Instance.gray_street.im.getHeight(null))||(variables.gameLvl!=1)){
						directionX = 0;
						directionY = 10;
						array = arrayD;
						if (time != null && time.isRunning()) return;
						timeAnim();
					}

//					directionX = 0;
//					directionY = 10;
//					array = arrayD;
//					if (time != null && time.isRunning()) return;
//					timeAnim();
					}
				
				
				
				if (e.getKeyCode()==KeyEvent.VK_ESCAPE) {
					System.exit(0);
				
					}
				
				
				
				if(e.getKeyCode()==KeyEvent.VK_I) {
					new Inventory();
					Inventory.f.setVisible(true);

				}





				if(e.getKeyCode()==KeyEvent.VK_E) {

					if(variables.e){
						ee=true;
					}
					else{
						ee=false;
					}



				}

				
				if(e.getKeyCode()==KeyEvent.VK_E) {
					if (Dialogue.dialogTrue) {
						sayE();
					}
				}
					
				if(e.getKeyCode()==KeyEvent.VK_1) {
					if (Dialogue.dialogTrue) {
						key=1;
						say();
						
					}
				}
				if(e.getKeyCode()==KeyEvent.VK_2) {
					if (Dialogue.dialogTrue) {
						key=2;
						say();
						}
				}
				if(e.getKeyCode()==KeyEvent.VK_3) {
					if (Dialogue.dialogTrue) {
						key=3;
						say();
						}
				}	
				if(e.getKeyCode()==KeyEvent.VK_3) {
					if (Dialogue.dialogTrue) {
						key=4;
						say();
						}
				}			
					
					
				
				
				  if (variables.gameLvl == 2) {
					  collisionDialog();
				  }

				  
				collision();

				
				
				
				variables.MainPanel.repaint(); //перерисовка
				
			}
		
		});
		
		

	}
	
	void moveHome(){
 //
		  Instance.blue.move();
		  Instance.orange.move();
		  Instance.gray.move();

	      Instance.green.move();
		  Instance.red.move();

		  Instance.street.move_st();
		  Instance.street2.move_st();
		  Instance.gray_street.move_st();
		  Instance.gray_street2.move_st();

		  Instance.transition.move_st();

		  Instance.cont_pap.move_cont();
		  Instance.cont_pl.move_cont();
		  Instance.cont_gl.move_cont();
		  Instance.cont_met.move_cont();
		  Instance.cont_org.move_cont();
		  Instance.cont_sim.move_cont();

		  Instance.car1.car_move();
		  Instance.car2.car_move();

		  Light.x -= Panel.player.directionX;
		  Light.y -= Panel.player.directionY;

	//  }
	}
	void moveTrash(){
	  	Instance.paper.move_trash();
	  	Instance.paper_2.move_trash();
	  	Instance.plastic.move_trash();
		Instance.met.move_trash();
	  	Instance.org.move_trash();
	  	Instance.glass.move_trash();

		Instance.cd.move_trash();
		Instance.chips.move_trash();
		Instance.plastic_bag.move_trash();
		Instance.cap.move_trash();
		Instance.apple.move_trash();
		Instance.container.move_trash();
		Instance.cardboard.move_trash();

		MainFrame.lightx-=Panel.player.directionX/3;
		MainFrame.lighty-=Panel.player.directionY/3;
	  	
}
	 void moveHouse() {

			game3.Panel.gray.move();
			game3.Panel.shop.move();
			game3.Panel.hospital.move();
			game3.Panel.office.move();


			game3.Panel.street.move_st();
			game3.Panel.gray_street.move_st();
			game3.Panel.gray_street2.move_st();

	}
	
	
	Boolean collisTrue = false;
	Boolean collisTrue2=false;
	//Boolean collTrue = false;
	void collision(){ //проверяем столкновение
		if (variables.gameLvl == 1) {

			Instance.blue.collision();
			Instance.orange.collision();
			Instance.gray.collision();
			Instance.green.collision();
			Instance.red.collision();

			Instance.paper.trash_coll();
			Instance.paper_2.trash_coll();
			Instance.plastic.trash_coll();
			Instance.glass.trash_coll();
			Instance.met.trash_coll();
			Instance.org.trash_coll();

			Instance.cd.trash_coll();
			Instance.chips.trash_coll();
			Instance.plastic_bag.trash_coll();
			Instance.cap.trash_coll();
			Instance.apple.trash_coll();
			Instance.container.trash_coll();
			Instance.cardboard.trash_coll();

			
			
			Instance.cont_pap.trash_cont();
			Instance.cont_pl.trash_cont();
			Instance.cont_gl.trash_cont();
			Instance.cont_met.trash_cont();
			Instance.cont_org.trash_cont();
			Instance.cont_sim.trash_cont();
			
			Instance.transition.st_col();
			Instance.street.st_col();
			Instance.street2.st_col();
			Instance.gray_street.st_col();
			Instance.gray_street2.st_col();
			Instance.car1.car_coll();
			Instance.car2.car_coll();

			collisTrue = Instance.blue.collisTrue || Instance.orange.collisTrue ||Instance.gray.collisTrue;

			//	|| Instance.cont_pap.collisTrue||Instance.cont_pl.collisTrue||Instance.cont_gl.collisTrue
			//	|| Instance.cont_met.collisTrue||Instance.cont_org.collisTrue||Instance.cont_sim.collisTrue;

		}

		if(variables.gameLvl == 3){
			game3.Panel.hospital.coll();
			game3.Panel.office.coll();
			game3.Panel.shop.coll();
			game3.Panel.gray.coll();



			collisTrue2= game3.Panel.shop.collisTrue2||game3.Panel.hospital.collisTrue2||game3.Panel.office.collisTrue2||game3.Panel.gray.collisTrue2;

		}
		if (variables.gameLvl == -2) {
			game3.Panel.doctor.coll(1);
			game3.Panel.door.coll(3);

			collisTrue2=game3.Panel.doctor.collisTrue2||game3.Panel.door.collisTrue2;
		}
		if(variables.gameLvl==-3){
			game3.Panel.doc_blood.coll(2);

			collisTrue2=game3.Panel.doc_blood.collisTrue2;
		}

		if(variables.gameLvl==-4){
			game3.Panel.stand.coll();

			collisTrue2=game3.Panel.stand.collisTrue2;
		}

		if(variables.gameLvl==-5){
			game3.Panel.fruit.coll();
			game3.Panel.vegetables.coll();
			game3.Panel.milk.coll();
			game3.Panel.meat.coll();
			game3.Panel.egg.coll();
			game3.Panel.bread.coll();
			game3.Panel.grocery.coll();

			collisTrue2=game3.Panel.fruit.collisTrue2||game3.Panel.vegetables.collisTrue2||game3.Panel.milk.collisTrue2||game3.Panel.meat.collisTrue2||
					game3.Panel.egg.collisTrue2||game3.Panel.bread.collisTrue2||game3.Panel.grocery.collisTrue2;
		}

		if(variables.gameLvl==-6){
			game3.Panel.flat1.coll();
			game3.Panel.flat2.coll();
			game3.Panel.flat3.coll();
			game3.Panel.flat4.coll();
			game3.Panel.flat5.coll();
			game3.Panel.flat6.coll();

			collisTrue2=game3.Panel.flat1.collisTrue2||game3.Panel.flat2.collisTrue2||game3.Panel.flat3.collisTrue2|| game3.Panel.flat4.collisTrue2||game3.Panel.flat5.collisTrue2|| game3.Panel.flat6.collisTrue2;
		}

		

	}
	public Dialogue dialog;
	boolean dialog1True = false;
	boolean dialog0True = false; //дополнительное условие, чтобы диалог не показывался
	//в ненужное время
	void  collisionDialog() {
		if (x >= game2.Panel.bird.x-50 &&
				x <= game2.Panel.bird.x+game2.Panel.bird.image.getWidth(null)+50 &&
				y+pers.getHeight(null)/2>=game2.Panel.bird.y-50 &&
				y+pers.getHeight(null)/2<=game2.Panel.bird.y+game2.Panel.bird.image.getHeight(null)+50
				&& !dialog0True) {
			dialog0True = true;
			dialog = new Dialogue();
		
			dialog.NUMBER = 0;
		
			dialog.show();
			Dialogue.dialogTrue = true;
		}
		else {
			Dialogue.dialogTrue = false;
			dialog0True = false;
		}
	}
	
	void sayE() {
		//Почему не рисует???
		dialog.NUMBER = 1;
		dialog.show();
	}
	
	void say() {
		//прописать результат выбора условия для первого диалога
		//раненная птичка
		switch(key){
		case 1: break;
		case 2: break;
		case 3: break;
		case 4: break;
		}
	}
	
	 Timer time;
	 int i=0;
	public void timeAnim() {
	  time= new Timer(100, new ActionListener() {
		  @Override
		  public void actionPerformed(ActionEvent e) {
			  if (variables.gameLvl == 1) {
				  Instance.gray.collision();

				  variables.e=Instance.car1.e_car||Instance.car2.e_car||Instance.cont_sim.e_cont||Instance.cont_gl.e_cont||Instance.cont_met.e_cont
						  ||Instance.cont_org.e_cont||Instance.cont_pap.e_cont||Instance.cont_pl.e_cont;


			  }
			  if(variables.gameLvl==3){
				  game3.Panel.gray.coll();

				  variables.e= game3.Panel.shop.e_house||game3.Panel.hospital.e_house
						  ||game3.Panel.office.e_house||game3.Panel.gray.e_house;

			  }
			
			 
			  if (i<array.length-1 && !collisTrue&&variables.gameLvl==1) {

				  pers = array[i];
						x+=directionX/3;
						y+=directionY/3;
					i++;
			  }


			  if (i<array.length-1 && !collisTrue2 &&(variables.gameLvl==3||(variables.gameLvl>-8 && variables.gameLvl<-1))) {

				  pers = array[i];
				  x+=directionX;
				  y+=directionY;
				  i++;
			  }


			  if (i>=array.length-1) {

				  if(variables.gameLvl == 1) {
					  if(Instance.gray_street.y+Instance.gray_street.im.getHeight(null)-directionY>=variables.height
					     && Instance.gray_street.x<=0+directionX
					     && Instance.gray.x-directionX>variables.height) {
						  moveHome();
						  moveTrash();
					  }
				  }
				  if(variables.gameLvl==3){
				  	moveHouse();
				  }
					i = 0;
					pers = array[0];
					time.stop();
			  }
			  //сталкиваемся со стеной
			  if (collisTrue) {
				  i = 0;
				  pers = array[0];
				  time.stop();
			  }
			  if(collisTrue2){
			  	i=0;
			  	pers=array[0];
			  	time.stop();
			  }
			  variables.MainPanel.repaint();
			  
		  }
	 });
	  time.start();
	}




}
