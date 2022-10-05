/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanM5;

/**
 *
 * @author DELL
 */
public class SubClass extends SuperClass{
    private String department, title;
    
    // Constructor 
    public SubClass(String department, String title, String nama, String id, String address) {
        super(nama, id, address);
        this.department = department;
        this.title = title;
    }
    
    // Getter atribut subclass
    public String getDepartment() {
        return department;
    }

    public String getTitle() {
        return title;
    }
    
    // Cetak semua data
    public void DataLengkap (){
        System.out.println("Nama : " + super.getNama());
        System.out.println("Alamat : " + super.getAddress());
        System.out.println("Id : " + super.getId());
        System.out.println("Bagian : " + getDepartment ());
        System.out.println("Jabatan : " + getTitle());
        
    }
    
    
    
}
