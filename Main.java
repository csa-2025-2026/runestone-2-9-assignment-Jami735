import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here
   
    String word = Mississippi;
    int maxCount = 0;
    String maxLetter = "";

    for (int count = 0; count < word.length; count++)
    {
      String target = word.substring(i, i+1);
      int count = 0;
      for (int num = 0; num < word.length(); num++)
      {
        String currentLetter = word.substring(num, num+1);
        if (currentLetter.equals(target))
        {
          count++;
        }
        
      }
      System.out.println("The letter " + target + "appears " + count "time");
    }

    if (maxCount < maxLetter)
    {
      
    }
  }
}
