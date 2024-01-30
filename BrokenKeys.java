class Solution {
    public boolean checkWord(String word, boolean[] brokenMap){
        for (int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if (brokenMap[c - 'a']){
                return false;
            }
        }
        return true;
    }
  
    public int canBeTypedWords(String text, String brokenLetters) {
        boolean[] brokenMap = new boolean[26];
        for (int i = 0; i < brokenLetters.length(); i++){
            char c = brokenLetters.charAt(i);
            brokenMap[c - 'a'] = true;
        }
      
        // O(n) space but simpler code
        String[] words = text.split(" ");  
        int count = 0;

        for (String word : words){
            if (checkWord(word, brokenMap)){
                count++;
            }
        }
        return count;
    }
}
