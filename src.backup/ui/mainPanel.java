package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class mainPanel extends JPanel{
	 public static final Image UI=new ImageIcon("Graphics/开始界面2.jpg").getImage();
     @Override
     public void paintComponent(Graphics g){
        g.drawImage( UI, 0, 0,1200,700,null);
   }
}
