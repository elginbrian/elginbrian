// Eps. 47 Latihan Array 2D (Operasi Matrix)
package com.Tutorial;
public class Main {
    public static void main(String[] args) {
        int[][] matrix_a = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };

        int[][] matrix_b = {
            {7,8,9},
            {2,4,6},
            {6,4,5},
        };

        display(matrix_a);
        display(matrix_b);
        display(add(matrix_a, matrix_b));
        display(dot(matrix_a, matrix_b));
    }

    private static void display(int[][] matrix){
        int baris = matrix.length;
        int kolom = matrix[0].length;
        for (int i = 0; i < baris; i++){
            System.out.print("[");
            for (int j = 0; j < kolom; j++){
                System.out.print(matrix[i][j]);
                if (j < (kolom - 1)){
                    System.out.print(", ");
                } else {
                    System.out.print("]");
                }   
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    private static int[][] add(int[][] matrix1, int[][] matrix2){
        int baris1 = matrix1.length;
        int kolom1 = matrix1[0].length;

        int baris2 = matrix2.length;
        int kolom2 = matrix2[0].length;

        int[][] hasil = new int[baris1][kolom1];

        if (baris1 == baris2 && kolom1 == kolom2){
            for (int i = 0; i < baris1; i++){
                for (int j = 0; j < kolom1; j++){
                    hasil[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
        } else {
            System.out.println("Jumlah baris dan kolom tidak sama");
        }
        return hasil;
    }

    private static int[][] dot(int[][] matrix1, int[][] matrix2) {
        int baris1 = matrix1.length;
        int kolom1 = matrix1[0].length;

        int baris2 = matrix2.length;
        int kolom2 = matrix2[0].length;

        // jika a . b, maka jumlah baris akan mengikuti matrix a
        // sedangkan kolom akan mengikuti matrix b
        
        int[][] hasil = new int[baris1][kolom2];
        int buffer;

        for (int i = 0; i < baris1; i++) {
            for (int j = 0; j < kolom2; j++) {
                buffer = 0;
                for (int k = 0; k < kolom1; k++) {
                    buffer += matrix1[i][k] * matrix2[k][j];
                }
                hasil[i][j] = buffer;
            }
        }    
        return hasil;
    }    
}
