package LeetCode;
//55. Jump Game
public class Jump {
    public static void main(String[] args){
        int[] nums = {2,1,3,2,5,2,3,3,3,2,1};
        for (int i = 0; i <= nums.length-1; i=i+nums[i]) {
            if (i == nums.length-1) {
                System.out.println("True");
                break;
            } else if (i > nums.length-1) {
                System.out.println("False");
                break;
            } else if (nums[i]==0) {
                System.out.println("False");
                break;
            }
        }
    }
}
