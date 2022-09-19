/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasM1;

/**
 *
 * @author DELL
 */
public class Mahasiswa {
    private String nim, prodi;
    private int spp, angkatan, semester, bayar_spp, by_semester;

    /**
     * @param nim the nim to set
     */
    public void setNim(String nim) {
        this.nim = nim;
    }

    /**
     * @param prodi the prodi to set
     */
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    /**
     * @param spp the spp to set
     */
    public void setSpp(int spp) {
         
        this.spp = spp;
    }

    /**
     * @param angkatan the angkatan to set
     */
    public void setAngkatan(int angkatan) {
       
        this.angkatan = angkatan;
    }

    /**
     * @param semester the semester to set
     */
    public void setSemester(int semester) {
        this.semester = semester;
    }

    /**
     * @return the nim
     */
    public String getNim() {
        return nim;
    }

    /**
     * @return the prodi
     */
    public String getProdi() {
        return prodi;
    }

    /**
     * @return the spp
     */

    /**
     * @return the angkatan
     */
    public int getAngkatan() {
        return angkatan;
    }

    /**
     * @return the semester
     */
    public int getSemester() {
        
        return semester;
    }

    /**
     * @return the bayar_spp
     */
    public int getBayar_spp() {
        if (angkatan >= 2017){
        spp = 15000000;
        bayar_spp = spp * semester;
        }
        else if (angkatan <= 2015){
        spp = 12000000;
        bayar_spp = spp * semester;
        }
        return bayar_spp;
    }

    /**
     * @return the by_semester
     */
    public int getBy_semester() {
         if (angkatan >= 2017){
        spp = 15000000;
        by_semester =  spp;
        }
        else if (angkatan <= 2015){
        by_semester = spp ;
        
        }
        return by_semester;
    }

    /**
     * @param by_semester the by_semester to set
     */
    public void setBy_semester(int by_semester) {
        this.by_semester = by_semester;
    }
  
}
