package zoho100code;

public class main {
    public static void main(String[] args) {
        patterndiamond(5);
        
    }
   static void patterndiamond(int n){
    for(int i=1;i<=n;i++){
        for(int k=n-i;k>0;k--){
            System.out.print(" ");
        }
        for(int j=0;j<i;j++){
           System.out.print("* ");
        }
        System.out.println();
    }
    for(int i=0;i<n;i++){
        for(int k=0;k<i;k++){
            System.out.print(" ");
        }
        for(int j=n-i;j>0;j--){
           System.out.print("* ");
        }
        System.out.println();
    }

   

   }
   
}
