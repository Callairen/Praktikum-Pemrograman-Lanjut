import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, pegawai> pegawaiMap = pegawai.initializePegawai();

        System.out.println("===============================================");
        System.out.println("|               RENS CORPORATION              |");
        System.out.println("|      Sistem Pengelolaan Gaji Pegawai        |");
        System.out.println("===============================================");
        
        while (true) {
            // Menampilkan menu dalam bentuk tabel
            System.out.println("\n+--------------------------------+");
            System.out.println("|            MENU UTAMA          |");
            System.out.println("+----+---------------------------+");
            System.out.println("| 1  | Cek Data Pegawai          |");
            System.out.println("| 2  | Cek Gaji                  |");
            System.out.println("| 3  | Klaim Bonus               |");
            System.out.println("| 4  | Keluar                    |");
            System.out.println("+----+---------------------------+");

            System.out.print(" Pilih menu (1-4): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  

            if (pilihan == 1) {
                System.out.print("Masukkan password CEO: ");
                String password = scanner.nextLine();
                if (password.equals("CEO123")) {
                    System.out.println("----------------------------------------------------------------------------------------");
                    System.out.printf("%-15s | %-25s | %-25s | %-12s %n", "Kode Pegawai", "Nama", "Jabatan", "Gaji Pokok");
                    System.out.println("----------------------------------------------------------------------------------------");
                    for (pegawai p : pegawaiMap.values()) {
                        p.displayInfo();
                    }
                    System.out.println("----------------------------------------------------------------------------------------");
                } else {
                    System.out.println("Akses ditolak!");
                }
            } 
            
            
            else if (pilihan == 2) {
                System.out.print("Masukkan kode pegawai: ");
                String kode = scanner.nextLine();
                if (pegawaiMap.containsKey(kode)) {
                    pegawai p = pegawaiMap.get(kode);
                    p.displayInfo();
                    System.out.print("Hitung gaji per bulan (1) atau per tahun (2)? ");
                    int tipe = scanner.nextInt();

                    System.out.println(" ");
                    System.out.println();
                    p.displayInfo();
                    System.out.println("Tunjangan       : Rp 1,000,000");
                    System.out.println("Potongan        :" + p.lepotong() );
                    System.out.println("Bonus           : "+ p.lebonus());
                    System.out.println("Total Gaji      : Rp " + String.format("%,.2f", p.hitungGajiTotal(tipe == 2)));
                    System.out.println("Keterangan      : " + p.notes());
                } else {
                    System.out.println("Pegawai tidak ditemukan!");
                }



            } else if (pilihan == 3) {
                System.out.print("Masukkan kode pegawai: ");
                String kode = scanner.nextLine();
                if (pegawaiMap.containsKey(kode)) {
                    pegawai p = pegawaiMap.get(kode);
                    System.out.print("Masukkan jumlah bonus: ");
                    double tambahanBonus = scanner.nextDouble();
                    p.tambahBonus(tambahanBonus);
                    System.out.println("Bonus telah ditambahkan!");
                } else {
                    System.out.println("Pegawai tidak ditemukan!");
                }
            } else if (pilihan == 4) {
                break;
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
        scanner.close();
    }
}
