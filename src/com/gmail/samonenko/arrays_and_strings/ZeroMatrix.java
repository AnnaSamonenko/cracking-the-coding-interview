package com.gmail.samonenko.arrays_and_strings;

import java.util.ArrayList;
import java.util.List;

public class ZeroMatrix {

    static int[][] matrix = {
            {1, 0, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 1, 1, 0, 1},
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1},

    };

    public static void main(String[] args) {
        zeroMatrix(matrix);
        sout(matrix);

    }

    static int[][] zeroMatrix(int[][] matrix) {
        List<Integer> rows = new ArrayList<>();
        List<Integer> columns = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    columns.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (rows.contains(i) || columns.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }

    public static void sout(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
