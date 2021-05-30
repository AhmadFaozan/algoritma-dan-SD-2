
package No2;

public class TugasNo2 {
    public static void main (String[] args){

        int [][]x={
            {2,2},
            {3,1},
            {4,5},
    };
        int [][]y={
            {3,2},
            {2,1},
            {1,2}
        };
        System.out.println("Program Membuat Penjumlahan matriks ");
        System.out.println("--------------------------------------------------");
        System.out.println("Nama : Ahmad Faozan");
        System.out.println("Kelas : 2B");
        System.out.println("Mata Kuliah : Algoritma dan Struktur Data 2");
        System.out.println("Tugas Praktikum Ke 2");
        System.out.println("--------------------------------------------------");
   if((x.length == y.length)&&(x[0].length==y[0].length)){
        int [][]f=new int[x.length][x[0].length];
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[0].length;j++){
                f[i][j]=x[i][j]-y[i][j];
            }
        }
        for(int[] c:f){
            for(int q:c){
                System.out.print(q+"");
            }
            System.out.println();
        }

    }
   else{
       System.out.println("Ukuran Matrix Tidak Sama");
   }
}
}

