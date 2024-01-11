public class singleNumber {
    public static int single(int[] arr){
        int result=0;
        for(int num:arr){
            result=result^num;
        }
        return result;
    }
    // This approach works because XORing the same number twice cancels out, and XORing with 0 doesn't change the value. 
    public static void main(String[] args) {
        int[] arr={1,2,2,1,3};
        int call=single(arr);
        System.out.println(call);
    }
}
