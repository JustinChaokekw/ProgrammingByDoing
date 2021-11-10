import java.awt.*;
import javax.swing.JFrame;
import java.awt.Polygon;

// 1. The pentagon would not so much a pentagon anymore, since the dots are connected in order.
//    Therefore to create a single enclosed shape, it is necessary to put the dots in clockwise order.
// 2.

public class PolygonDemo extends Canvas
{
	public void paint( Graphics g )
	{
		g.setColor(Color.black);
		g.drawString("Hey, a triangle!", 50, 50);

		Polygon tri = new Polygon();
		tri.addPoint(100, 100);
		tri.addPoint(100, 300);
		tri.addPoint(200, 300);

		g.setColor(Color.blue);
		g.fillPolygon(tri);

		Polygon trap = new Polygon(); // 2. Make a trapezoid somewhere on the screen. The color doesn't matter, and it doesn't matter if it's filled-in or an outline.
		trap.addPoint(800,550);
		trap.addPoint(900,700);
		trap.addPoint(600,700);
		trap.addPoint(650,550);

		g.setColor(Color.magenta);
		g.fillPolygon(trap);

		Polygon pent = new Polygon();
		pent.addPoint(450, 200);
		pent.addPoint(500, 250);
		pent.addPoint(475, 350);
		pent.addPoint(425, 350);
		pent.addPoint(400, 250);

		g.setColor(Color.green);
		g.fillPolygon(pent);

		Polygon hex = new Polygon();

		// use trig to make a regular hexagon
		int radius = 100; // pixels
		int xCenter = 200;
		int yCenter = 500;
		for ( double ang = 0; ang<2*Math.PI; ang=ang+(2*Math.PI)/6.0)
		{
			double xDelta = radius * Math.cos(ang);
			double yDelta = -radius * Math.sin(ang);
			hex.addPoint(xCenter+(int)xDelta, yCenter+(int)yDelta);
		}

		g.setColor(Color.black);
		g.fillPolygon(hex);
	}

	public static void main(String[] args)
	{
		JFrame win = new JFrame("Polygon Demo");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new PolygonDemo() );
		win.setVisible(true);
	}

}
