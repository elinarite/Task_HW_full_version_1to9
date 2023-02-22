package task_140223HW;

import java.util.Arrays;

public class HW1 {

    public static void main(String[] args) {

        //   найти 3 и 4 минальный элемент
        int[] nums = {1, 8, 7, 6, 4, 2, 7, 5,};
        getMin3(nums);
    }
    public static void getMin3(int nums[]) {

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int min3 = Integer.MAX_VALUE;
        int min4 = Integer.MAX_VALUE;
        if (nums.length > 4) {
            for (int i = 0; i < nums.length; ++i) {

                if (nums[i] < min1) {
                    min4 = min3;
                    min3 = min2;
                    min2 = min1;
                    min1 = nums[i];
                } else if (nums[i] < min2) {
                    min4 = min3;
                    min3 = min2;
                    min2 = nums[i];
                } else if (nums[i] < min3) {
                    min4 = min3;
                    min3 = nums[i];
                } else if (nums[i] < min4) {
                    min4 = nums[i];
                }
            }
            System.out.println(Arrays.toString(nums));
            System.out.println("min3 " + min3 + " min4 " + min4);
        } else {
            System.out.println("массив меньше");
        }
    }
}

