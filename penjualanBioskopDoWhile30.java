import java.util.Scanner;
public class penjualanBioskopDoWhile30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 int jumlahTiket, totalTiket = 0;
        int hargaTiket = 50000;
        double totalPenjualan = 0, diskon, totalHarga, hargaBayar;

        do {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan lagi!");
                continue;
            }

            if (jumlahTiket == 0) {
                break;
            }

            totalHarga = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            } else {
                diskon = 0;
            }

            hargaBayar = totalHarga - (totalHarga * diskon);

            totalTiket += jumlahTiket;
            totalPenjualan += hargaBayar;

            System.out.println("Total harga: Rp " + totalHarga);
            System.out.println("Diskon: " + (diskon * 100) + "%");
            System.out.println("Harga setelah diskon: Rp " + hargaBayar);

        } while (true);

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan tiket: Rp " + totalPenjualan);

        
    }
}