import java.util.*;
public class ArrayListExample{
   public static void main(String args[]){
    ArrayList<Integer> list=new ArrayList<>();
    //add function to add element 
    list.add(9);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    System.out.println(list);//1,2,3,4,5
    //get function to get element 
    int element=list.get(2);//get(idx)
    System.out.println(element);//3
    //remove function to remve element 
    int element1=list.remove(3);//romove(idx)
    System.out.println(list);//1,2,3,5
    //to get the size of the list
    System.out.println(list.size());//4 due to removal of element at index 3

    //for sorting -->fnx is  Collect.sort(arrayList name)
    Collections.sort(list);
    System.out.println(list);
   }
}