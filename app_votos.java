import java.util.LinkedList;

import javax.swing.JOptionPane;

public class app_votos {
    private static LinkedList<cls_candidatos> obj_candidato = new LinkedList<>();
    public static void main(String[] args) {
        fnt_menu(true);
    }

    private static void fnt_menu(boolean sw){
        do{
            int option = Integer.valueOf(JOptionPane.showInputDialog(null,"<<< MENU DE OPCIONES >>>\n\n1. CANDIDATOS\n2. SALIR"));
            if (option == 2) {
                sw = false;
            }
        }while(sw);
    }
}
