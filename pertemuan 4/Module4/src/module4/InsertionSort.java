
package module4;

public class InsertionSort {
    public static void insertionSort(int[] O){
        for (int i = 1; i < O.length;i++){
            int key = O[i];
            int j = i - 1;
            while ((j>= 0) && (O[j] > key)){
                O[j+1] = O[j];
                j--;
            }
            O[j + 1] = key;
        }
    }
     public static void tampil(){
        System.out.println("*************** Tugas Praktikum 4 *************** "+"\n");
        System.out.println();
        System.out.println("Nama : Ahmad Faozan" + "\n");
        System.out.println("Kelas 2B"+"\n");
        System.out.println("Mata Kuliah : Algoritma dan Struktur Data 2"+"\n");
        
        System.out.println();
        System.out.println("************************************************" + "\n");
        System.out.println();
        System.out.println();
        System.out.println("Urutkan Data Berikut dari Terkecil ke Terbesar : ");
    }
      public static void tampilan(){
         System.out.println("Data yang sudah urut : " );
     }
    public static void screen(int data[]) {
        
        for (int i = 0; i < data.length;i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    public static void main (String[] args){
        int O[] = {3, 10, 4, 2, 8, 9, 7, 6};
        InsertionSort.tampil();
        InsertionSort.screen(O);
        InsertionSort.tampilan();
        InsertionSort.insertionSort(O);
        InsertionSort.screen(O);
    }
}
