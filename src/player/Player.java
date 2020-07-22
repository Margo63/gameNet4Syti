package player;

import java.awt.Image;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.Timer;

import game1.Container;
import game1.Home;
import game1.Instance;
import game1.Inventory;
import game1.Light;
import game1.Panel;
import game1.Point;
import game2.Dialogue;
import game3.Hospitale_Room;
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
	public int directionX = 5;
	public int directionY = 0;
	public int y;

	int key = 0;

	
	public Player(){
	
		main.MainFrame.frame.addKeyListener (new KeyAdapter() {
			public void keyPressed (KeyEvent e) {
				
				//����������� �������� ������
				if (e.getKeyCode() == KeyEvent.VK_D && variables.x+variables.player.getWidth(null)<variables.width &&variables.x>0 /*&& pass*/) {
					directionX = 5;
					directionY = 0;
					array = arrayR;
					if (time != null && time.isRunning()) return;
					
						timeAnim(); 
					
						
				}
				if (e.getKeyCode()== KeyEvent.VK_A && variables.x-variables.player.getWidth(null)/10 >0 /*&& pass*/) {
					directionX = -5;
					directionY = 0;
					array = arrayL;
					if (time != null && time.isRunning()) return;
					timeAnim(); 
				}
				if (e.getKeyCode()==KeyEvent.VK_W && variables.y>0 /*&& pass*/) {
					directionX = 0;
					directionY = -5;
					array = arrayU;
					if (time != null && time.isRunning()) return;
					timeAnim(); 
				}
				if (e.getKeyCode()==KeyEvent.VK_S && variables.y<variables.height-variables.player.getHeight(null)/*&& pass*/) {
					directionX = 0;
					directionY = 5;
					array = arrayD;
					if (time != null && time.isRunning()) return;
					timeAnim(); 
					}
				
				
				
				if (e.getKeyCode()==KeyEvent.VK_ESCAPE) {
					System.exit(0);
				
					}
				
				
				
				if(e.getKeyCode()==KeyEvent.VK_I) {
					new Inventory();
					Inventory.f.setVisible(true);

						
				}

				if(e.getKeyCode()==KeyEvent.VK_P) {

					//Inventory.f.dispose();


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
				if (variables.gameLvl == -2) {
					game3.Panel.doctor.coll(1);
					game3.Panel.door.coll(3);
					/*if(x >= game3.Panel.doctor.x-50 &&
							x <= game3.Panel.doctor.x+game3.Panel.doctor.image.getWidth(null)+50 &&
							y+pers.getHeight(null)/2>=game3.Panel.doctor.y-50 &&
							y+pers.getHeight(null)/2<=game3.Panel.doctor.y+game3.Panel.doctor.image.getHeight(null)+50
							){
						Hospitale_Room.type=1;
						System.out.println("������");
						Hospitale_Room.blood();
					}
					if(x >= game3.Panel.door.x-50 &&
							x <= game3.Panel.door.x+game3.Panel.door.image.getWidth(null)+50 &&
							y+pers.getHeight(null)/2>=game3.Panel.door.y-50 &&
							y+pers.getHeight(null)/2<=game3.Panel.door.y+game3.Panel.door.image.getHeight(null)+50
					){
						Hospitale_Room.type=3;
						Hospitale_Room.blood();
					}*/
				}
				if(variables.gameLvl==-3){
					game3.Panel.doc_blood.coll(2);
				}
				  
				  
				collision();
				
				
				
				
				variables.MainPanel.repaint(); //�����������
				
			}
		
		});
		
		

	}
	
	void moveHome(){
		  //	Instance.green.move();
			//Instance.red.move();
			Instance.blue.move();
			Instance.orange.move();
			Instance.gray.move();
			
			Instance.street.move_st();
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
			
			Light.x-=Panel.player.directionX/3;
			Light.y-=Panel.player.directionY/3;
			
			//variables.sx-=Panel.player.directionX/3;
			//variables.sy-=Panel.player.directionY/3;
			//variables.gsx-=Panel.player.directionX/3;
			//variables.gsy-=Panel.player.directionY/3;
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

	  	
}
	 void moveHouse() {
		 game3.Panel.gray.move();
		 game3.Panel.shop.move();
		 game3.Panel.hospital.move();
		 game3.Panel.office.move();

	}
	
	
	Boolean collisTrue = false;
	Boolean collisTrue2=false;
	//Boolean collTrue = false;
	void collision(){ //��������� ������������
		if (variables.gameLvl == 1) {
			
			//Instance.green.collision();
			//Instance.red.collision();
			Instance.blue.collision();
			Instance.orange.collision();
			Instance.gray.collision();
			
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
			Instance.car1.car_coll();
			Instance.car2.car_coll();

			collisTrue = Instance.blue.collisTrue || Instance.orange.collisTrue ||Instance.gray.collisTrue

				|| Instance.cont_pap.collisTrue||Instance.cont_pl.collisTrue||Instance.cont_gl.collisTrue
				|| Instance.cont_met.collisTrue||Instance.cont_org.collisTrue||Instance.cont_sim.collisTrue
			;
			
			
			
			
		
		}

		if(variables.gameLvl == 3){
			game3.Panel.hospital.coll();
			game3.Panel.office.coll();
			game3.Panel.shop.coll();
			game3.Panel.gray.coll();



			collisTrue2= game3.Panel.shop.collisTrue2||game3.Panel.hospital.collisTrue2||game3.Panel.office.collisTrue2||game3.Panel.gray.collisTrue2;

		}
		

	}
	public Dialogue dialog;
	boolean dialog1True = false;
	boolean dialog0True = false; //�������������� �������, ����� ������ �� �����������
	//� �������� �����
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
		//������ �� ������???
		dialog.NUMBER = 1;
		dialog.show();
	}
	
	void say() {
		//��������� ��������� ������ ������� ��� ������� �������
		//�������� ������
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
			  }
			  if(variables.gameLvl==3){
				  game3.Panel.gray.coll();
			  }
			
			 
			  if (i<array.length-1 && !collisTrue&&variables.gameLvl==1) {
				  pers = array[i];
						x+=directionX;
						y+=directionY;
					i++;
			  }


			  if (i<array.length-1 && !collisTrue2&&(variables.gameLvl==3||variables.gameLvl==-2||variables.gameLvl==-3)) {
				  pers = array[i];
				  x+=directionX;
				  y+=directionY;
				  i++;
			  }


			  if (i>=array.length-1) {

				  if(variables.gameLvl == 1) {
					  moveHome();
					  moveTrash();

				  }
				  if(variables.gameLvl==3){
				  	moveHouse();
				  }
					i = 0;
					pers = array[0];
					time.stop();
			  }
			  //������������ �� ������
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
