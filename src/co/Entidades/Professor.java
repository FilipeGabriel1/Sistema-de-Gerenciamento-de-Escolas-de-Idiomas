package co.Entidades;

public class Professor extends Pessoa {
      

   
    private String cargoAtual;
    private int anosExperiencia;
    private String diasDeTrabalho;
    private String horarioDeTrabalho;
    private int id;
    private String disciplinaLecionada;
  
   
  public Professor(){

  }

  public Professor(String cargoAtual,int anosExperiencia,  String diasDeTrabalho, String horarioDeTrabalho, int id, String disciplinaLecionada){
    this.cargoAtual = cargoAtual;
    this.anosExperiencia = anosExperiencia;
    this.diasDeTrabalho = diasDeTrabalho;
    this.horarioDeTrabalho = horarioDeTrabalho;
    this.id = id;
    this.disciplinaLecionada = disciplinaLecionada;
    
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

  public String getDisciplinaLecionada() {
    return disciplinaLecionada;
  }

  public void setDisciplinaLecionada(String disciplinaLecionada) {
    this.disciplinaLecionada = disciplinaLecionada;
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

  @Override

  public String toString(){
    return "Nome: " + getNome() + " " + getSobrenome();
  }
}





