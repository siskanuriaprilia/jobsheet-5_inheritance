package AlatMakeUp;

public class IngeritanceMain {
        public static void main(String[] args) {
            System.out.println("=============== Objek Kelas Eyeshadow ===============");
            Eyeshadow eyeshadow = new Eyeshadow("PinkFlash", "Pink", 60000, "Face Palette", 10);
            eyeshadow.tampilEyeshadow();
    
            System.out.println("");
    
            System.out.println("=============== Objek Kelas Cushion ===============");
            Cushion cushion1 = new Cushion("Skintific - Cover All Perfect", "Biru", 95000, "Ivory", true);
            cushion1.tampilCushion();
            System.out.println("---------------------------------------------------");
            Cushion cushion2 = new Cushion("Skintific - Perfect Stay Velvet", "Cream", 105000, "Beige", false);
            cushion2.tampilCushion();
        }
    }

