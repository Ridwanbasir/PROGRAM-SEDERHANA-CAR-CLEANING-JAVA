import java.util.Scanner;

public class CarCleaning {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pemesan pemesan = new Pemesan();
        pemesan.inputPemesan();

        int jasaPilihan;
        int teamPilihan;

        do {
            System.out.println("\nJenis Jasa");
            System.out.println("1. Cuci Mobil");
            System.out.println("2. Salon Mobil Interior");
            System.out.println("3. Salon Mobil Eksterior");
            System.out.print("/nPilih Jasa  : ");
            jasaPilihan = input.nextInt();

            if (jasaPilihan < 1 || jasaPilihan > 3) {
                System.out.println("Pilihan jasa tidak valid. Harap pilih antara 1, 2, atau 3.");
            }
        } while (jasaPilihan < 1 || jasaPilihan > 3);

        do {
            System.out.println("\nTeam Penyedia Jasa");
            System.out.println("1. Team Sea [2 Orang]");
            System.out.println("2. Team Mountain [4 Orang]");
            System.out.println("3. Team Forest [5 Orang]");
            System.out.print("\nPilih Team : ");
            teamPilihan = input.nextInt();

            if (teamPilihan < 1 || teamPilihan > 3) {
                System.out.println("Pilihan tim penyedia jasa tidak valid. Harap pilih antara 1, 2, atau 3.");
            }
        } while (teamPilihan < 1 || teamPilihan > 3);

        input.nextLine(); // Membersihkan newline dari buffer

        System.out.print("\nBerikan Keterangan Pemesan : ");
        String keterangan = input.nextLine();

        Transaksi transaksi = new Transaksi(jasaPilihan, teamPilihan, keterangan);
        transaksi.printInvoice(pemesan);
    }
}
