import java.util.Scanner;
 public class charToInt {


    public static  int myAtoi(String s) {
        s=s.trim();//for removing white space

        int Int =0;
        try{
            Int=Integer.parseInt(s);//because integer is wrapper class
        }catch(NumberFormatException e ){

            System.out.println("not valid");
        }
        return Int; 
    }

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String str="43";
    // int num=myAtoi(str);
    System.out.println(myAtoi(str));

}
 }
