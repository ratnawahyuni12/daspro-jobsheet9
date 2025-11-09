# daspro-jobsheet9

Pertanyaan Percobaan 1
1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?
Jawab: yang terjadi dengan diubahnya elemen-elemen array bil tersebut berupa angka yang tidak semuanya berjenis integer (bilangan bulat) yaitu akan eror pada saat dijalankan (run). dikarenakan pada awal sudah di deklarasikan integer, sehingga jenis atau tipe data yang lain tidak akan bisa dikenali dan berakhir dengan eror.
2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus pada saat deklarasi array.
3. Ubah statement pada langkah No 4 menjadi seperti berikut
for (int i = 0; i < 4; i++) {
    System.out.println(bil[i]);
}
Apa keluaran dari program? Jelaskan maksud dari statement tersebut.
Jawab: keluaran dari program tersebut adalah sama seperti sebelumnya, yaitu:
5
13
-7
17
maksud dari statement tersebut adalah sebagai berikut:
- for (int i = 0; i < 4; i++) adalah perulangan for yang digunakan untuk menelusuri setiap elemen array. int i = 0 digunakan untuk menginisialisasi variabel penghitung i dimulai dari 0. i < 4 sebagai kondisi perulangan yang terus berjalan selama i bernilai kurang dari 4. i++ akan menambah nilai i di setiap putaran.
- System.out.println(bil[i]); digunakan untuk menampilkan nilai elemen array bil pada indeks ke-1.
Jadi, perulangan for digunakan untuk menampilkan seluruh elemen array tanpa harus menulis System.out.println(); berkali-kali. output program menampilkan isi array bil (5, 13, -7, dan 17) di masing-masing baris yang berbeda.
4. Jika kondisi pada statement for-loop di atas diubah menjadi i <= 4, apa keluaran dari program? Mengapa demikian?
jawab: keluaran dari program tersebut sama seperti sebelumnya, namun terdapat pesan error berupa :
- Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
         ArrayBilangan21.main(ArrayBilangan21.java:7)
hal ini terjadi karena pada saat nilai i bernilai 4, program mencoba mengakses elemen bil[4], sedangkan array bil hanya memiliki indeks 0 sampai 3 saja. dengan kata lain, indeks ke-4 berada di luar batas (out of bounds) dari panjang array yang berjumlah 4 elemen.

Pertanyaan Percobaan 2
1. Ubah statement pada langkah nomor 5 menjadi seperti berikut ini:
for (int i = 0; i < nilaiAkhir.length; i++) {
    System.out.print("Masukkan nilai akhir ke-" + i + " : ");
    nilaiAkhir[i] = sc.nextInt();
}
Jalankan program. Apakah terjadi perubahan? Mengapa demikian?
Jawab: tidak terjadi perubahan pada saat program dijalankan. program akan tetap meminta pengguna untuk memasukkan 10 nilai akhir, lalu menampilkan semuanya kembali seperti sebelumnya. hal ini dapat terjadi karena i < nilaiAkhir.length sama dengan i < 10 karena memiliki batas perulangan yang sama. perbedaannya terletak pada fleksibilitas .length yang apabila ukuran array nantinya diubah maka perulangan akan otomatis menyesuaikan tanpa perlu mengubah angka tersebut secara manual.
2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length ?
Jawab: berikut penjelasannya:
- nilaiAkhir.length digunakan untuk mendapatkan panjang array.
- maksud dari i < nilaiAkhir.length yaitu perulangan akan terus berjalan selama indeks i masih berada di dalam batas jumlah elemen array. dengan menggunakan cara ini dalam mengetahui panjang array, akan lebih aman dan fleksibel daripada menulis angka tetap (seperti i < 10), karena secara otomatis menyesuaikan jika ukuran array berubah. 
3. Ubah statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai > 70):
for (int i = 0; i < nilaiAkhir.length; i++) {
    if (nilaiAkhir[i] > 70) {
        System.out.println("Mahasiswa ke-" + i + " lulus!");
    }
}
Jalankan program dan jelaskan alur program!
Jawab: alur program:
(1.) Program meminta pengguna memasukkan 10 nilai akhir mahasiswa satu per satu.
(2.) Setiap nilai disimpan di dalam array nilaiAkhir.
(3.) Program melakukan cek tiap nilai dengan perulangan for.
(4.) Jika nilai lebih dari 70, maka ditampilkan bahwa mahasiswa tersebut lulus.
(5.) Hanya mahasiswa yang nilai > 70 yang status kelulusannya muncul di output. sedangkan untuk mahasiswa yang nilainya < 70 hanya akan muncul di bagian "Masukkan nilai akhir ke-i : " dan status kelulusannya tidak muncul.
(8.) Program selesai!