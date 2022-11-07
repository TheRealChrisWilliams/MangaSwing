import javax.swing.*;
import javax.swing.text.DefaultCaret;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UI2 {

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
		
		ToggleSwitch ts = new ToggleSwitch();
		ts.setLocation(10, 20);
		frame.add(ts);
		
		ImageIcon mangaIcon = new ImageIcon("mangaicon.jpg");
		frame.setIconImage(mangaIcon.getImage());
				
		JLabel darkmode = new JLabel("Dark Mode");
		darkmode.setFont(new Font("HV Boli", Font.PLAIN, 12));
		//darkmode.setBounds(10, 25, 600, 800);
		darkmode.setLocation(10, 25);
		darkmode.setForeground(Color.BLACK);
		frame.add(darkmode);	
		
		frame.setVisible(true);
		
	}
	  
}
