/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.atividade1;

/**
 *
 * @author Ícaro Viníciua &lt;Ícaro Vinícius at ifnmg.edu.br&gt;
 */
public class Endereco {
    
   private TipoLogradouro tipoLogradouro;
   private String logradouro;
   private Integer numero;
   private String bairro;
   private Integer cep;
   private Pessoa pessoa;
   
   
   //<editor-fold defaultstate="collapsed" desc="Gettets/Setters">
   
    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) throws Exception {
        
        if(logradouro.length()>255){
            throw new Exception("O logradouro tem mais de 255 caracteres");
        }
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) throws Exception {
        
        if(bairro.length()>50){
            throw new Exception("O bairro tem mais de 50 caracteres");
        }
        this.bairro = bairro;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }
    
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
    //</editor-fold>
    
private String formatarCep(Integer cep) {
    String cepFormatado = String.valueOf(cep);

    if (cepFormatado.length() == 8) {
        return cepFormatado.substring(0, 5) + "-" + cepFormatado.substring(5);
    }

    return cepFormatado;
}
    

    //<editor-fold defaultstate="collapsed" desc="ToString">

    @Override
    public String toString() {
    return tipoLogradouro + " " + logradouro + ", " + numero + ", " + bairro + ", " + formatarCep(cep);
}
    //</editor-fold>
    
    
    
}

