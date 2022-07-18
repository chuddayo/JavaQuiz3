package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        String vowels = "aeiouAEIOU";
        int firstVowel = -1;
        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(word.substring(i, i+1))) {
                firstVowel = i;
                break;
            }
        }
        return firstVowel >= 0;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        String vowels = "aeiouAEIOU";
        int firstVowel = -1;
        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(word.substring(i, i+1))) {
                firstVowel = i;
                break;
            }
        }
        return firstVowel;
    }

    public static Boolean startsWithVowel(String word) {
        String vowels = "aeiouAEIOU";
        return vowels.contains(Character.toString(word.charAt(0)));
    }

    public static Boolean isVowel(Character character) {
        String vowels = "aeiouAEIOU";
        return vowels.contains(Character.toString(character));
    }
}
