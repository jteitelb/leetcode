/*
  Leetcode 300 
  worst case O(n^3)
  not an attempt at the most efficient
  just a simple implementation using increasingSubsequence method (see IncreasingTriplet.java, Leetcode 334)
*/
class Solution {
    public int lengthOfLIS(int[] nums) {
        for (int i = nums.length; i > 1; i--){     // O(nums*nums + nums(nums-1) + ... + nums*2) = O(nums^3)
            if (increasingSubsequence(nums, i)){   // O(nums*i)
                return i;
            }
        }
        return 1;
    }
    // O(n*l)
    public boolean increasingSubsequence(int[] nums, int length) {
        if (nums.length < length){
            return false;
        }
        int[] sequenceMax = new int[length - 1];
        Arrays.fill(sequenceMax, Integer.MAX_VALUE);

        for (int num : nums) {
            boolean found = false;
            for (int i = 0; i < length - 1; i++){
                if (num <= sequenceMax[i]){
                    sequenceMax[i] = num;
                    found = true;
                    break;
                }
            }
            if (!found){
                return true;
            }
        }
        return false;
    }
}
