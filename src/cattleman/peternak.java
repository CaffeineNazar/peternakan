/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cattleman;

/**
 *
 * @author Hp
 */
public class peternak extends desa {
    
    Integer idPeternak, idDesa, nikPt;
    String namaPt, umurPeternak, kelamin, pekerjaan, alamat, password, dateCreated;
    
    public peternak(){}
    
    public void inputIdPeternak(Integer idPeternak){
        this.idPeternak = idPeternak;
    }
    
    public Integer getIdPeternak(){
        return this.idPeternak;
    }
    
    public void inputNikPt(Integer nikPt){
        this.nikPt = nikPt;
    }
    
    public Integer getNikPt(){
        return this.nikPt;
    }
    
    
    public void inputNamaPt(String namaPt){
        this.namaPt = namaPt;
    }
    
    public String getNamapt(){
        return this.namaPt;
    }
    
    public void inputUmurPt(String umur_peternak){
        this.umurPeternak = umur_peternak;
    }
    
    public String getUmurPt(){
        return this.umurPeternak;
    }
    
    public void inputkelaminPt(String kelamin){
        this.kelamin = kelamin;
    }
    
    public String getkelaminPt(){
        return this.kelamin;
    }
    
    public void inputPekerjaanPt(String pekerjaan){
        this.pekerjaan = pekerjaan;
    }
    
    public String getPekerjaanPt(){
        return this.pekerjaan;
    }
    
    public void inputAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getAlamat(){
        return this.alamat;
    }
    public void inputPasswordPt(String password){
        this.password = password;
    }
    
    public String getPasswordPt(){
        return this.password;
    }
    public void inputDateCreatedPt(String dateCreated){
        this.dateCreated = dateCreated;
    }
    
    public String getDateCreatedPt(){
        return this.dateCreated;
    }
}
