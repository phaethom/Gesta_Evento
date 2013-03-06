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
public class Artistas extends ArrayList<Artista> {

    private String listagem_comissao;
    
    public String getListagemComissao() {
        return listagem_comissao;
    }
    
    public void setListagemComissao(String listagem_comissao) {
        this.listagem_comissao = listagem_comissao;
    }
    
    public void adicionar_artista(Artista art) {
        this.add(art);
    }
    
    public void listar_artistas() {
        for (Artista art : this) {
            if (art != null) {
                System.out.println(art.toString());
            }
        }
    }
    
    public void remover_artista(int id) {
        for (Artista art : this) {
            if (art.getNum_fiscal() == id) {
                try {
                    this.remove(art);
                } catch (Exception e) {
                }
            }
        }
        
    }
    public float artista_devolve_comissao_agente(){
        
        float comissao_agente=0;
        for (Artista art : this) {
            if (art.getComissao_liq_agente()>0) {
                comissao_agente=+art.getComissao_liq_agente();
                listagem_comissao=art.getNum_fiscal()+"-"+art.getNome()+"Receita artista["+art.comissao_artista()+"]"+"Receita agente["+art.getComissao_liq_agente()+"]\n";
            }
        }
          return comissao_agente;
    }
  public void mostra_info(){
      System.out.println(listagem_comissao);
  }
  
  public void devolve_nome_artista(int num_fiscal,String nome){
      for (Artista art : this) {
          if (art.getNum_fiscal()==num_fiscal) {
              art.setNome(nome);
          }
      }
  }
  public void devolve_montante_bruto_artista(int num_fiscal,float bruto){
      for (Artista art : this) {
          if (art.getNum_fiscal()==num_fiscal) {
              art.setMontante_bruto(bruto);
          }
      }
  }
  public void devolve_comissao_agente(int num_fiscal,float comissao_liquida){
      for (Artista art : this) {
          if (art.getNum_fiscal()==num_fiscal) {
              art.setComissao_liq_agente(comissao_liquida);
          }
      }
  }
  public void devolve_calculo_comissao_artista(int num_fiscal, float comiss){
      for (Artista art : this) {
          if (art.getNum_fiscal()==num_fiscal) {
              art.Calcula_comissao_artista(comiss);
          }
      }
     
  }
  public Artista devolve_um_artista(int num_fisc){
      Artista artista=new Artista();
      for (Artista art : this) {
          if (art.getNum_fiscal()==num_fisc) {
              art.recebe_artista(art);
          }
      }
      return artista;
  }
}
