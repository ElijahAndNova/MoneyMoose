import javax.swing.JFrame;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class Checking extends GUI{

    static JFrame frame;
    static JLabel netWorth;

    public Checking(JFrame passedFrame){
	System.out.println("Checking class instantiated");
	frame = passedFrame;
	GUI.setProgramState(1);
	netWorth = new JLabel("Checking Balance: $" + GUI.netWorthVal/3);
	netWorth.setFont(new Font("Serif", Font.PLAIN, 40));
	netWorth.setSize(640,100);
	netWorth.setLocation(0,380);
	netWorth.setForeground(Color.green);
	netWorth.setVisible(true);
	frame.getContentPane().add(netWorth);
	frame.repaint();
    }
 
    public static void kill(){
	frame.getContentPane().remove(netWorth);
	frame.repaint();
    }

}