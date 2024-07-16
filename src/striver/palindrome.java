
class HelloWorld {
    public static void main(String[] args) {
        String a="Madam Arora teaches malayalam";
        // print only palindrome
        a=a.toLowerCase();
        String []b=a.split(" ");
        int count=0;
        String m="";
        for(String bb:b){
            if(checkpalin(bb)){
                count++ ;
            m+=bb+" ";
            }
        }
        System.out.println(count+m);
    }
    public static boolean checkpalin(String a){
        int end=a.length()-1;
        int start=0;
        while(start<=end){
           if(a.charAt(start)!=a.charAt(end)){
               return false;
           }
           start++;
           end--;
        }
        return true;
    }
}
