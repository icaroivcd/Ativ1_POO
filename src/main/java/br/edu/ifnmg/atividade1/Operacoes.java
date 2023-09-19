/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifnmg.atividade1;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author Ícaro Viníciua &lt;Ícaro Vinícius at ifnmg.edu.br&gt;
 */
public class Operacoes {

    public static void main(String[] args) {
        
      
       //<editor-fold defaultstate="collapsed" desc="Credenciais">
       
        Credencial c1 = new Credencial();
        Credencial c2 = new Credencial();
        Credencial c3 = new Credencial();
       
        c1.setEmail("ana.zaira@mail.com");
        try {
            c1.setSenha("asdf123");
        } catch (Exception e) {
            System.out.println("!! "+e.getMessage());
        }
        c1.setAdministrador(Boolean.TRUE);
        
        c2.setEmail("beatriz.yana@mail.com,");
        try {
            c2.setSenha("123asdf,");
        } catch (Exception e) {
            System.out.println("!! "+e.getMessage());
        }
        c2.setAdministrador(Boolean.FALSE);
        
        c3.setEmail("cecilia.xerxes@mail.com");
        try {
            c3.setSenha("123123");
        } catch (Exception e) {
            System.out.println("!! "+e.getMessage());
        }
        c3.setAdministrador(Boolean.FALSE);
       
       //</editor-fold>
        
       //<editor-fold defaultstate="collapsed" desc="Pessoas">
       
       Pessoa p1 = new Pessoa();
       Pessoa p2 = new Pessoa();
       Pessoa p3 = new Pessoa();
       
       p1.setNome("Ana Zaira");
       p1.setNascimento(LocalDate.of(2000,01,29)); 
       p1.setCred(c1);
       
       p2.setNome("Beatriz Yana");
       p2.setNascimento(LocalDate.of(1999,01,28)); 
       p2.setCred(c2);
       
       p3.setNome("Cecília Xerxes");
       p3.setNascimento(LocalDate.of(1998,01,27)); 
       p3.setCred(c3);
       
        //</editor-fold>
       
       //<editor-fold defaultstate="collapsed" desc="Enderecos">
        
       Endereco e1 = new Endereco();
       Endereco e1_2 = new Endereco();
       Endereco e2 = new Endereco();
       Endereco e3 = new Endereco();
       Endereco e3_2 = new Endereco();
       Endereco e3_3 = new Endereco();
       
       //<editor-fold defaultstate="collapsed" desc="Endereco 1">
      
       e1.setTipoLogradouro(TipoLogradouro.RUA);
        try {
            e1.setLogradouro("A1");
        } catch (Exception ex) {
            System.out.println("!! "+ex.getMessage());
        }
       e1.setNumero(1011);
        try {
            e1.setBairro("Santa Ana I");
        } catch (Exception ex) {
            System.out.println("!! "+ex.getMessage());
        }
        e1.setCep(39401111);
        
       e1_2.setTipoLogradouro(TipoLogradouro.RUA);
        try {
            e1_2.setLogradouro("A2");
        } catch (Exception ex) {
            System.out.println("!! "+ex.getMessage());
        }
       e1_2.setNumero(1012);
        try {
            e1_2.setBairro("Santa Ana II");
        } catch (Exception ex) {
            System.out.println("!! "+ex.getMessage());
        }
        e1_2.setCep(39401112);
        
        p1.adicionarEndereco(e1);
        p1.adicionarEndereco(e1_2);
        
        //</editor-fold>
       
       //<editor-fold defaultstate="collapsed" desc="Endereco 2">
       
        e2.setTipoLogradouro(TipoLogradouro.RUA);
        try {
            e2.setLogradouro("B");
        } catch (Exception ex) {
            System.out.println("!! "+ex.getMessage());
        }
       e2.setNumero(2022);
        try {
            e2.setBairro("Santa Beatriz");
        } catch (Exception ex) {
            System.out.println("!! "+ex.getMessage());
        }
        e2.setCep(39402222); 
        
        p2.adicionarEndereco(e2);
        
        //</editor-fold>
        
       //<editor-fold defaultstate="collapsed" desc="Endereco 3">
       
         e3.setTipoLogradouro(TipoLogradouro.RUA);
        try {
            e3.setLogradouro("C1");
        } catch (Exception ex) {
            System.out.println("!! "+ex.getMessage());
        }
       e3.setNumero(3031);
        try {
            e3.setBairro("Santa Cecilia I");
        } catch (Exception ex) {
            System.out.println("!! "+ex.getMessage());
        }
        e3.setCep(39403331); 
        
         e3_2.setTipoLogradouro(TipoLogradouro.RUA);
        try {
            e3_2.setLogradouro("C2");
        } catch (Exception ex) {
            System.out.println("!! "+ex.getMessage());
        }
       e3_2.setNumero(3032);
        try {
            e3_2.setBairro("Santa Cecilia II");
        } catch (Exception ex) {
            System.out.println("!! "+ex.getMessage());
        }
        e3_2.setCep(39403332); 
        
         e3_3.setTipoLogradouro(TipoLogradouro.RUA);
        try {
            e3_3.setLogradouro("C3");
        } catch (Exception ex) {
            System.out.println("!! "+ex.getMessage());
        }
       e3_3.setNumero(3033);
        try {
            e3_3.setBairro("Santa Cecilia III");
        } catch (Exception ex) {
            System.out.println("!! "+ex.getMessage());
        }
        e3_3.setCep(39403333); 
        
        p3.adicionarEndereco(e3);
        p3.adicionarEndereco(e3_2);
        p3.adicionarEndereco(e3_3);
        
        
       //</editor-fold> 
        
       //</editor-fold>
       
       //<editor-fold defaultstate="collapsed" desc="Telefone">
       
       //<editor-fold defaultstate="collapsed" desc="Telefone1">
       
       Telefone t1 = new Telefone();
       
       t1.setDdd((byte)38);
       t1.setNumero(12341234);
       
       p1.adicionarTelefone(t1);
       
       
       //</editor-fold>
       
       //<editor-fold defaultstate="collapsed" desc="Telefone2">
       
       Telefone t2_1 = new Telefone();
       Telefone t2_2 = new Telefone();
       
       
       t2_1.setDdd((byte)38);
       t2_1.setNumero(23452345);
       
       t2_2.setDdd((byte)38);
       t2_2.setNumero(923452345);
       
       p2.adicionarTelefone(t2_1);
       p2.adicionarTelefone(t2_2);
       
       
       //</editor-fold>
       
       //<editor-fold defaultstate="collapsed" desc="Telefone3">
       
       Telefone t3_1 = new Telefone();
       Telefone t3_2 = new Telefone();
       
       
       t3_1.setDdd((byte)38);
       t3_1.setNumero(934563456);
       
       t3_2.setDdd((byte)38);
       t3_2.setNumero(834563456);
       
       p3.adicionarTelefone(t3_1);
       p3.adicionarTelefone(t3_2);
       
       
       //</editor-fold>
       
       
       
       
       
       //</editor-fold>
       
       //<editor-fold defaultstate="collapsed" desc="Produtos">
       
       Produto prod_1 = new Produto();
       Produto prod_2 = new Produto();
       Produto prod_3 = new Produto();
       Produto prod_4 = new Produto();
       Produto prod_5 = new Produto();
       
       //Produto 1
        try {
            prod_1.setNome("Abacaxi");
        } catch (Exception ex) {
            System.out.println("!! "+ex.getMessage());
        }
        prod_1.setPreco(new BigDecimal ("1.99"));
        
        //Produto 2
        try {
            prod_2.setNome("Banana");
        } catch (Exception ex) {
            System.out.println("!! "+ex.getMessage());
        }
        prod_2.setPreco(new BigDecimal ("2.99"));
        
        //Produto 3
        try {
            prod_3.setNome("Caqui");
        } catch (Exception ex) {
            System.out.println("!! "+ex.getMessage());
        }
        prod_3.setPreco(new BigDecimal ("3.99"));
        
        //Produto 4
        try {
            prod_4.setNome("Damasco");
        } catch (Exception ex) {
            System.out.println("!! "+ex.getMessage());
        }
        prod_4.setPreco(new BigDecimal ("4.99"));
        
        //Produto 5
        try {
            prod_5.setNome("Espinafre");
        } catch (Exception ex) {
            System.out.println("!! "+ex.getMessage());
        }
        prod_5.setPreco(new BigDecimal ("5.99"));
   
        //</editor-fold>
       
       //<editor-fold defaultstate="collapsed" desc="Compras">
        
        
        //Pessoa 1
        
        String numeroString = "000.100.101";
        String numeroSemPontos = numeroString.replace(".", "");
        long numeroLong = Long.parseLong(numeroSemPontos);
        
        Compra cop_1 = new Compra(numeroLong,p1);
        
        Item i1 = new Item(11,prod_1);
        cop_1.adicionarItem(i1);
        
        p1.adicionarCompra(cop_1);
        
        //Pessoa 2
        
         String numero_String = "000.200.202";
        String numero_SemPontos = numero_String.replace(".", "");
        long numero_Long = Long.parseLong(numero_SemPontos);
        
        Compra cop_2 = new Compra(numero_Long,p2);
        
        Item i2 = new Item(11,prod_2);
        cop_2.adicionarItem(i2);
        Item i3 = new Item(12,prod_3);
        cop_2.adicionarItem(i3);
        Item i4 = new Item(13,prod_4);
        cop_2.adicionarItem(i4);
        Item i5 = new Item(14,prod_5);
        cop_2.adicionarItem(i5);
        
        p2.adicionarCompra(cop_2);
        
         String numero_String1 = "000.200.212";
        String numero_SemPontos1 = numero_String1.replace(".", "");
        long numero_Long1 = Long.parseLong(numero_SemPontos1);
        Compra cop_2_2 = new Compra(numero_Long1,p2);
        
        Item i6 = new Item(21,prod_1);
        cop_2_2.adicionarItem(i6);
        Item i7 = new Item(22,prod_3);
        cop_2_2.adicionarItem(i7);
        Item i8 = new Item(23,prod_5);
        cop_2_2.adicionarItem(i8);
        
        p2.adicionarCompra(cop_2_2);
   
        
        //Pessoa 3
        
        String numeroString3 = "000.300.303";
        String numeroSemPontos3 = numeroString3.replace(".", "");
        long numeroLong3 = Long.parseLong(numeroSemPontos3);
        
        Compra cop_3 = new Compra(numeroLong3,p3);
        
        Item i9 = new Item(31,prod_1);
        cop_3.adicionarItem(i9);
        Item i10 = new Item(32,prod_3);
        cop_3.adicionarItem(i10);
        Item i11 = new Item(33,prod_5);
        cop_3.adicionarItem(i11);
        
        p3.adicionarCompra(cop_3);

        //</editor-fold>
       
       
        System.out.println(">> "+c1.toString());
        System.out.println(">> "+e1.toString());
        System.out.println(">> "+e1_2.toString());
        System.out.println(">> "+t1.toString());
        System.out.println(">> "+i1.toString());
        System.out.println(">> "+cop_1.toString());
        System.out.println(">> "+p1.toString());
        
        System.out.println("------------------------------------------------------------");
        
        System.out.println(">> "+c2.toString());
        System.out.println(">> "+e2.toString());
        System.out.println(">> "+t2_1.toString());
        System.out.println(">> "+t2_2.toString());
        System.out.println("Itens da compra 1:");
        System.out.println(">> "+i2.toString());
        System.out.println(">> "+i3.toString());
        System.out.println(">> "+i4.toString());
        System.out.println(">> "+i5.toString());
        System.out.println("+++++++++++++");
        System.out.println("Itens da compra 2:");
        System.out.println(">> "+i6.toString());
        System.out.println(">> "+i7.toString());
        System.out.println(">> "+i8.toString());
        System.out.println("+++++++++++++");
        System.out.println(">> "+cop_2.toString());
        System.out.println(">> "+cop_2_2.toString());
        System.out.println(">> "+p2.toString());
        
        System.out.println("------------------------------------------------------------");
        
        System.out.println(">> "+c3.toString());
        System.out.println(">> "+e3.toString());
        System.out.println(">> "+e3_2.toString());
        System.out.println(">> "+e3_3.toString());
        System.out.println(">> "+t3_1.toString());
        System.out.println(">> "+t3_2.toString());
        System.out.println(">> "+i9.toString());
        System.out.println(">> "+i10.toString());
        System.out.println(">> "+i11.toString());
        System.out.println(">> "+cop_3.toString());
        System.out.println(">> "+p3.toString());
        
        System.out.println("------------------------------------------------------------");
        
        System.out.println("Produtos: ");
        System.out.println(">> "+prod_1.toString());
        System.out.println(">> "+prod_2.toString());
        System.out.println(">> "+prod_3.toString());
        System.out.println(">> "+prod_4.toString());
        System.out.println(">> "+prod_5.toString());
    }
}
