/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.atividade1;

/**
 *
 * @author Ícaro Viníciua &lt;Ícaro Vinícius at ifnmg.edu.br&gt;
 */
public class Telefone {
    
    private Byte ddd;
    private Integer numero;
    private Pessoa pessoa;

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
    public Byte getDdd() {
        return ddd;
    }

    public void setDdd(Byte ddd) {
        this.ddd = ddd;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="ToString">
   
    @Override
    public String toString() {
        String numero_string = Integer.toString(numero);

        if (numero_string.length() == 8) {
            return "(" + ddd + ") " + String.format("%s-%s", numero_string.substring(0, 4), numero_string.substring(4));
        } else if (numero_string.length() == 9) {
            return "(" + ddd + ") " + String.format("%s-%s-%s", numero_string.substring(0, 3), numero_string.substring(3, 6), numero_string.substring(6));
        } else {
            return "(" + ddd + ") " + numero_string;
        }
    }
    //</editor-fold>
    
}
