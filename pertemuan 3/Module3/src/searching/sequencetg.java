
package searching;
import java.util.Scanner;
public class sequencetg {
    public static void main(String[] args){
    System.out.println("***** SEQUENTIAL SEARCH *****"+ "\n");
        String data[] = {"Galileo", "Adam", "Enstein"};
        String key;
        //    fitur scanner
    Scanner scan = new Scanner(System.in);
    System.out.print("masukkan Data yang dicari : ");
    key = scan.nextLine();
    
//    menampilkan data array
    System.out.print("Isi Data adalah : ");
    for (int i = 0; i < data.length; i++){
    
    System.out.print(data[i]+ " ");
    
}
    System.out.println("");
    
    for (int i = 0; i <= data.length; i++){
        if(key.equalsIgnoreCase(data[i])){
            System.out.print(" Data " + key + " berada pada index ke- " + i);
            break;
        }
    }
    System.out.println("\n");
    System.out.println();
    System.out.println("********** Terima Kasih **********");
    }
    

    
}
