public class cls_votos {
    private int numero_candidato_int;
    private String id_votante_str;
    private String fecha_str;

    public cls_votos(int numero_candidato_int, String id_votante_str, String fecha_str) {
        this.numero_candidato_int = numero_candidato_int;
        this.id_votante_str = id_votante_str;
        this.fecha_str = fecha_str;
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
}
