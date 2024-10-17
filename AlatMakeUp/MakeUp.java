package AlatMakeUp;

public class MakeUp {
    public String merk;
    public String warnaKemasan;
    public double harga;

    public MakeUp() {
    }

    public MakeUp(String merk, String warnaKemasan, double harga) {
        this.merk = merk;
        this.warnaKemasan = warnaKemasan;
        this.harga = harga;
    }

    public void tampilInfo() {
        System.out.println("Merk\t\t: " + merk);
        System.out.println("Warna Kemasan\t: " + warnaKemasan);
        System.out.println("Harga\t\t: Rp" + harga);
    }
}
    
