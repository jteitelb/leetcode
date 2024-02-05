/* 
  Leetcode 1071
  Greatest Common Divisor of Strings
*/

class Solution {
    public boolean isDivisor(String t, String s){
        int sLength = s.length();
        int tLength = t.length();
        if (sLength % tLength != 0){
            return false;
        }
        int numCopies = sLength / tLength;
        for (int i = 0; i < numCopies; i++){
            int start = i * tLength;
            int end = start + tLength;
            if (!t.equals(s.substring(start, end))){
                return false;
            }
        }
        return true;
    }

    public String gcdOfStrings(String str1, String str2) {
        int maxLength = Math.min(str1.length(), str2.length());
        for (int i = maxLength; i > 0; i--){
            String divisor = str1.substring(0, i);
            if (isDivisor(divisor, str1) && isDivisor(divisor, str2)){
                return divisor;
            }
        }
        return "";

    }
}
