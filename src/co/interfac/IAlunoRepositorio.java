package co.interfac;

import java.util.ArrayList;

import co.Entidades.Aluno;

public interface IAlunoRepositorio {

    public void salvar(Aluno aluno);
    Aluno buscarAlunoPorNome(String nome, String sobrenome);
    public boolean removerAluno(Aluno aluno);
    public ArrayList<Aluno> listarTodosAlunos();
    

}
