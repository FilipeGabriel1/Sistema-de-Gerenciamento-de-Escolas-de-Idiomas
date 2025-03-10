package co.Entidades;

public class Aluno extends Pessoa{

        
    private double matricula;
    private double mensalidade;
    private String turma;
   private String cursando;
    

  
    
   

    public Aluno (){
      super();

    }

    public Aluno (double matricula, double mensalidade, double rendaMensal , String turma, String cursando){
      
      

      this.matricula = matricula;
      this.mensalidade = mensalidade;
      this.turma = turma;
      this.cursando = cursando;
      
    
     

    }

    public String getTurma() {
      return turma;
    }

    public String getCursando() {
      return cursando;
    }

    public void setCursando(String cursando) {
      this.cursando = cursando;
    }

    public void setTurma(String turma) {
      this.turma = turma;
    }

    public void setMatricula(double matricula){
      this.matricula = matricula;

    }

    public double getMatricula(){
      return matricula;
    }

    public void setMensalidade(double mensalidade){
      this.mensalidade = mensalidade;

    }

    public double getMensalidade(){
      return mensalidade;
    }


    @Override
    public String toString() {
        return "Aluno: " + getNome() + " " + getSobrenome();
    }
   

    
}
