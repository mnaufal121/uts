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
public class CPU {
    protected String nama;
    protected int kecepatan;
    
    public CPU(String nama, int kecepatan){
        this.nama = nama;
        this.kecepatan = kecepatan;
    }
    public CPU(){
        
    }
    public String getCPUData(){
        return nama+" "+kecepatan;
    }
}
class intel extends CPU{    
    public intel(int kecepatan) {
      this.kecepatan = kecepatan;
      this.nama="Intel";
    }

class amd extends CPU{
    public amd(int kecepatan){
        this.kecepatan = kecepatan;
        this.nama = "AMD";
    }
}
}
