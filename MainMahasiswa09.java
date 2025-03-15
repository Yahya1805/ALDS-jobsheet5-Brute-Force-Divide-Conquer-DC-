// Main.java
public class MainMahasiswa09 {
    public static void main(String[] args) {
        // Data mahasiswa sesuai tabel
        Mahasiswa09[] mahasiswa = {
            new Mahasiswa09("Ahmad", "220101001", 2022, 78, 82),
            new Mahasiswa09("Budi", "220101002", 2022, 85, 88),
            new Mahasiswa09("Cindy", "220101003", 2021, 90, 87),
            new Mahasiswa09("Dian", "220101004", 2021, 76, 79),
            new Mahasiswa09("Eko", "220101005", 2023, 92, 95),
            new Mahasiswa09("Fajar", "220101006", 2020, 88, 85),
            new Mahasiswa09("Gina", "220101007", 2023, 80, 83),
            new Mahasiswa09("Hadi", "220101008", 2020, 82, 84),
        };

        // Menampilkan data mahasiswa
        System.out.println("Data Mahasiswa:");
        for (Mahasiswa09 mhs : mahasiswa) {
            mhs.tampilkanData();
        }

        // Panggil method dari kelas Mahasiswa untuk mencari hasil yang diinginkan
        int maxUTS = Mahasiswa09.cariMaxUTS(mahasiswa, 0, mahasiswa.length - 1);
        System.out.println("\nNilai UTS Tertinggi: " + maxUTS);

        int minUTS = Mahasiswa09.cariMinUTS(mahasiswa, 0, mahasiswa.length - 1);
        System.out.println("Nilai UTS Terendah: " + minUTS);

        double rataRataUAS = Mahasiswa09.hitungRataRataUAS(mahasiswa);
        System.out.println("Rata-rata Nilai UAS: " + rataRataUAS);
    }
}
