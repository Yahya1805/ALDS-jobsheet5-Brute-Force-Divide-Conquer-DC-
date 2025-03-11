import java.util.Scanner;
public class MainSum09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah elemen: ");
        int elemen = sc.nextInt();
        Sum09 sm = new Sum09(elemen);
        for (int i = 0; i < elemen; i++){
            System.out.print("Masukkan nilai keuntungan elemen ke- " + (i+1) + ": ");
            sm.keuntungan[i] = sc.nextDouble();
        }
        System.out.println("HASIL SUM BRUTE FORCE");
        System.out.println("Total keuntungan: " + sm.totalBF());
        System.out.println("HASIL SUM DIVIDE CONQUER");
        System.out.println("Total keuntungan: " + sm.totalDC(sm.keuntungan, 0, elemen-1));
    }
}
