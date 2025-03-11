import java.util.Scanner;

public class MainPangkat09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah elemen: ");
        int elemen = sc.nextInt();
        Pangkat09[] png = new Pangkat09[elemen];
        for (int i = 0; i < elemen; i++){
            System.out.print("Masukkan nilai basis elemen ke- " + (i+1) + ": ");
            int basis = sc.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke- " + (i+1) + ": ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat09(basis, pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTE FORCE");
        for (Pangkat09 p : png){
            System.out.println("Hasil " + p.nilai + " pangkat " + p.pangkat + " adalah: " + p.pangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("HASIL PANGKAT DIVIDE CONQUER");
        for (Pangkat09 p : png){
            System.out.println("Hasil " + p.nilai + " pangkat " + p.pangkat + " adalah: " + p.pangkatDC(p.nilai, p.pangkat));
        }    
    }
}