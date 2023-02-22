package task_140223HW;

import java.util.HashSet;
import java.util.Set;

public class HW3 {
    public static void main(String[] args) {
        //вам необходимо проверить массив на наличие повторений чисел

        int[] arrDouble = new int[]{1, 4, 6, 2, 7, 8, 3, 2, 9, 3, 4};
        getDuplicated(arrDouble);

    }

    public static void getDuplicated(int[] nums) {

        Set<Integer> foundStrings = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int value : nums) {
            if (foundStrings.contains(value)) {
                duplicates.add(value);
            } else {
                foundStrings.add(value);
            }
        }
        System.out.println(duplicates);
    }

}
