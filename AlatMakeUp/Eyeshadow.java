package AlatMakeUp;

    public class Eyeshadow extends MakeUp {
        public String jenisPalette;
        public int jumlahWarna;
    
        public Eyeshadow() {
        }
    
        public Eyeshadow(String merk, String warnaKemasan, double harga, String jenisPalette, int jumlahWarna) {
            super(merk, warnaKemasan, harga);
            this.jenisPalette = jenisPalette;
            this.jumlahWarna = jumlahWarna;
        }
    
        public void tampilEyeshadow() {
            super.tampilInfo();
            System.out.println("Jenis Palette\t: " + jenisPalette);
            System.out.println("Jumlah Warna\t: " + jumlahWarna);
        }
    }
    
