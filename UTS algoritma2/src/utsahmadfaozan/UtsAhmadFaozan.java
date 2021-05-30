
package UtsAhmadFaozan;

import java.util.Scanner;

public class UtsAhmadFaozan {
    
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
      public static void Shellsort(int[] arr){
       int n = arr.length;
        int C,M;
        int jarak, i, j, kondisi;
        boolean Sudah = true;
        int temp;
        C=0;
        M=0;
        jarak=n;
        
        while (jarak >= 1){
            jarak = jarak /2;
            Sudah = true;
            while(Sudah){
                Sudah = false;
                for(j=0;j<n-jarak;j++){
                    i = j + jarak;
                    C++;
                    if(arr[j]>arr[i]){
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i]= temp;
                        Sudah = true;
                    } 
                }
            }
        }
    }

       public static void tampil(){
        System.out.println("*************** Ulangan Tengah Semester 2 *************** "+"\n");
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
        int O[] = {3, 10, 4, 2, 8, 13};
        UtsAhmadFaozan.tampil();
        UtsAhmadFaozan.screen(O);
        UtsAhmadFaozan.Shellsort(O);
        UtsAhmadFaozan.searching(O);
    }
}
