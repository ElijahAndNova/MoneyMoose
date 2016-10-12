import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Graph extends JPanel {

    static JFrame jFrame;

    public Graph(String doesntmatter){
	setBackground(Color.black);
    }

    public Graph(int x, int y) {
        setBackground(Color.black);
	jFrame = new JFrame("Overview Graph");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(630, 310);
        jFrame.add(new Graph("a"));
	jFrame.setUndecorated(true);
	//jFrame.setLocationRelativeTo(null);
	jFrame.setLocation(x+4, y+90);
        jFrame.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
	Random rand = new Random();
	for (int i = 0; i < 500; i++){
	    float r1 = rand.nextFloat();
	    float r2 = rand.nextFloat();
	    float r3 = rand.nextFloat();
	    g.setColor(new Color(r1,r2,r3));
	    g.drawOval(i, i, i+10, i+10);
	}
    }

    public void kill(){
	System.out.println("Killing");
	jFrame.dispose();
    }

}