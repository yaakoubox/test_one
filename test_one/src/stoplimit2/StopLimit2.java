package stoplimit2;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StopLimit2 {

    public static void main(String[] args) throws AWTException {
       StopLimitFrame2 c = new StopLimitFrame2();
      c.setLocationRelativeTo(null);
      c.setVisible(true);
      go g = new go();
    //    System.out.println(g.CheckAndChangePoint("6725,50"));
     
    CoinRobot cc = new CoinRobot();
     // cc.Typing(g.Get("STOP_LIMIT_PRICE"));
    // cc.HoldKeybord(KeyEvent.VK_WINDOWS);
    //
    //cc.MouseMove(740, 485);
   //cc.MouseMove(700, 535);
     //cc.pressKeybord(KeyEvent.VK_UP);
    }

}
