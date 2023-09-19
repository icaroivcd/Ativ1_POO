/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.atividade1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ícaro Viníciua &lt;Ícaro Vinícius at ifnmg.edu.br&gt;
 */
public class Compra {
    
    private long notaFiscal;
    private ArrayList<Item> itens;
    private Pessoa cliente;

    public Compra(long notaFiscal,Pessoa cliente) {
        this.notaFiscal = notaFiscal;
        this.itens = new ArrayList<>();
        this.cliente = cliente;
    }
     
//<editor-fold defaultstate="collapsed" desc="Getters/Setters">
   
    public long getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(long notaFiscal) {
        this.notaFiscal = notaFiscal;
    }
    //</editor-fold>
    
    public void adicionarItem(Item item) {
        itens.add(item);
         
}
    
    public BigDecimal calculaTotal() {
        
    BigDecimal total = new BigDecimal(0); 

    for (Item item : itens) {
        total = total.add(item.calculaTotal());
    }

    return total;
}
    
@Override
    public String toString() {
        String notaFiscalString = String.format("%09d", notaFiscal);
        StringBuilder sb = new StringBuilder();

        sb.append("Nota fiscal: ");
        sb.append(notaFiscalString.substring(0, 3));
        sb.append(".");
        sb.append(notaFiscalString.substring(3, 6));
        sb.append(".");
        sb.append(notaFiscalString.substring(6));
        sb.append("; Cliente: ");
        sb.append(cliente.getNome()); // Adicione o nome do cliente

        BigDecimal totalCompra = calculaTotal();
        sb.append("; R$ ");
        sb.append(totalCompra);
        sb.append("; [");

        for (int i = 0; i < itens.size(); i++) {
            Item item = itens.get(i);
            sb.append("Item ");
            sb.append(i + 1);
            sb.append(": ");
            sb.append(item.toString());

            if (i < itens.size() - 1) {
                sb.append("; ");
            }
        }

        sb.append("]");

        return sb.toString();
    } 
}

