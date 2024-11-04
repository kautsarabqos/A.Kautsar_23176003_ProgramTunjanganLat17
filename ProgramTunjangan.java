public class ProgramTunjangan {

    // Fungsi untuk menghitung total gaji
    public static double hitungGaji(double gajiPokok, double tunjangan) {
        return gajiPokok + tunjangan;
    }

    public static void main(String[] args) {
        // Data input
        double gajiPokok = 6000000; // Gaji pokok per bulan
        double tunjangan = 2100000; // Tunjangan

        // Menghitung total gaji
        double totalGaji = hitungGaji(gajiPokok, tunjangan);

        // Menampilkan hasil perhitungan
        System.out.println("========Hasil Perhitungan Gaji Anda=========");
        System.out.printf("Gaji Pokok   : Rp %.1f%n", gajiPokok);
        System.out.printf("Tunjangan    : Rp %.1f%n", tunjangan);
        System.out.printf("Total Gaji   : Rp %.1f%n", totalGaji);
        System.out.println("(Developed by Rizki Adam Kurniawan)");
    }
}