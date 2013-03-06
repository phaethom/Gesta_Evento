/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestao_evento;

/**
 *
 * @author Conilingus
 */
public class Evento {

    private int num_evento;
    private String nome;
    private Data data;
    private float receita;
    private Bilhete bilhete;
    private Agentes agentes;

    public Evento() {
    }

    public Evento(String nome, Data data, float receita, Bilhete bilhete, Agentes agentes, int num_evento) {
        this.nome = nome;
        this.data = data;
        this.receita = receita;
        this.bilhete = bilhete;
        this.agentes = agentes;
        this.num_evento = num_evento;
    }

    public int getNum_evento() {
        return num_evento;
    }

    public void setNum_evento() {
        this.num_evento = ++num_evento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public float getReceita() {
        return receita;
    }

    public void setReceita(float receita) {
        this.receita = receita;
    }

    public Bilhete getBilhete() {
        return bilhete;
    }

    public void setBilhete(Bilhete bilhete) {
        this.bilhete = bilhete;
    }

    public Agentes getAgentes() {
        return agentes;
    }

    public void setAgentes(Agentes agentes) {
        this.agentes = agentes;
    }

    @Override
    public String toString() {
        return "Evento{" + "nome=" + nome + ", data=" + data + ", receita=" + receita + ", bilhete=" + bilhete + ", agentes=" + agentes + '}';
    }

    public void recebe_evento(Evento evt) {
        this.setNome(evt.getNome());
        this.setAgentes(agentes);
        this.setBilhete(bilhete);
        this.setData(data);
        this.setNum_evento();
        this.setReceita(receita);
    }
}
