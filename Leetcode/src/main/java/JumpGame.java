public class JumpGame {
    public boolean canJump(int[] nums) {
        int steps = 1;
        for(int i = nums.length - 2; i>= 0; i--){
            if(nums[i] >= steps){
                steps = 1;
            } else{
                steps++;
            }
        }
        return steps == 1;
    }
}
