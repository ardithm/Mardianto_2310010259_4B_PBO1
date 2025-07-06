package toko;

public class Pakaian extends Produk {
    private String ukuran;
    private String warna;
    
    // konstruktor
    public Pakaian(String nama, double harga, int stok, String ukuran, String warna) {
        super(nama, harga, stok);
        this.ukuran = ukuran;
        this.warna = warna;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Ukuran      : "+ukuran);
        System.out.println("Warna       : "+warna);
    }
    
    
}
