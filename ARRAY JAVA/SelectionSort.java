import java.util.*;
public class SelectionSort{

public static void print(int arr[],int n)
{
    for (int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
}

public static void selection(int arr[],int n)
{
    for(int i=0;i<n-1;i++)
    {
        int min=i;
        for(int j=i+1;j<n;j++)
        {
            if(arr[min]>arr[j])
            {
                min=j;
            }
        }

        int temp=arr[i];
        arr[i]=arr[min];
        arr[min]=temp;
    }
}


    public static void main (String args[]){
        int[] arr={4,1,5,2,3};
        int n =arr.length;
        print(arr,n);
        selection(arr,n);
        System.out.println(" ");
        System.out.println("Sorted array");
        print(arr,n);
    }
}