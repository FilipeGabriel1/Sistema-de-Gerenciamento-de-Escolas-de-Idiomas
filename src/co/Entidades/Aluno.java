package co.Entidades;

public class Aluno extends Pessoa{

        
    private double matricula;
    private double mensalidade;
    private String turma;
    private CursosPrincipais curso;
    private Turmas turmas;
    private boolean ativo;
  
    
   

    public Aluno (){
      super();

    }

    public boolean isAtivo() {
      return ativo;
    }

    public void setAtivo(boolean ativo) {
      this.ativo = ativo;
    }

    public Aluno (double matricula, double mensalidade){
      
      

      this.matricula = matricula;
      this.mensalidade = mensalidade;
     
      
    
    
     

    }

    public String getTurma() {
      return turma;
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

    public CursosPrincipais getCurso() {
      return curso;
    }

    public void setCurso(CursosPrincipais curso) {
      this.curso = curso;
    }

    public Turmas getTurmas() {
      return turmas;
    }

    public void setTurmas(Turmas turmas) {
      this.turmas = turmas;
    }


    @Override
    public String toString() {
        return "Aluno: " + getNome() + " " + getSobrenome();
    }

 
   

    
}
