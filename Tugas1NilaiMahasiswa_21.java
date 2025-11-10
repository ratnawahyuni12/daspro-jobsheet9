import java.util.Scanner;
public class Tugas1NilaiMahasiswa_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====================- NILAI MAHASISWA -====================");
        System.out.println();

        // memasukkan banyaknya nilai mahasiswa yang akan diinput
        System.out.print("Masukkan banyak nilai mahasiswa yang akan diinput : ");
        int banyakNilaiMhs = sc.nextInt();
        System.out.println();

        int[] nilaiMhs = new int[banyakNilaiMhs];
        int total = 0;

        // memasukkan setiap nilai mahasiswa
        for ( int i = 0; i < banyakNilaiMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
        }
        System.out.println();

        // menghitung nilai rata-rata
        double rataRata = (double) total / banyakNilaiMhs;

        int nilaiTertinggi = nilaiMhs[0];
        int nilaiTerendah = nilaiMhs[0];

        for (int i = 1; i < banyakNilaiMhs; i++) {
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }

        System.out.println("========- HASIL SIMPAN DAN KELOLA NILAI MAHASISWA -========");
        System.out.println();

        System.out.println("Rata-rata nilai       : " + rataRata);
        System.out.println("Nilai tertinggi       : " + nilaiTertinggi);  // menampilkan nilai tertinggi
        System.out.println("Nilai terendah        : " + nilaiTerendah);   // menampilkan nilai terendah

        // menampilkan semua nilai yang telah dimasukkan
        System.out.print("Nilai yang dimasukkan : ");
        for (int i = 0; i < banyakNilaiMhs; i++) {
            System.out.print(nilaiMhs[i] + " | ");
        }

        System.out.println();
        System.out.println();

        System.out.println("====================- PROGRAM SELESAI -====================");

        sc.close();
    }
}