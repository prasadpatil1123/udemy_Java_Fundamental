public class addSum {
    public static void main(String[] args) {
        int[] nums = {11 ,4, 55, 69};
        int sum = 0;
//        for(int i =0; i < nums.length;i++){
//            sum += nums[i];
//        }
        for(int n:nums){
            sum += n;
        }
        System.out.println(sum);
    }
}
