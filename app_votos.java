import java.util.LinkedList;

import javax.swing.JOptionPane;

public class app_votos {
    private static LinkedList<cls_candidatos> obj_candidato = new LinkedList<>();
    public static void main(String[] args) {
        fnt_menu(true);
    }
    private static void fnt_candidatos(boolean menu){
        boolean sw = false;
        int pos = 0;
        String cadena = "";
        do{
            int option = Integer.valueOf(JOptionPane.showInputDialog(null,"1. Registrar \n2. Consultar \n3. Atrás"));
            if (option == 1) {
                int nurmero_int = Integer.valueOf(JOptionPane.showInputDialog(null,"Múmero de candidato"));
                String nombre_str = JOptionPane.showInputDialog(null,"Nombre del candidato");
                String propuesta_str = JOptionPane.showInputDialog(null,"Propuesta del candidato");
                String partido_str = JOptionPane.showInputDialog(null,"Partido al que pertenece el candidato");
                obj_candidato.add(new cls_candidatos(nurmero_int, nombre_str, propuesta_str, partido_str));
                JOptionPane.showMessageDialog(null, "Canditado registrado exitosamente", "REGISTRO CANDIDATO", JOptionPane.INFORMATION_MESSAGE);
            }
            if (option == 2) {
                int nurmero_int = Integer.valueOf(JOptionPane.showInputDialog(null,"Número de candidato"));
                for(int i = 0; i < obj_candidato.size(); i++){
                    if(obj_candidato.get(i).getNumero_candidato_int() == nurmero_int){
                        sw = true;
                        pos = i;
                        break;
                    }
                }
                if (sw) {
                    cadena = "Nombre: " + obj_candidato.get(pos).getNombre_str()
                             + "\nPropuesta: " + obj_candidato.get(pos).getPropuesta_str() 
                             + "\nPartido: " + obj_candidato.get(pos).getPartido_str() 
                             + "\nNúmero de votos: " + obj_candidato.get(pos).getN_votos_int();
                    JOptionPane.showMessageDialog(null, cadena);
                }else{
                    cadena = "No se encuentran registros del candidato";
                    JOptionPane.showMessageDialog(null, cadena,"",JOptionPane.WARNING_MESSAGE);
                }
            }
            if (option == 3) {
                menu = false;
            }
        }while(menu);
        
    }
    private static void fnt_menu(boolean sw){
        do{
            int option = Integer.valueOf(JOptionPane.showInputDialog(null,"<<< MENU DE OPCIONES >>>\n\n1. CANDIDATOS\n2. SALIR"));
            if (option == 1) {
                fnt_candidatos(true);
            }
            if (option == 2) {
                sw = false;
            }
        }while(sw);
    }
}
