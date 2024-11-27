import java.util.*;

public class Arraycreation
{   
    public static void function(int marks[])
    {
      for(int i = 0; i<marks.length;i++)
      {
        marks[i] = marks[i]+1;
      }
    }
    public static void main(String args[])
    {
        int marks[] = {98,84,32};
        //int number[] = {10,25,37};automatically it gives java the size is three and values of theem
        function(marks);

        //print the marks
        for(int i = 0; i<marks.length;i++)
          {
        System.out.print(marks[i]+" ");
          }
      System.out.println();
    }
}