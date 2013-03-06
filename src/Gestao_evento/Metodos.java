/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestao_evento;

import java.io.FileInputStream;
import java.io.FileOutputStream;



import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Conilingus
 */
public class Metodos {
    
    static int opcao;
    static int aux_int;
    static float aux_float;
    static String aux_string;
    public static Scanner tec = new Scanner(System.in);
    Messages msg = new Messages();
    public static Artistas lista_artistas = new Artistas();
    public static Artista artista = new Artista();
    public static Agente agente = new Agente();
    public static Agentes lista_agentes = new Agentes();
    public static Evento evento = new Evento();
    public static Eventos lista_eventos = new Eventos();
    public static Contrato contrato= new Contrato();
    public static Contratos lista_contratos =new Contratos();

    //funcao ler inteiro
    public static int ler_int(String msg, String num_a_pedir) {
        int num = 0;
        boolean res;
        do {
            System.out.println(msg);
            System.out.flush();
            num_a_pedir = tec.next();
            try {
                System.out.flush();
                num = Integer.parseInt(num_a_pedir);
                res = true;
            } catch (Exception e) {
                System.out.println("numero invalido!");
                res = false;
            }
        } while (res != true);
        return num;
    }
    //funcao ler float
    public static float ler_float(String msg, String num_a_pedir) {
        float num = 0;
        boolean res;
        
        do {
            System.out.println(msg);
            System.out.flush();
            num_a_pedir = tec.next();
            try {
                num = Float.parseFloat(num_a_pedir);
                res = true;
            } catch (Exception e) {
                System.out.println("numero invalido!");
                res = false;
            }
        } while (res != true);
        return num;
    }

    //mostrar mensagem
    public static void pmsg(String msg) {
        System.out.println(msg);
    }
    public static Data inserir_data() {
        Data data_r = new Data();
        int dia, mes, ano;
        do {
            dia = ler_int("Insira o dia", aux_string);
        } while (dia <= 0 || dia > 31);
        
        do {
            mes = ler_int("Insira o mes", aux_string);
        } while (mes <= 0 || mes > 12);
        
        do {
            ano = ler_int("Insira o ano", aux_string);
        } while (ano < 2012);
        //teste ano bissexto
        if (ano % 4 == 0 && (ano % 400 == 0 || ano % 100 != 0)) {
            if (mes == 2 && dia >= 29) {
                dia = 28;
            }
        }
        data_r.setDia(dia);
        data_r.setMes(mes);
        data_r.setAno(ano);
        
        return data_r;
    }

    //adicionar um artista
    public void metod_adicona_artista() {
        Artista art = new Artista();
        pmsg("Nome artista:");
        aux_string = tec.next();
        art.setNome(aux_string);
         pmsg("Sobrenome artista:");
        aux_string = tec.next();
        art.setSobre_nome(aux_string);
        System.out.flush();
        aux_int = ler_int("Numero fiscal", aux_string);
        art.setNum_fiscal(aux_int);
        pmsg("Morada:");
        aux_string = tec.next();
        art.setMorada(aux_string);
        aux_int = ler_int("Telefone:", aux_string);
        art.setTelefone(aux_int);
        pmsg("E-mail:");
        aux_string = tec.next();
        art.setE_mail(aux_string);
        lista_artistas.adicionar_artista(art);
    }

    //adicionar um artista
    public void metod_adicona_agente() {
        Agente agt = new Agente();
        pmsg("Nome agente:");
        aux_string = tec.next();
        agt.setNome(aux_string);
         pmsg("Sobrenome agente:");
        aux_string = tec.next();
        agt.setSobre_nome(aux_string);
        System.out.flush();
        aux_int = ler_int("Numero fiscal", aux_string);
        agt.setNum_fiscal(aux_int);
        pmsg("Morada:");
        aux_string = tec.next();
        agt.setMorada(aux_string);
        aux_int = ler_int("Telefone:", aux_string);
        agt.setTelefone(aux_int);
        pmsg("E-mail:");
        aux_string = tec.next();
        agt.setE_mail(aux_string);
        lista_agentes.adicionar_agente(agt);
    }
    
