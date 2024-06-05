/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cattleman;

/**
 *
 * @author Hp
 */
public class desa {
    
    Integer idDesa;
    String namaDesa, usernameDs, passwordDs, date_created;
    public desa(){}
    
    public void inputIdDesa(Integer idDesa){
        this.idDesa = idDesa;
    }
    
    public Integer getIdDesa(){
        return this.idDesa;
    }
    
    public void inputNamaDesa(String namaDesa){
        this.namaDesa = namaDesa;
    }
    
    public String getNamaDesa(){
        return this.namaDesa;
    }
    
    public void inputUsernameDs(String usernameDs){
        this.usernameDs = usernameDs;
    }
    
    public String getUsernameDs(){
        return this.usernameDs;
    }
    
    public void inputPasswordDs(String passwordDs){
        this.passwordDs = passwordDs;
    }
    
    public String getPasswordDs(){
        return this.passwordDs;
    }
    
    public void inputDateCreatedDs(String date_created){
        this.date_created = date_created;
    }
    
    public String getDateCreatedDs(){
        return this.date_created;
    }
}
