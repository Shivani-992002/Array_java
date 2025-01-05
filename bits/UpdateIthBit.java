public class UpdateIthBit{

    // public static int setIthBit(int n,int i)
    // {
    //     int bitMask=1<<i;
    //     return n|bitMask;
    // }
    public static int clearIthBit(int n,int i)
    {
        int bitMask=~(1<<i);
        return n|bitMask;
    }
    public static int updateIntBit(int n ,int i, int newBit)
    {
        // if(newBit==0)
        // {
        //     return clearIthBit(n,i);
        // }else{
        //     return setIthBit(n,i);
        // }

        int m=clearIthBit(n,i);
        int bitMask=newBit<<i;
        return n|bitMask;

    }
    public static void main(String args[])
    {
        System.out.println(updateIntBit(10,2,1));
    }
}