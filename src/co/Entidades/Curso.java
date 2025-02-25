package co.Entidades;

public class Curso extends Aluno{
    
  
    private int cargaHoraria;
    private int capacidadeMaxAlunos;
    private String descricao;
    private String aulas;
    private String idiomas;

    public Curso (){

    }

    public Curso (int cargaHoraria, int capacidadeMaxAlunos, String descricao, String aulas, String idiomas){
     this.cargaHoraria = cargaHoraria;
     this.capacidadeMaxAlunos = capacidadeMaxAlunos;
     this.descricao = descricao;
     this.aulas = aulas;
     this.idiomas = idiomas;

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

    public void setDescricao(String descricao){
     this.descricao = descricao;

    }

    public String getDescricao(){
     return descricao;

    }

    public void setAulas(String aulas){
     this.aulas = aulas;

    }

    public String getAulas(){
     return aulas;

    }

    public void setIdiomas(String idiomas){
     this.idiomas = idiomas;

    }

    public String getIdiomas(){
     return idiomas;
    }


}