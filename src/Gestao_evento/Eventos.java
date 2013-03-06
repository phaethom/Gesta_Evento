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
public class Eventos extends ArrayList<Evento> {

    public void adicionar_evento(Evento evt) {
        this.add(evt);
    }

    public void listar_eventos() {
        for (Evento evt : this) {
            if (evt != null) {
                System.out.println(evt.toString());
            }
        }
    }

    public void remover_evento(int id) {
        for (Evento evt : this) {
            if (evt.getNum_evento() == id) {
                try {
                    this.remove(evt);
                } catch (Exception e) {
                }
            }
        }
    }

    public void devolve_nome_evento(int num_evento, String nome) {
        for (Evento evt : this) {
            if (evt.getNum_evento() == num_evento) {
                evt.setNome(nome);
            }
        }
    }
    
       public Evento devolve_um_evento(int num_evt){
      Evento evento=new Evento();
      for (Evento ev : this) {
          if (ev.getNum_evento()==num_evt) {
              evento.recebe_evento(ev);
          }
      }
      return evento;
  }
}

