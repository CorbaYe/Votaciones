import java.util.LinkedList;

import javax.swing.JOptionPane;

public class app_votos {
    protected static LinkedList<cls_candidatos> obj_candidato = new LinkedList<>();
    protected static LinkedList<cls_votantes> obj_votante = new LinkedList<>();
    private static cls_candidatos_util candidato = new cls_candidatos_util();
    private static cls_votantes_util votante = new cls_votantes_util();
    public static void main(String[] args) {
        fnt_menu(true);
    }

    private static void fnt_menu(boolean sw){
        do{
            int option = Integer.valueOf(JOptionPane.showInputDialog(null,"<<< MENU DE OPCIONES >>>\n\n1. CANDIDATOS\n2. VOTANTES\n3. SALIR"));
            if (option == 1) {
                candidato.fnt_candidatos(true);
            }
            if (option == 2) {
                votante.fnt_votantes(true);
            }
            if (option == 3) {
                sw = false;
            }
        }while(sw);
    }
}
