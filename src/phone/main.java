package phone;

public class main {
    public static void main(String[] args) {
        phone("","123 ");
        // dice("",4);
    }
    static void phone(String a,String b){
        if(b.isEmpty()){
            System.out.println(a);
            return;
        }
        int digit=b.charAt(0)-'0';// getting digits  
        for (int i = (digit-1)*3; i<digit*3; i++) {
             char ab=(char)('a'+i);
             phone(a+ab,b.substring(1));
        }

    }
    static void dice(String a,int tag){
        if(tag==0){
            System.out.println(a);
            return;
        }
        for(int i=1;i<=6&&i<=tag;i++){
            dice(a+i, tag-i);
        }
    }
}
