/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ClassObject2;
import java.io.*;
public class MainHP {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        Handphone hp = new Handphone();
        Samsung samsung = new Samsung();
        try{
            do {
                System.out.println("PBO CELL");
                System.out.println("1. Isi data HP");
                System.out.println("2. Beli HP");
                System.out.println("3. Keluar aplikasi");
                int pilih = Integer.parseInt(br.readLine());
                switch(pilih){
                    case 1:
                        System.out.println("-Isi data-");
                        System.out.print("Masukan tipe :");
                        hp.setTipe(br.readLine());
                        System.out.println("Mauskan warna");
                        hp.setWarna(br.readLine());
                        
                        break;
                    case 2 :
                        break;
                    case 3 :
                        System.exit(0);
                }
            }while (true);
        } catch (Exception e){
            System.out.println("Inputan anda salah");
        }
    }
    
}
