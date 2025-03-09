import java.util.LinkedHashMap;
import java.util.Map;

enum Jabatan {
    DIREKTUR, ENGINEERING_MANAGER, MARKETING_MANAGER, SOFTWARE_ENGINEERING_LEAD, QUALITY_ASSURANCE,
    DIGITAL_MARKETING, SALES, STAFF, INTERN;
}

public class pegawai {
    private String kodePegawai;
    private String nama;
    private Jabatan jabatan;
    private double gajiPokok;
    private double tunjangan;
    private double potongan;
    private double bonus;


    public pegawai(String kode, String nama, Jabatan jabatan, double gajiPokok, double tunjangan, double bonus, double potongan) {
        this.kodePegawai = kode;
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
        this.potongan = potongan;
        this.bonus = bonus;
    }

    public static Map<String, pegawai> initializePegawai() {
        Map<String, pegawai> pegawaiMap = new LinkedHashMap<>();
        
        pegawaiMap.put("DIR0001", new pegawai("DIR0001", "Brando Franco", Jabatan.DIREKTUR, 10000000, 1000000, 0, 0));
        pegawaiMap.put("ENG0001", new pegawai("ENG0001", "Upi Halimawan", Jabatan.ENGINEERING_MANAGER, 7500000, 1000000, 0, 0));
        pegawaiMap.put("MKT0001", new pegawai("MKT0001", "Alfachri", Jabatan.MARKETING_MANAGER, 7500000, 1500000, 0, 0));
        pegawaiMap.put("SEL0001", new pegawai("SEL0001", "Manca Ilyasa", Jabatan.SOFTWARE_ENGINEERING_LEAD, 5000000, 1000000, 0,0));
        pegawaiMap.put("SEL0002", new pegawai("SEL0002", "Dapid Ge", Jabatan.SOFTWARE_ENGINEERING_LEAD, 5000000, 1000000, 0,0));
        pegawaiMap.put("QA0001", new pegawai("QA0001", "Dian Saputra", Jabatan.QUALITY_ASSURANCE, 5000000, 1000000, 0,0));
        pegawaiMap.put("QA0002", new pegawai("QA0002", "Rizky Pratama", Jabatan.QUALITY_ASSURANCE, 5000000, 1000000, 0,0));
        pegawaiMap.put("DM0001", new pegawai("DM0001", "Tob Tobitob Tob", Jabatan.DIGITAL_MARKETING, 3500000, 1000000, 0,0));
        pegawaiMap.put("DM0002", new pegawai("DM0002", "Ujang Kedu", Jabatan.DIGITAL_MARKETING, 3500000, 1000000, 0,0));
        pegawaiMap.put("SLS0001", new pegawai("SLS0001", "Joko Susanto", Jabatan.SALES, 3500000, 1000000, 0,0));
        pegawaiMap.put("SLS0002", new pegawai("SLS0002", "Selena Gomez", Jabatan.SALES, 3500000, 1000000, 0,0));
        pegawaiMap.put("STF0001", new pegawai("STF0001", "Amba", Jabatan.STAFF, 3500000, 1000000, 500000,0));
        pegawaiMap.put("INT0001", new pegawai("INT0001", "Windy Batubara", Jabatan.INTERN, 1500000, 1000000, 0,750000));
        
        return pegawaiMap;
    }

        String notes, lebonus, lepotong;
        
    public String notes() {
        if (kodePegawai.equals("STF0001")) {
            notes = "Terimakasih MAS AMBA sudah bekerja keras!"; 
        } else if (kodePegawai.equals("INT0001")) {
            notes = "Kecacatan Kerja, pegawai adalah seekor anomali!";
        } else {
            notes = "Terimakasih sudah bekerja selayaknya pegawai, besok kerja lagi yang bener.";
        }


        return notes;
    }
   
    public String lebonus() {
        if (kodePegawai.equals("STF0001")) {
            lebonus = "Rp 500.000"; 
        } else {
            lebonus = "Rp 0";
        }


        return lebonus;
    }
   
    public String lepotong() {
        if (kodePegawai.equals("INT0001")) {
            lepotong = " 50% Gaji Pokok";
        } else {
            lepotong = " Rp 0";
        }


        return lepotong;
    }
   

    public double hitungGajiTotal(boolean tahunan) {
        double totalGajiBulanan = gajiPokok + bonus - potongan;
    
        
        if (tahunan) {
            return (totalGajiBulanan * 12) + tunjangan;
        } else {
            return totalGajiBulanan;
        }
    }
    

    public void displayInfo() {
        System.out.printf("%-15s | %-25s | %-25s | Rp%,12.2f %n", kodePegawai, nama, jabatan, gajiPokok);
    }
   
    public void tambahBonus(double tambahan) {
        this.bonus += tambahan;
    }
}