
package tugasmodule4;


public class selectionSort {
    public static void Selectionsort(int[]A){
        int smallIndex;
        int pass, j, n=A.length;
        int temp;
        
        for (pass = 0;pass<n-1;pass++){
            smallIndex = pass;
            for(j=pass+1;j<n;j++){
                if (A[j]<A[smallIndex]){
                    smallIndex=j;
                }
            }
            temp = A[pass];
            A[pass]=A[smallIndex];
            A[smallIndex]=temp;
        }
    }
    public static void tampilkan (){
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
    
    public static void tampilin(){
        System.out.println("Data yang sudah diurutkan adalah : ");
    }
    public static void tampil(int data[]){
        
        for (int i = 0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int A[]={25, 7, 9, 13, 3};
        selectionSort.tampilkan();
        selectionSort.tampil(A);
        selectionSort.tampilin();
        selectionSort.Selectionsort(A);
        selectionSort.tampil(A);
    }
}
