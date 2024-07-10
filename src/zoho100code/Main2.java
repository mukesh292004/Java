package zoho100code;

public class Main2 {
    public static void main(String[] args) {
        currencyvalue(5010);
    }
    static void currencyvalue(int n){
        int a[]={2000,500,200,100,50,20,10,5,2,1};
        int arr[]=new int[a.length];
        int i=0;
        while(n!=0){
            if(n>a[i]){
                arr[i]=n/a[i];
                n=n%a[i];
            }else{
              i++;
            }
        }
        for(int as:arr){
           System.out.println(as);
        }
    }
}
