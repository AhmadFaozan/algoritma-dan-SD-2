
package Transpose;
import java.util.Scanner;
public class TransposeMatrix {
    public static void main(String[] args){
        int i,j,m,n;
        int matriks[][]=new int[10][10];
        int transpose[][]=new int[10][10];
        Scanner scan=new Scanner(System.in);
        System.out.println("Masukkan Jumlah Baris Matriks:  ");
        m=scan.nextInt();
        System.out.println("Masukkan Jumlah Kolom Matriks :  ");
        n=scan.nextInt();
        System.out.println("Masukkan Elemen Matriks:  ");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                matriks[i][j]=scan.nextInt();
            }
        }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                transpose[j][i]=matriks[i][j];
            }
        }
        System.out.println("Hasil Transpose Matriks Adalah :  ");
        for(i=0;i<n;i++){
            for (j=0;j<m;j++){
                System.out.print(transpose[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
     