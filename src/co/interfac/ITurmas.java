package co.interfac;

import java.util.List;

import co.Entidades.Aluno;

public interface ITurmas<AlunoRepositorio>{

   public void adicionarAluno(Aluno aluno);
   public Aluno buscarAlunoPorNome(String nome);
    public void deletarAluno(String nome);
  public List<Aluno> listarAlunos();

   


    

}
