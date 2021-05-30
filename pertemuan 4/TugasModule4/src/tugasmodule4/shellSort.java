
package tugasmodule4;

public class shellSort {
    public static void shellsort(int[]arr){
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
    public static void tampilkan(){
        System.out.println("*************** Tugas Praktikum 4 *************** "+"\n");
        System.out.println();
        System.out.println("Nama : Ahmad Faozan" + "\n");
        System.out.println("Kelas 2B"+"\n");
        System.out.println("Mata Kuliah : Algoritma dan Struktur Data 2"+"\n");
        
        System.out.println();
        System.out.println("************************************************" + "\n");
        System.out.println();
        System.out.println();
        System.out.println("Urutkan data berikut dari terkecil ke terbesar : ");
    }
    public static void tampilin (){
        System.out.println("Data yang sudah diurutkan adalah : ");
    }
    public static void tampil (int data[]){
        
        for (int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
            System.out.println();
        }
    }
    
    public static void main(String[]args){
        int A[]={25, 7, 9, 13, 3};
        shellSort.tampilkan();
        shellSort.tampil(A);
        shellSort.tampilin();
        shellSort.shellsort(A);
        shellSort.tampil(A);
                
    }
}
