import java.util.*;
public class DuplicateParentheses{
    public static boolean isDuplicate(String str){
        Stack<Character> s=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            //closing
            if(ch==')'){
                int count =0;

                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;//duplicate pair exists
                }else{
                    s.pop();//opening pair
                }
            }else{
                s.push(ch);
            }
        }
        return false;//no duplicate pair exists
    }

    public static void main(String[] args){
        String str2="(a+b)";//false
        String str="((a+b))";//true

        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));
    }
}