package co.interfac;

import java.util.ArrayList;
import co.Entidades.Aluno;

public interface IAlunoRepositorio {

    public Aluno buscarPorCPF(String cpf);
    public void salvar(Aluno aluno);
    Aluno buscarAlunoPorNome(String nome, String sobrenome);
    public boolean removerAluno(Aluno aluno);
    public ArrayList<Aluno> listarTodosAlunos();
    public boolean desativarAluno(Aluno aluno);
    void alterarAluno(Aluno aluno);
}
