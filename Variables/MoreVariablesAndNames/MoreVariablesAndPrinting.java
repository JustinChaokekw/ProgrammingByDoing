// Justin Chao. August 31th, 2021.
public class MoreVariablesAndPrinting
{
  public static void main( String[] args )
  {
    String Name, Eyes, Teeth, Hair;
    int Age, Height, Weight;
    double CvHeight, CvWeight;

    Name = "Zed A. Shaw";
    Age = 35;     // not a lie
    Height = 74;  // inches
    Weight = 180; // lbs
    Eyes = "Blue";
    Teeth = "White";
    Hair = "Brown";
    CvHeight = Height * 2.54;
    CvWeight = Weight * 0.453592;

    System.out.println( "Let's talk about " + Name + "." );
    System.out.println( "He's " + Height + " inches (or " + CvHeight + " cm) tall." );
    System.out.println( "He's " + Weight + " pounds (or" + CvWeight + " kg) heavy." );
    System.out.println( "Actually, that's not too heavy." );
    System.out.println( "He's got " + Eyes + " eyes and " + Hair + " hair." );
    System.out.println( "His teeth are usually " + Teeth + " depending on the coffee." );

    // "This line is tricky; try to get it exactly right."? Seems quite easy to me though?
    System.out.println( "If I add " + Age + ", " + Height + ", and " + Weight + " I get " + (Age + Height + Weight) + "." );
  }
}
