package task_140223HW;

import java.util.HashSet;
import java.util.Set;

public class HW2 {

    public static void main(String[] args) {
        //Дан массив и число. Вывести на экран два любых числа из массива которые
        //в сумме дают n за O(n) либо написать что таких чисел нет
        //[0 1 5 4 8 9 3 2 6] n = 13
        //** все пары чисел

        int[] arr = new int[]{0, 1, 5, 4, 8, 9, 3, 2, 6};
        int sum = 13;
        getTwoNumbers(arr, sum);

    }

    public static void getTwoNumbers(int[] numbers, int n) {

        int a;
        int b;
        Set<Integer> set = new HashSet<>(numbers.length);
        for (int value : numbers) {
            a = value;
            b = n - value;
            if (!set.contains(b)) {
                set.add(a);
            } else {
                System.out.println("First number is: " + value + ", Second number is: " + b);
            }
        }
    }
}

