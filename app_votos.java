import java.util.LinkedList;

import javax.swing.JOptionPane;

public class app_votos {
    protected static LinkedList<cls_candidatos> obj_candidato = new LinkedList<>();
    private static cls_candidatos_util candidato = new cls_candidatos_util();
    public static void main(String[] args) {
        fnt_menu(true);
    }

    private static void fnt_menu(boolean sw){
        do{
            int option = Integer.valueOf(JOptionPane.showInputDialog(null,"<<< MENU DE OPCIONES >>>\n\n1. CANDIDATOS\n2. SALIR"));
            if (option == 1) {
                candidato.fnt_candidatos(true);
            }
            if (option == 2) {
                sw = false;
            }
        }while(sw);
    }
}
