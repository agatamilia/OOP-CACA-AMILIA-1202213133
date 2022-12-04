public class MainApp {
    public static void main(String[] args) {
        Perangkat perangkat1 = new Perangkat("Adata", 2, 1.80f);
        perangkat1.informasi();
        
        Laptop laptop1 = new Laptop("Seagate",8, 2.40f, true);
        laptop1.informasi();
        laptop1.bukaGame("dota 2");
        laptop1.kirimEmail("amiliaagata@gmail.co.id");
        laptop1.kirimEmail("Milia@gmail.com", "ami@gmail.com");
        
        Handphone handphone1 = new Handphone("Sandisk", 3, 2.20f, false);
        handphone1.informasi();
        handphone1.telfon(62445656);
        handphone1.kirimSMS(62845656);
        handphone1.kirimSMS(62347889, 7939394);

    }
}
