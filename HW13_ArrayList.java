package task_140223HW;

import java.util.*;
//1 уровень сложности: Task 1.
//         Даны два ArrayList, элементы которых упорядочены. Объединить их в трерий ArrayList,
//         элементы которого тоже должны быть отсортированы.


//         Task 2.
//         Пусть дан ArrayList нечетной длины. Используя только Iterator (не прибегая к индексам и длине списка), вывести на экран элемент, находящийся ровно посередине списка.
//         Example 1:
//         Input: list = [1,2,4]
//         Output: 2
//         Example 2:
//         Input: list = [1,2,3,4,5]
//         Output: 3
//         Example 3:
//         Input: list = [1]
//         Output: 1
//
//
//         2 уровень сложности:
public class HW13_ArrayList {
    public static void main(String[] args) {

//    Даны два ArrayList, элементы которых упорядочены. Объединить их в трерий ArrayList,
//    элементы которого тоже должны быть отсортированы.

        //Example 1: Input: list1 = [1,2,4], list2 = [1,3,4] Output: [1,1,2,3,4,4]
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 2, 4));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(1, 3, 4));
        ArrayList<Integer> list3 = new ArrayList<>(mergeList(list1, list2));
        System.out.println(sortMergeList(list3));

        // Example 2: Input: list1 = [], list2 = [] Output: []
        ArrayList<Integer> list4 = new ArrayList<>(List.of());
        ArrayList<Integer> list5 = new ArrayList<>(List.of());
        ArrayList<Integer> list6 = new ArrayList<>(mergeList(list4, list5));
        System.out.println(sortMergeList(list6));

        // Example 3: Input: list1 = [], list2 = [0] Output: [0]
        ArrayList<Integer> list7 = new ArrayList<>(List.of());
        ArrayList<Integer> list8 = new ArrayList<>(List.of(0));
        ArrayList<Integer> list9 = new ArrayList<>(mergeList(list7, list8));
        System.out.println(sortMergeList(list9));

//    Пусть дан ArrayList нечетной длины. Используя только Iterator (не прибегая к индексам и длине списка),
//    вывести на экран элемент, находящийся ровно посередине списка.
//    Example 1: Input: list = [1,2,4] Output: 2
        ArrayList<Integer> list10 = new ArrayList<>(List.of(1, 2, 4));
        findAverageIndex(list10);
        // Example 2: Input: list = [1,2,3,4,5] Output: 3
        ArrayList<Integer> list11 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        findAverageIndex(list11);
//    Example 3: Input: list = [1] Output: 1
        ArrayList<Integer> list12 = new ArrayList<>(List.of(1));
        findAverageIndex(list12);


    }

    //Task 1
    private static List<Integer> mergeList(List<Integer> list1, List<Integer> list2) {
        List<Integer> list = new ArrayList<>();
        list.addAll(list1);
        list.addAll(list2);

        return list;
    }

    //Task 1
    private static List<Integer> sortMergeList(ArrayList<Integer> list3) {
        Collections.sort(list3);

        return list3;
    }

    //Task 2
    private static void findAverageIndex(ArrayList<Integer> list10) {
        int count1 = 0;
        int count2 = 0;
        boolean flag = true;
        Iterator<Integer> iterator1 = list10.iterator();
        Iterator<Integer> iterator2 = list10.iterator();
        while (iterator1.hasNext()) {
            iterator1.next();
            count1++;
            if (iterator1.hasNext() != flag) {
                break;
            }
        }
        while (iterator2.hasNext()) {
            iterator2.next();
            count2++;
            if (count2 == count1 / 2) {
                System.out.println(iterator2.next());
            } else if (count2 == 1 && iterator2.hasNext() != flag) {
                System.out.println(list10.toString().replace("[", "").replace("]", ""));
            }
        }
    }
}
