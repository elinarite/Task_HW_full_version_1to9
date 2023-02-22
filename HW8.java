package task_140223HW;

public class HW8 {
    public static void main(String[] args) {
        //  Дан массив чисел. Найти число состоящее из собственных делителей.
        //  Например число 128 состоит из 1 2 и 8. 128 % 1 == 0 , 128 % 2 == 0 и 128 % 8 == 0.
        //  Вот такие числа надо найти.
        int[] arrDivide = new int[]{128, 226, 34, 47, 5};
        getNumberDivideSelbst(arrDivide);
    }

    public static void getNumberDivideSelbst(int[] arr) {

        int k;
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            String s = String.valueOf(arr[i]);
            char[] charrArr = s.toCharArray();
            for (int j = 0; j < charrArr.length; j++) {
                k = Character.digit(charrArr[j], 10);
                if (arr[i] % k == 0) {
                } else {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("Число " + arr[i] + " не подошло");
                flag = false;
            } else {
                System.out.println("Число " + arr[i] + " подошло");
            }
        }
    }
}





