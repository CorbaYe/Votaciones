import javax.swing.JOptionPane;

public class cls_votantes_util extends app_votos{
    public void fnt_votantes(boolean menu){
        boolean sw = false;
        int pos = 0;
        String cadena = "";
        do{
            int option = Integer.valueOf(JOptionPane.showInputDialog(null,"1. Registrar \n2. Consultar \n3. Atrás"));
            if (option == 1) {
                String id_str = JOptionPane.showInputDialog(null,"Id del votante");
                String nombre_str = JOptionPane.showInputDialog(null,"Nombre del votante");
                String ciudad_str = JOptionPane.showInputDialog(null,"Ciudad");
                String puesto_votacion_str = JOptionPane.showInputDialog(null,"Puesto de votación");
                obj_votante.add(new cls_votantes(id_str, nombre_str, ciudad_str, puesto_votacion_str));
                JOptionPane.showMessageDialog(null, "Votante registrado exitosamente", "REGISTRO VOTANTE", JOptionPane.INFORMATION_MESSAGE);
            }
            if (option == 2) {
                String id_str = JOptionPane.showInputDialog(null,"Id del votante");
                for(int i = 0; i < obj_votante.size(); i++){
                    if(obj_votante.get(i).getId_str().equals(id_str)){
                        sw = true;
                        pos = i;
                        break;
                    }
                }
                if (sw) {
                    cadena = "Nombre: " + obj_votante.get(pos).getNombre_str()
                             + "\nCiudad: " + obj_votante.get(pos).getCiudad_str() 
                             + "\nPuesto de votación: " + obj_votante.get(pos).getPuesto_votacion_str() 
                             + "\nEstado: " + obj_votante.get(pos).getEstado_int();
                    JOptionPane.showMessageDialog(null, cadena);
                }else{
                    cadena = "No se encuentran registros del votanten";
                    JOptionPane.showMessageDialog(null, cadena,"",JOptionPane.WARNING_MESSAGE);
                }
            }
            if (option == 3) {
                menu = false;
            }
        }while(menu);
        
    }
}
