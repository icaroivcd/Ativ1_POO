/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.atividade1;

import static java.lang.Boolean.FALSE;

/**
 *
 * @author Ícaro Viníciua &lt;Ícaro Vinícius at ifnmg.edu.br&gt;
 */
public class Credencial {
    
        private String email;
        private String senha;
        private Boolean administrador = FALSE;
        private Pessoa pessoa;
               
//<editor-fold defaultstate="collapsed" desc="Getters/Setters">
        

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) throws Exception {
        
        if(senha.length()>12){
            throw new Exception("A senha tem mais de 12 caracteres");
        }
        this.senha = senha;
    }

    public Boolean getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Boolean administrador) {
        this.administrador = administrador;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    

    
     //</editor-fold>   

    //<editor-fold defaultstate="collapsed" desc="To string">
    
    @Override
    public String toString() {
    String string = administrador ? "Administrador" : "Usuário geral";
    return email + ", " + senha + ", " + string;
}

    
  //</editor-fold>

    


}
