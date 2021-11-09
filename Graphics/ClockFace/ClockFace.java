import java.awt.*;
import javax.swing.JFrame;

public class ClockFace extends Canvas
{
  public void paint( Graphics eh )
  {
    eh.setColor(Color.black);
    eh.fillRect(0,0,800,600);

    eh.setColor(Color.orange);
    eh.drawOval(300,200,200,200);

		eh.setFont(new Font("Arial", Font.PLAIN, 20));
		eh.drawString("XII", 385, 230);
    eh.drawString("III", 465, 307);
		eh.drawString("XI", 390, 380);
    eh.drawString("IX", 315, 307);

    eh.setFont(new Font("Arial", Font.PLAIN, 15));
    eh.setColor(Color.white);
    eh.drawString("I", 440, 240);
    eh.drawString("II", 460, 270);
    eh.drawString("IV", 460, 340);
    eh.drawString("V", 440, 370);
    eh.drawString("VII", 345, 370);
    eh.drawString("VIII", 325, 340);
    eh.drawString("X", 330, 270);
    eh.drawString("XI", 355, 240);


    eh.drawLine(350,300,400,300);
    eh.drawLine(400,220,400,300);

    eh.setColor(Color.yellow);
    eh.fillOval(390,290,20,20);
    eh.drawString("hehe clock", 370, 450);
  }

  public static void main( String[] args )
	{
		JFrame win = new JFrame("ClockFace");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ClockFace canvas = new ClockFace();
		win.add( canvas );
		win.setVisible(true);
	}
}
