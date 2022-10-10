/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiketPesawat;

/**
 *
 * @author Syafal
 */
public class Citilink extends Tiket{
    private int hrg, jum_penumpang, total;
    private String KotaTujuan, NoPesawat, NoKursi;

    public int getJum_penumpang() {
        return jum_penumpang;
    }

    public String getKotaTujuan() {
        return KotaTujuan;
    }

    public String getNoPesawat() {
        int min = 1 ;
        int max = 40;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        String kd = "LAIR" + Integer.toString(random_int);
        
        return NoPesawat = kd;
    }

    public String getNoKursi() {
        int min = 1 ;
        int max = 100;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        String rand = Integer.toString(random_int);
        
        return NoKursi = rand ;
    }

    public int getHrg() {
        if (super.getKotaAsal().equalsIgnoreCase("Jakarta") ){
            if (KotaTujuan.equalsIgnoreCase("Surabaya") || KotaTujuan.equalsIgnoreCase("yogyakarta")){
                hrg = 750000;
            }
            else if (KotaTujuan.equalsIgnoreCase("Bali") || KotaTujuan.equalsIgnoreCase("Lombok")){
                hrg = 1000000;
            }
            
           else if (KotaTujuan.equalsIgnoreCase("Balikpapan") || KotaTujuan.equalsIgnoreCase("Makasat")){
                hrg = 900000;
            }
    }
        
        else if (super.getKotaAsal().equalsIgnoreCase("Surabaya")){
        if (KotaTujuan.equalsIgnoreCase("Jakarta") || KotaTujuan.equalsIgnoreCase("yogyakarta")){
                return this.hrg = 700000;
            }
            else if (KotaTujuan.equalsIgnoreCase("Bali") || KotaTujuan.equalsIgnoreCase("Lombok")){
                hrg = 700000;
            }
            
           else if (KotaTujuan.equalsIgnoreCase("Balikpapan") || KotaTujuan.equalsIgnoreCase("Makasat")){
                hrg = 850000;
            }
        
        }
        return hrg;
    }

    public int getTotal() {
        
        
        return total = getHrg() * getJum_penumpang();
    }
    

    public Citilink(int hrg, int jum_penumpang, String KotaTujuan, String NoPesawat, String NoKursi, String bookID, String nik, String nama, String jns_kelamin, String tglBerangkat, String tglKembali, String kotaAsal) {
        super(bookID, nik, nama, jns_kelamin, tglBerangkat, tglKembali, kotaAsal);
        this.hrg = hrg;
        this.jum_penumpang = jum_penumpang;
        this.KotaTujuan = KotaTujuan;
        this.NoPesawat = NoPesawat;
        this.NoKursi = NoKursi;
    }
    
    public void detailTiket () {
        System.out.println("--DETAIL TIKET PESANAN--");
        System.out.println("Book ID : " + super.getBookID());
        System.out.println("Nama : " + super.getNama());
        System.out.println("NIK : " + super.getNama());
        System.out.println("Jenis kelamin : " + super.getJns_kelamin());
        System.out.println("Kota asal : " + super.getKotaAsal());
        System.out.println("Kota tujuan : " + getKotaTujuan());
        System.out.println("Tanggal berangkat : " + super.getTglBerangkat());
        System.out.println("Tanggal kembali : " + super.getTglKembali());
        System.out.println("Nomor kursi : " + getNoKursi());
        System.out.println("Nomor pesawat : " + getNoPesawat());
        System.out.println("Total harga : " + getTotal());
    }
    
    
    
}
