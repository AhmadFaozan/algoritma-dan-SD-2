
package no4;
import java.util.Scanner;
public class jawaban {
    public static void main(String[] args){
        int i,j,m,n;
        int matriks[][] = new int [10][10];
        int transpose [][] = new int [10][10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Program Membuat Transpose matriks ");
        System.out.println("--------------------------------------------------");
        System.out.println("Nama : Ahmad Faozan");
        System.out.println("Kelas : 2B");
        System.out.println("Mata Kuliah : Algoritma dan Struktur Data 2");
        System.out.println("Tugas Praktikum Ke 2");
        System.out.println("--------------------------------------------------");
        System.out.println("Masukkan Jumlah Baris Matriks: ");
        m = scan.nextInt();
        System.out.println("Masukkan Jumlah Kolom Matriks : ");
        n = scan.nextInt();
        System.out.println("Masukkan Elemen - Elemen Matriks : ");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                matriks[i][j] = scan.nextInt();
                
            }
        }
        System.out.println("Hasil Matriks : ");
        for (i=0; i<m;i++){
            for(j=0;j<n;j++){
                System.out.println(matriks[i][j] + "\t");
                
            }
            System.out.println();
        }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                transpose[j][i]=matriks[i][j];
            }
        }
        System.out.println("Hasil Transpose Matriks: ");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(transpose[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
