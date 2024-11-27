import java.util.*;

public class Linearsearch
{
    public static int findindex(int numbers[], int key)
    {
        for(int i=0;i<numbers.length;i++)
        {
        if(numbers[i] == key)
          {
             return i;
          }
        }

         return -1;
    }



    public static void main(String args[])
    {
        int numbers[] ={2,4,6,8,10,12,14,18};
        int key = 54;

        int index = findindex(numbers,key);
        if(index==-1)
        {
            System.out.println("not found");
        }
        else
        {
            System.out.println("the key is at index :" +index);
        }
    }
}