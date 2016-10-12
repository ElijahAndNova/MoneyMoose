import javax.swing.JFrame;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class Overview{

    static JFrame frame;
    static JLabel netWorth;
    static Graph graph;
    static boolean killed;

    public Overview(JFrame passedFrame){
	killed = false;
	System.out.println("Overview class instantiated");
	frame = passedFrame;
	GUI.setProgramState(0);
	netWorth = new JLabel("Net Worth: $" + GUI.netWorthVal);
	netWorth.setFont(new Font("Serif", Font.PLAIN, 40));
	netWorth.setSize(640,100);
	netWorth.setLocation(0,380);
	netWorth.setForeground(Color.green);
	netWorth.setVisible(true);
	frame.getContentPane().add(netWorth);	
	frame.repaint();
	graph = new Graph(frame.getX(), frame.getY());
	
	
	
    }

    public static void kill(){
	killed = true;
	frame.getContentPane().remove(netWorth);
	graph.kill();
	frame.repaint();
    }

	
    
}

