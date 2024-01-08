public class lengthoflastword {
    
    public static int count(String str){
        int count=0;
        int len=str.length()-1;

        while(len>=0 && str.charAt(len)==' '){
            len--;
        }
        while(len>=0 && str.charAt(len)!=' '){
            count++;
            len--;
        }
        
        return count;

    }
    public static void main(String[] args) {
        String str ="i am ";
        int length=count(str);
        System.out.println("length of last word: "+length);
    }
}
