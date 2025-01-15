public class FindSubSet{

    public static void findSubSet(String str,String ans,int i){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        findSubSet(str,ans+str.charAt(i),i+1);//for yes choice
        findSubSet(str,ans,i+1);//for no choice
    }
     

    public static void main(String args[]){
        String str="abc";
        findSubSet(str," ",0);
    }
}