import java.util.Collections;
import java.util.List;

public class CountPairsLessThanTarget {
    public int countPairs(List<Integer> nums, int target) {
        int n = nums.size();
        Collections.sort(nums);
        int l=0;
        int r=n-1;
        int ans = 0;
        while(l<r) {
            int currSum = nums.get(l)+nums.get(r);
            if(currSum<target){
                ans += (r-l);
                l++;
            } else {
                r--;
            }
        }

        return ans;
    }

}
