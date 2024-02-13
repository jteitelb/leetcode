/*
  Leetcode 392: Is Subsequence
*/

class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        if (sArr.length == 0){
            return true;
        }
        if (sArr.length > tArr.length){
            return false;
        }

        int sFound = 0;
        for (int i = 0; i < tArr.length; i++){
            if (tArr[i] == sArr[sFound]){
                sFound++;
            }
            if (sFound == sArr.length){
                return true;
            }
        }
        return false;
    }
}
