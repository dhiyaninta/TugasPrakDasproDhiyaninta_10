public class RobotArm10 {
    // 3 nampan (A, B, C). Mula-mula: nampan A berisi 1 bola bintang, nampan B berisi 1 bola bulan, 
    // dan nampan C kosong
    // langkah-langkah berikut secara berurutan:
    //  1) Ambil bola di nampan A, taruh di nampan C.  
    //  2) Ambil bola di nampan B, taruh di nampan A.
    //  3) Ambil bola di nampan C, taruh di nampan B. 
    //(a) Kedua bola sudah bertukar tempat;
    //(b) ada dua bola di nampan A;
    //(c) ada dua bola di nampan B;
    //(d) nampan A kosong;
    //(e) nampan C kosong; 
    //(f) tidak ada yang berubah, tiap bola kembali ke tempat asalnya.

    public static void main(String[] args) {
        System.out.println("Setelah Langkah 1: Nampan A = Kosong, Nampan B = Bintang, Nampan C = Bulan");
        System.out.println("Setelah Langkah 2: Nampan A = Bintang, Nampan B = Kosong, Nampan C = Bulan");
        System.out.println("Setelah Langkah 3: Nampan A = Bintang, Nampan B = Bulan, Nampan C= Kosong");
        System.out.println("kesimpulan: Pernyataan yang benar adalah: 'a dan e' ");
    }

}
