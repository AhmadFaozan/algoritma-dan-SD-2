
package searching;

public class binary_fixxx {
    public static void main(String[] args){
//        pendeklarasian variabel
        int B[] = {7, 9, 11, 13, 15};
        int cari = 9;
        int IndeksAwal =0;
        int IndeksAkhir = B.length-1;
        int ketemu = 0;
        int point = 0;
//     menapilkan data array
        System.out.println("Isi Data adalah : ");
        for ( int i = 0; i < B.length; i++){
            System.out.print(B[i] + " ");
        }
        System.out.println("");
        System.out.println("");
        
        while ((IndeksAwal <= IndeksAkhir) && (ketemu == 0)){
            point = (IndeksAwal + IndeksAkhir) /2;
            System.out.println("Indeks Pointer = " + point);
            if (cari == B[point] ){
                ketemu = 1;
                System.out.println("Data " +
                        cari + " Telah ditemukan pada indeks ke - " + point);
            }
            else if (cari <B[point]){
                System.out.println("Cari di kiri");
                IndeksAkhir = point-1;
            }
            else {
                IndeksAwal = point+1;
                System.out.println("Cari di kanan");
            }
        
        }
        if (ketemu == 1)
            System.out.println("Kesimpulan : Data di temukan ");
        else
            System.out.println("Kesimpulan : Data Tidak Ditemukan ");
    }
}
    
    

