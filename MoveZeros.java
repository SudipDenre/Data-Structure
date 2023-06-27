import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0};
        if(nums==null || nums.length<=1){
            System.out.println(Arrays.toString(nums));
        }else{
            int lastNonZeroIndex = 0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0){
                    nums[lastNonZeroIndex] = nums[i];
                    lastNonZeroIndex++;
                }
            }

            while(lastNonZeroIndex<nums.length){
                nums[lastNonZeroIndex] = 0;
                lastNonZeroIndex++;
            }
            System.out.println(Arrays.toString(nums));
        }
    }
}
