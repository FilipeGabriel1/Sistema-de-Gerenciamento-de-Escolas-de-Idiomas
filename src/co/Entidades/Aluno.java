package co.Entidades;

import java.util.ArrayList;
import java.util.List;


public class Aluno extends Pessoa{
  
    private int matricula;
    private double mensalidade;
    private Turma turma;
    private boolean ativo;
    private Curso cursos;
    private List<Responsavel> responsaveis;
  
    public Aluno (){
     this.responsaveis = new ArrayList<>();
    }

    public Aluno (String nome, String sobrenome, int idade, String cpf, int matricula, double mensalidade){
      super(nome, sobrenome, idade, cpf);
      this.matricula = matricula;
      this.mensalidade = mensalidade;
      
    }
    
    public void adicionarResponsavel(String nome, String sobrenome, String cpf, int celular ){
      this.responsaveis.add(new Responsavel(nome, sobrenome, cpf, celular));
    }

    public List<Responsavel> getResponsavel() {
      return responsaveis;
    }

    public void setReponsavel(List<Responsavel> responsaveis) {
      this.responsaveis = responsaveis;
    }

    public Turma getTurma() {
      return turma;
    }


    


    public boolean isAtivo() {
      return ativo;
    }

    public void setTurma(Turma turma) {
      this.turma = turma;
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
