package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        return str.substring(0, indexToCapitalize) + Character.toString(str.charAt(indexToCapitalize)).toUpperCase() + str.substring(indexToCapitalize + 1);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        List<String> allSubstrings = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j <= string.length(); j++) {
                allSubstrings.add(string.substring(i, j));
            }
        }
        HashSet<String> uniqueStrings = new HashSet<>(allSubstrings);
        return uniqueStrings.toArray(new String[0]);
    }

    public static Integer getNumberOfSubStrings(String input){
        String[] allSubstrings = getAllSubStrings(input);
        return allSubstrings.length;
    }
}
