
package tugaspraktik2;

public class TugasPraktik2 {

    public static void main(String[] args) {
        int matrix[][] = {
            {34 ,56 ,41},
            {45 ,46 ,37},
            {51 ,32 ,46}
        };
        System.out.println("Program Membuat Matriks dan Akses Matriks ");
        System.out.println("--------------------------------------------------");
        System.out.println("Nama : Ahmad Faozan");
        System.out.println("Kelas : 2B");
        System.out.println("Mata Kuliah : Algoritma dan Struktur Data 2");
        System.out.println("Tugas Praktikum Ke 2");
        System.out.println("--------------------------------------------------");
//        int matrix[][]=new int[3][3];
//        matrix[0][0] = 34;
//        matrix[0][1] = 56;
//        matrix[0][2] = 41;
//        matrix[1][0] = 45;
//        matrix[1][1] = 36;
//        matrix[1][2] = 37;
//        matrix[2][0] = 51;
//        matrix[2][1] = 32;
//        matrix[2][2] = 46;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+"");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Ahmad Faozan");
 
    }
    
}
