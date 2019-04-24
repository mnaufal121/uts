/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasuts;

/**
 *
 * @author Asus
 */
public class cpu {
    protected String nama;
    protected int kecepatan;
    
    public cpu(String nama, int kecepatan){
        this.nama = nama;
        this.kecepatan = kecepatan;
    }
    public cpu(){
        
    }
    public String getCPUData(){
        return nama+" "+kecepatan;
    }
}
class intel extends cpu{    
    public intel(int kecepatan) {
      this.kecepatan = kecepatan;
      this.nama="Intel";
    }

class amd extends cpu{
    public amd(int kecepatan){
        this.kecepatan = kecepatan;
        this.nama = "AMD";
    }
}
}
