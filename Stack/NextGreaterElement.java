//the next Greater element of some element x in an array is the first greater element that is to the right of x in the same array
//input--> arr[]={6,8,0,1,3}
//output-->nextGreater[]={8,-1,1,3,-1}
//next Greater right
import java.util.*;
public class NextGreaterElement{

    public static void nextGreaterElement(int arr[],int n){
        Stack<Integer> s=new Stack<>();
        int nextGreater[]=new int[n];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
               s.pop();
            }

            if(s.isEmpty()){
                nextGreater[i]=-1;
            }else{
                nextGreater[i]=arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<nextGreater.length;i++){
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();

    }

    public static void main(String args[]){
        int arr[]={6,8,0,1,3};
        int n=arr.length;
        
        nextGreaterElement(arr,n);
    }
}