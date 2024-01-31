class Solution {
    public boolean increasingTriplet(int[] nums) {
        // return increasingSubsequence(nums, 3);
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= first) {
                first = num;
            }
            else if (num <= second) {
                second = num;
            }
            else {
                return true;
            }
        }
        return false;
    }

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
