package P13;

import java.util.Scanner;

public class BioskopWithScanner10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, pilihan;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu Bioskop");
            System.out.println("1. Input Data penonton");
            System.out.println("2. Daftar Penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu 1 -3: ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();

                if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                    System.out.println("Baris atau kolom tidak tersedia");
                } else {
                    penonton[baris - 1][kolom - 1] = nama;
                }

                System.out.print("Input penonton lainnya? (y/n): ");
                pilihan = sc.nextLine();

                if (pilihan.equalsIgnoreCase("n")) {
                    break;
                }
            } else if (menu == 2) {
                System.out.println("Daftar Penonton: ");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                     System.out.println("Penonton baris ke-" + (i + 1) + ": " + penonton[i][j]);   
                    }
                }
            } else if (menu == 3) {
                break;
            } else {
                System.out.println("Input tidak valid");
            }
        }
    }
}