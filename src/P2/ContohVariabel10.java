public class ContohVariabel10 {
    
    public static void main(String[] args) {
        String salah_Satu_Hobby_Saya_Adalah = "Bermain petak umpet";
        boolean is_Pandai = true;
        char jenis_Kelamin = 'L';
        byte umur_Saya_Sekarang = 18;
        double $ipk = 3.24, tinggi = 1.78;
        System.out.println("Salah satu hobby saya adalah: " + salah_Satu_Hobby_Saya_Adalah);
        System.out.println("Apakah pandai?" + is_Pandai);
        System.out.println("Jenis Kelamin: " + jenis_Kelamin);
        System.out.println("Umurku Saat Ini: " + umur_Saya_Sekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", $ipk, tinggi));
    }
}