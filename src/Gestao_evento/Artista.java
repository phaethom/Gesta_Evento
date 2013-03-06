/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestao_evento;

/**
 *
 * @author Conilingus
 */
public class Artista extends Pessoa {

    private float montante_bruto;
    private float comissao_liq_agente;

    public Artista() {
    }

    public Artista(String nome, int num_fiscal, String morada, int telefone, String e_mail, String sobre_nome) {
        super(nome, num_fiscal, morada, telefone, e_mail, sobre_nome);
    }

    public Artista(float montante_bruto, float comissao_liq_agente) {
        this.montante_bruto = montante_bruto;
        this.comissao_liq_agente = comissao_liq_agente;
    }

   

  

    public float getMontante_bruto() {
        return montante_bruto;
    }

    public void setMontante_bruto(float montante_bruto) {
        this.montante_bruto = montante_bruto;
    }

    public float getComissao_liq_agente() {
        return comissao_liq_agente;
    }

    public void setComissao_liq_agente(float comissao_liq_agente) {
        this.comissao_liq_agente = comissao_liq_agente;
    }

    @Override
    public String toString() {
        String str = super.toString();
        return "Artista{" + str + "montante_bruto=" + montante_bruto + ", comissao_liq_agente=" + comissao_liq_agente + '}';
    }

    /////////////////////////////////////////////////////////////////////////////
    public void Calcula_comissao_agente(float percentagem) {
        this.setComissao_liq_agente(montante_bruto * percentagem);
    }

    public float Calcula_comissao_artista(float percentegem) {
        this.setComissao_liq_agente(montante_bruto * percentegem);
        return this.montante_bruto - this.getComissao_liq_agente();
    }

    public float comissao_artista() {
        return this.montante_bruto - this.comissao_liq_agente;
    }

    public void recebe_artista(Artista art) {
        this.setNome(art.getNome());
        this.setNum_fiscal(art.getNum_fiscal());
        this.setMorada(art.getMorada());
        this.setTelefone(art.getTelefone());
        this.setE_mail(art.getE_mail());

        this.montante_bruto = art.montante_bruto;
        this.comissao_liq_agente = art.getComissao_liq_agente();
    }
}
