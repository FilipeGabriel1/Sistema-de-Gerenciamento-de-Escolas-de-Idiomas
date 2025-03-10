package co.Entidades;

public class Curso extends Pessoa{
    
  
    private int cargaHoraria;
    private int capacidadeMaxAlunos;
    private String disciplinas;
    private String ingles;
    private String espanhol;
    private String frances;
    private String japones;
    private String nomeCurso;

    public Curso(){

    }

    public Curso (String ingles, String espanhol, String
    frances, String japones){

    this.ingles = ingles;
    this.espanhol = espanhol;
    this.frances = frances;
    this.japones = japones;

    }

    public Curso (int cargaHoraria, int capacidadeMaxAlunos, String disciplinas, String ingles, String espanhol, String
    frances, String japones, String nomeCurso){
     this.cargaHoraria = cargaHoraria;
     this.capacidadeMaxAlunos = capacidadeMaxAlunos;
     this.disciplinas = disciplinas;
     this.ingles = ingles;
     this.espanhol = espanhol;
     this.frances = frances;
     this.japones = japones;  
        this.nomeCurso = nomeCurso;
   


    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public void setCargaHoraria(int cargaHoraria){
     this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria(){
     return cargaHoraria;

    }

  

    public void setCapacidadeMaxAlunos(int capacidadeMaxAlunos){
     this.capacidadeMaxAlunos = capacidadeMaxAlunos;

    }

    public int getCapacidadeMaxAlunos(){
     return capacidadeMaxAlunos;

    }


    public String getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
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
    public String toString() {
        return "Curso{" +
                "nomeCurso='" + nomeCurso + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", capacidadeMaxAlunos=" + capacidadeMaxAlunos +
                ", disciplinas='" + disciplinas + '\'' +
                ", ingles='" + ingles + '\'' +
                ", espanhol='" + espanhol + '\'' +
                ", frances='" + frances + '\'' +
                ", japones='" + japones + '\'' +
                '}';
    }


}


