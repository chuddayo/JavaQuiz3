package rocks.zipcode.io.quiz3.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        for (SomeType thing : array) {
            if (getNumberOfOccurrences(thing) % 2 != 0) return thing;
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for (SomeType thing : array) {
            if (getNumberOfOccurrences(thing) % 2 == 0) return thing;
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer counter = 0;
        for(SomeType thing : array) {
            if (thing.equals(valueToEvaluate)) counter++;
        }
        return counter;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        List<SomeType> filteredList = new ArrayList<>();
        for (SomeType thing : array) {
            if (predicate.apply(thing)) filteredList.add(thing);
        }
        SomeType[] filteredArray;
        if (array[0] instanceof Integer) {
            filteredArray = (SomeType[])new Integer[filteredList.size()];
        } else {
            filteredArray = (SomeType[])new String[filteredList.size()];
        }

        for (int i = 0; i < filteredList.size(); i++) {
            filteredArray[i] = filteredList.get(i);
        }
        return filteredArray;
    }
}
