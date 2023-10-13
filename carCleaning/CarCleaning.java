import java.util.Scanner;

public class CarCleaning {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pemesan pemesan = new Pemesan();
        pemesan.inputPemesan();

        System.out.println("\nJenis Jasa");
        System.out.println("1. Cuci Mobil");
        System.out.println("2. Salon Mobil Interior");
        System.out.println("3. Salon Mobil Eksterior");
        System.out.print("Pilih Jasa  : ");
        int jasaPilihan = input.nextInt();

        System.out.println("\nTeam Penyedia Jasa");
        System.out.println("1. Team Sea [2 Orang]");
        System.out.println("2. Team Mountain[ 4 Orang]");
        System.out.println("3. Team Forest[ 5 Orang]");
        System.out.print("Pilih Team : ");
        int teamPilihan = input.nextInt();
        input.nextLine(); // Membersihkan newline dari buffer

        System.out.print("Berikan Keterangan Pemesan : ");
        String keterangan = input.nextLine();

        Transaksi transaksi = new Transaksi(jasaPilihan, teamPilihan, keterangan);
        transaksi.printInvoice(pemesan);
    }
}
