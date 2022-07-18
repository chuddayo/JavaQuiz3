package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        if (str.equals("")) return new String[0];

        List<String> waveString = new ArrayList<>();
        String strLower = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(strLower.charAt(i))) {
                waveString.add(StringUtils.capitalizeNthCharacter(strLower, i));
            }
        }

        return waveString.toArray(new String[0]);
    }
}
