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