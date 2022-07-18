package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String vowels = "aeiouAEIOU";
        String[] splitWords = str.split(" ");
        List<String> splitList = new ArrayList<>(Arrays.asList(splitWords));
        StringBuilder pigString = new StringBuilder();
        for(String normal : splitList) {
            String addOn;
            int firstVowel = -1;
            for (int i = 0; i < normal.length(); i++) {
                if (vowels.contains(normal.substring(i, i+1))) {
                    firstVowel = i;
                    break;
                }
            }
            if (firstVowel == 0) {
                addOn = "way";
                pigString.append(normal).append(addOn);
            } else if (firstVowel > 0) {
                addOn = "ay";
                pigString.append(normal.substring(firstVowel)).append(normal, 0, firstVowel).append(addOn);
            } else {
                pigString.append(normal).append("ay");
            }
            pigString.append(" ");
        }
        String returnString = String.valueOf(pigString);
        return returnString.substring(0, returnString.length()-1);
    }
}
