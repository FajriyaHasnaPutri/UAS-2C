package UAS;

public class queue_nomor2 {
    public static void main(String[] args){
        queue antrian = new queue(10);
        antrian.enqueue(12);
        antrian.display();
        antrian.enqueue(60);
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek());
        System.out.println("Nama saya adalah Fajriya Hasna Putri");
        System.out.println(" ");
        antrian.enqueue(70);
        antrian.display();
        System.out.println("yang diambil dari antrian = " + antrian.dequeue());
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek());
    }
    
}
