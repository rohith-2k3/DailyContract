package Arrays.problems;

import java.util.HashSet;
import java.util.Set;

public class LC1684 {
    public static int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allowedSet = new HashSet<>();

        // Add allowed characters to set
        for (char c : allowed.toCharArray()) {
            allowedSet.add(c);
        }

        int count = 0;

        // Check each word
        for (String word : words) {
            boolean isConsistent = true;

            for (char c : word.toCharArray()) {
                if (!allowedSet.contains(c)) {
                    isConsistent = false;
                    break;
                }
            }

            if (isConsistent) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        String[] words = new String[] {"ad","bd","aaab","baa","badab"};
        System.out.println(countConsistentStrings("ab",words));
    }
}
