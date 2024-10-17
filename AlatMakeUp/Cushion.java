package AlatMakeUp;

public class Cushion extends MakeUp {
    public String jenisShade;
    public boolean adaSPF;

    public Cushion() {
    }

    public Cushion(String merk, String warnaKemasan, double harga, String jenisShade, boolean adaSPF) {
        super(merk, warnaKemasan, harga);
        this.jenisShade = jenisShade;
        this.adaSPF = adaSPF;
    }

    public void tampilCushion() {
        super.tampilInfo();
        System.out.println("Jenis Shade\t: " + jenisShade);
        System.out.println("Ada SPF\t\t: " + (adaSPF ? "Ya" : "Tidak"));
    }
}

