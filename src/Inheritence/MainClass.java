/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Inheritence;

/**
 *
 * @author DELL
 */
import java.io.*;
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         // Object : Sub Class
        SubClass sub = new SubClass ("", "SI", 0);
        
        // TODO code application logic here
        BufferedReader ts = new BufferedReader(new InputStreamReader(System.in));
        
        // Input data 
        try{
            System.out.println("Isi nama :");
            String nm = ts.readLine();
            System.out.println("Isi keterangan :");
            String kt = ts.readLine();
            System.out.println("Isi tinggi :");
            int tg = Integer.parseInt(ts.readLine());
            
            //Masukan variabel ke dalam parameter object
            sub = new SubClass (nm, kt, tg);
            
            // Cetak data lengkapIl
            sub.DataLengkap();
            
        } catch  (Exception e){
        
        }
       
        // Panggil method cetak dan halo
        sub.cetak();
        sub.halo();
        
        
    }
    
}
