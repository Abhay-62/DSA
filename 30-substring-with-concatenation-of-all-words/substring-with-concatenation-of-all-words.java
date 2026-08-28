class Solution {
    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> ans = new ArrayList<>();

        int wordLen = words[0].length();
        int wordCount = words.length;
        int totalLen = wordLen * wordCount;

        // Frequency of words that we NEED
        HashMap<String, Integer> required = new HashMap<>();

        for (String word : words) {
            required.put(word, required.getOrDefault(word, 0) + 1);
        }

        // Try every possible alignment
        for (int offset = 0; offset < wordLen; offset++) {

            int left = offset;
            int right = offset;
            int count = 0;

            // Words currently present in our window
            HashMap<String, Integer> current = new HashMap<>();

            while (right + wordLen <= s.length()) {

                // Take one complete word
                String word = s.substring(right, right + wordLen);
                right += wordLen;

                // Case 1: word is not required
                if (!required.containsKey(word)) {

                    current.clear();
                    count = 0;
                    left = right;

                } 
                else {

                    // Add word to current window
                    current.put(word, current.getOrDefault(word, 0) + 1);
                    count++;

                    // Case 2: word appears too many times
                    while (current.get(word) > required.get(word)) {

                        String leftWord = s.substring(left, left + wordLen);

                        current.put(
                            leftWord,
                            current.get(leftWord) - 1
                        );

                        left += wordLen;
                        count--;
                    }

                    // Case 3: exactly all words found
                    if (count == wordCount) {

                        ans.add(left);

                        // Move left forward to search for next answer
                        String leftWord = s.substring(left, left + wordLen);

                        current.put(
                            leftWord,
                            current.get(leftWord) - 1
                        );

                        left += wordLen;
                        count--;
                    }
                }
            }
        }

        return ans;
    }
}