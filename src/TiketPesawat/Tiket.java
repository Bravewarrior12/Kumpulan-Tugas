/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiketPesawat;

/**
 *
 * @author Syafal
 */
public class Tiket {
    private String bookID, nik, nama, jns_kelamin, tglBerangkat, tglKembali, kotaAsal;

    public Tiket(String bookID, String nik, String nama, String jns_kelamin, String tglBerangkat, String tglKembali, String kotaAsal) {
        this.bookID = bookID;
        this.nik = nik;
        this.nama = nama;
        this.jns_kelamin = jns_kelamin;
        this.tglBerangkat = tglBerangkat;
        this.tglKembali = tglKembali;
        this.kotaAsal = kotaAsal;
    }

    public String getBookID() {
        int min = 1 ;
        int max = 100;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        String kd = "BK" + Integer.toString(random_int);
        
        return bookID = kd;
    }

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public String getJns_kelamin() {
        return jns_kelamin;
    }

    public String getTglBerangkat() {
        return tglBerangkat;
    }

    public String getTglKembali() {
        return tglKembali;
    }

    public String getKotaAsal() {
        return kotaAsal;
    }
}
