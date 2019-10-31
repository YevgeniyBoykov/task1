package Task_Proj;

import java.util.Random;

class Third
{
  private static final int LIMIT_3 = 1000;

  private static boolean division_rand(int x)
  {
    Random r = new Random();
    int rand = r.nextInt(10);

    if (rand == 0)
    {
      return false;
    }
    else return x % rand == 0;
  }

  static void taskThird()
  {
    for (int i = 1; i < LIMIT_3; i++)
    {
      if (division_rand(i))
      {
        System.out.println("Cycle completed! Step - " + i);
        System.out.println();
        break;
      }
    }
  }
}
