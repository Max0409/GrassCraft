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
	 public static final Image WINDOW_BG=new ImageIcon("Graphics/��ʼ����2.jpg").getImage();
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
		  //���ñ���
		  this.setTitle("GrassCraft");
		  //���Ĭ�Ϲر����ԣ����������
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  //TODO ���ô��ڴ�С
		  this.setSize(1200,700);
		  //�������û��ı䴰�ڴ�С
		  this.setResizable(false);
		  //����
		  FrameUtil.setFrameCenter(this);
		  //container
		  con=this.getContentPane();
		  //��ʼ�����
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
	  * ��ʼ�������
	  */
	 private void initFirstPanel() {
		//�����ò��ֹ�����
		 firstPanel.setLayout(null);
		//���ɿ�ʼ��ť
		 firstPanel.add(createBeginButton());
		//������Ϸ����ť
		 firstPanel.add(createRuleButton());
		//���������ŶӰ�ť
		 firstPanel.add(createTeamButton());
	}
	/*
	  * ��ʼ����ʼ���
	  */
	 private void initBeginPanel(){
		//�����ò��ֹ�����
		 beginPanel.setLayout(null);
		//���ɷ��ذ�ť
	     beginPanel.add(createStartBackButton());
	 }
	 private void initRulePanel(){
		//�����ò��ֹ�����
		 rulePanel.setLayout(null);
		//���ɷ��ذ�ť
		 rulePanel.add(createRuleBackButton());
	 }
	 private void initTeamPanel(){
	    //�����ò��ֹ�����
		 teamPanel.setLayout(null);
		//���ɷ��ذ�ť
		 teamPanel.add(createTeamBackButton());
	 }
	 /*
	  * ���������ŶӰ�ť
	  */
	private JButton createTeamButton() {
	   	    teamButton=new JButton();
	        ImageIcon icon = new ImageIcon("Graphics/��ť�����Ŷ�.png"); 
	        teamButton.setBorder(null);
	        teamButton.setBounds(650,480,260,68);
	        Image temp = icon.getImage().getScaledInstance( teamButton.getWidth(),  
	        		 teamButton.getHeight(), icon.getImage().SCALE_DEFAULT);  
	        icon = new ImageIcon(temp);
	        teamButton.setIcon(icon);
	        //������ť�¼�
	        teamButton.addActionListener(this);
	   	    return  teamButton;
	}
	/*
	 * ������Ϸ����ť
	 */
	 private JButton createRuleButton() {
	   	    ruleButton=new JButton();
	        ImageIcon icon = new ImageIcon("Graphics/��ť��Ϸ����.png"); 
	        ruleButton.setBorder(null);
	        ruleButton.setBounds(640,370,272,73);
	        Image temp = icon.getImage().getScaledInstance(ruleButton.getWidth(),  
	        		ruleButton.getHeight(), icon.getImage().SCALE_DEFAULT);  
	        icon = new ImageIcon(temp);
	        ruleButton.setIcon(icon);
	        //������ť�¼�
	        ruleButton.addActionListener(this);
	   	    return ruleButton;
	}
	 /*
	  * ���ɿ�ʼ��ť
	  */
     public JButton createBeginButton(){
   	    startButton=new JButton();
        ImageIcon icon = new ImageIcon("Graphics/��ť��ʼ.png"); 
        startButton.setBorder(null);
        startButton.setBounds(660,285,162,56);
        Image temp = icon.getImage().getScaledInstance(startButton.getWidth(),  
       		 startButton.getHeight(), icon.getImage().SCALE_DEFAULT);  
        icon = new ImageIcon(temp);
        startButton.setIcon(icon);
        //������ť�¼�
        startButton.addActionListener(this);
   	    return startButton;
    }
    /*
     * ��ʼ���淵�ذ�ť
     */
     public JButton createStartBackButton(){
    	 startBackButton=new JButton("back");
    	 startBackButton.setBorder(null);
    	 startBackButton.setBounds(660,250,167,72);
         //��Ӱ�ť����
    	 startBackButton.addActionListener(this);
    	 return startBackButton;
     }	
     /*
      * ��Ϸ���򷵻ذ�ť
      */
     public JButton createRuleBackButton(){
    	 ruleBackButton=new JButton("back");
    	 ruleBackButton.setBorder(null);
    	 ruleBackButton.setBounds(660,250,167,72);
         //��Ӱ�ť����
    	 ruleBackButton.addActionListener(this);
    	 return ruleBackButton;
     }	
     /*
      * �����Ŷӷ��ذ�ť
      */
	 private JButton createTeamBackButton() {
		 teamBackButton=new JButton("back");
		 teamBackButton.setBorder(null);
		 teamBackButton.setBounds(660,250,167,72);
         //��Ӱ�ť����
		 teamBackButton.addActionListener(this);
    	 return  teamBackButton;
	}

     //������ť�¼�
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
