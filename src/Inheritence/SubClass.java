/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritence;

/**
 *
 * @author DELL
 */
public class SubClass extends SuperClass {
    private int tinggi;
    // Constructor berparameter
    public SubClass(String nama, String keterangan, int tinggi) {
        super(nama, keterangan);
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }
    
    // Data Lengkap
    public void DataLengkap(){
        System.out.println(super.getNama() + " " + super.getKeterangan() + " " + getTinggi());
    }
    
    @Override
    public void cetak() {
        super.cetak(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void halo() {
        super.halo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

   
}
