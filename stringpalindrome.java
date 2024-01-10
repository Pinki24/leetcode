public class stringpalindrome {
    public static boolean isPalindrome(String s) {
        s=s.trim();
        s=s.toLowerCase();
        int len=s.length()-1;
        StringBuilder temp= new StringBuilder();
        for(int i=len;i>=0;i--){
            temp.append(s.charAt(i));
            System.out.print(temp);
        }
        if(s.equals(temp)){
            return true;
        }else{
           return  false;
        }
    }
    public static void main(String[] args) {
        String str="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str)); 
    }
}
// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.