    public void metodo_adiciona_avento() {
        Evento evt = new Evento();
        evt.setNum_evento();
        pmsg("Nome evento:");
        aux_string = tec.next();
        evt.setNome(aux_string);
        pmsg("Data da realizacao do evento");
        evt.setData(inserir_data());
        lista_eventos.adicionar_evento(evt);
    }
    public void metodo_adiciona_contrato(){
        Contrato ct=new Contrato();
        Data dt=new Data();
        
        pmsg("Insira a data do inicio do contrato");
        dt=inserir_data();
        ct.setData_inicio(dt);
        Artista at=new Artista();
        /*pedir numero fiscal do artista, se existir copiar*/
        aux_int=ler_int("Insira numero fiscal do artista a contratar", aux_string);
        at=lista_artistas.devolve_um_artista(aux_int);
        if (at.getNum_fiscal()==0) {
            metod_adicona_artista();
        }
        else
        {
            ct.setArtista(at);
        }
        
        
    }
    
    public void add_all() {
        
        do {
            do {
                msg.msg_ger("ADICIONAR");
                opcao = tec.nextInt();
                switch (opcao) {
                    case 1:
                        //adicionar evento
                        metodo_adiciona_avento();
                        break;
                    case 2:
                        //adicionar repartiçao
                        break;
                    case 3:
                        //adicionar artista
                        metod_adicona_artista();
                        break;
                    case 4:
                        //adicionar contrato
                        break;
                    case 5:
                        //adicinar agente
                        metod_adicona_agente();
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("Escolha um numero entre 1-6!");
                }
            } while (opcao != 6);
            System.out.println("Deseja adicionar mais dados?  0-sim 1-nao ");
            opcao = tec.nextInt();
        } while (opcao != 1);
    }
    
    public void rem_all() {
        do {
            do {
                msg.msg_ger("Remover");
                opcao = tec.nextInt();
                 switch (opcao) {
                    case 1:
                        // evento
                       
                        break;
                    case 2:
                        // repartiçao
                        break;
                    case 3:
                        // artista
                        aux_int=ler_int("Insira o contribuinte do artista a remover", aux_string);
                        lista_artistas.remover_artista(aux_int);
                        break;
                    case 4:
                        // contrato
                        break;
                    case 5:
                        // agente
                    
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("Escolha um numero entre 1-6!");
                }
             
            } while (opcao != 6);
            System.out.println("Deseja remover mais dados?  0-sim 1-nao ");
            opcao = tec.nextInt();
        } while (opcao != 1);
        
    }
    
    public void edit_all() {
        do {
            do {
                msg.msg_ger("EDITAR");
                opcao = tec.nextInt();
                 switch (opcao) {
                    case 1:
                        // evento
                       
                        break;
                    case 2:
                        // repartiçao
                        break;
                    case 3:
                        // artista
                        
                        break;
                    case 4:
                        // contrato
                        break;
                    case 5:
                        // agente
                    
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("Escolha um numero entre 1-6!");
                }
            } while (opcao != 6);
            System.out.println("Deseja editar mais dados?  0-sim 1-nao ");
            opcao = tec.nextInt();
        } while (opcao != 1);
        
    }
    
    public void show_all() {
        do {
            do {
                msg.msg_ger("MOSTRAR");
                opcao = tec.nextInt();
                
                switch (opcao) {
                    case 1:
                        // evento
                        lista_eventos.listar_eventos();
                        break;
                    case 2:
                        // repartiçao
                        break;
                    case 3:
                        // artista
                        lista_artistas.listar_artistas();
                        break;
                    case 4:
                        // contrato
                        break;
                    case 5:
                        // agente
                        lista_agentes.listar_agentes();
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("Escolha um numero entre 1-6!");
                }
            } while (opcao != 6);
            System.out.println("Deseja mostrar mais dados?  0-sim 1-nao ");
            opcao = tec.nextInt();
        } while (opcao != 1);
        
    }
    /*
     public  void write_file() throws FileNotFoundException, IOException{
     try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("artista.dat"))) {
     out.writeObject(lista_artistas.listar_artistas());
     }
        
        
     }
    
       
    
  
    public void read_file() throws IOException {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("artista.dat"));
            try {
                ArrayList<Artistas> lista_artistas = (ArrayList<Artistas>) in.readObject();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    */
    
    public void rec_file_artistas(String nome_f){
        try {
            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(nome_f));
            out.writeObject(lista_artistas);
            out.close();
        } catch (Exception e) {
            System.out.println("Erro ao escrever ficheiro no ficheiro"+nome_f+".");
            System.exit(0);
        }
        
    }
    
    public void read_file_artista(String nome_f){
        try {
            ObjectInputStream in= new ObjectInputStream(new FileInputStream(nome_f));
            lista_artistas=(Artistas)in.readObject();
        } catch (Exception e) {
            System.out.println("Ficheiro inexistente.");
        }
        
        
    }
}
