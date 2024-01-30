class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result = "";
        int mergeLength = Math.min(word1.length(), word2.length());
        for(int i = 0; i < mergeLength; i++){
            result += word1.charAt(i);
            result += word2.charAt(i);
        }
        result += word1.substring(mergeLength) + word2.substring(mergeLength); // at least one of these will be empty
        return result;
    }
}
