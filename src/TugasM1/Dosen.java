/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasM1;

/**
 *
 * @author DELL
 */
public class Dosen {
    private String nik;
    private String bagan;
    private int kehadiran;
    private int gaji_perhari;
    private int tot_gj;

    /**
     * @param nik the nik to set
     */
    public void setNik(String nik) {
        this.nik = nik;
    }

    /**
     * @param bagan the bagan to set
     */
    public void setBagan(String bagan) {
        this.bagan = bagan;
    }

    /**
     * @param kehadiran the kehadiran to set
     */
    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    /**
     * @param gaji_perhari the gaji_perhari to set
     */
    public void setGaji_perhari(int gaji_perhari) {
        this.gaji_perhari = gaji_perhari;
    }

    /**
     * @return the nik
     */
    public String getNik() {
        return nik;
    }

    /**
     * @return the bagan
     */
    public String getBagan() {
        return bagan;
    }

    /**
     * @return the kehadiran
     */
    public int getKehadiran() {
        return kehadiran;
    }

    /**
     * @return the gaji_perhari
     */
    public int getGaji_perhari() {
        return gaji_perhari;
    }

    /**
     * @return the tot_gj
     */
    public int getTot_gj() {
        return tot_gj = this.gaji_perhari * this.kehadiran ;
    }
}
