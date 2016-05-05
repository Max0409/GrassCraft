package util;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
/*
 * 窗体居中
 */
public class FrameUtil {
    public static void setFrameCenter(JFrame jf){
  	  Toolkit toolkit=Toolkit.getDefaultToolkit();
  	  Dimension screen=toolkit.getScreenSize();
  	  int x=(screen.width-jf.getWidth())/2;
  	  int y=(screen.height-jf.getHeight())/2;
  	  //设置小任务图标
  	  Image icon=toolkit.getImage("Graphics/村子.jpg");
  	  jf.setIconImage(icon);
  	  jf.setLocation(x, y);
    }
}