public class RemoveDuplicate{
   
    public static void removeDuplicate(String str,int idx,StringBuilder newStr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        //kaam
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            //duplicate
            removeDuplicate(str,idx+1,newStr,map);

        }else{
            //not duplicate
            map[currChar-'a']=true;
            removeDuplicate(str,idx+1,newStr.append(currChar),map);
        }
    }


    public static void main(String args[]){
        String str="sshhivannii";
        StringBuilder newStr=new StringBuilder(" ");
        boolean map[]=new boolean[26];
        removeDuplicate(str,0,newStr,map);
    }
}