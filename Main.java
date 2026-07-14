import java.util.Random;

class Main
{
  public static void main(String[] args)
  {
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;
    int count5 = 0;
    int count6 = 0;

    for (int rollNumber = 1; rollNumber <= 100; rollNumber++)
    {
      int result = roll();
      System.out.println("Roll " + rollNumber + ": [" + result + "]");

      if (result == 1)
      {
        count1++;
      }
      else if (result == 2)
      {
        count2++;
      }
      else if (result == 3)
      {
        count3++;
      }
      else if (result == 4)
      {
        count4++;
      }
      else if (result == 5)
      {
        count5++;
      }
      else
      {
        count6++;
      }
    }

    System.out.println();
    System.out.println("Final Roll Counts:");
    System.out.println("[1]: " + count1 + " times");
    System.out.println("[2]: " + count2 + " times");
    System.out.println("[3]: " + count3 + " times");
    System.out.println("[4]: " + count4 + " times");
    System.out.println("[5]: " + count5 + " times");
    System.out.println("[6]: " + count6 + " times");
  }
  
  // Random is a class we can use to generate random numbers
  // You do not need to change anything in the method below
  // Every time you invoke the roll() method, it will generate a random int
  // between 0-5, and then we add 1, so it will return a number between 1-6, just like dice
  public static int roll()
  {
    Random dice = new Random();
    return dice.nextInt(6) + 1;
  }
}
