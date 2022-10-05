/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritence;
// Package super class


/**
 *
 * @author DELL
 */
public class SuperClass {
    // Package super class
    private String nama, keterangan ;
    
    // Constructor 
    
    public SuperClass (String nama, String keterangan){
        this.nama = nama;
        this.keterangan = keterangan;
    }

    // Getter 
    public String getNama() {
        return nama;
    }

    public String getKeterangan() {
        return keterangan;
    }
    

    public void cetak() {
        System.out.println(getNama() +" "+ getKeterangan());
    }
    public void halo (){
        System.out.println("Hello world");
    }
}
