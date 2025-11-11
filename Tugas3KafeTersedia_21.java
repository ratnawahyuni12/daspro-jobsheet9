import java.util.Scanner;
public class Tugas3KafeTersedia_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============- PEMESANAN MAKANAN DAN MINUMAN -==============");
        System.out.println();

        // daftar menu menggunakan array 1
        String[] daftarMenuMakanan = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.println("Daftar menu : ");
        for (int i = 0; i < daftarMenuMakanan.length; i++) {
            System.out.println((i + 1) + ". " + daftarMenuMakanan[i]);
        }

        // nama menu (makanan/minuman) yang ingin dicari
        System.out.println();
        System.out.print("Nama menu yang ingin dicari : ");
        String cariMenu = sc.nextLine();

        boolean menuDitemukan = false;

        // algoritma linear search
        for (int i = 0; i < daftarMenuMakanan.length; i++) {
            if (daftarMenuMakanan[i].equalsIgnoreCase(cariMenu)) {
                menuDitemukan = true;
                break;
            }
        }

        System.out.println();
        if (menuDitemukan) {
            System.out.println("Menu '" + cariMenu + "' tersedia di menu kafe."); // jika menu tersedia
        } else {
            System.out.println("Maaf, menu '" + cariMenu + "' tidak tersedia di menu kafe."); // jika menu tidak tersedia
        }

        System.out.println();
        System.out.println("======================- TERIMA KASIH! -======================");

        sc.close();
    }
}