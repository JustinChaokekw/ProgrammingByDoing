import java.awt.*;
import javax.swing.JFrame;
import java.awt.Polygon;

public class BoringTriangle extends Canvas
{
  public void paint( Graphics weeee )
  {
    Color royalBlueDark = new Color(10,16,69);

    Polygon boring = new Polygon();
    boring.addPoint(512, 200);
		boring.addPoint(580, 400);
		boring.addPoint(470, 430);

    weeee.setColor(royalBlueDark);
		weeee.fillPolygon(boring);
  }

  public static void main(String[] args)
	{
		JFrame win = new JFrame("BoringTriangle");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new BoringTriangle() );
		win.setVisible(true);
	}
}
