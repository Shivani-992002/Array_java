import java.util.*;

public class IndianCoins{
    public static void main(String args[]){
        Integer coins[] = {1, 2, 5, 10, 20,50,100,200,500,2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins=0;
        int amount =670;

        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<coins.length;i++){
            if(coins[i] <= amount){
                while(coins[i]<=amount){
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }

        System.out.println("total min coins use : "+countOfCoins);

        for(int i=0;i<ans.size();i++){
            System.out.println("coins used : "+ans.get(i));
        }
        System.out.println();
    }
}