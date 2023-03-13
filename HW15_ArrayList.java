package task_140223HW;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HW15_ArrayList {
    public static void main(String[] args) {


        int k = 0;
        //Example 1: Input: nums = [1,1,2] Output: 2, nums = [1,2,_]
        List<Integer> list = new ArrayList<>(List.of(1, 1, 2));
        System.out.println(getDuplicateNumberXOR(list, k));

        //Example 2: Input: nums = [0,0,1,1,1,2,2,3,3,4] /Output: 5, nums = [0,1,2,3,4,,,,,_]
        List<Integer> list2 = new ArrayList<>(List.of(0, 0, 1, 1, 1, 2, 2, 3, 3, 4));
        System.out.println(getDuplicateNumberXOR(list2, k));

        //  Example 1: Input: nums = [2,2,1] Output: 1
        List<Integer> list3 = new ArrayList<>(List.of(2, 2, 1));
        System.out.println(getUniqueNumber(list3));

        //  Example 2: Input: nums = [4,1,2,1,2] Output: 4
        List<Integer> list4 = new ArrayList<>(List.of(4, 1, 2, 1, 2));
        System.out.println(getUniqueNumber(list4));

        //Example 3: Input: nums = [1] Output: 1
        List<Integer> list5 = new ArrayList<>(List.of(1));
        System.out.println(getUniqueNumber(list5));
    }

    /**
     * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that
     * ach unique element appears only once. The relative order of the elements should be kept the same.
     **/

    public static List<Integer> getDuplicateNumberXOR(List<Integer> list, int k) {

        List<Integer> listReturn = new ArrayList<>();

        for (int i = 0, j = 1; i < list.size() - 1; i++, j++) {
            if ((list.get(i) ^ list.get(j)) != 0) {
                listReturn.add(list.get(i));
            }
            if ((!Objects.equals(list.get(i), list.get(j))) && j == list.size() - 1) {
                listReturn.add(list.get(j));
            } else if ((Objects.equals(list.get(i), list.get(j))) && j == list.size() - 1) {
                listReturn.add(list.get(j));
            }
        }
        k = listReturn.size();
        System.out.println(k);

        for (int l = k; l < list.size(); l++) {
            listReturn.add(null);
        }
        return listReturn;
    }

    /**
     * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
     */
    public static int getUniqueNumber(List<Integer> list) {
        int result = 0;
        for (int value : list) {
            result = result ^ value;
        }
        return result;
    }
}