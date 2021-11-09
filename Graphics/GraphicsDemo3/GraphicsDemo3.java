import java.awt.*;
import javax.swing.JFrame;

// 1. 1) X-coordinate of the starting point; 2) Y-coordinate of the starting point; 3) X-coordinate of the ending point; 4) Y-coordinate of the ending point.
// 4. The upper-left corner.
// 5. The left edge and the middle height line.
// 6. It will become Calibri.
// 7. It will become Calibri.

public class GraphicsDemo3 extends Canvas
{
	public void paint( Graphics g )
	{
		// lines
		g.setColor(Color.green);
		g.drawLine(10,100,400,100);
		g.setColor(Color.blue);
		g.drawLine(50,150,100,180);
		g.setColor(Color.magenta);
		g.drawLine(100,350,300,230);
		g.setColor(Color.red);
		g.drawLine(205,50,205,150); // 2. Make a short red line that intersects the long green line.
		g.drawLine(200,250,230,300); // 3. Make a short red line that is roughly perpendicular to the diagonal "magenta" line.

		g.setColor(Color.black);

		// fonts
		g.drawString("Graphics are pretty neat.", 500, 100);
		g.setFont(new Font("Consolas", Font.PLAIN, 36)); // 36-pt plain
		g.drawString("Yes, they are.", 400, 200);

		g.setColor(Color.white);
		g.setFont(new Font("Arial", Font.BOLD+Font.ITALIC, 60)); // 60-pt italic bold
		g.drawString("Leander Lions", 300, 350);

		g.setColor(Color.blue);
		g.setFont(Font.decode("Arial-BOLDITALIC-60")); // a different way to specify the same font
		g.drawString("Leander Lions", 290, 360);

		g.setColor(Color.black);
		g.setFont(new Font(null)); // restore default font

		int x=400, y=490;
		g.drawRect(x,y,150,20);
		g.drawString("Where is the starting point?", x,y);
		g.setColor(Color.red);
		g.drawLine(x,y,x,y);	// drawing a line from a point to itself makes a 1px-by-1px dot

	}

	public static void main( String[] args )
	{
		JFrame win = new JFrame("GraphicsDemo3: Fonts and Lines");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GraphicsDemo3 canvas = new GraphicsDemo3();
		win.add( canvas );
		win.setVisible(true);
	}
}
