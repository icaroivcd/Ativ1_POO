/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.atividade1;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ícaro Viníciua &lt;Ícaro Vinícius at ifnmg.edu.br&gt;
 */
public class Pessoa {
    
    private String nome;
    private LocalDate nascimento;
    private Byte idade;
    private Credencial cred;
    private ArrayList<Endereco> enderecos;
    private ArrayList<Telefone> telefones;
    private ArrayList<Compra> compras;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    
    public Pessoa() {
        this.cred = new Credencial();
        this.enderecos = new ArrayList<>();
        this.telefones = new ArrayList<>();
        this.compras = new ArrayList<>();
    }

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
        
        idade =(byte) nascimento.until(LocalDate.now(),ChronoUnit.YEARS);
    }

    public Byte getIdade() {
        return idade;
    }

    public Credencial getCred() {
        return cred;
    }

    public void setCred(Credencial cred) {
        this.cred = cred;
    }
  
    public List<Endereco> getEnderecos() {
        return enderecos;
    }
    
    
    //</editor-fold>

    public void adicionarEndereco(Endereco endereco) {
        enderecos.add(endereco);
    }
    
    public void adicionarTelefone(Telefone telefone) {
        telefones.add(telefone);
    }
    
    public void adicionarCompra(Compra compra){
           compras.add(compra);
    }
    
    public BigDecimal calculaGastoTotal() {
    BigDecimal gastoTotal = BigDecimal.ZERO;

    for (Compra compra : compras) {
        gastoTotal = gastoTotal.add(compra.calculaTotal());
    }

    return gastoTotal;
}

    
    //<editor-fold defaultstate="collapsed" desc="To string">
    
   
    
    //</editor-fold>

    @Override
public String toString() {
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    StringBuilder sb = new StringBuilder();
    sb.append(nome).append(", ");
    sb.append(nascimento.format(formatter)).append(", ");
    sb.append(idade).append(" anos, ");
    sb.append(cred).append(", ");
    sb.append("Endereços: ").append(enderecos).append(", ");
    sb.append("Telefones: ").append(telefones).append(", ");
    sb.append("Gasto total: R$ ").append(calculaGastoTotal()).append(", ");
    sb.append("Compras: [");
    for (int i = 0; i < compras.size(); i++) {
        Compra compra = compras.get(i);
        sb.append(compra.getNotaFiscal()).append(", R$ ").append(compra.calculaTotal());

        if (i < compras.size() - 1) {
            sb.append("; ");
        }
    }
    sb.append("]");

    return sb.toString();
}
    }

