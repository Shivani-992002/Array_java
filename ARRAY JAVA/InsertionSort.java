import java.util.*;

public class InsertionSort{
   
   public static void print(int arr[],int n)
   {
     for (int i=0;i<n;i++)
     {
        System.out.print(arr[i]+" ");
     }
   }

   public static void insertion(int arr[],int n)
   {
     int i,j,key;
     for (i=1;i<n;i++)
     {
        key=arr[i];
        j=i-1;
        while(j>=0 && key<arr[j])
        {
            arr[j+1]=arr[j];
            j=j-1;
        }
        arr[j+1]=key;
     }
   }



    public static void main(String args[])
    {
        int arr[]={4,1,5,2,3};
        int n=arr.length;
        print(arr,n);
        insertion(arr,n);
        System.out.println();
        System.out.println("Sorted array:-");
        print(arr,n);
    }
}