import java.awt.*;
import javax.swing.JFrame;

//1. The width of the window is 800, while the height is 600.
//2. 1) X-coordinate of the left edge; 2) Y-coordinate of the top edge; 3) Width; 4) Height.
//3. 1) X-coordinate of the left edge; 2) Y-coordinate of the top edge; 3) Width; 4) Height.
//4. 1) X-coordinate of the left edge; 2) Y-coordinate of the top edge.
//5. The ones that are later created will be on the top.

public class GraphicsDemo1 extends Canvas
{
	public void paint( Graphics g )
	{
		g.setColor(Color.green);
		g.drawRect(50,20,100,200);  // draw a rectangle
		g.fillOval(160,20,100,200); // draw a filled-in oval
		g.setColor(Color.blue);
		g.fillRect(200,400,200,20); // a filled-in rectangle
		g.drawOval(200,430,200,100);
		g.setColor(Color.red);
		g.fillRect(600,450,50,50); // 6. Add a red, filled-in square somewhere in the lower-right of the canvas.

		g.setColor(Color.black);
		g.drawString("Graphics are pretty neat.", 500, 100);
		int x = getWidth() / 2;
		int y = getHeight() / 2;
		g.drawString("The first letter of this string is at (" + x + "," + y + ")", x, y);
	}

	public static void main( String[] args )
	{
		// You can change the title or size here if you want.
		JFrame win = new JFrame("GraphicsDemo1");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GraphicsDemo1 canvas = new GraphicsDemo1();
		win.add( canvas );
		win.setVisible(true);
	}
}
