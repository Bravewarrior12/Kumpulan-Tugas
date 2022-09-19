/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasM1;
import java.io.*;
/**
 *
 * @author DELL
 */
public class Maintugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         BufferedReader tg = new BufferedReader (new InputStreamReader (System.in));
         Undika universitas = new Undika () ;
         Undika universitasDS = new Undika () ;
         Mahasiswa ilham = new Mahasiswa ();
         Dosen Byorka = new Dosen ();
         try {
         do{
         System.out.println("===    SICYCA DINAMIKA     ===");
                System.out.println("1. CEK SPP MAHASISWA");
                System.out.println("2. Cek GAJI DOSEN");
                System.out.println("3. KELUAR APLIKASI");
                System.out.print("Masukan pilhan menu = ");
                int pilih = Integer.parseInt(tg.readLine());
                switch(pilih){
                    case 1 :
                        System.out.println("====    MENU DATA MAHASISWA  ===");
                        System.out.print("Nama = ");
                        universitas.setNama(tg.readLine());
                        System.out.print("Alamat = ");
                        universitas.setAlamat(tg.readLine());
                        System.out.println("Masukan NIM = ");
                        ilham.setNim(tg.readLine());
                        System.out.print("Angkatan = ");
                        ilham.setAngkatan(Integer.parseInt(tg.readLine()));
                        System.out.print("Prodi = ");
                        ilham.setProdi(tg.readLine());
                        System.out.print("Semester = ");
                        ilham.setSemester(Integer.parseInt(tg.readLine()));
                        
                        System.out.println("===     Output data mahasiswa       ===");
                        System.out.println("Nama mahasiswa = " +universitas.getNama());
                        System.out.println("Alamat mahasiswa = " +universitas.getAlamat());
                        System.out.println("Angkatan mahasiswa = " +ilham.getAngkatan());
                        System.out.println("NIM mahasiswa = " +ilham.getNim());
                        System.out.println("Prodi mahasiswa = " +ilham.getProdi());
                        System.out.println("Semester mahasiswa = " +ilham.getSemester());
                        System.out.println("Biaya persemester = " +ilham.getBy_semester());
                        System.out.println("Total biaya semua kuliah = " +ilham.getBayar_spp());
                        break;
                        
                    case 2 :
                        System.out.println("===     MENU KARYAWAN       ===");
                        System.out.print("Masukan nama karyawan = " );
                        universitasDS.setNama(tg.readLine());
                        System.out.print("Masukan NIK karyawan= ");
                        Byorka.setNik(tg.readLine());
                        System.out.print("Masukan alamat karyawan = " );
                        universitasDS.setAlamat(tg.readLine());
                        System.out.print("Bagian kakryawan = ");
                        Byorka.setBagan(tg.readLine());
                        System.out.print("Masukan jumlah kehadiran karyawan = ");
                        Byorka.setKehadiran(Integer.parseInt(tg.readLine()));
                        System.out.print("Masukan jumlah gaji perhari = Rp.");
                        Byorka.setGaji_perhari(Integer.parseInt(tg.readLine()));
                        
                        System.out.println("===     OUTPUT DATA KARYAWAN        ===");
                        System.out.println("Nama karyawan = " +universitasDS.getNama());
                        System.out.println("NIK karyawan = " +Byorka.getNik());
                        System.out.println("Alamat karyawan = " +universitasDS.getAlamat());
                        System.out.println("Bagian kerja karyawan = " +Byorka.getBagan());
                        System.out.println("Jumlah kehadiran karayawan = " +Byorka.getKehadiran());
                        System.out.println("Gaji perhari karyawan = " +Byorka.getGaji_perhari());
                        System.out.println("Total gaji seluruh karyawan = " +Byorka.getTot_gj());
                        
                        break;
                        
                    case 3:
                        System.exit(0);
                }
                
                
         }while (true);
         } catch (Exception e){
             System.out.println("Inputan anda salah ");
         }
        System.out.println("TERIMA KASIH SUDAH MEMAKAI APLIKASI SICYCA ONLINE");
    }
    
}
