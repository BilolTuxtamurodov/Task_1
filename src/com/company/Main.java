package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = {{0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},};

        int[] location = getCurrentLocation(matrix);
        if (location == null) {
            System.out.println("Noto'g'ri locatsiya");
            return;
        }
        System.out.println("Qadamlar:  " + countSteps(location[0], location[1]));
    }


    public static int[] getCurrentLocation(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static int countSteps(int locationI, int locationJ) {
        //markazdan hozirgi turgan joyni ayiramiz va moduleni olamiz.
        int a = Math.abs(3 - locationI);
        int b = Math.abs(3 - locationJ);
        return a + b;
    }
}
