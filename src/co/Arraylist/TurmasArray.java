package co.Arraylist;

import co.Entidades.Turmas;

public class TurmasArray extends Turmas {

    private String ingles;
    private String espanhol;
    private String frances;
    private String japones;

    public TurmasArray() {
    }

    public TurmasArray(String ingles, String espanhol, String frances, String japones) {
        this.ingles = ingles;
        this.espanhol = espanhol;
        this.frances = frances;
        this.japones = japones;

        
    }

  
    

    public String getIngles() {
        return ingles;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }

    public String getEspanhol() {
        return espanhol;
    }

    public void setEspanhol(String espanhol) {
        this.espanhol = espanhol;
    }

    public String getFrances() {
        return frances;
    }

    public void setFrances(String frances) {
        this.frances = frances;
    }

    public String getJapones() {
        return japones;
    }

    public void setJapones(String japones) {
        this.japones = japones;
    }

    @Override
    public void IdentificarAluno(Turmas turma) {
        System.out.println("Identificando turma: " + turma);
    }

    

    @Override
    public void IdentificarAluno() {
        System.out.println("ID identificado com Sucesso!");
        
    }

    @Override
    public void ExibiIdentificacao() {
        System.out.println("Exibindo identificação do aluno.");
    }

}
