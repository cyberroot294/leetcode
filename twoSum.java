/**
 * twoSum
 * https://leetcode.com/problems/two-sum/
 */

import java.util.*; 
public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> maps = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; maps.put(nums[i], i++)) {
            System.out.printf("%s ", i);
            System.out.println(maps.toString());
            if(maps.containsKey(target-nums[i]))
                return new int[] {maps.get(target-nums[i]), i};
        }
        return new int[2];
    } // O(n) TC O(n) SC
    
    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
