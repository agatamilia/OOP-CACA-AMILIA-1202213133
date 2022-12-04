public class Laptop extends Perangkat{
    protected Boolean webcam;

    public Laptop(String drive, int ram, float processor, Boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }
    public void informasi(){
        if (this.webcam==true){
            System.out.println("Laptop diketahui memiliki drive tipe " + this.drive + " dengan ram sebesar "+ this.ram+ " dan processor secepat "+this.processor+" Ghz. Selain itu laptop ini juga memiliki Webcam");
        } else{
            System.out.println("Laptop tidak diketahui memiliki drive tipe " + this.drive + " dengan ram sebesar "+ this.ram+ "dan processor secepat "+this.processor+" Ghz. Selain itu laptop ini tidak memiliki Webcam");
        }

    }
    public void bukaGame(String nama_game){
        System.out.println("Laptop berhasil membuka game "+nama_game);
    }
    public void kirimEmail(String email){
        System.out.println("Laptop berhasil mengirim Email ke " + email);
    }
    public void kirimEmail(String email1, String email2){
        System.out.println("Laptop berhasil mengirim Email ke " + email1 + " dan ke " + email2);
    }
    
}
