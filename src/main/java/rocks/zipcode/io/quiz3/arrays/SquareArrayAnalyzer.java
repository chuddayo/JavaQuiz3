package rocks.zipcode.io.quiz3.arrays;

import java.util.*;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]` such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(inputArray));
        List<Integer> squaredList = new ArrayList<>(Arrays.asList(squaredValues));
        Collections.sort(inputList);
        Collections.sort(squaredList);
        for (int i = 0; i < inputList.size(); i++) {
            if (!Objects.equals(inputList.get(i) * inputList.get(i), squaredList.get(i))) return false;
        }
        return true;
    }
}
