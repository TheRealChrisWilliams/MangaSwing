import javax.swing.*;
import javax.swing.text.DefaultCaret;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UI {

	public static void main(String[] args) {
		showWindow();		
	}
	
	public static void showWindow() {
		
		JFrame frame = new JFrame();
		frame.setSize(600, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color (255, 255, 255));
		frame.setResizable(false);								
		frame.setTitle("MangaSwing");	
				
		JButton loginButton = new JButton("Login");
		//loginButton.setBounds(8, 96, 600, 800);
		loginButton.setSize(8, 96);
		frame.add(loginButton);	
		
		loginButton.addActionListener(new ActionListener() {
			@Override
		public void actionPerformed (ActionEvent arg0) {
			frame.setVisible(false);
			UI2 secWin = new UI2();
			UI2.showWindow();
			}
		});
		
		frame.setVisible(true);
		
	}
	  
}
