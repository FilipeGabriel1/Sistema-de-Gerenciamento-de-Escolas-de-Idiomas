package co.interfac;

import co.Entidades.Professor;


public interface IProfessorServicos {
    void salvar(Professor professor);
    void cadastrar(Professor professor, int matricula, String nome, String sobrenome, int idade, String diasDeAula, String horarioDeAula, String curso, String cpf);
    boolean deletarProfessor(Professor professor);
    void listarProfessores();
    void alterarProfessor(String cpf, int novaIdade, int novosAnosExperiencia, String novosDiasDeTrabalho, String novoHorarioDeTrabalho, String novoCursoLecionado, int novoId);
}