import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MGS1Menu extends JPanel {
    private JMenuBar Menu;
    private JLabel menubtn;
    private JLabel jcomp3;
    private JLabel jcomp4;
    private JLabel jcomp5;
    private JList jcomp6;
    private JLabel jcomp7;
    private JComboBox jcomp8;
    private JList jcomp9;
    private JLabel jcomp10;
    private JComboBox jcomp11;

    public MGS1Menu() {
        //construct preComponents
        JMenu exitMenu = new JMenu ("Exit");
        JMenu fileMenu = new JMenu ("File");
        JMenuItem import_mangaItem = new JMenuItem ("Import Manga");
        fileMenu.add (import_mangaItem);
        JMenu viewMenu = new JMenu ("View");
        JMenuItem continuous_verticalItem = new JMenuItem ("Continuous Vertical");
        viewMenu.add (continuous_verticalItem);
        JMenuItem webtoonItem = new JMenuItem ("Webtoon");
        viewMenu.add (webtoonItem);
        JMenuItem verticalItem = new JMenuItem ("Vertical");
        viewMenu.add (verticalItem);
        JMenuItem right_to_leftItem = new JMenuItem ("Right to Left");
        viewMenu.add (right_to_leftItem);
        JMenuItem left_to_rightItem = new JMenuItem ("Left to Right");
        viewMenu.add (left_to_rightItem);
        String[] jcomp6Items = {"MOB 3", "CSM", "TYBW"};
        String[] jcomp8Items = {"MOB 3", "CSM", "TYBW", "One Piece", "Full Metal Alchemist", "Jujutsu Kaisen", "Boku dake Ga inai Machi", "Monster", "Berserk", "Your Lie In April", "Black Bible", "Euphoria", "Dropout"};
        String[] jcomp9Items = {"One Piece", "Full Metal Alchemist", "Jiujitsu Kaisen", "Boku dake Ga inai Machi", "Monster", "Berserk", "Your lie in april", "Black Bible", "Euphoria", "Dropout"};
        String[] jcomp11Items = {"English", "Japanese", "Korean", "Chinese", "Spanish", "Russian"};

        //construct components
        Menu = new JMenuBar();        
        Menu.add (fileMenu);
        Menu.add (viewMenu);
        Menu.add (exitMenu);
        menubtn = new JLabel ("Menu ");
        jcomp3 = new JLabel ("Thank you for using MangaSwing");
        jcomp4 = new JLabel ("Select Language");
        jcomp5 = new JLabel ("Select From library");
        jcomp6 = new JList (jcomp6Items);
        jcomp7 = new JLabel ("New releases");
        jcomp8 = new JComboBox (jcomp8Items);
        jcomp9 = new JList (jcomp9Items);
        jcomp10 = new JLabel ("All Releases");
        jcomp11 = new JComboBox (jcomp11Items);

        //set components properties
        jcomp3.setToolTipText ("T");
        jcomp9.setToolTipText ("yas");

        //adjust size and set layout
        setPreferredSize (new Dimension (532, 292));
        setLayout (null);

        //add components
        add (Menu);
        add (menubtn);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);
        add (jcomp6);
        add (jcomp7);
        add (jcomp8);
        add (jcomp9);
        add (jcomp10);
        add (jcomp11);

        //set component bounds (only needed by Absolute Positioning)
        Menu.setBounds (0, 0, 525, 25);
        menubtn.setBounds (240, 20, 48, 32);
        jcomp3.setBounds (330, 235, 215, 70);
        jcomp4.setBounds (25, 50, 100, 25);
        jcomp5.setBounds (405, 50, 125, 25);
        jcomp6.setBounds (300, 75, 100, 75);
        jcomp7.setBounds (305, 50, 100, 25);
        jcomp8.setBounds (405, 80, 100, 25);
        jcomp9.setBounds (130, 80, 155, 185);
        jcomp10.setBounds (155, 50, 100, 25);
        jcomp11.setBounds (25, 80, 100, 25);
    }


    public static void main (String[] args) {
    	showWindow();
    }
    
    public static void showWindow() {
    	ImageIcon mangaIcon = new ImageIcon("mangaicon.jpg");
        JFrame frame = new JFrame ("MangaSwing");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new MGS1Menu());
        frame.pack();
        frame.setIconImage(mangaIcon.getImage());
        frame.setVisible (true);
    	
    }
}
