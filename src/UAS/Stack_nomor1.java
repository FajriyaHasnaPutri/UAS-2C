package UAS;

public class Stack_nomor1 {
    public static void main (String [] args){
    stack tumpukan = new stack(10);
    tumpukan.push(12);
    tumpukan.baca();
    tumpukan.push(30);
    tumpukan.baca();
    long nilai1=tumpukan.peek();
    System.out.println("nilai teratas = " + nilai1);
    System.out.println("Nama saya adalah Fajriya Hasna Putri");
    tumpukan.pop();
    System.out.println("nilai yang dihapus = " + nilai1);
    tumpukan.baca();
    System.out.println(" ");
    tumpukan.push(40);
    tumpukan.baca();
    tumpukan.push(50);
    tumpukan.baca();
}
}
