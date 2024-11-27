import java.util.*;

public class Maxnumber
{

    public static int getlarget(int numbers[])
    {
        int largest = Integer.MIN_VALUE;//-infinity = lowest possible value

        for(int i =0; i<numbers.length; i++)
        {
            if(largest<numbers[i])
            {
            largest = numbers[i];
            } 
        }

        return largest;
    }
    public static void main(String args[])
    {
        int numbers[]={1,82,67,3,55};  
        System.out.println("the largest value is : " + getlarget(numbers) ) ;
    }
}