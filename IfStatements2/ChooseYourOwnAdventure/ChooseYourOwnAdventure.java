import java.util.Scanner;

public class ChooseYourOwnAdventure
{
  public static void main( String[] args ) throws Exception
  {

    Scanner keyboard = new Scanner(System.in);

    String P1, P2, P3, PA;
    int C1, C2, C3;

    P1 = ("he/she/they");
    P2 = ("his/her/their");
    P3 = ("him/her/them");
    PA = ("is/are");

    System.out.println();

    // HAVEN'T STARTED
    for ( int j=0; j<8; j++ )
    {
      if ( j%8 == 0 )
        System.out.println("You are stuck in a dark room with the person you hate the most.");
      else if ( j%8 == 1 )
        System.out.println("You wish they could disappear.");
      else if ( j%8 == 2 )
        System.out.println("And the room is, more specifically, your room.");
      else if ( j%8 == 3 )
        System.out.println("Anyways, without " + P2 + " notice, you somehow touched something on the floor." );
      else if ( j%8 == 4 )
        System.out.println("It is a charging line, maybe you forgot to put it back to where it should be." );
      else if ( j%8 == 5 )
        System.out.println("While " + P1 + " " + PA + " still confused, an idea suddenly grew in your mind." );
      else if ( j%8 == 6 )
        System.out.println("What about trying to KILL " + P3 + " with this?");
      else if ( j%8 == 7 )
        {
          System.out.println("> Try it, grab it from the ground. (1)");
          System.out.println("> Turn on the lights instead. (2)");
          System.out.print("> ");
        }

      Thread.sleep(2000);
    }
    C1 = keyboard.nextInt();

      if ( C1 == 1 )
      {
        // FIRST CHOICE - 1
        for ( int k=0; k<5; k++ )
        {
          if ( k%5 == 0 )
            System.out.println();
          else if ( k%5 == 1 )
            System.out.println("Without a sound, you successfully grabbed the charger wire from the ground.");
          else if ( k%5 == 2 )
            System.out.println("It is now steadily in your hands.");
          else if ( k%5 == 3 )
            System.out.println("You feel the full weight of it in your hands.");
          else if ( k%5 == 4 )
            {
              System.out.println("> Do it. (1)");
              System.out.println("> Nevermind. (2)");
              System.out.print("> ");
            }

          Thread.sleep(2000);
        }
          C2 = keyboard.nextInt();
          if ( C2 == 1 )
          {
            // FIRST CHOICE - 1 - SECOND CHOICE - 1
            for ( int l=0; l<5; l++ )
            {
              if ( l%5 == 0 )
                System.out.println();
              else if ( l%5 == 1 )
                System.out.println("You approached " + P2 + " back, and strangled them with your full strength.");
              else if ( l%5 == 2 )
                System.out.println("In the middle of " + P2 + " struggles, " + P1 + " turned back and look at you.");
              else if ( l%5 == 3 )
                System.out.println("You can feel the excruciating pain from " + P2 + " expression.");
              else if ( l%5 == 4 )
                {
                  System.out.println("> Keep going. (1)");
                  System.out.println("> Let go. (2)");
                  System.out.print("> ");
                }

              Thread.sleep(2000);
            }
              C3 = keyboard.nextInt();
              if ( C3 == 1 )
              {
                // FIRST CHOICE - 1 - SECOND CHOICE - 1 - THIRD CHOICE - 1
                for ( int m=0; m<13; m++ )
                {
                  if ( m%13 == 0 )
                    System.out.println();
                  else if ( m%13 == 1 )
                    System.out.println("Well, after he/she/died, the body fell on the ground after you released them.");
                  else if ( m%13 == 2 )
                    System.out.println("Umm, funny enough- you can't get out!");
                  else if ( m%13 == 3 )
                    System.out.println("I mean, who would care? At least you won't.");
                  else if ( m%13 == 4 )
                    System.out.println("Just a simple game that is written in Java language, what's the matter.");
                  else if ( m%13 == 5 )
                    System.out.println("Well, HOWEVER-");
                  else if ( m%13 == 6 )
                    System.out.println("Notice where you stand.");
                  else if ( m%13 == 7 )
                    System.out.println("Notice that one step is followed by the next, and the next, and the next-");
                  else if ( m%13 == 8 )
                    System.out.println("-to infinity.");
                  else if ( m%13 == 9 )
                    System.out.println("Look at where you are, and look at where you'll be.");
                  else if ( m%13 == 10 )
                    System.out.println("HAHA! Just kidding! It's just a game, how serious could it be?");
                  else if ( m%13 == 11 )
                    System.out.println("Time to go back to your regular life!");
                  else if ( m%13 == 12 )
                    {
                      System.out.println("Enjoy! :)");
                      System.out.println();
                    }

                  Thread.sleep(2000);
                }
              }
              else if ( C3 == 2 )
              {
                // FIRST CHOICE - 1 - SECOND CHOICE - 1 - THIRD CHOICE - 2
                for ( int n=0; n<7; n++ )
                {
                  if ( n%7 == 0 )
                    System.out.println();
                  else if ( n%7 == 1 )
                    System.out.println("You really thought you can escape from this, huh.");
                  else if ( n%7 == 2 )
                    System.out.println("Lemme tell you something, there is no way turning back.");
                  else if ( n%7 == 3 )
                    System.out.println("Lemme help you.");
                  else if ( n%7 == 4 )
                    System.out.println("His/her/they stopped struggling, the painful expression was the only thing you will see from him/her/them now.");
                  else if ( n%7 == 5 )
                    System.out.println();
                  else if ( n%7 == 6 )
                    {
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("HAVE A GOOD DAY.");
                      System.out.println("Have a good day. :)");
                      System.out.println();
                    }

                  Thread.sleep(2000);
                }
              }
          }
          else if ( C2 == 2 )
          {
            // FIRST CHOICE - 1 - SECOND CHOICE - 2
            for ( int o=0; o<8; o++ )
            {
              if ( o%8 == 0 )
                System.out.println();
              else if ( o%8 == 1 )
                System.out.println("Hmm...");
              else if ( o%8 == 2 )
                System.out.println("Well, aren’t you tired of this choice you have made?");
              else if ( o%8 == 3 )
                System.out.println("Maybe... every time in your life, you had made this choice.");
              else if ( o%8 == 4 )
                System.out.println("Isn’t it frustrating?");
              else if ( o%8 == 5 )
                System.out.println("Not being powerful or bold enough to harm them...");
              else if ( o%8 == 6 )
                System.out.println("-yet not kind enough to make people treat you better...");
              else if ( o%8 == 7 )
                {
                  System.out.println("Why not choose an easier path to walk on?");
                  System.out.println("> DO IT DO IT DO IT DO IT DO IT DO IT DO IT DO IT DO IT DO IT DO IT DO IT DO IT DO IT DO IT DO IT DO IT DO IT DO IT DO IT DO IT DO IT DO IT DO IT DO IT DO IT DO IT DO IT DO IT DO IT DO IT DO IT DO IT DO IT DO IT DO IT DO IT (1)");
                  System.out.println("> I said, nevermind. (2)");
                  System.out.print("> ");
                }

              Thread.sleep(2000);
            }
              C3 = keyboard.nextInt();
              if ( C3 == 1 )
              {
                // FIRST CHOICE - 1 - SECOND CHOICE - 2 - THIRD CHOICE - 1
                for ( int p=0; p<4; p++ )
                {
                  if ( p%4 == 0 )
                    System.out.println();
                  else if ( p%4 == 1 )
                    System.out.println("That’s right.");
                  else if ( p%4 == 2 )
                    System.out.println("Now, no one’s in your way now.");
                  else if ( p%4 == 3 )
                    {
                      System.out.println("Enjoy your life :)");
                      System.out.println();
                    }

                  Thread.sleep(2000);
                }
              }
              else if ( C3 == 2 )
              {
                // FIRST CHOICE - 1 - SECOND CHOICE - 2 - THIRD CHOICE - 2
                for ( int q=0; q<7; q++ )
                {
                  if ( q%7 == 0 )
                    System.out.println();
                  else if ( q%7 == 1 )
                    System.out.println("Huh…");
                  else if ( q%7 == 2 )
                    System.out.println("You are strong.");
                  else if ( q%7 == 3 )
                    System.out.println("You accepted to stay in such situation.");
                  else if ( q%7 == 4 )
                    System.out.println("You know what, just for that,");
                  else if ( q%7 == 5 )
                    System.out.println("-I genuinely wish you would have a better life.");
                  else if ( q%7 == 6 )
                    {
                      System.out.print("Have a good day.");
                      System.out.println();
                    }

                  Thread.sleep(2000);
                }
              }
          }
      }
      else if ( C1 == 2 )
      {
        // FIRST CHOICE - 2
        for ( int r=0; r<7; r++ )
        {
          if ( r%7 == 0 )
            System.out.println();
          else if ( r%7 == 1 )
            System.out.println("You walked towards the light switch, and you turned the light.");
          else if ( r%7 == 2 )
            System.out.println("Your sight was slightly blurred by the sudden increase in brightness.");
          else if ( r%7 == 3 )
            System.out.println("At the same time, " + P1 + " seemed a bit frightened, too.");
          else if ( r%7 == 4 )
            System.out.println("After a quick glance around, " + P1 + " noticed that you are in the room.");
          else if ( r%7 == 5 )
            System.out.println("What will you do?");
          else if ( r%7 == 6 )
            {
              System.out.println("> Talk to " + P3 + ". (1)");
              System.out.println("> W-walk away-? (2)");
              System.out.print("> ");
            }

          Thread.sleep(2000);
        }
          C2 = keyboard.nextInt();
          if ( C2 == 1 )
          {
            // FIRST CHOICE - 2 - SECOND CHOICE - 1
            for ( int s=0; s<3; s++ )
            {
              if ( s%3 == 0 )
                System.out.println();
              else if ( s%3 == 1 )
                System.out.println("What would you want to talk to them?");
              else if ( s%3 == 2 )
                {
                  System.out.println("> Maybe... about the misunderstandings and feelings? (1)");
                  System.out.println("> I hate you, b*tch. (2)");
                  System.out.print("> ");
                }

              Thread.sleep(2000);
            }
              C3 = keyboard.nextInt();
              if ( C3 == 1 )
              {
                // FIRST CHOICE - 2 - SECOND CHOICE - 1 - THIRD CHOICE - 1
                for ( int t=0; t<3; t++ )
                {
                  if ( t%6 == 0 )
                    System.out.println();
                  else if ( t%6 == 1 )
                    System.out.println("Umm...");
                  else if ( t%6 == 2 )
                    System.out.println("...They refused to talk and walked out of the room.");
                  else if ( t%6 == 3 )
                    System.out.println("...Listen, sometimes people are not as kind as you think.");
                  else if ( t%6 == 4 )
                    System.out.println("Be bold.");
                  else if ( t%6 == 5 )
                    {
                      System.out.println("Wish you a good day.");
                      System.out.println();
                    }

                  Thread.sleep(2000);
                }
              }
              else if ( C3 == 2 )
              {
                // FIRST CHOICE - 2 - SECOND CHOICE - 1 - THIRD CHOICE - 2
                for ( int u=0; u<2; u++ )
                {
                  if ( u%2 == 0 )
                    System.out.println(".");
                  else if ( u%2 == 1 )
                    {
                      System.out.println("You fucking died becuz they punched you to death looool");
                      System.out.println();
                    }

                  Thread.sleep(2000);
                }
              }
          }
          else if ( C2 == 2 )
          {
            // FIRST CHOICE - 2 - SECOND CHOICE - 2
            for ( int v=0; v<3; v++ )
            {
              if ( v%3 == 0 )
                System.out.println();
              else if ( v%3 == 1 )
                System.out.println("What the hell- Ok, you are surely different, but- why???");
              else if ( v%3 == 2 )
                {
                  System.out.println("> Are you running outta ideas, is that why you’re asking me a question (1)");
                  System.out.println("> I just don’t wanna see" + P3 + ". (2)");
                  System.out.print("> ");
                }

              Thread.sleep(2000);
            }
              C3 = keyboard.nextInt();
              if ( C3 == 1 )
              {
                // FIRST CHOICE - 2 - SECOND CHOICE - 2 - THIRD CHOICE - 1
                for ( int w=0; w<5; w++ )
                {
                  if ( w%5 == 0 )
                    System.out.println();
                  else if ( w%5 == 1 )
                    System.out.println("You know what, just for that, I’m gonna stop writing if statements to please you.");
                  else if ( w%5 == 2 )
                    System.out.println("It’s time to stop your arrogance and GROW UP.");
                  else if ( w%5 == 3 )
                    System.out.println("If you have to time to waste here, why not doing some more important things?");
                  else if ( w%5 == 4 )
                    {
                      System.out.println("I wish you would enjoy the boringness in the rest of your life, jerk.");
                      System.out.println();
                    }

                  Thread.sleep(2000);
                }
              }
              else if ( C3 == 2 )
              {
                // FIRST CHOICE - 2 - SECOND CHOICE - 2 - THIRD CHOICE - 2
                for ( int x=0; x<6; x++ )
                {
                  if ( x%6 == 0 )
                    System.out.println();
                  else if ( x%6 == 1 )
                    System.out.println("Hmmm...");
                  else if ( x%6 == 2 )
                    System.out.println("You know what, that is surely a good move.");
                  else if ( x%6 == 3 )
                    System.out.println("Emm.. but never ask me it is correct or not, you will see,");
                  else if ( x%6 == 4 )
                    System.out.println("-or you might be lucky enough to never worry about it.");
                  else if ( x%6 == 5 )
                    {
                      System.out.println("Have a good day.");
                      System.out.println();
                    }

                  Thread.sleep(2000);
                }
              }
          }


    }
  }
}
