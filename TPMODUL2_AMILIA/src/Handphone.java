public class Handphone extends Perangkat{

    protected Boolean fingerprint;
    public Handphone(String drive, int ram, float processor, Boolean fingerprint) {
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    @Override
    public void informasi(){
        if (this.fingerprint==true){
            System.out.println("\nHandphone ini memiliki drive tipe " +  this.drive + " dengan ram sebesar " + this.ram + " GB dan processor secepat " + this.processor + "Ghz. Selain itu handphone ini memiliki Fingerprint");}
        else{
            System.out.println("\nHandphone ini memiliki drive tipe " +  this.drive + " dengan ram sebesar " + this.ram + " GB dan processor secepat " + this.processor + "Ghz. Selain itu handphone ini TIDAK memiliki Fingerprint");
        }   
    }

    public void telfon(int no_hp){
        System.out.println("Handphone berhasil menyambung telfon ke No " + no_hp);
    }

    public void kirimSMS(int no_hp){
        System.out.println("Handphone berhasil mengirim SMS ke No " + no_hp);
    }
    
    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengirim SMS ke No " + no_hp1 + " dan ke " + no_hp2);
    }
}
