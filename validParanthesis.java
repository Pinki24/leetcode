import java.util.Stack;

public class validParanthesis {
     public boolean isValid(String s) {
        Stack<Character> stc= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('|| s.charAt(i)=='{'||s.charAt(i)=='['){
                stc.push(s.charAt(i));
            }else if(s.charAt(i)==')'|| s.charAt(i)=='}'||s.charAt(i)==']'){
                if(stc.isEmpty()){
                return false;
                }
                char top=stc.pop();
                 if((s.charAt(i)=='}' && top=='{') ||(s.charAt(i)==')' && top=='(')||(s.charAt(i)==']' && top=='[')){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return stc.isEmpty();
    }
    
}
