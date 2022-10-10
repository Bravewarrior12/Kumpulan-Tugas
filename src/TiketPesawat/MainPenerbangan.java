/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TiketPesawat;
import java.io.*;
        /**
 *
 * @author Syafal
 */
public class MainPenerbangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LionAir test1 = new LionAir(0, 0, "", "", "", "", "", "", "", "", "", "" );        
        Citilink test2 = new Citilink (0, 0, "", "", "", "", "", "", "", "", "", "" );
        
        try{
            do{
         System.out.println("--PBO Tiket--");
                System.out.println("1. Citilink");
                System.out.println("2. Lion Air");
                System.out.println("3. Keluar Aplikasi");
                System.out.print("Pilih Menu : ");
                 int pilih = Integer.parseInt(br.readLine());
                switch (pilih){
                    case 1:
                    System.out.println("Isi Nama : ");
                    String n = br.readLine();
                    System.out.println("Isi NIK : ");
                    String k = br.readLine();
                    System.out.println("Isi Jenis kelamin : ");
                    String t = br.readLine();
                    System.out.println("Isi kota asal");
                    String ka = br.readLine();
                    System.out.println("Isi kota tujuan : ");
                    String kt = br.readLine();
                    System.out.println("Isi tanggal berangkat");
                    String tb = br.readLine();
                    System.out.println("Isi tanggal kembali");
                    String tk = br.readLine();
                    System.out.println("Isi jumlah orang : ");
                    int or = Integer.parseInt(br.readLine());
                    
                    //Untuk nomor kursi, nomor pesawat, dan nomor booking akan tergenerate sendiri secara acak
                    //Deklarasi ulang
                    test1 = new LionAir(0, or, kt, "", "", "", "", n, t, tb, tk, ka );
                            
                    //Detail pesanan
                    test1.detailTiket();
                    
                        break;
                        
                    case 2:
                      System.out.println("Isi Nama : ");
                    String n1 = br.readLine();
                    System.out.println("Isi NIK : ");
                    String k1 = br.readLine();
                    System.out.println("Isi Jenis kelamin : ");
                    String t1 = br.readLine();
                    System.out.println("Isi kota asal");
                    String ka1 = br.readLine();
                    System.out.println("Isi kota tujuan : ");
                    String kt1 = br.readLine();
                    System.out.println("Isi tanggal berangkat");
                    String tb1 = br.readLine();
                    System.out.println("Isi tanggal kembali");
                    String tk1 = br.readLine();
                    System.out.println("Isi jumlah orang : ");
                    int or1 = Integer.parseInt(br.readLine());
                    
                    //Untuk nomor kursi, nomor pesawat, dan nomor booking akan tergenerate sendiri secara acak
                    //Deklarasi ulang
                    test2 = new Citilink(0, or1, kt1, "", "", "", "", n1, t1, tb1, tk1, ka1 );
                       
                    //Detail pesanan
                    test2.detailTiket();
                    break;
                    
                    case 3:
                        System.exit(0);
                }
            }while(true);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Inputan Salah / Bukan Angka");
        }
    }
}

