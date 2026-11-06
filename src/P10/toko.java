package P10;
import java.util.Scanner;


public class toko{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlPro = 0, jmlHari = 0, totSelPro = 0;
        double rata = 0;

        do {
        System.out.print("Masukkan jumlah hari: ");
        jmlHari = sc.nextInt();
        System.out.print("Masukka jumlah produk: ");
        jmlPro = sc.nextInt();

        if (jmlPro <= 1 || jmlHari <= 0) {
            System.out.println("Input ulang");
        }
        } while (jmlPro <= 1 || jmlHari <= 0); {
            int produk = 1;
            totSelPro = 0;
        while (produk <= jmlPro) {
            int totalpro = 0;
            System.out.println("produk ke- " + produk);
            for (int hari = 0; hari < jmlHari; hari++) {
                int terjual;
                do {
                    System.out.println("Penjualan hari ke-" + hari + ": ");
                    terjual = sc.nextInt();
                    if (terjual < 0) {
                            System.out.println("Tidak boleh negatif input ulang");
                            
                        }
                } while (terjual<0);
                    totalpro = totalpro + terjual;
                }
                rata = totalpro/jmlHari;
                System.out.println("total produk : " + totalpro);
                System.out.println("Rata - rata: " + rata);
                totSelPro += totalpro;
                produk ++;
                
            }
            System.out.println("Total: " + totSelPro);
           
        }
        sc.close();
    }
}