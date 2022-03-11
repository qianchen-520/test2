package com.demo.boot.demo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import org.apache.tomcat.util.codec.binary.StringUtils;

public class Test {

  public static void main(String[] arg) {
    test();
    TallingClock clock = new TallingClock();
    clock.start(1000,true);
    JOptionPane.showMessageDialog(null,"Quit");
    System.exit(0);
  }

  @Deprecated
  public static void test() {System.out.println("test");}
}

class TallingClock{
  public void start(int interval,boolean beep){
    ActionListener listener = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("At the zone, the time is " + new Date());
        if(beep) Toolkit.getDefaultToolkit().beep();
      }
    };
    Timer t = new Timer(interval,listener);
    t.start();
  }
}
