package Task_Proj;

import java.util.Scanner;

public class Main_Task
{
  private static final String[] menu = {"1. division two numbers", "2. frequency rate of 6", "3. random division", "4. getWordWithMinLength()", "5. changeWordsOrder()", "6. EXIT."};
  public static void main (String[] args)
  {
    boolean err = false;
    int item;

    do
    {
       for (int i = 0; i < 6; i++) {
          System.out.println(menu[i]);
        }
        Scanner s = new Scanner(System.in);
        item = s.nextInt();
        if (item < 1 || item > 6)
        {
          System.out.println("Enter a number 1-6");
        }
        switch (item)
        {
          case 1:
            First.taskFirst();
            break;
          case 2:
            Second.taskSecond();
            break;
          case 3:
            Third.taskThird();
            break;
          case 4:
            Forth.taskForth();
            break;
          case 5:
            Fifth.fifthTask();
            break;
          case 6:
            err = true;
            break;
        }
    } while (!err);
  }
}
