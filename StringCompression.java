/* 
  Leetcode 443
  String Compression
*/

class Solution {
    /** 
    * write a group to the chars array starting at given position
    * return the index one after the index of the last character written
    */
    public int writeGroup(char c, int num, int position, char[] chars){
        String numString = Integer.toString(num); // uses O(log10(n)) extra space

        chars[position++] = c;
        if (num <= 1){
            return position;
        }
        for (char digitChar : numString.toCharArray()){
            chars[position++] = digitChar;
        }
        return position;
    }

    public int compress(char[] chars) {
        char currentChar = chars[0];
        int count = 1;
        int writePosition = 0;

        for (int i = 1; i < chars.length; i++){
            if (chars[i] == currentChar){
                count++;
            }
            else {
                writePosition = writeGroup(currentChar, count, writePosition, chars);
                currentChar = chars[i];
                count = 1;
            }
        }
        return writeGroup(currentChar, count, writePosition, chars);
    }
}
