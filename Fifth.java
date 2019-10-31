package Task_Proj;

public class Fifth
{
    private static final String baseString1 = "test1 test2  test3";
    private static final String baseString2 = "Get the latest BC World News: international ne, features and analysis from Africa!";

    private static String[] changeWordsOrder(String s)
    {
        String str = s.replaceAll("[!:,]", "");

        String[] miniStr = str.split(" ");
        for(int i = 0; i < miniStr.length/2; i++)
        {
            String temp = miniStr[miniStr.length-i-1];
            miniStr[miniStr.length-i-1] = miniStr[i];
            miniStr[i] = temp;
        }
        return miniStr;
    }
    static void fifthTask()
    {
       for (String string : changeWordsOrder(baseString1))
          System.out.print(string + " ");

        System.out.println();
    }

}
