
package No3;

public class Jawaban {
    public static void main(String[] args){
        int [][]X={
            {1,2,3},
            {3,2,1}
        
        };
        int [][]Y={
            {2,1},
            {3,2},
            {4,5}
    
        };
        System.out.println("Program Membuat Perkalian matriks ");
        System.out.println("--------------------------------------------------");
        System.out.println("Nama : Ahmad Faozan");
        System.out.println("Kelas : 2B");
        System.out.println("Mata Kuliah : Algoritma dan Struktur Data 2");
        System.out.println("Tugas Praktikum Ke 2");
        System.out.println("--------------------------------------------------");
        if (X[0].length == Y.length){
            int[][]C=new int [X.length][Y[0].length];
            for(int i=0; i<X.length; i++){
            for(int j=0;j<Y[0].length;j++){
            for(int k=0; k<X[0].length;k++){
                C[i][j]+=X[i][k]*Y[k][j];
        }
            }
            }
            for(int[] c: C){
                for(int i: c){
                    System.out.print(i+"");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Ukuran kolom X tidak sama dengan baris Y");
        }
    }
}
