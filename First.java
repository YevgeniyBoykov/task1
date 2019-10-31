package Task_Proj;

import java.util.Scanner;

class First
{
  private static float division(float x, float y)
  {
    return x/y;
  }

  static void taskFirst()
  {
    System.out.print("Enter a: ");
    Scanner scan = new Scanner(System.in);
    float a = scan.nextInt();

    System.out.print("Enter b: ");
    scan = new Scanner(System.in);
    float b = scan.nextInt();

    if (b == 0)
    {
      System.out.println("Division to zero is prohibit!");
      return;
    }
    else if (a < 100 || b < 10)
    {
      System.out.println("Entering digits are too small... BUT: ");
    }
    System.out.println(division(a, b));
    System.out.println();
  }
}
