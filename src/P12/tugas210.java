package P12;

import java.util.Scanner;
/*
Tugas 2 (uji wajib) jumlah item dipesan 2 + (10 mod 4) = 4
Tugas 2 (uji wajib) indeks menu yang wajib
dipesan 10 mod 7 = 3*/
public class tugas210 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[]harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};
        
        System.out.println("======== DAFTAR MENU KAFE KAMPUS ========");
        for (int i = 0; i < menu.length; i++){
            System.out.println((i + 1)+ ". "+ menu[i] + " - Rp" + harga[i]);
        }
        System.out.print("Masukkan nama Menu: ");
        String cari = input.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < menu.length; i++){
            if (menu[i].equalsIgnoreCase(cari)) {
                ditemukan = true;
                System.out.println("Harga: Rp " + harga[i]);
                break;
            }
        }
            if(!ditemukan){
                System.out.println("Menu tidak ditemukan");
            }
        System.out.print("Masukkan jumlah item yang dipesan: ");
        int item = input.nextInt();
        input.nextLine();

        String[]pesanan = new String[item];
        int[] hargaPesanan = new int[item];
        int total = 0;

        for (int i = 0; i < item; i++){
            boolean valid = false;
            while (!valid) {
                System.out.print("Masukkan menu pesanan ke- " + (i + 1) + ": ");
                String namaPesanan = input.nextLine().trim();

                for (int j = 0; j < menu.length; j++){           
                if (menu[j].equalsIgnoreCase(namaPesanan)) {
                    pesanan[i]=menu[j];
                    hargaPesanan[i] = harga[j];
                    total = total + harga[j];
                    valid = true;
                    break;
                }
            }
            if (!valid) {
                System.out.println("Menu tidak ditemukan, silahkan coba lagi");
            }
        }
    }
    System.out.println("========= RINGKASAN PESANAN =========");
    input.nextLine();

    for (int i = 0; i <item; i++) {
        System.out.println((i + 1) + ". " + pesanan[i] + " - Rp" + hargaPesanan[i]);
    }
    System.out.println("Total bayar: Rp" + total);

    System.out.println("======== TERIMAKASIH ========");

    input.close();
    }
}