/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.atividade1;

import java.math.BigDecimal;

/**
 *
 * @author Ícaro Viníciua &lt;Ícaro Vinícius at ifnmg.edu.br&gt;
 */
public class Produto {
    
    private String nome;
    private BigDecimal preco;
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception{
        
        if(nome.length()>150){
            throw new Exception("O nome tem mais de 150 caracteres");
        }
        
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
    
    //</editor-fold>

    @Override
    public String toString() {
        return nome +" R$ " + preco;
    }
    
    
    
}
