package co.Arraylist;

import co.Entidades.Pessoa;

public class Professor extends Pessoa {
      

    private String cursos;
    private String cargoAtual;
    private int anosExperiencia;
    private String diasDeTrabalho;
    private String horarioDeTrabalho;
  
   
  public Professor(){

  }

  public Professor(String cursos, String cargoAtual,int anosExperiencia,  String diasDeTrabalho, String horarioDeTrabalho){
    this.cursos = cursos;
    this.cargoAtual = cargoAtual;
    this.anosExperiencia = anosExperiencia;
    this.diasDeTrabalho = diasDeTrabalho;
    this.horarioDeTrabalho = horarioDeTrabalho;
    
    
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

  public void setCursos(String cursos){
    this.cursos = cursos;

  }

  public String getCursos(){
    return cursos;
    
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

}





