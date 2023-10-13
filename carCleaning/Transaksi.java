public class Transaksi {
    private int jasa;
    private int team;
    private String keterangan;

    Transaksi(int jasa, int team, String keterangan) {
        this.jasa = jasa;
        this.team = team;
        this.keterangan = keterangan;
    }

    String getJasa() {
        switch (jasa) {
            case 1:
                return "Cuci Mobil";
            case 2:
                return "Salon Mobil Interior";
            case 3:
                return "Salon Mobil Eksterior";
            default:
                return "Jasa tidak valid";
        }
    }
    

    double getBiayaPenyediaJasa() {
        switch (team) {
            case 1:
                return 100000;
            case 2:
                return 200000;
            case 3:
                return 250000;
            default:
                return 0;
        }
    }

    String PenyediaJasa() {
        switch (team) {
            case 1:
                return "Team Sea [2 Orang]";
            case 2:
                return "Team Mountain [4 Orang]";
            case 3:
                return "Team Forest [5 Orang]";
            default:
                return "Jasa tidak valid";
        }
    }


    double getBiayaJasaAlat() {
        return 150000;
        
    }

    double getBiayaBahanJasa() {
        return 60000;
    }

    double getBiayaTransportasi() {
        return 50000;
    }

    double getTotalBiaya() {
        return getBiayaPenyediaJasa() + getBiayaJasaAlat() + getBiayaBahanJasa() + getBiayaTransportasi();
    }

    void printInvoice(Pemesan pemesan) {
        System.out.println("\n");
        System.out.println("Masukan Biaya Penyedia Jasa\t\tRp." + (int) getBiayaPenyediaJasa());
        System.out.println("Masukan Biaya Jasa Alat\t\t        Rp."+ (int) getBiayaJasaAlat());
        System.out.println("Masukan Biaya Bahan Jasa\t\tRp." + (int)getBiayaBahanJasa());
        System.out.println("Masukan Biaya Transportasi\t\tRp." + (int)getBiayaTransportasi());
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("===========================================================================");  
        System.out.println("\n");  
        System.out.println("===========================================================================");  
        System.out.println("Jasa yang di Pesan\t\t" + getJasa());
        System.out.println("Nama penyedia jasa\t\t" + PenyediaJasa());
        System.out.println("Keterangan\t\t\t" + keterangan);
        System.out.println("===========================================================================");
        System.out.println("\n");
        System.out.println("===========================================================================");
        System.out.println("Total Biaya yang di Bayar pemesan Rp. " + (int) getTotalBiaya());
        System.out.println("===========================================================================\n");
        System.out.println("Salam Beraih " + pemesan.getNama() + " Terimakasih");
        System.out.println("\n");
    }
}
