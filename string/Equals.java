public class Equals{
    public static void main(String args[])
    {
    String s1="tony";
    String s2="tony";
    String s3=new String ("tony");
    if(s1==s2)
    {
        System.out.println("true");
    }else
    {
        System.out.println("false");
    }

    if(s1==s3)
    {
        System.out.println("true");
    }else
    {
        System.out.println("false");
    }

    //using equals string function
    if(s1.equals(s3))
    {
        System.out.println("true");
    }else
    {
        System.out.println("false");
    }
    }
}