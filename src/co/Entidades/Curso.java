package co.Entidades;

public class Curso extends Pessoa{
    
  
    private int cargaHoraria;
    private int capacidadeMaxAlunos;
    private String disciplinas;
    private CursosPrincipais cursoPrincipal;

    private String nomeCurso;

    public Curso() {
    }
    
    public Curso(CursosPrincipais cursoPrincipal, int cargaHoraria, int capacidadeMaxAlunos) {
        this.cursoPrincipal = cursoPrincipal;
        this.cargaHoraria = cargaHoraria;
        this.capacidadeMaxAlunos = capacidadeMaxAlunos;

    }

  

    

    public Curso (int cargaHoraria, int capacidadeMaxAlunos, String disciplinas, String ingles, String espanhol, String
    frances, String japones, String nomeCurso){
     this.cargaHoraria = cargaHoraria;
     this.capacidadeMaxAlunos = capacidadeMaxAlunos;
     this.disciplinas = disciplinas;
     
   


    }

    public CursosPrincipais getCursoPrincipal() {
        return cursoPrincipal;
    }
    
    
    public void setCursoPrincipal(CursosPrincipais cursoPrincipal) {
        this.cursoPrincipal = cursoPrincipal;
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


   @Override
    public String toString() {
        return "Curso{" +
                "cursoPrincipal=" + cursoPrincipal +
                "nomeCurso='" + nomeCurso + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", capacidadeMaxAlunos=" + capacidadeMaxAlunos +
                ", disciplinas='" + disciplinas + '\'' +
                '}';
    }








}


