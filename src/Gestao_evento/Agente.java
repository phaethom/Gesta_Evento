/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestao_evento;

/**
 *
 * @author Conilingus
 */
public class Agente extends Pessoa{
    private float montante;
    private Artista artistas;
    private  Contratos contratos;

    public Agente() {
    }
    
     public Agente(String nome, int num_fiscal, String morada, int telefone, String e_mail, String sobre_nome) {
        super(nome, num_fiscal, morada, telefone, e_mail, sobre_nome);
    }

    public Agente(float montante, Contratos contratos) {
        this.montante = montante;
        this.contratos = contratos;
    }

    public Agente(float montante, Contratos contratos, String nome, int num_fiscal, String morada, int telefone, String e_mail) {
        this.montante = montante;
        this.contratos = contratos;
    }

    public float getMontante() {
        return montante;
    }

    public void setMontante(float montante) {
        this.montante = montante;
    }

    public Artista getArtistas() {
        return artistas;
    }

    public void setArtistas(Artista artistas) {
        this.artistas = artistas;
    }

    public Contratos getContratos() {
        return contratos;
    }

    public void setContratos(Contratos contratos) {
        this.contratos = contratos;
    }

    @Override
    public String toString() {
        String str=super.toString();
        return "Agente {" +str+ "montante=" + montante + ", artistas=" + artistas + ", contratos=" + contratos + '}';
    }
    
     public void recebe_agente(Agente agt){
        this.setNome(agt.getNome());
        this.setNum_fiscal(agt.getNum_fiscal());
        this.setMorada(agt.getMorada());
        this.setTelefone(agt.getTelefone());
        this.setE_mail(agt.getE_mail());
        
       
    }
   
    

   

    
    
}