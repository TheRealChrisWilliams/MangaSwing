//Generated by GuiGenie - Copyright (c) 2004 Mario Awad.
//Home Page http://guigenie.cjb.net - Check often for new versions!

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MGS1Login extends JPanel {
    private static JButton jcomp1;
    private JLabel jcomp2;
    private JLabel jcomp3;
    private JTextField jcomp4;
    private JTextField jcomp5;

    public MGS1Login() {
        //construct components
        jcomp1 = new JButton ("Submit");
        jcomp2 = new JLabel ("Login ID");
        jcomp3 = new JLabel ("Password");
        jcomp4 = new JTextField (5);
        jcomp5 = new JTextField (5);

        //adjust size and set layout
        setPreferredSize (new Dimension (532, 292));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);
        
        
        
        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (190, 160, 100, 20);
        jcomp2.setBounds (115, 90, 100, 25);
        jcomp3.setBounds (115, 125, 100, 25);
        jcomp4.setBounds (190, 95, 100, 25);
        jcomp5.setBounds (190, 125, 100, 25);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("MGS1Login");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new MGS1Login());
        frame.pack();
        jcomp1.addActionListener(new ActionListener() {
			@Override
		public void actionPerformed (ActionEvent arg0) {
			frame.setVisible(false);
			MGS1Menu secWin = new MGS1Menu();
			MGS1Menu.showWindow();
			}
		});
        frame.setVisible (true);
    }
}
