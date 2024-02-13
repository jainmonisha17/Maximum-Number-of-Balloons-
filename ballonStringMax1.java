// Name: Monisha Jain
// Qualificaton: MCA
// College: PES(Bengaluru)

// Given a string, determine the maximum number of times the word "balloon" can be formed using the characters from the string. Each character in the string can be used only once.

// Examples:

// Example 1:

// Input: "balloonballoon"
// Expected Output: 2
// Justification: The word "balloon" can be formed twice from the given string.
// Example 2:

// Input: "bbaall"
// Expected Output: 0
// Justification: The word "balloon" cannot be formed from the given string as we are missing the character 'o' twice.
// Example 3:

// Input: "balloonballoooon"
// Expected Output: 2
// Justification: The word "balloon" can be formed twice, even though there are extra 'o' characters.


import java.util.*;

public class ballonStringMax1 {
    public int maxNumBallons(String s) {
        HashMap<Character, Integer> myHashMap = new HashMap<>();

        for(char c: s.toCharArray()) {
            myHashMap.put(c, myHashMap.getOrDefault(c, 0) + 1);
        }

        int minCount = Integer.MAX_VALUE;
        // calculate the maximun number of times "ballon" can be formed

        minCount = Math.min(minCount, myHashMap.getOrDefault('b', 0));
        minCount = Math.min(minCount, myHashMap.getOrDefault('a', 0));
        minCount = Math.min(minCount, myHashMap.getOrDefault('l', 0) / 2);
        minCount = Math.min(minCount, myHashMap.getOrDefault('o', 0) / 2);
        minCount = Math.min(minCount, myHashMap.getOrDefault('n', 0) / 2);


        return minCount;
     }

    public static void main(String[] args) {
        ballonStringMax1 obj = new ballonStringMax1();
        System.out.println(obj.maxNumBallons("balloonballoon")); // expected 2
        System.out.println(obj.maxNumBallons("bbaall")); // expected 2
        System.out.println(obj.maxNumBallons("ballooonballooooonna")); // expected 2

    }
}


// Time Complexity: The algorithm traverses the string once to populate the hashmap, which is O(n), where n is the length of the string. The subsequent operations are constant time. Therefore, the overall time complexity is O(n).

// Space Complexity: The space complexity is determined by the hashmap, which in the worst case will have an entry for each unique character in the string. However, since the English alphabet has a fixed number of characters, the space complexity is O(1).