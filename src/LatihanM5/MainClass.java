/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LatihanM5;

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
        // TODO code application logic here
         BufferedReader ts = new BufferedReader(new InputStreamReader(System.in));
         
        // Object sub class
        SubClass Ilham = new SubClass("", "", "", "", "");
        
        // Input data
         try{
            System.out.print("Isi bagian :");
            String dp = ts.readLine();
            System.out.print("Isi jabatan :");
            String tl = ts.readLine();
            System.out.print("Isi nama :");
             String nm = ts.readLine();
            System.out.print("Isi id :");
             String id = ts.readLine();
            System.out.print("Isi alamat :");
            String al = ts.readLine();
            
            //Masukan variabel ke dalam parameter object
            Ilham = new SubClass (dp, tl, nm, id, al);
            
            // Cetak data lengkapIl
            Ilham.DataLengkap();
            
        } catch  (Exception e){
        
        }
    }
    
}
