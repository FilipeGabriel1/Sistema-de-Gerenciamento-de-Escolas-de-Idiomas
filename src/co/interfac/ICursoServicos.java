package co.interfac;

import co.Entidades.Curso;
import co.Entidades.Turma;

import java.util.List;

public interface ICursoServicos {
    void salvar(Curso curso);
    void adicionarCurso(Curso curso, String horario, int capacidadeMaxAlunos, int capacidadeMaxAlunosPorTurma, String nomeCurso, List<Turma> turmas, String diasDasAulas);
    void listarAlunosDoCurso(Curso curso);
    boolean deletarCurso(Curso curso);
    void listarCursos();
    public boolean alterar(String horario, int capacidadeMaxAlunos, int capacidadeMaxAlunosPorTurma, String nomeCurso, String diasDasAulas);
}