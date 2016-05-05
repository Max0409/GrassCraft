package ui;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import util.FrameUtil;
public class FrameGame extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	 public Container con;
	 public static final Image WINDOW_BG=new ImageIcon("Graphics/开始界面2.jpg").getImage();
	 public JPanel beginPanel;
	 public JPanel firstPanel;
	 public JPanel rulePanel;
	 public JPanel teamPanel;
	 public JButton startButton;
	 public JButton startBackButton;
	 public JButton ruleBackButton;
	 public JButton teamBackButton;
	 public JButton ruleButton;
	 public JButton teamButton;
	 Graphics g;
	 public FrameGame(){
		  //设置标题
		  this.setTitle("GrassCraft");
		  //设计默认关闭属性（程序结束）
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  //TODO 设置窗口大小
		  this.setSize(1200,700);
		  //不允许用户改变窗口大小
		  this.setResizable(false);
		  //居中
		  FrameUtil.setFrameCenter(this);
		  //container
		  con=this.getContentPane();
		  //初始化面板
		  firstPanel=new mainPanel();
		  beginPanel=new beginPanel();
		  rulePanel=new rulePanel();
		  teamPanel=new teamPanel();
		  initFirstPanel();
		  initBeginPanel();
		  initRulePanel();
		  initTeamPanel();
		  con.add(firstPanel);
		  this.setVisible(true);
	  }
	 /*
	  * 初始化初面板
	  */
	 private void initFirstPanel() {
		//不设置布局管理器
		 firstPanel.setLayout(null);
		//生成开始按钮
		 firstPanel.add(createBeginButton());
		//生成游戏规则按钮
		 firstPanel.add(createRuleButton());
		//生成制作团队按钮
		 firstPanel.add(createTeamButton());
	}
	/*
	  * 初始化开始面板
	  */
	 private void initBeginPanel(){
		//不设置布局管理器
		 beginPanel.setLayout(null);
		//生成返回按钮
	     beginPanel.add(createStartBackButton());
	 }
	 private void initRulePanel(){
		//不设置布局管理器
		 rulePanel.setLayout(null);
		//生成返回按钮
		 rulePanel.add(createRuleBackButton());
	 }
	 private void initTeamPanel(){
	    //不设置布局管理器
		 teamPanel.setLayout(null);
		//生成返回按钮
		 teamPanel.add(createTeamBackButton());
	 }
	 /*
	  * 生成制作团队按钮
	  */
	private JButton createTeamButton() {
	   	    teamButton=new JButton();
	        ImageIcon icon = new ImageIcon("Graphics/按钮制作团队.png"); 
	        teamButton.setBorder(null);
	        teamButton.setBounds(650,480,260,68);
	        Image temp = icon.getImage().getScaledInstance( teamButton.getWidth(),  
	        		 teamButton.getHeight(), icon.getImage().SCALE_DEFAULT);  
	        icon = new ImageIcon(temp);
	        teamButton.setIcon(icon);
	        //监听按钮事件
	        teamButton.addActionListener(this);
	   	    return  teamButton;
	}
	/*
	 * 生成游戏规则按钮
	 */
	 private JButton createRuleButton() {
	   	    ruleButton=new JButton();
	        ImageIcon icon = new ImageIcon("Graphics/按钮游戏规则.png"); 
	        ruleButton.setBorder(null);
	        ruleButton.setBounds(640,370,272,73);
	        Image temp = icon.getImage().getScaledInstance(ruleButton.getWidth(),  
	        		ruleButton.getHeight(), icon.getImage().SCALE_DEFAULT);  
	        icon = new ImageIcon(temp);
	        ruleButton.setIcon(icon);
	        //监听按钮事件
	        ruleButton.addActionListener(this);
	   	    return ruleButton;
	}
	 /*
	  * 生成开始按钮
	  */
     public JButton createBeginButton(){
   	    startButton=new JButton();
        ImageIcon icon = new ImageIcon("Graphics/按钮开始.png"); 
        startButton.setBorder(null);
        startButton.setBounds(660,285,162,56);
        Image temp = icon.getImage().getScaledInstance(startButton.getWidth(),  
       		 startButton.getHeight(), icon.getImage().SCALE_DEFAULT);  
        icon = new ImageIcon(temp);
        startButton.setIcon(icon);
        //监听按钮事件
        startButton.addActionListener(this);
   	    return startButton;
    }
    /*
     * 开始界面返回按钮
     */
     public JButton createStartBackButton(){
    	 startBackButton=new JButton("back");
    	 startBackButton.setBorder(null);
    	 startBackButton.setBounds(660,250,167,72);
         //添加按钮监听
    	 startBackButton.addActionListener(this);
    	 return startBackButton;
     }	
     /*
      * 游戏规则返回按钮
      */
     public JButton createRuleBackButton(){
    	 ruleBackButton=new JButton("back");
    	 ruleBackButton.setBorder(null);
    	 ruleBackButton.setBounds(660,250,167,72);
         //添加按钮监听
    	 ruleBackButton.addActionListener(this);
    	 return ruleBackButton;
     }	
     /*
      * 制作团队返回按钮
      */
	 private JButton createTeamBackButton() {
		 teamBackButton=new JButton("back");
		 teamBackButton.setBorder(null);
		 teamBackButton.setBounds(660,250,167,72);
         //添加按钮监听
		 teamBackButton.addActionListener(this);
    	 return  teamBackButton;
	}

     //监听按钮事件
	 public void actionPerformed(ActionEvent e) {
		if(e.getSource()==startButton){
			con.removeAll();
			con.add(beginPanel);
			con.revalidate();
			con.repaint();
		}
		if(e.getSource()==startBackButton||e.getSource()==ruleBackButton||e.getSource()==teamBackButton){
			con.removeAll(); 
			con.add(firstPanel);
			con.revalidate();
			con.repaint();
		}
		if(e.getSource()==ruleButton){
			con.removeAll(); 
			con.add(rulePanel);
			con.revalidate();
			con.repaint();
		}
		if(e.getSource()==teamButton){
			con.removeAll(); 
			con.add(teamPanel);
			con.revalidate();
			con.repaint();
		}
	}


}
