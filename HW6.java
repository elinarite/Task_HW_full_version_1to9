package task_140223HW;

public class HW6 {
    public static void main(String[] args) {
        //Дан массив чисел в котором все числа имеют повторения
        // кроме одного числа. Найти это число
        int[] numbers = {5, 3, 5, 6, 6, 3, 4};
        getUniqueNumber(numbers);
    }

    public static void getUniqueNumber(int[] nums) {

        int result = 0;
        for (int a : nums) {
            result = result ^ a; // result ^= a
        }
        System.out.println(result);
    }

}



