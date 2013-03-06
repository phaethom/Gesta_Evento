/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestao_evento;

/**
 *
 * @author Conilingus
 */
public class Messages {
    
    public void msg_principal(){
        System.out.println("**********GESTAO EVENTOS**********");
        String opc[]=new String[]{"Adicionar","Remover","Alterar","Listar","Definir","Sair"};
        for (int i = 0; i < opc.length; i++) {
            System.out.println(i+1+"\t"+opc[i]);
        }
    }
    public void msg_ger(String msg){
        System.out.println("##########"+msg+"##########");
        String opc[]=new String[]{"Evento","Reparticao","Artist","Contrato","Agente","Sair"};
        for (int i = 0; i < opc.length; i++) {
            System.out.println(i + 1 + "\t" + opc[i]);
        }
    }
}
