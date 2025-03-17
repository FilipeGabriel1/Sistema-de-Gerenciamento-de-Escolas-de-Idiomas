package co.Entidades;

public class Professor extends Pessoa {
       
    private String cargoAtual;
    private int anosExperiencia;
    private String diasDeTrabalho;
    private String horarioDeTrabalho;
    private int id;
    private String cursoLecionado;
  
  public Professor(){

  }

  public Professor(String cargoAtual,int anosExperiencia,  String diasDeTrabalho, String horarioDeTrabalho, int id, String disciplinaLecionada, String cursoLecionado ){
    this.cargoAtual = cargoAtual;
    this.anosExperiencia = anosExperiencia;
    this.diasDeTrabalho = diasDeTrabalho;
    this.horarioDeTrabalho = horarioDeTrabalho;
    this.id = id;
    this.cursoLecionado = cursoLecionado;  
  }

  public String getDiasDeTrabalho() {
    return diasDeTrabalho;
  }

  public void setDiasDeTrabalho(String diasDeTrabalho) {
    this.diasDeTrabalho = diasDeTrabalho;
  }

  public String getHorarioDeTrabalho() {
    return horarioDeTrabalho;
  }

  public void setHorarioDeTrabalho(String horarioDeTrabalho) {
    this.horarioDeTrabalho = horarioDeTrabalho;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setCargoAtual(String cargoAtual){
    this.cargoAtual = cargoAtual;  
  }

  public String getCargoAtual(){
    return cargoAtual;
  }

  public void setAnosExperiencia(int anosExperiencia){
    this.anosExperiencia = anosExperiencia;
  }

  public int getAnosExperiencia(){
    return anosExperiencia;
  }

  public String getCursoLecionado() {
    return cursoLecionado;
  }

  public void setCursoLecionado(String cursoLecionado) {
    this.cursoLecionado = cursoLecionado;
  }

  @Override
  public String toString(){
    return "Nome: " + getNome() + " " + getSobrenome();
  }
}




