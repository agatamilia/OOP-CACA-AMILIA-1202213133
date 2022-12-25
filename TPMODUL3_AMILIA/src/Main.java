import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        Restaurant rs = new Restaurant();
        int customerID, orderQty;
        try{
            System.out.println("Masukan ID Pembeli:");
            customerID = data.nextInt();
            System.out.println("Masukan banyak pesanan: ");
            orderQty = data.nextInt();

            Thread t1 = new Thread(rs);
            Waiters waiter = new Waiters(customerID, orderQty);
            Thread t2 = new Thread(waiter);

            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch(Exception x){
            System.out.println("Input harus integer hehehe");
        }
    }
}
