public class Waiters implements Runnable{
    private final int customerID;
    private final int orderQty;
    static int foodPrice = 25000;
    
    public Waiters(int customerID, int orderQty) {
        this.customerID = customerID;
        this.orderQty = orderQty;
    }

    @Override
    public void run(){
        while (true) {
            getFood();
            try{
                Thread.sleep(15000);
            }catch(InterruptedException x){
                x.printStackTrace();
            }
        }
    }

    public void orderInfo(){
        System.out.println("======================================================");
        System.out.println("ID pembeli: " + this.customerID);
        System.out.println("Jumlah Pesanan: " + this.orderQty);
        System.out.println("Total Harga: " + this.orderQty * foodPrice);
        System.out.println("======================================================");
    }
    public void getFood() {
        synchronized(Restaurant.getLock()){
            System.out.println("Waiters: Makanan sudah siap di kirim yey :D");
            Restaurant rs = new Restaurant();
            rs.setWaitingForPickup(false);
            if (Restaurant.getfoodNumber() == this.orderQty + 1){
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiters: Memberi tahu chef untuk membuat makanan lainnya \n");
        }
    }
}
