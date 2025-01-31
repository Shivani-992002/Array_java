import java.util.*;
public class Knapsack{
    public static void main(String[] args) {
        int val[]={60,100,120};
        int weight[]={10,20,30};
        int W=50;
        double ratio[][]=new double[val.length][2];
        //0th col--> idx; 1st col--> ratio

        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];
        }

        Arrays.sort(ratio, (a, b) -> Double.compare(a[1], b[1]));//ascending order

        int capacity=W;
        int finalVal=0;

        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            if(capacity >= weight[idx]){
                finalVal += val[idx];
                capacity -= weight[idx];
            }else{
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("final values = "+finalVal);
    }
}