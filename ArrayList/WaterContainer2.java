import java.util.*;
public class WaterContainer2{

    public static int storeWater(ArrayList<Integer> height){
        int maxWater=0;
        //two pointer approach
        int lp=0;//left pointer
        int rp=height.size()-1;//right pointer
        while(lp<rp){
            //Calcutate water area
            int ht=Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
            int currWater=ht*width;
            maxWater=Math.max(currWater,maxWater);
            //updation on pointers
            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer> height=new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
    }
}
