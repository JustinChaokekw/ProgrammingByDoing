import java.awt.*;
import javax.swing.JFrame;

public class SmilingFace extends Canvas
{
  public void paint( Graphics ha )
  {
    ha.setColor(Color.yellow);
    ha.fillOval(300,200,200,200);

    ha.setColor(Color.blue);
    ha.fillOval(330,250,40,40);
    ha.fillOval(430,250,40,40);

    ha.setColor(Color.red);
    ha.drawArc(350,250,100,100,210,120);
  }

  public static void main( String[] args )
	{
		JFrame win = new JFrame("GraphicsDemo3: :)");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SmilingFace canvas = new SmilingFace();
		win.add( canvas );
		win.setVisible(true);
	}
}
