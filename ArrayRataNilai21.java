import java.util.Scanner;
public class ArrayRataNilai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        int totalLulus = 0;
        int totalTidakLulus = 0;
        double rataLulus = 0;
        double rataTidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }

        rataLulus = (jumlahLulus > 0) ? ( (double) totalLulus / jumlahLulus) : 0;
        rataTidakLulus = (jumlahTidakLulus > 0) ? ( (double) totalTidakLulus / jumlahTidakLulus) : 0;

        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);

        sc.close();
    }
}
