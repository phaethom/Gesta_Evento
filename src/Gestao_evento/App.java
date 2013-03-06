/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestao_evento;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Conilingus
 */
public class App {

    public static void main(String[] args) throws IOException {
        Scanner tec = new Scanner(System.in);
        Messages msg = new Messages();
        Metodos met = new Metodos();
        int opc = 0;
       // met.read_file();
        do {
            msg.msg_principal();
            opc = tec.nextInt();
            switch (opc) {
                case 1:
                    //adicionar
                    met.add_all();
                    break;
                case 2:
                    //remover
                    met.rem_all();
                    break;
                case 3:
                    //alterar
                    met.edit_all();
                    break;
                case 4:
                    //listar
                    met.show_all();
                    break;
                case 5:
                    //definiçoes
                    break;
                case 6:
                    //sair
                    break;
                default:
                    System.out.println("Escolha uma opcao valida");
            }
        } while (opc != 6);

     met.rec_file_artistas("artistas.dat");
    }
}
