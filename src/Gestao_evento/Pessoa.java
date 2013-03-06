/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestao_evento;

    
    
    
/**
 *
 * @author Conilingus
 */
public class Pessoa {
   private static int numero;
    private String nome;
    private String sobre_nome;
    private int num_fiscal;
    private String morada;
    private int telefone;
    private String e_mail;
   
    /*construtores*/

    public Pessoa() {
    }

    public Pessoa(String nome, int num_fiscal, String morada, int telefone, String e_mail,String sobre_nome) {
        this.nome = nome;
        this.sobre_nome=sobre_nome;
        this.num_fiscal = num_fiscal;
        this.morada = morada;
        this.telefone = telefone;
        this.e_mail = e_mail;
    }

    public static int getNumero() {
        return numero;
    }

    public static void setNumero(int numero) {
        Pessoa.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobre_nome(){
        return sobre_nome;
    }
    public void setSobre_nome(String sobre_nome){
        this.sobre_nome=sobre_nome;
    }
    public int getNum_fiscal() {
        return num_fiscal;
    }

    public void setNum_fiscal(int num_fiscal) {
        this.num_fiscal = num_fiscal;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", sobre_nome=" + sobre_nome + ", num_fiscal=" + num_fiscal + ", morada=" + morada + ", telefone=" + telefone + ", e_mail=" + e_mail + '}';
    }

   
    
}
