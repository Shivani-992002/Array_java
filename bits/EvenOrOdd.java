public class EvenOrOdd{

    public static void isEven(int n)
    {
        int bitMask=1;
        if((n&bitMask)==0)
        {
            System.out.println("even");
        }else 
        {
            System.out.println("odd");
        }
    }

    public static void main (String args[])
    {
       
       isEven(7);
       isEven(8);
    }
}