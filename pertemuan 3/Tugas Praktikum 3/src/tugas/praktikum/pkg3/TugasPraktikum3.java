
package tugas.praktikum.pkg3;
import java.util.Scanner;
public class TugasPraktikum3 {

    public static void main(String[] args) {
      System.out.println("***** Tugas Praktikum 3 *****" + "\n");
      
      System.out.println("");
      
      System.out.println("Nama : Ahmad Faozan "+"\n");
      System.out.println("Kelas : 2B"+"\n");
      System.out.println("Mata Kuliah : Algoritma dan Struktur Data 2" + "\n");
      
      System.out.println("");
      System.out.println("****************************************************");
      
      System.out.println(" Jawaban Soal No 1");
      System.out.println("****************************************************");
      
      String ozan[] = {"Galileo", "Archimedes", "Alkhawarizmi", "Aljabar", "AhmadFaozan", "Tesla"};
      String key;
      
      Scanner scan = new Scanner(System.in);
      System.out.println("Masukkan Data Yang Akan Anda Cari :  ");
      key = scan.nextLine();
      
      System.out.print("isi Datanya Adalah : ");
      for (int i = 0; i < ozan.length; i++){
          
          System.out.print(ozan[i]+" ");
      }
    System.out.println("");
    for (int i = 0; i<= ozan.length; i++){
        if(key.equalsIgnoreCase(ozan[i])){
            System.out.print("Data " + key + " Berada pada Indeks yang ke - "+ i);
            break;
        }
    }
    System.out.println("\n");
    System.out.println("");
    System.out.println("*************** Matur Nuwun ******************");
}
}

