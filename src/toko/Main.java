package toko;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // io sederhana
        Scanner input = new Scanner(System.in);
    
    // array
    Produk[] daftarProduk = new Produk[4];
    
    // object
    daftarProduk[0] = new Elektronik("TV Samsung", 3000000, 5, "Samsung", 2);
    daftarProduk[1] = new Elektronik("Kulkas LG", 4000000, 3, "LG", 3);
    daftarProduk[2] = new Pakaian("Kaos Polos", 75000, 20, "M", "Hitam");
    daftarProduk[3] = new Pakaian("Jaket Hoodie", 150000, 10, "L", "Abu-abu");
    
    boolean lanjut = true;
        while (lanjut) { // Perulangan
            System.out.println("\n=== Daftar Produk Toko Online ===");
            for (int i = 0; i < daftarProduk.length; i++) { //Perulangan
                System.out.println((i + 1) + ". " + daftarProduk[i].getNama() + " (Stok: " + daftarProduk[i].getStok() + ")");
            }

            try { // Error Handling
                System.out.print("\nPilih produk (1-" + daftarProduk.length + "): ");
                int pilih = input.nextInt();

                if (pilih < 1 || pilih > daftarProduk.length) { // Seleksi
                    System.out.println("Pilihan tidak valid!"); 
                    continue; //  skip sisa perintah dan ulang while dari awal
                }

                Produk dipilih = daftarProduk[pilih - 1];
                dipilih.tampilInfo();

                System.out.print("Jumlah beli: ");
                int jumlah = input.nextInt();

                if (jumlah <= 0) { // Seleksi
                    System.out.println("Jumlah harus lebih dari 0!");
                } else {
                    dipilih.beli(jumlah);
                }

            } catch (Exception e) { // Error Handling
                System.out.println("Input tidak valid. Harus angka!");
                input.nextLine(); // Reset buffer
            }

            System.out.print("\nIngin beli produk lain? (y/n): ");
            String jawaban = input.next();
            lanjut = jawaban.equalsIgnoreCase("y");
        }

        input.close(); // menutup scanner
        System.out.println("Terima kasih telah berbelanja!");
    }
}
    
   
