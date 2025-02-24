
    import java.util.Scanner;

class Film {
    String judul, genre; 
    int harga;
    
    Film(String judul, String genre, int harga) {
        this.judul = judul;
        this.genre = genre;
        this.harga = harga;

        
    }
}

class Studio {
    String nomorStudio, deskripsi;
    int kapasitas, hargaTambahan;
    String[] jadwal;
    
    Studio(String nomorStudio, String deskripsi, int kapasitas, int hargaTambahan, String[] jadwal) {
        this.nomorStudio = nomorStudio;
        this.deskripsi = deskripsi;
        this.kapasitas = kapasitas;
        this.hargaTambahan = hargaTambahan;
        this.jadwal = jadwal;
    }
}

class Tiket {
    String nomorTiket, film,genre, studio, jamTayang, nomorKursi, namaPenonton;
    int totalHarga;
    
    Tiket(String nomorTiket, String film,String genre, String studio, String jamTayang, String nomorKursi, String namaPenonton, int totalHarga) {
        this.nomorTiket = nomorTiket;
        this.film = film;
        this.genre = genre;
        this.studio = studio;
        this.jamTayang = jamTayang;
        this.nomorKursi = nomorKursi;
        this.namaPenonton = namaPenonton;
        this.totalHarga = totalHarga;
    }

    //ini udh mentok maaf kak 



    void printTiket() {
        System.out.println("===================== Tiket Bioskop ABC =====================");
        System.out.println("============================================================");
        System.out.printf("%-15s : %-40s %n", "Nomor Tiket", nomorTiket);
        System.out.printf("%-15s : %-40s %n", "Nama", namaPenonton);
        System.out.printf("%-15s : %-40s %n", "Film", film);
        System.out.printf("%-15s : %-40s %n", "Genre", genre);
        System.out.printf("%-15s : %-40s %n", "Studio", studio);
        System.out.printf("%-15s : %-40s %n", "Jam Tayang", jamTayang);
        System.out.printf("%-15s : %-40s %n", "Kursi", nomorKursi);
        System.out.printf("%-15s : Rp %-37d %n", "Total Harga", totalHarga);
        System.out.println("============================================================");
        System.out.println("   Terima kasih sudah memesan tiket, enjoy your time at ABC!   ");
        System.out.println("=========== A B C - Your happiness is ours to see ===========");
    }
}

