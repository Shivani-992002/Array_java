public class MergeSort{
   
    public static void merge(int arr[],int left ,int mid,int right){
        int ary[]=new int[right-left+1];
        int i=left,j=mid+1,k=0;

        while(i<=mid && j<=right){
        if(arr[i]<arr[j]){
            ary[k]=arr[i];
            i++;
        }else{
            ary[k]=arr[j];
            j++;
        }
        k++;
    }
    //left part
    while(i<=mid){
        ary[k++]=arr[i++];
    }
    //right part
    while(j<=right){
        ary[k++]=arr[j++];
    }

    //copy ary to original arr
    for(k=0,i=left;k<ary.length;k++,i++){
        arr[i]=ary[k];
    }
}
    
    
    public static void mergeSort(int arr[],int left,int right){
        if(left>=right){
            return;
        }
        int mid=left+(right-left)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }

    public static void printarr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        int n=arr.length;
        printarr(arr,n);
        mergeSort(arr,0,n-1);
        printarr(arr,n);
    }
}