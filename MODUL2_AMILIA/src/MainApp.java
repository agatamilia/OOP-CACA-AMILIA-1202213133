public class MainApp {
    public static void main(String[] args) {
        TransportasiAir transportasiAir1 = new TransportasiAir(4, 20000); 
        transportasiAir1.informasi();
        transportasiAir1.berlayar();
        transportasiAir1.berlabuh();
        
        Sampan sampan = new Sampan(20, 5000, 2); 
        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();
        sampan.berlabuh(2);

        Kapal kapal = new Kapal(50, 10000, "Diesel");
        kapal.informasi();
        kapal.berlayar();
        kapal.berlayar(20);
        kapal.berlabuh();
    }
//AMILIA AGATA 1202213133    
}
