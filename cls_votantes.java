public class cls_votantes {
    private String id_str;
    private String nombre_str;
    private String ciudad_str;
    private int estado_int;
    private String puesto_votacion_str;

    public cls_votantes(String id_str, String nombre_str, String ciudad_str, int estado_int,
            String puesto_votacion_str) {
        this.id_str = id_str;
        this.nombre_str = nombre_str;
        this.ciudad_str = ciudad_str;
        this.estado_int = estado_int;
        this.puesto_votacion_str = puesto_votacion_str;
    }
    
    public String getId_str() {
        return id_str;
    }
    public void setId_str(String id_str) {
        this.id_str = id_str;
    }
    public String getNombre_str() {
        return nombre_str;
    }
    public void setNombre_str(String nombre_str) {
        this.nombre_str = nombre_str;
    }
    public String getCiudad_str() {
        return ciudad_str;
    }
    public void setCiudad_str(String ciudad_str) {
        this.ciudad_str = ciudad_str;
    }
    public int getEstado_int() {
        return estado_int;
    }
    public void setEstado_int(int estado_int) {
        this.estado_int = estado_int;
    }
    public String getPuesto_votacion_str() {
        return puesto_votacion_str;
    }
    public void setPuesto_votacion_str(String puesto_votacion_str) {
        this.puesto_votacion_str = puesto_votacion_str;
    }
    
}
