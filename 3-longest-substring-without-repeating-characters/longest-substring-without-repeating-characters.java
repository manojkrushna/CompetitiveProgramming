class Solution {
    public int lengthOfLongestSubstring(String s) {
       int[] index = new int[128]; // ASCII character set
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            left = Math.max(left, index[s.charAt(right)]);
            maxLength = Math.max(maxLength, right - left + 1);
            index[s.charAt(right)] = right + 1;
        }

        return maxLength;
    }
}