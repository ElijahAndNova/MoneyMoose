import javax.swing.JFrame;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;

public class GUI extends JFrame{
    
    static int xCoord;
    static int yCoord;
    static JFrame frame;
    static Overview overview;
    static Checking checking;

    static ArrayList<JButton> buttons = new ArrayList<JButton>(8);
    static int programState = 0;
    public static double netWorthVal = 5000.00;

    public static void main(String[] args){
	frame = new JFrame("Money Moose V0.1");
	frame.setLayout(null);
	frame.setSize(640,480);
	frame.setLocationRelativeTo(null);
	xCoord = frame.getX();
	yCoord = frame.getY();
	//frame.setUndecorated(true);
	frame.getContentPane().setBackground(Color.black);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(false);
	frame.setVisible(true);
	
	ComponentListener listener = new ComponentAdapter()
	    {
		public void componentMoved(ComponentEvent evt){
		    determineKillState();
		    determineOpenState();
		}
	    };

	    frame.addComponentListener(listener);

	JButton button1 = new JButton();
	button1.setLocation(0,0);
	button1.setSize(160,30);
	button1.setBackground(Color.white);
	button1.setText("OVERVIEW");
	buttons.add(button1);
	button1.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent e) 
	    {
		determineKillState();
		overview = new Overview(frame);
	    }
	});
	frame.getContentPane().add(button1);

	JButton button2 = new JButton();
	button2.setLocation(160,0);
	button2.setSize(160,30);
	button2.setBackground(Color.white);
	button2.setText("CHECKING");
	buttons.add(button2);
	button2.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent e) 
	    {
		determineKillState();
		checking = new Checking(frame);
	    }
	});
	frame.getContentPane().add(button2);
	
	JButton button3 = new JButton();
	button3.setLocation(320,0);
	button3.setSize(160,30);
	button3.setBackground(Color.white);
	button3.setText("SAVINGS");
	buttons.add(button3);
	frame.getContentPane().add(button3);

	JButton button4 = new JButton();
	button4.setLocation(480,0);
	button4.setSize(160,30);
	button4.setBackground(Color.white);
	button4.setText("INVESTING");
	buttons.add(button4);
	frame.getContentPane().add(button4);

	JButton button5 = new JButton();
	button5.setLocation(0,30);
	button5.setSize(160,30);
	button5.setBackground(Color.white);
	button5.setText("LOOMING");
	buttons.add(button5);
	frame.getContentPane().add(button5);

	JButton button6 = new JButton();
	button6.setLocation(160,30);
	button6.setSize(160,30);
	button6.setBackground(Color.white);
	button6.setText("RECURRING");
	buttons.add(button6);
	frame.getContentPane().add(button6);
	
	JButton button7 = new JButton();
	button7.setLocation(320,30);
	button7.setSize(160,30);
	button7.setBackground(Color.white);
	button7.setText("LOGBOOK");
	buttons.add(button7);
	frame.getContentPane().add(button7);

	JButton button8 = new JButton();
	button8.setLocation(480,30);
	button8.setSize(160,30);
	button8.setBackground(Color.white);
	button8.setText("SAVE/EXIT");
	buttons.add(button8);
	frame.getContentPane().add(button8);


	overview = new Overview(frame);
	
    }

    public static void setProgramState(int state){
	programState = state;
    }

    public static void determineKillState(){
	if (programState == 0){
	    overview.kill();
	}
	else if (programState == 1){
	    checking.kill();
	}
	else if (programState == 2){
	    savings.kill();
	}
	else if (programState == 3){
	    investing.kill();
	}
	else if (programState == 4){
	    looming.kill();
	}
	else if (programState == 5){
	    recurring.kill();
	}
	else if (programState == 6){
	    logbook.kill();
	}
    }
 
     public static void determineOpenState(){
	if (programState == 0){
	    overview = new Overview(frame);
	}
	else if (programState == 1){
	    checking = new Checking(frame);
	}
	else if (programState == 2){
	    savings = new Savings(frame);
	}
	else if (programState == 3){
	    investing = new Investing(frame);
	}
	else if (programState == 4){
	    looming = new Looming(frame);
	}
	else if (programState == 5){
	    recurring = new Recurring(frame);
	}
	else if (programState == 6){
	    logbook = new Logbook(frame);
	}
    }

}