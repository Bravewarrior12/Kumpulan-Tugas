/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbos3;

/**
 *
 * @author DELL
 */
public class MainClassHewan {
    public static void main(String[] args) {
        //untuk mengakses class Hewan, Burung, Ikan, perlu membuat objek;
        //akses suara dari tipe, suara, dan usia dari class hewan
        Hewan Burung = new Hewan();
        Hewan Ikan = new Hewan();
        
        //akses method dar class Burung dan Ikan 
        Burung B = new Burung();
        Ikan I = new Ikan();
        
        //Cara isi dari suara, tipe, dan usia
        Burung.setTipe("Kakaktua");
        Burung.setSuara("Petok petok");
        Burung.setUsia(10);
        
        Ikan.setTipe("Ikan tarong");
        Ikan.setSuara("Blup blup");
        Ikan.setUsia(1);
        
        //cara ambil dari setter (Hewan, Ikan, dan Burung)
        System.out.println("Aku "+Burung.getTipe() + " Suaraku "+Burung.getSuara()+" Usiaku " +Burung.getUsia() +". " );
        B.terbang();
        
        System.out.println("Aku "+Ikan.getTipe() + " Suaraku "+Ikan.getSuara()+" Usiaku " +Ikan.getUsia() +". " );
        I.berenang();
        
    }
    
}
