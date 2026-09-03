import java.util.*;

class Solution {

    public String sortSentence(String sentence) {

        String[] words = sentence.split(" ");

        Arrays.sort(words, (w1, w2) ->
            w1.charAt(w1.length() - 1) - w2.charAt(w2.length() - 1)
        );

        String res = "";

        for (String word : words) {
            res += word.substring(0, word.length() - 1) + " ";
        }

        return res.trim();
    }
}