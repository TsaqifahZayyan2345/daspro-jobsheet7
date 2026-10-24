import java.util.Scanner;
public class parkir30 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        int jenis, durasi;
        int total = 0;

        System.out.println("=== Program Parkir ===");

        System.out.print("Masukkan jenis kendaraan (1 mobil, 2 motor, 0 keluar): ");
        jenis = sc.nextInt();

        while (jenis != 0) {
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }
            } else {
                System.out.println("Jenis kendaraan tidak valid.");
            }

            System.out.print("Masukkan jenis kendaraan (1 mobil, 2 motor, 0 keluar): ");
            jenis = sc.nextInt();
        }

        System.out.println("Total pembayaran parkir: Rp " + total);

        sc.close();
    }
}
    