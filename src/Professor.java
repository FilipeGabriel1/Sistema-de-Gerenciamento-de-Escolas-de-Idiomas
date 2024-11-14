public class Professor extends Pessoa {
      

    private String cursos;
    private String cargoAtual;
    private String empresaAtual;
    private int anosExperiencia;
    private String banco;
    private String agencia;
    private int numeroConta;
    private double salarioAtual;
   
  public Professor(){

  }

  public Professor(String cursos, String cargoAtual, String empresaAtual,int anosExperiencia, String banco, String agencia, int numeroConta, double salarioAtual){

    this.cursos = cursos;
    this.cargoAtual = cargoAtual;
    this.empresaAtual = empresaAtual;
    this.anosExperiencia = anosExperiencia;
    this.banco = banco;
    this.agencia = agencia;
    this.numeroConta = numeroConta;
    this.salarioAtual = salarioAtual;


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

  public void setEmpresaAtual(String empresaAtual){
    this.empresaAtual = empresaAtual;

  }

  public String getEmpresaAtual(){
    return empresaAtual;

  }

  public void setAnosExperiencia(int anosExperiencia){
    this.anosExperiencia = anosExperiencia;

  }

  public int getAnosExperiencia(){
    return anosExperiencia;

  }

  public void setBanco(String banco){
    this.banco = banco;

  }

  public String getBanco(){
    return banco;
    
  }

  public void setAgencia(String agencia){
    this.agencia = agencia;

  }

  public String getAgencia(){
    return agencia;

  }

  public void setNumeroConta(int numeroConta){
    this.numeroConta = numeroConta;

  }

  public int getNumeroConta(){
    return numeroConta;

  }
  public void setSalarioAtual(double salarioAtual){
    this.salarioAtual = salarioAtual;

  }

  public double getSalarioAtual(){
    return salarioAtual;

  }


}


