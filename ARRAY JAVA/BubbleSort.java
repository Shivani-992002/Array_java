import java.util.*;

public class BubbleSort{
    public static void sorting(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void print(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        int n=arr.length;
        print(arr,n);
        System.out.println("\n");
        sorting(arr,n);
        print(arr,n);
    }
}
