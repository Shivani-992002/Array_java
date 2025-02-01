import java.util.*;

public class MaxLength{
    public static void main(String args[]){
        int pairs[][] ={{5,24},{39,60},{5,28},{27,40},{50,90}};

        //Arrays.sort(ratio, (a, b) -> Double.compare(a[1], b[1]));

        Arrays.sort(pairs, (obj1 , obj2) -> Double.compare(obj1[1] , obj2[1]) );

        int chainLen=1;
        int chainEnd=pairs[0][1];//last selected pair end

        for(int i=0;i<pairs.length;i++){
            if(pairs[i][0]>=chainEnd){
                chainLen++;
                chainEnd=pairs[i][1];
            }
        }
        System.out.println("max length of chain = "+chainLen);
    }
}