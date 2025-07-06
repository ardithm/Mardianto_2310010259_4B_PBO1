package toko;

public class Produk {
    // atribut dan encapsulation
    private String nama;
    private double harga;
    private int stok;
    
    // konstruktor
    public Produk(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }
    
    // accessor (getter)
    public String getNama() {
        return nama;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public int getStok() {
        return stok;
    }
    
    // mutator (setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    // menampilkan informasi produk
    public void tampilInfo() {
        System.out.println("Nama Produk : "+nama);
        System.out.println("Harga       : "+harga);
        System.out.println("Stok        : "+stok);
    }
    
    // proses pembelian
    public void beli(int jumlah) {
        // seleksi
        if (jumlah <= stok) {
            stok -= jumlah;
            System.out.println("Berhasil membeli "+jumlah+ " unit.");
        } else {
            System.out.println("Stok tidak cukup.");
        }
    }
}
