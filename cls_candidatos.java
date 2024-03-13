public class cls_candidatos{
    private int numero_candidato_int;
    private String nombre_str;
    private String propuesta_str;
    private String partido_str;
    private int n_votos_int;

    public cls_candidatos(int numero_candidato_int, String nombre_str, String propuesta_str, String partido_str) {
        this.numero_candidato_int = numero_candidato_int;
        this.nombre_str = nombre_str;
        this.propuesta_str = propuesta_str;
        this.partido_str = partido_str;
        this.n_votos_int = 0;
    }

    public int getNumero_candidato_int() {
        return numero_candidato_int;
    }

    public void setNumero_candidato_int(int nurmero_int) {
        this.numero_candidato_int = nurmero_int;
    }

    public String getNombre_str() {
        return nombre_str;
    }

    public void setNombre_str(String nombre_str) {
        this.nombre_str = nombre_str;
    }

    public String getPropuesta_str() {
        return propuesta_str;
    }

    public void setPropuesta_str(String propuesta_str) {
        this.propuesta_str = propuesta_str;
    }

    public String getPartido_str() {
        return partido_str;
    }

    public void setPartido_str(String partido_str) {
        this.partido_str = partido_str;
    }

    public int getN_votos_int() {
        return n_votos_int;
    }

    public void setN_votos_int(int n_votos_int) {
        this.n_votos_int = n_votos_int;
    }
    

    
}