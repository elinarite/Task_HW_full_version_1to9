package task_140223HW;

public class HW4 {
    public static void main(String[] args) {
        //[1 1 5 4 1 9 2 4 6] n = 11
        //вернуть длину минимальной последовательности
        //которая в сумме дает n
        //в массиве все числа положительные
        int[] a = new int[]{1, 1, 5, 4, 1, 9, 2, 4, 6};
        int n = 11;
        System.out.println(getMinSequence(a, n));
    }

    public static int getMinSequence(int[] nums, int s) {

        int result = Integer.MAX_VALUE;
        int left = 0;
        int valSum = 0;

        for (int i = 0; i < nums.length; i++) {

            valSum += nums[i];

            while (valSum >= s) {
                result = Math.min(result, (i + 1) - left);
                valSum = valSum - nums[left];
                left++;
            }
        }
        return (result == Integer.MAX_VALUE ? 0 : result);
    }

}










