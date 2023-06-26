import java.util.HashMap;
import java.util.Map;

public class q2 {
    public static int firstUniqChar(String s) {
        // Create a frequency map to count occurrences of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Find the first character with frequency 1 and return its index
        for (int i = 0; i < s.length(); i++) {
            if (frequencyMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1; // No unique character found
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        int result1 = firstUniqChar(s1);
        System.out.println(result1);

        String s2 = "loveleetcode";
        int result2 = firstUniqChar(s2);
        System.out.println(result2);

        String s3 = "aabb";
        int result3 = firstUniqChar(s3);
        System.out.println(result3);
    }
}
