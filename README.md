# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah aplikasi toko online sederhana menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini adalah sistem toko online sederhana yang memungkinkan pengguna untuk melihat daftar produk dan melakukan pembelian. Aplikasi ini menampilkan berbagai jenis produk seperti elektronik dan pakaian dengan detail informasi yang berbeda untuk setiap kategori produk.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Fitur Utama

1. **Tampilan Daftar Produk** - Menampilkan semua produk yang tersedia dengan informasi stok
2. **Pembelian Produk** - Memungkinkan pengguna untuk membeli produk dengan jumlah tertentu
3. **Manajemen Stok** - Otomatis mengurangi stok setelah pembelian berhasil
4. **Kategori Produk** - Mendukung berbagai jenis produk (Elektronik dan Pakaian)

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Produk`, `Elektronik`, `Pakaian`, dan `Main` adalah contoh dari class.

```bash
public class Produk {
    ...
}

public class Elektronik extends Produk {
    ...
}

public class Pakaian extends Produk {
    ...
}

public class Main {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, pembuatan object dilakukan untuk setiap produk dalam array.

```bash
daftarProduk[0] = new Elektronik("TV Samsung", 3000000, 5, "Samsung", 2);
daftarProduk[1] = new Elektronik("Kulkas LG", 4000000, 3, "LG", 3);
daftarProduk[2] = new Pakaian("Kaos Polos", 75000, 20, "M", "Hitam");
daftarProduk[3] = new Pakaian("Jaket Hoodie", 150000, 10, "L", "Abu-abu");
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, setiap class memiliki atribut yang relevan.

```bash
// Class Produk
String nama;
double harga;
int stok;

// Class Elektronik
String merk;
int garansiTahun;

// Class Pakaian
String ukuran;
String warna;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Produk`, `Elektronik`, dan `Pakaian`.

```bash
// Class Produk
public Produk(String nama, double harga, int stok) {
    this.nama = nama;
    this.harga = harga;
    this.stok = stok;
}

// Class Elektronik
public Elektronik(String nama, double harga, int stok, String merk, int garansiTahun) {
    super(nama, harga, stok);
    this.merk = merk;
    this.garansiTahun = garansiTahun;
}

// Class Pakaian
public Pakaian(String nama, double harga, int stok, String ukuran, String warna) {
        super(nama, harga, stok);
        this.ukuran = ukuran;
        this.warna = warna;
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama`, `setHarga` dan `setStok` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setHarga(double harga) {
    this.harga = harga;
}

public void setStok(int stok) {
    this.stok = stok;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getharga`, dan `getStok` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public double getHarga() {
    return harga;
}

public int getStok() {
    return stok;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, semua atribut dienkapsulasi.

```bash
// Class Produk
private String nama;
private double harga;
private int stok;

// Class Elektronik
private String merk;
private int garansiTahun;

// Class Pakaian
private String ukuran;
private String warna;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Elektronik` dan `Pakaian` mewarisi dari `Produk` dengan sintaks `extends`.

```bash
// class Elektronik
public class Elektronik extends Produk {
    ...
}

// Class Pakaian
public class Pakaian extends Produk {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda
   tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilInfo()` di class `Elektronik` dan `Pakaian` merupakan override dari
   method `tampilInfo()` di class `Produk`.

```bash
// Class Elektronik
@Override
public void tampilInfo() {
    super.tampilInfo();
    System.out.println("Merk        : "+merk);
    System.out.println("Garansi     : "+garansiTahun+" tahun");
}

// Class Pakaian
@Override
public void tampilInfo() {
    super.tampilInfo();
    System.out.println("Ukuran      : "+ukuran);
    System.out.println("Warna       : "+warna);
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dan `if` untuk validasi input dan pembelian.
    
```bash
// Seleksi if else - Validasi stok
if (jumlah <= stok) {
    stok -= jumlah;
    System.out.println("Berhasil membeli "+jumlah+ " unit.");
} else {
    System.out.println("Stok tidak cukup.");
}

// Seleksi if - Validasi pilihan
if (pilih < 1 || pilih > daftarProduk.length) {
    System.out.println("Pilihan tidak valid!"); 
    continue;
}

// Seleksi if - Validasi jumlah
if (jumlah <= 0) {
    System.out.println("Jumlah harus lebih dari 0!");
} else {
    dipilih.beli(jumlah);
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `while` untuk menu utama dan `for` untuk menampilkan daftar produk.

```bash
while (lanjut) {
    // Menu utama
    ...
}

for (int i = 0; i < daftarProduk.length; i++) {
    System.out.println((i + 1) + ". " + daftarProduk[i].getNama() + " (Stok: " + daftarProduk[i].getStok() + ")");
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk
    menampilkan output.

```bash
Scanner input = new Scanner(System.in);
System.out.print("Pilih produk (1-" + daftarProduk.length + "): ");
int pilih = input.nextInt();

System.out.print("Jumlah beli: ");
int jumlah = input.nextInt();

System.out.print("\nIngin beli produk lain? (y/n): ");
String jawaban = input.next();

System.out.println("Nama Produk : "+nama);
System.out.println("Harga       : "+harga);
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, array digunakan untuk menyimpan daftar produk.

```bash
Produk[] daftarProduk = new Produk[4];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani input yang tidak valid.

```bash
try {
    System.out.print("Pilih produk (1-" + daftarProduk.length + "): ");
    int pilih = input.nextInt();
    // ... kode lainnya
} catch (Exception e) {
    System.out.println("Input tidak valid. Harus angka!");
    input.nextLine(); // Reset buffer
}
```

## Struktur Class

```
Produk (Parent Class)
├── Elektronik (Child Class)
└── Pakaian (Child Class)

Main (Class utama untuk menjalankan aplikasi)
```

## Cara Menjalankan

1. Compile semua file Java
2. Jalankan class `Main`
3. Pilih produk yang ingin dibeli dari daftar yang tersedia
4. Masukkan jumlah yang ingin dibeli
5. Sistem akan memvalidasi stok dan memproses pembelian

## Usulan Nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Mardianto
NPM: 2310010259
