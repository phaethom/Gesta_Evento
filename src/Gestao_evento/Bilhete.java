/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestao_evento;

/**
 *
 * @author Conilingus
 */
public class Bilhete {
    private float preco;
    private static int contador;
    private int numero_bilhete;

    public Bilhete() {
    }

    public Bilhete(float preco) {
        this.preco = preco;
        this.numero_bilhete = ++contador;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Bilhete.contador = contador;
    }

    public int getNumero_bilhete() {
        return numero_bilhete;
    }

    public void setNumero_bilhete(int numero_bilhete) {
        this.numero_bilhete = numero_bilhete;
    }

    @Override
    public String toString() {
        return numero_bilhete+"-"+preco;
    }
    
    public float devolve_receita_bilhete(){
        return contador*preco;
    }
    
    
}
