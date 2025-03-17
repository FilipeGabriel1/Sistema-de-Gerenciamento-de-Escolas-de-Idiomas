package co.Entidades;

public class Aluno extends Pessoa{
  
    private int matricula;
    private double mensalidade;
    private Turma turma;
    private boolean ativo;
    private Curso cursos;
  
    public Aluno (){
     
    }

    public boolean isAtivo() {
      return ativo;
    }

    public void setAtivo(boolean ativo) {
      this.ativo = ativo;
    }

    public Aluno (int matricula, double mensalidade){
      
      this.matricula = matricula;
      this.mensalidade = mensalidade;
    }

    public int getMatricula() {
      return matricula;
    }

    public void setMatricula(int matricula) {
      this.matricula = matricula;
    }

    public void setMensalidade(double mensalidade){
      this.mensalidade = mensalidade;

    }

    public double getMensalidade(){
      return mensalidade;
    }

    public Turma getTurmas() {
      return turma;
    }

    public void setTurmas(Turma turma) {
      this.turma = turma;
    }

    public Curso getCursos() {
      return cursos;
    }

    public void setCursos(Curso cursos) {
      this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Aluno: " + getNome() + " " + getSobrenome();
    }
}
