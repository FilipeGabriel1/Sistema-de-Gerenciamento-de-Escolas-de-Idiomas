package co.interfac;

import co.Entidades.Turma;
import co.Entidades.Aluno;
import java.util.List;

public interface ITurmaServicos {
    public void remover(Turma turma);
    void salvar(Turma turma);
    void atualizar(Turma turma);
    public void ListarTurmas();
    void adicionarAlunoATurma(Turma turma, Aluno aluno);
    void removerAluno(Turma turma, Aluno aluno);
}
