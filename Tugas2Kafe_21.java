import java.util.Scanner;
public class Tugas2Kafe_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============- PEMESANAN MAKANAN DAN MINUMAN -==============");
        System.out.println();

        System.out.print("Jumlah pesanan : "); // jumlah pesanan
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();

        String[] namaPesanan = new String[jumlahPesanan]; // array nama pesanan
        double[] hargaPesanan = new double[jumlahPesanan]; // array harga

        System.out.println();

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("Pesanan ke-" + (i  + 1));
            System.out.print("Nama Makanan/Minuman : "); // nama makanan/minuman
            namaPesanan[i] = sc.nextLine();

            System.out.print("Harga Pesanan        : Rp "); // harga masing-masing pesanan
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine();
        }

        // menghitung total biaya dari semua pesanan yang dimasukkan
        double totalBiayaPesanan = 0;
        for (int i = 0; i < jumlahPesanan; i++) {
            totalBiayaPesanan += hargaPesanan[i];
        }

        System.out.println();

        // tampilan daftar pesanan yang telah dimasukkan bersama dengan total biaya
        System.out.println("=========- DAFTAR PESANAN MAKANAN DAN MINUMAN KAFE -=========");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + (int) hargaPesanan[i]); // daftar pesanan
        }

        System.out.println();

        System.out.println("Total biaya : Rp " + (int) totalBiayaPesanan); // total biaya
        System.out.println("=============================================================");

        sc.close();
    }
}