import java.awt.*;
import javax.swing.JFrame;

public class Circle extends Canvas
{
  public void paint( Graphics sad )
	{
    sad.setColor(Color.green);
    sad.fillOval(300,150,200,200);
  }

  public static void main( String[] args )
	{
		JFrame win = new JFrame("Circle");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Circle canvas = new Circle();
		win.add( canvas );
		win.setVisible(true);
	}
}
