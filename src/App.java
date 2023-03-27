public class App {
    public static void main(String[] args) throws Exception {
        Usuario usuario1 = new Usuario();
        usuario1.setName("Leonardo");
        usuario1.setEmail("leo@gmail.com");
        usuario1.setCpf("123.456.789-12");
        usuario1.setAge(25);

        Usuario usuario2 = new Usuario();
        usuario2.setName("Sofia");
        usuario2.setEmail("sofi@gmail.com");
        usuario2.setCpf("987.654.321-10");
        usuario2.setAge(24);

        Usuario usuario3 = new Usuario();
        usuario3.setName("Valdirene");
        usuario3.setEmail("valdi@gmail.com");
        usuario3.setCpf("999.888.777-10");
        usuario3.setAge(2);

        Pergunta pergunta1 = new Pergunta();
        pergunta1.setUsuario(usuario2);
        pergunta1.setTitulo("Como codar em Java?");
        pergunta1.setDescricao("Eu ainda não sei codar em Java alguém pode me ajudar por favor?");

        Resposta resposta1 = new Resposta();
        resposta1.setPergunta(pergunta1);
        resposta1.setUsuario(usuario3);
        resposta1.setComentario("Eu não sei, também quero aprender");

        Resposta resposta2 = new Resposta();
        resposta2.setUsuario(usuario1);
        resposta2.setPergunta(pergunta1);
        resposta2.setComentario("Faça a aceleração de java!");

        System.out.println(resposta2.getPergunta().getUsuario().getName() + ": " + resposta2.getPergunta().getTitulo());
        System.out.println(resposta2.getUsuario().getName() + ": " + resposta2.getComentario());
    }
}
