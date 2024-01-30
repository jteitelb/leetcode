class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split(" +");
        String result = "";
        for (int i = words.length - 1; i > 0; i--){
            result += words[i] + " ";
        }
        result += words[0];
        return result;
    }
}
