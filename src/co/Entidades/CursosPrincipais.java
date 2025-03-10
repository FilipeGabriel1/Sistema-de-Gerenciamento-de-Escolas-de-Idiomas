package co.Entidades;

public enum CursosPrincipais {

    INGLES("Ingles"),
    ESPANHOL("Espanhol"),
    FRANCES("Frances"),
    JAPONES("Japones");

    private String curso;

    CursosPrincipais(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
