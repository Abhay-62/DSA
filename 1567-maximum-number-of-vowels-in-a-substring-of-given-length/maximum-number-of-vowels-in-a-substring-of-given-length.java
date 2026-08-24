class Solution {
    public int maxVowels(String s, int k) {

        int low = 0;
        int count = 0;
        int max = 0;

        for (int high = 0; high < s.length(); high++) {

            // Add the new character
            if (isVowel(s.charAt(high))) {
                count++;
            }

            // Window size becomes greater than k
            if (high - low + 1 > k) {
                if (isVowel(s.charAt(low))) {
                    count--;
                }
                low++;
            }

            // Window size is exactly k
            if (high - low + 1 == k) {
                max = Math.max(max, count);
            }
        }

        return max;
    }

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u';
    }
}