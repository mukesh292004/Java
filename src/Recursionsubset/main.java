package Recursionsubset;

public class main {
    public static void main(String[] args) {
        // recursion("aabbcc", "");
        subseq("","abc");
    }
    static void recursion(String a ,String i){
        if(a.length()<1){
            System.out.println(i);
            return;
        }
        char c=a.charAt(0);
        if(c=='a'){
            recursion(a.substring(1), i);
        }
        else{
            recursion(a.substring(1), i+c);
        }
        
    }

    static void subseq(String temp,String up){
        if(up.length()==0){
            System.out.println(temp);
            return;
        }
        char a=up.charAt(0);
        subseq(temp+a, up.substring(1));
        subseq(temp, up.substring(1));
    }
}
