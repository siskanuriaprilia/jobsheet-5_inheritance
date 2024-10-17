public class Dosen extends Pegawai {
    public String nidn;

    public Dosen() {
        System.out.println(gaji);
        System.out.println("Objek dari class Dosen dibuat");
    }

    public String getInfo(){
        String info = final.getInfo();
        return "NIDN        :  " + this.nidn + "\n";
    }

    public String getAllinfo(){
        String info = super.getInfo();
        info += "NIDN       : " + nidn;
 
        return info;
    }
}