public class bioskop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat datang di Bioskop ABC! Silakan pesan tiket untuk film kesukaanmu!");
        System.out.print("Masukkan Nama Anda: ");
        String nama = input.nextLine();
        
        // Daftar studio dan film
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};
        Film[] films = {
            new Film("Shangri La Frontier", "Anime", 75000),
            new Film("Iron Man 3", "Fiction", 60000),
            new Film("Divergent", "Fiction", 60000),
            new Film("Terrifier", "Thriller", 50000),
            new Film("Haikyuu", "Anime", 50000),
            new Film("Kino no Tabi", "Anime", 50000)
        };

        Studio[] studios = {
            new Studio("001", "Premium", 18, 15000, new String[]{"Shangri La Frontier", "Iron Man 3", "Divergent", "Terrifier", "Haikyuu", "Kino no Tabi"}),
            new Studio("002", "Standar Plus", 24, 10000, new String[]{"Kino no Tabi", "Shangri La Frontier", "Iron Man 3", "Divergent", "Terrifier", "Haikyuu"}),
            new Studio("003", "Standar", 30, 0, new String[]{"Haikyuu", "Kino no Tabi", "Shangri La Frontier", "Iron Man 3", "Divergent", "Terrifier"})
        };
        
        System.out.println("Jadwal Film di Bioskop ABC:\n");
        System.out.printf("%-10s | %-25s | %-25s | %-25s %n", "Hari", "Studio 1", "Studio 2", "Studio 3");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.printf("%-10s | %-25s | %-25s | %-25s %n", "Senin", "Shangri La Frontier", "Kino no Tabi", "Haikyuu");
        System.out.printf("%-10s | %-25s | %-25s | %-25s %n", "Selasa", "Iron Man 3", "Shangri La Frontier", "Kino no Tabi");
        System.out.printf("%-10s | %-25s | %-25s | %-25s %n", "Rabu", "Divergent", "Iron Man 3", "Shangri La Frontier");
        System.out.printf("%-10s | %-25s | %-25s | %-25s %n", "Kamis", "Terrifier", "Divergent", "Iron Man 3");
        System.out.printf("%-10s | %-25s | %-25s | %-25s %n", "Jumat", "Haikyuu", "Terrifier", "Divergent");
        System.out.printf("%-10s | %-25s | %-25s | %-25s %n", "Sabtu", "Kino no Tabi", "Haikyuu", "Terrifier");
        System.out.println("----------------------------------------------------------------------------------------");

        //dari sini milih filmnya
        System.out.println("Pilih Film yang ingin ditonton:");
        for (int i = 0; i < films.length; i++) {
            System.out.println((i + 1) + ". " + films[i].judul);
        }
        
        int pilihanFilm = input.nextInt() - 1;
        Film filmDipilih = films[pilihanFilm];
    
           
        if (pilihanFilm == 0){
            System.out.println("Pilih hari menonton SESUAI KETERSEDIAAN JADWAL 1. Senin | 2. Selasa | 3. Rabu ");
        int pilihanHari = input.nextInt() - 1;
        }
        else if(pilihanFilm == 1){
            System.out.println("Pilih hari menonton SESUAI KETERSEDIAAN JADWAL  2. Selasa | 3. Rabu | 4. Kamis ");
        int pilihanHari = input.nextInt() - 1;
        }
        else if(pilihanFilm==2){
            System.out.println("Pilih hari menonton SESUAI KETERSEDIAAN JADWAL  3. Rabu | 4. Kamis | 5. Jumat ");
        int pilihanHari = input.nextInt() - 1;
        }
        else if (pilihanFilm==3) {
                System.out.println("Pilih hari menonton SESUAI KETERSEDIAAN JADWAL 4. Kamis | 5. Jumat | 6. Sabtu:");
            int pilihanHari = input.nextInt() - 1;
            }
        else if (pilihanFilm==4) {
            System.out.println("Pilih hari menonton SESUAI KETERSEDIAAN JADWAL 1. Senin | 5. Jumat | 6. Sabtu:");
        int pilihanHari = input.nextInt() - 1;
        }
        else if (pilihanFilm==5) {
            System.out.println("Pilih hari menonton SESUAI KETERSEDIAAN JADWAL 1. Senin | 2. Selasa | 6. Sabtu:");
            int pilihanHari = input.nextInt() - 1;  
        }
        
       
        // Menampilkan harga tipe studio
        System.out.println("Pilih Studio:");
        for (int i = 0; i < studios.length; i++) {
            System.out.println((i + 1) + ". " + studios[i].deskripsi + " - Tambahan Harga: Rp " + studios[i].hargaTambahan);
        }
        int pilihStudio = input.nextInt();
        
        String kursi = "";
        // Memilih jam tayang
        System.out.println("Pilih jam tayang: 1. 10:00 AM  2. 01:00 PM  3. 04:00 PM  4. 07:00 PM");
        int pilihanJam = input.nextInt();
        String jamTayang = switch (pilihanJam) {
            case 1 -> "10:00 AM";
            case 2 -> "01:00 PM";
            case 3 -> "04:00 PM";
            case 4 -> "07:00 PM";
            default -> "N/A";
        };
        
        if(pilihStudio==1){
            System.out.println("Pilih nomor kursi :");
            System.out.println("| 1A | 2A | 3A |   | 4A | 5A | 6A |");
            System.out.println("| 1B | 2B | 3B |   | 4B | 5B | 6B |");
            System.out.println("| 1C | 2C | 3C |   | 4C | 5C | 6C |");
        }
       else if (pilihStudio==2){
        System.out.println("Pilih nomor kursi :");
        System.out.println("| 1A | 2A | 3A |   | 4A | 5A | 6A |");
        System.out.println("| 1B | 2B | 3B |   | 4B | 5B | 6B |");
        System.out.println("| 1C | 2C | 3C |   | 4C | 5C | 6C |");
        System.out.println("| 1D | 2D | 3D |   | 4D | 5D | 6D |");
    }
    else if(pilihStudio==3){
        System.out.println("Pilih nomor kursi :");
        System.out.println("| 1A | 2A | 3A |   | 4A | 5A | 6A |");
        System.out.println("| 1B | 2B | 3B |   | 4B | 5B | 6B |");
        System.out.println("| 1C | 2C | 3C |   | 4C | 5C | 6C |");
        System.out.println("| 1D | 2D | 3D |   | 4D | 5D | 6D |");
        System.out.println("| 1E | 2E | 3E |   | 4E | 5E | 6E |");
    }
    kursi = input.next();
        
        // Total harga
        int totalHarga = films[pilihanFilm].harga + studios[pilihStudio].hargaTambahan;
        System.out.println("Total harga: Rp " + totalHarga);
        
        // Konfirmasi pembayaran
        System.out.print("Konfirmasi bayar? (y/n): ");
        char bayar = input.next().charAt(0);
        if (bayar == 'y' || bayar == 'Y') {
            Tiket tiket = new Tiket
            ("00ABC" + studios[pilihStudio].nomorStudio + (pilihanFilm + 1) * 10, filmDipilih.judul,filmDipilih.genre, studios[pilihStudio].deskripsi, jamTayang, kursi, nama, totalHarga);
            tiket.printTiket();
        } else {
            System.out.println("Bayar dulu yah!");
        }
    }
}

