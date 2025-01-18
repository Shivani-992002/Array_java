import java.util.*;
public class Swap{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
     
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int idx1=2;
        int idx2=3;

        int temp=list.get(2);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
        System.out.print(list);
    }
}