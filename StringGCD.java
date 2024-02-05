/* 
  Leetcode 1071
  Greatest Common Divisor of Strings
*/

class Solution {
    public String euclidean(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        if (len1 < len2){
            return euclidean(str2, str1);
        }
        if (str1.equals(str2)){
            return str1;
        }
        if (str1.startsWith(str2)){
            return euclidean(str1.substring(len2), str2);
        }
        return "";
    }
  
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
