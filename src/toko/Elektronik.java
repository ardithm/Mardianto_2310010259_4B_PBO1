package toko;

public class Elektronik extends Produk { // inheritance
    private String merk;
    private int garansiTahun;

    // konstruktor
    public Elektronik(String nama, double harga, int stok, String merk, int garansiTahun) {
        super(nama, harga, stok);
        this.merk = merk;
        this.garansiTahun = garansiTahun;
    }
    
    // polymophism (overriding)
    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Merk        : "+merk);
        System.out.println("Garansi     : "+garansiTahun+" tahun");
    }
    
}
