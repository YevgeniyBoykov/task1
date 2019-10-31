package Task_Proj;

import java.util.ArrayList;

class Forth
{
    private static final String baseString = "Get the latest BC World News: international ne, features and analysis from Africa!";

    private static ArrayList<String> getWordWithMinLength(String s)
    {
        String str = s.replaceAll("[!:,]", "");
        String[] miniStr = str.split("\\s+");
        ArrayList<String> resultString  = new ArrayList<String>();
        resultString.add(miniStr[0]);

        for (int i = 1; i < miniStr.length; i++)
        {
           if(miniStr[i].length() <= resultString.get(0).length())
           {
               if(miniStr[i].length() < resultString.get(0).length())
               {
                   resultString.clear();
                   resultString.add(miniStr[i]);
               }
               else
                   resultString.add(miniStr[i]);
           }
        }
        return resultString;
    }

    static void taskForth()
    {
        System.out.println(getWordWithMinLength(baseString));
    }
}
