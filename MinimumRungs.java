class Solution {
    public int addRungs(int[] rungs, int dist) {
        int count = Math.max(0, (int) Math.ceil( rungs[0] / (double) dist ) - 1 );
        for (int i = 1; i < rungs.length; i++){
            int gap = rungs[i] - rungs[i-1];
            if (gap > dist){
                count += Math.ceil( gap / (double) dist ) - 1 ;
            }
        }
        return count;
    }
}
