public class Recurssion{

    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDec(n-1);
    }

    public static void printInc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printInc(n-1);
        System.out.println(n);
        
    }

    public static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
       
        return n*fact(n-1);
    }

    public static int printNaturalNo(int n){
        if(n==1){
           return 1;
        }
        int sum=n+printNaturalNo(n-1);
        return sum;
    }

    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            int fib=fibonacci(n-1);
            int fib2=fibonacci(n-2);
            int fibFinal=fib+fib2;
            return fibFinal;
        }
    }

    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
    
    public static int firstOccurance(int ary[],int key,int i)
    {
    if(i==ary.length){
            return -1;
        }
        if(ary[i]==key){
            return i;
        }

        return firstOccurance(ary,key,i+1);

    }

    public static int lastOccurance(int ary[],int key,int i){
        if(i==ary.length){
        return -1;
        }
        int isFound=lastOccurance(ary,key,i+1);
        if(isFound!=-1){
            return isFound;
        }

        //check with self
       if(ary[i]==key){
            return i;
        } 
        return isFound;
    }

    public static int power(int x,int n){
      if(n==0){
        return 1;
      }
    //   int xnm1=power(x,n-1);
    //   int xn=x*xnm1;
    //   return xn;
    return x*power(x,n-1);
    }

    public static int optimisedPower(int a,int b){
        if(b==0){
            return 1;
        }
        // for more optimization next line
        int halfPower1=optimisedPower(a,b/2);
        // int halfPower=optimisedPower(a,b/2)*optimisedPower(a,b/2);
        int halfPower=halfPower1*halfPower1;
        
        //if power is odd
        if(b%2!=0){
            halfPower=halfPower*a;
        }
        return halfPower;
    }


    public static void main(String[] args) {
        int n=6;
        int arr[]={1,2,3,4,5};
        int ary[]={8,3,6,9,5,10,2,5,3};
        printInc(n);
        printDec(n);
         System.out.println(fact(n));
         System.out.println(printNaturalNo(n));
         System.out.println(fibonacci(n));
         System.out.println(isSorted(arr,0));
         System.out.println(firstOccurance(ary,5,0));
         System.out.println(lastOccurance(ary,5,0));
         System.out.println(power(2,10));
         System.out.println(optimisedPower(2,10));
    }
}
