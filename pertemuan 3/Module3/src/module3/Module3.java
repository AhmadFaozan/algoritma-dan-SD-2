
package module3;

public class Module3 {
    public static void main(String[] args) {
        int A[] = {10, 12, 8, 9, 15};
        int cari = 20;
        int ketemu = 0;
        
        System.out.println("Isi Data A adalah : ");
        for (int i = 0; i < A.length; i++){
            System.out.print(A[i]+" ");
            }
        System.out.println("");
        System.out.println("");
        
        for (int i = 0; i < A.length; i++){
            if (A[i] == cari){
                ketemu = 1;
                System.out.println("data " + cari + "berada di index ke- "+A[i]);
            }
        }
        System.out.println("");
        System.out.println("");
        
        if (ketemu == 1)
            System.out.println("Kesimpulan Data Ditemukan ");
        else
            System.out.println("Data yang dicari = "+ cari);
            System.out.println("Kesimpulan : Data tidak ditemukan ");
        
        

    }
    
}
