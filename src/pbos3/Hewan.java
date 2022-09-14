/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbos3;

/**
 *
 * @author DELL
 */
public class Hewan {
    //atribut /data 
    private String tipe, suara;
    private int usia;
    
    //setter dari semua variable/attribut/data
    public void setTipe(String t){
    tipe = t;
    }
    
    public void setSuara(String suara){
    this.suara = suara;
    }
    
    public void setUsia(int usia){
    this.usia = usia;
    }
    
    //getter
    //getter biasanya tidak memiliki parameter karena 
    //langsung mengambil data dari setter
    public String getTipe (){
        return tipe;
    }
    
    public String getSuara (){
        return this.suara;
    }
    
    public int getUsia (){
        return this.usia;
    }
    
}
