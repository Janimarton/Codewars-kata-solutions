package string;

import kata.Kata;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates extends Kata {

    private static final String kataLink = "https://www.codewars.com/kata/counting-duplicates/train/java";

    public CountingDuplicates() {
        super(kataLink);
    }

    public static int duplicateCount(String text) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));
            if (map.containsKey(c)) {
                int cnt = map.get(c);
                map.put(c, ++cnt);
            } else {
                map.put(c, 1);
            }
        }
        int duplicateCounter = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) duplicateCounter++;
        }
        return duplicateCounter;
    }

}
