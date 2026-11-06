package P3;

import java.util.Scanner;

public class MenghitungLuasPersegiPanjang10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Panjang;
        int Lebar;
        int luas;
        
        Panjang = input.nextInt();
        Lebar = input.nextInt();
        luas = Panjang * Lebar;
        System.out.println("Luas persegi adalah: " + luas);

    }
    
}
