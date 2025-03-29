package co.interfac;

import java.util.List;

import co.Entidades.Aluno;
import co.Entidades.Curso;
import co.Entidades.Turma;

public interface IAlunoServicos {
    
    void salvar(Aluno aluno);
    void matricular(Aluno aluno, int matricula, String nome, String sobrenome, int idade, int mensalidade, Curso nomeCurso, Turma turma, String cpf);
    boolean deletarAluno(String cpf);
    void inativarAluno(Aluno aluno);
    void listarAlunosDesativados();
    void listarAlunos();
    void alterar(Aluno aluno, int matricula, int idade, int mensalidade, Curso nomeCurso, Turma turma);
    
}