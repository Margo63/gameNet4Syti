package game4;

import game.Button;
import main.MainBut;
import main.MainFrame;
import main.variables;
import player.Player;
import selection.selectionGame;

public class Choice {//номера кнопок с 1**
    public static Player player;
    public static MainBut q_b0,q_b1,q_b2,q_b3,q_b4,q_b5,q_b6,q_b7,q_b8,q_b9;

    public Choice(){
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

      but();
if(variables.gameLvl==4) {
    q_b0 = new MainBut();
    q_b0.MenuButt(101, "", variables.width / 2 - 75, 100, variables.MainPanel);

    q_b1 = new MainBut();
    q_b1.MenuButt(102, "", variables.width / 2 - 75, 160, variables.MainPanel);

    q_b2 = new MainBut();
    q_b2.MenuButt(103, "", variables.width / 2 - 75, 220, variables.MainPanel);

    q_b3 = new MainBut();
    q_b3.MenuButt(104, "", variables.width / 2 - 75, 280, variables.MainPanel);

    q_b4 = new MainBut();
    q_b4.MenuButt(105, "", variables.width / 2 - 75, 340, variables.MainPanel);

    q_b5 = new MainBut();
    q_b5.MenuButt(106, "", variables.width / 2 - 75, 400, variables.MainPanel);

    q_b6 = new MainBut();
    q_b6.MenuButt(107, "", variables.width / 2 - 75, 460, variables.MainPanel);

    q_b7 = new MainBut();
    q_b7.MenuButt(108, "", variables.width / 2 - 75, 520, variables.MainPanel);

    q_b8 = new MainBut();
    q_b8.MenuButt(109, "", variables.width / 2 - 75, 580, variables.MainPanel);

    q_b9 = new MainBut();
    q_b9.MenuButt(110, "", variables.width / 2 - 75, 640, variables.MainPanel);
}
    }
    void but() {
        selectionGame.but3.setVisible(false);
        selectionGame.but7.setVisible(false);
        selectionGame.but6.setVisible(false);
        selectionGame.but8.setVisible(false);
        selectionGame.but9.setVisible(false);
        Button.button();

        variables.MainPanel.repaint();
        MainFrame.frame.setFocusable(true);
    }
}
