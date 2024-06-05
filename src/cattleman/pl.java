/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cattleman;

/**
 *
 * @author Hp
 */
public class pl extends upt {
    Integer idPl, idUpt;
    String usernamePl, namaPl, passwordPl;
    
    public pl(){}
    
    public void inputIdPl(Integer idPl){
        this.idPl = idPl;
    }
    
    public Integer getIdPl(){
        return this.idPl;
    }
    
    public void inputUsernamePl(String usernamePl){
        this.usernamePl = usernamePl;
    }
    
    public String getUsernamePl(){
        return this.usernamePl;
    }
    
    public void inputNamaPl(String namaPl){
        this.namaPl = namaPl;
    }
    
    public String getNamaPl(){
        return this.namaPl;
    }
    
    public void inputPasswordPl(String passwordPl){
        this.passwordPl = passwordPl;
    }
    
    public String getPasswordPl(){
        return this.passwordPl;
    }
    
}
