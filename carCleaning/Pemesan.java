import java.util.Scanner;

public class Pemesan {
    String nama, alamat, telpon, email, keterangan;

    void inputPemesan() {
        Scanner input = new Scanner(System.in);
        System.out.println("================================");
        System.out.println("---------Car Cleaning-----------");
        System.out.println("-----Anda Pesan Kami Datang-----");
        System.out.println("================================\n");

        System.out.println("Masukkan Data Pemesanan");
        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();
        System.out.print("Masukkan Alamat: ");
        alamat = input.nextLine();
        System.out.print("Masukkan No. Tlp : ");
        telpon = input.nextLine();
        System.out.print("Masukkan Email : ");
        email = input.nextLine();
    }

    String getNama() {
        return nama;
    }

    String getAlamat() {
        return alamat;
    }

    String getTelpon() {
        return telpon;
    }

    String getEmail() {
        return email;
    }
}
