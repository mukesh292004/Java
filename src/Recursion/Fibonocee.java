package Recursion;

public  class Fibonocee {
    Fibonocee(int a){
        System.out.println(fib(a));
    }
    
    static int fib(int n){
        if(n<2){
            return n;
        }
        return  fib(n-1)+fib(n-2);
        
    }
}
