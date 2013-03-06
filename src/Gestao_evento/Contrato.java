/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestao_evento;

/**
 *
 * @author Conilingus
 */
public class Contrato {
    private Data data_inicio;
    private Data data_fim;
    private Artista artista;
    private float percentagem;

    public Contrato() {
    }

    public Contrato(Data data_inicio, Data data_fim, Artista artista, float percentagem) {
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.artista = artista;
        this.percentagem = percentagem;
    }

    public Data getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Data data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Data getData_fim() {
        return data_fim;
    }

    public void setData_fim(Data data_fim) {
        this.data_fim = data_fim;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public float getPercentagem() {
        return percentagem;
    }

    public void setPercentagem(float percentagem) {
        this.percentagem = percentagem;
    }

    @Override
    public String toString() {
        return "Contrato{" + "data_inicio=" + data_inicio + ", data_fim=" + data_fim + ", artista=" + artista + ", percentagem=" + percentagem + '}';
    }
    
    
    
}
