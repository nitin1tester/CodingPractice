package LeetCode;
//55. Jump Game
public class Jump {
    public static void main(String[] args){
        int[] nums = {2,0};
        for (int i = 0; i <= nums.length-1; i=i+nums[i]) {
            if (i == nums.length-1) {
                System.out.println("True");
                break;
            } else if (i >= nums.length || nums[i]==0 || nums[0]> nums.length-1 ) {
                System.out.println("False");
                break;
            }
        }
    }
}
