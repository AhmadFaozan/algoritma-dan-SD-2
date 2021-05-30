//
package tugas.praktikum.pkg3;
//
import java.util.Scanner;
public class JawabanNo2 {

    public static void main(String[] args){
      System.out.println("***** Tugas Praktikum 3 *****" + "\n");
      
      System.out.println("");
      
      System.out.println("Nama : Ahmad Faozan "+"\n");
      System.out.println("Kelas : 2B"+"\n");
      System.out.println("Mata Kuliah : Algoritma dan Struktur Data 2" + "\n");
      
      System.out.println("");
      System.out.println("****************************************************");
      
      System.out.println(" Jawaban Soal No 2");
      System.out.println("****************************************************");
      
      int G[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
      int key;
      int IndeksPertama = 0;
      int IndeksLast = G.length - 1;
      int ketemu = 0;
      int point = 0;
      
      
      
      System.out.println("");
      System.out.println("");
      
        Scanner scan = new Scanner(System.in);
            System.out.print("Masukkan Data yang Anda Cari : ");
            key = scan.nextInt();
      
      System.out.println(" Isi Datanya Adalah : ");
      for (int i = 0; i< G.length; i++){
          System.out.print(G[i] + " ");
      }
      
      System.out.println("");
      
      while ((IndeksPertama <= IndeksLast) && (ketemu == 0)){
          point = (IndeksPertama + IndeksLast) / 2;
          System.out.println("Indeks Pointer :  " + point);
          if (key == G[point]){
              ketemu = 1;
              
              System.out.println(" Data " + key + " Telah ditemukan pada indeks ke - " + point);
              
          }
          else if (key < G[point]){
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
}
