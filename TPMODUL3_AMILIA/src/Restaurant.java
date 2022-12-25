
public class Restaurant implements Runnable{
    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int foodNumber = 1;

    @Override
    public void run(){
        while (true) {
            makeFood();
            try{
                Thread.sleep(3000);

            }catch(InterruptedException x){
                x.printStackTrace();
            }
        }
    }
    public void setWaitingForPickup (boolean waitingForPickup){
        this. waitingForPickup = waitingForPickup;
    }

    public static int getfoodNumber(){
        return foodNumber;
    }

    public void makeFood(){
        synchronized(Restaurant.lock){
            if (this.waitingForPickup){
                try{
                    System.out.println("Restaurant: Menunggu waiters untuk mengirim makanan");
                    Restaurant.lock.wait();
                } catch (InterruptedException x){
                    x.printStackTrace();
                }
            }
            waitingForPickup = true;
            System.out.println("\nRestaurant: Membuat pesanan ke-"+ foodNumber++);
            Restaurant.lock.notifyAll();
            System.out.println("Restaurant: Memberi tahu waiters untuk mengambil makanan\n");
        }
    }
    public static Object getLock(){
        return lock;
    }
}