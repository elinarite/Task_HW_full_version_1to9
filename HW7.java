package task_140223HW;


public class HW7 {
    public static void main(String[] args) {
        //Дан массив чисел, в котором есть все числа от 0 до N .
        // Все эти числа в единственном экземпляре. Расположены в разнобой.
        // Одно число в этом массиве пропущено ( Например {1 0 2 8 6 5 4 7} - это 3 ) .
        // Найти пропущенное число
        int[] arrNum = {1, 0, 2, 8, 6, 5, 4, 7};
        System.out.println(getMissingNumber(arrNum));
    }

    public static int getMissingNumber(int[] arr) {

        int result = 0;
        for (int a : arr)
            result ^= a;
        for (int i = 0; i < arr.length + 1; i++) {
            result ^= i;
        }
        return result;
    }
}

