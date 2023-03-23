package Easy;

import java.util.HashMap;

public class Find_Pivot_Index {

    public int pivotIndex(int[] nums) {
        HashMap <Character, Character> map = new HashMap();
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < nums.length; i++) {
            rightSum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            if (rightSum - leftSum == 0) {
                return i;
            }
            leftSum += nums[i];

        }
        return -1;

    }
}

