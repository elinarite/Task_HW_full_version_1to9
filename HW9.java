package task_140223HW;

import java.util.Arrays;

public class HW9 {
    public static void main(String[] args) {
        //      4.  Ну и для особо отличившихся. Написать метод который
//генерирует двумерный массив длиной N и высотой H
//Далее заполняет получившийся массив числами от 1 до W по спирали.
//Например массив [ ][ ][ ][ ]
//                        [ ][ ][ ][ ]
//                        [ ][ ][ ][ ]
//имеет N == 4 and H == 3 и вид [ 1 ][ 2 ][ 3 ][ 4 ]
//                                             [10][11][12 ][ 5 ]
//                                             [ 9 ][ 8 ][ 7 ][ 6 ]
        for (int[] row : spiral(7, 8)) {
            System.out.println(Arrays.toString(row));
        }
    }


    public static int[][] spiral(int rows, int cols) {

        int[][] arr = new int[rows][cols];

        int num = 1;
        int max = rows * cols;
        int rmin = 0;
        int cmin = 0;
        int rmax = rows - 1;
        int cmax = cols - 1;
        System.out.println("-----" + rows + " x " + cols + "-----");
        while (num <= max) {
            for (int i = cmin; num <= max && i <= cmax; i++) {
                arr[rmin][i] = num++;
            }
            rmin++;
            for (int i = rmin; num <= max && i <= rmax; i++) {
                arr[i][cmax] = num++;
            }
            cmax--;
            for (int i = cmax; num <= max && i >= cmin; i--) {
                arr[rmax][i] = num++;
            }
            rmax--;
            for (int i = rmax; num <= max && i >= rmin; i--) {
                arr[i][cmin] = num++;
            }
            cmin++;
        }
        return arr;
    }
}



