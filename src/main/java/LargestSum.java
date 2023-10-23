import java.util.Comparator;
import java.util.List;


public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        int maxSum = 0;
        nums.sort(Comparator.reverseOrder());
        int max; int secondmax;
        max = nums.get(0);
        secondmax = nums.get(1);
        maxSum = max+secondmax;

        return maxSum;
    }
}