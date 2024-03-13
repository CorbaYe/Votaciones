public class cls_votos {
    private int numero_candidato_int;
    private String id_votante_str;
    private String fecha_str;
    private int nombre_votos_int;
    public cls_votos(int numero_candidato_int, String id_votante_str, String fecha_str, int nombre_votos_int) {
        this.numero_candidato_int = numero_candidato_int;
        this.id_votante_str = id_votante_str;
        this.fecha_str = fecha_str;
        this.nombre_votos_int = nombre_votos_int;
    }
    public int getNumero_candidato_int() {
        return numero_candidato_int;
    }
    public void setNumero_candidato_int(int numero_candidato_int) {
        this.numero_candidato_int = numero_candidato_int;
    }
    public String getId_votante_str() {
        return id_votante_str;
    }
    public void setId_votante_str(String id_votante_str) {
        this.id_votante_str = id_votante_str;
    }
    public String getFecha_str() {
        return fecha_str;
    }
    public void setFecha_str(String fecha_str) {
        this.fecha_str = fecha_str;
    }
    public int getNombre_votos_int() {
        return nombre_votos_int;
    }
    public void setNombre_votos_int(int nombre_votos_int) {
        this.nombre_votos_int = nombre_votos_int;
    }
    
}
