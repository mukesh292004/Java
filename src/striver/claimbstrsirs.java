package striver;

import java.util.HashMap;
import java.util.Map;

public class claimbstrsirs {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        System.out.println(recursion(10,map));
    }

      
    public static int recursion(int n,Map<Integer,Integer> map){
        if(n==0||n==1){
            return 1;
        }
        if(!map.containsKey(n)){
            map.put(n,recursion( n-1, map)+recursion( n-2, map));
        }
        return map.get(n);
    }
}

