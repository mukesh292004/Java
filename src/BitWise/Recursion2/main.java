package BitWise.Recursion2;

public class main {
  public static void main(String[] args) {
    // fun(5);
//    System.out.println( factorial(5));
// System.out.println(sumofdigits(1234));
// n-- and --n
// System.out.println(Reverseadigit(1234));
System.out.println(palindrome(12251));
  }
  static void fun(int n){
    if(n==0){
        return;
    }
    fun(n-1);
    System.out.println(n);
    
  }
  static int factorial(int n){
    if(n==1){
        return 1;
    }
    return n*factorial(n-1);
  }

static int sumofdigits(int n){
    if(n<1){
        return 0;
    }
    return (n%10)+(sumofdigits(n/10));
}

static int Reverseadigit(int n){
    int digits=(int)(Math.log10(n))+1;
    return helper(n, digits);
  }
  
static int helper(int n,int digits){
    if(n%10==n){
        return n;
    }
    int rem =n%10;
    return rem*(int)Math.pow(10,digits-1)+helper(n/10,digits-1);
}
static boolean palindrome(int a){
    return a ==Reverseadigit(a);

}
  
}

