/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestao_evento;

import java.util.ArrayList;

/**
 *
 * @author Conilingus
 */
public class Agentes extends ArrayList<Agente> {
    
    
     public void adicionar_agente(Agente agt) {
        this.add(agt);
    }
    
    public void listar_agentes() {
        for (Agente agt: this) {
            if (agt != null) {
                System.out.println(agt.toString());
            }
        }
    }
    
    public void remover_agente(int id) {
        for (Agente agt : this) {
            if (agt.getNum_fiscal() == id) {
                try {
                    this.remove(agt);
                } catch (Exception e) {
                }
            }
        }
        
    }
    
    public void devolve_nome_agente(int num_fiscal,String nome){
      for (Agente agt : this) {
          if (agt.getNum_fiscal()==num_fiscal) {
              agt.setNome(nome);
          }
      }
  }
    
     public Artista devolve_um_agente(int num_fisc){
      Artista artista=new Artista();
      for (Agente agt : this) {
          if (agt.getNum_fiscal()==num_fisc) {
              agt.recebe_agente(agt);
          }
      }
      return artista;
  }
    
}
