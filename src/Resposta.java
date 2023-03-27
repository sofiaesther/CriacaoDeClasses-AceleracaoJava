public class Resposta {
    private Usuario usuario;
    private Pergunta pergunta;
    private String comentario;
    
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Pergunta getPergunta() {
        return pergunta;
    }
    public void setPergunta(Pergunta pergunta) {
        this.pergunta = pergunta;
    }
    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
