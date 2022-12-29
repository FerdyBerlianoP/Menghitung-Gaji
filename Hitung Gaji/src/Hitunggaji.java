import java.util.Scanner;

public class Hitunggaji {
    public static void main(String[] args) {
        // Deklarasi variabel
        int jamKerja;
        double tarifPerJam;
        double gaji;
        double lembur = 0;
        double pajak = 0;

        // Membuat objek Scanner untuk input dari keyboard
        Scanner input = new Scanner(System.in);

        // Meminta input jam kerja dari pengguna
        System.out.print("Masukkan jumlah jam kerja: ");
        jamKerja = input.nextInt();

        // Meminta input tarif per jam dari pengguna
        System.out.print("Masukkan tarif per jam: ");
        tarifPerJam = input.nextDouble();

        // Menghitung lembur jika jam kerja lebih dari 8 jam
        if (jamKerja > 8) {
            lembur = (jamKerja - 8) * tarifPerJam;
        }

        // Menghitung gaji total
        gaji = jamKerja * tarifPerJam + lembur;

        // Menghitung pajak 10% dari gaji total
        pajak = gaji * 0.1;

        // Menampilkan hasil hitungan gaji
        System.out.println("Gaji yang akan diterima: " + (gaji - pajak));
    }
}
