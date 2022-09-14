/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassObject2;

public class Samsung {
    private int harga, jumlah, total;
    
    //setter
    public void setHarga (int hrg){
    harga = hrg;
    }
    
     public void setJumlah (int jum){
    jumlah = jum;
    }
     //getter
     
     public int getHarga(){
         return harga;
     }
     
     public int getJumlah(){
         return jumlah;
     }
     
     //custom
     public int getBeli (){
         total = getHarga () * getJumlah ();
         return total;
     }
     
}
