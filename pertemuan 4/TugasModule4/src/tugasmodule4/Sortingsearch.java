
package tugasmodule4;

import java.util.Scanner;

public class Sortingsearch {
    
      public static void searching(int []O){
          
      System.out.println("****************************************************");
     
      int key;
      int IndeksPertama = 0;
      int IndeksLast = O.length - 1;
      int ketemu = 0;
      int point = 0;
      
      
      
      System.out.println("");
      System.out.println("");
      
        Scanner scan = new Scanner(System.in);
            System.out.print("Masukkan Data yang Anda Cari : ");
            key = scan.nextInt();
      
      System.out.println(" Isi Datanya Adalah : ");
      for (int i = 0; i< O.length; i++){
          System.out.print(O[i] + " ");
      }
      
      System.out.println("");
      
      while ((IndeksPertama <= IndeksLast) && (ketemu == 0)){
          point = (IndeksPertama + IndeksLast) / 2;
          System.out.println("Indeks Pointer :  " + point);
          if (key == O[point]){
              ketemu = 1;
              
              System.out.println(" Data " + key + " Telah ditemukan pada indeks ke - " + point);
              
          }
          else if (key < O[point]){
              System.out.println("Cari Dikiri");
              IndeksLast = point - 1;
          }
          
          else{
              IndeksPertama = point+1;
              System.out.println("Cari di Kanan");
              
          }
      }
      if(ketemu == 1)
          System.out.println("Kesimpulan : Selamat, Data yang anda cari ditemukan");
      else
          System.out.println("kesimpulan : Mohon Ma'af, Data yang Anda Cari Tidak Ditemukan  ");
    }
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
        System.out.println("Urutkan data berikut dari Terkecil ke Terbesar : ");
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
        int O[] = {25, 7, 9, 13, 3};
        Sortingsearch.tampil();
        Sortingsearch.screen(O);
        Sortingsearch.tampilan();
        Sortingsearch.insertionSort(O);
        Sortingsearch.screen(O);
        Sortingsearch.searching(O);
    }
}
