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
public class Item {
    
    private Integer quantidade;
    private Produto produto;

    public Item(Integer quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }
    
    
    
//<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    //</editor-fold>
    
    public BigDecimal calculaTotal(){
        BigDecimal resultado = new BigDecimal(quantidade);
        return resultado.multiply(produto.getPreco());          
    }

    @Override
    public String toString() {
        return produto.getNome() + " " + quantidade + " x " + "R$ " + produto.getPreco() + " = " + "R$ " + calculaTotal();
    }
    
    
    
}
