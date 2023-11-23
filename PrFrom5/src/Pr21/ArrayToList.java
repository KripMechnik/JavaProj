package Pr21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static List<String> convertStringArrayToList(String[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
    public static List<Integer> convertIntArrayToList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int element : array) {
            list.add(element);
        }
        return list;
    }
}
