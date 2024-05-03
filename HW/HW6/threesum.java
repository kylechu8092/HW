package HW.HW6;
import java.util.*;

public class threesum {
    
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> finalList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
        {
            if (i > 0 && nums[i] == nums[i-1])
            {
                continue;
            }
            int j = i + 1, k = nums.length - 1;
            while (j < k)
            {
                int threeSum = nums[i] + nums[j] + nums[k];
                if (threeSum == 0)
                {
                    finalList.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    while (nums[j] == nums[j-1] && j < k)
                    {
                        j++;
                    }
                }
                else if (threeSum < 0)
                {
                    j++;
                }
                else
                {
                    k--;
                }
            }
        }
        return finalList;
    }
}
