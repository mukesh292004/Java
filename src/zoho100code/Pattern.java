package zoho100code;

public class Pattern {
    public static void main(String[] args) {
       int n=5;
       for(int i=0;i<n+1;i++){
        for(int j=0;j<n-i-1;j++){
            System.out.print("  ");
        }
        for(int k=n-i+1;k<=n;k++){
            System.out.print(k+" ");
        }
        System.out.print(0+" ");
        for(int q=n;q>n-i;q--){
            System.out.print(q+" ");
        }
        System.out.println();
       }
      
    }
}
