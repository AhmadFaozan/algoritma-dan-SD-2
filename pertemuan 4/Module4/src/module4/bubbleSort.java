
package module4;

public class bubbleSort {
    public static void sortBubble(int[]Z){
        int i=1 , j , n = Z.length;
        int temp;
        while (i<n){
            j=n-1;
            while (j>=i){
                if(Z[j-1]>Z[j]){
                    temp = Z[j];
                    Z[j]=Z[j-1];
                    Z[j-1]=temp;
                }
                j=j-1;
            }
            i=i+1;
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
        System.out.println("Urutkan data tersebut dari yang terkecil ke terbesar :");
    }
     public static void tampilan(){
         System.out.println("Data yang sudah urut : " );
     }
    public static void nampil(int data[]){
      
        
        for(int i=0;i<data.length;i++){
            
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[]args){
        int Z[] = {25, 7, 9, 13, 3};
        bubbleSort.tampil();
        bubbleSort.nampil(Z);
        bubbleSort.tampilan();
        bubbleSort.sortBubble(Z);
        bubbleSort.nampil(Z);
    }
}
