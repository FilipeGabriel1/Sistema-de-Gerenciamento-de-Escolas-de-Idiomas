package co.interfac;

import co.Entidades.Professor;


public interface IProfessorServicos {
    void salvar(Professor professor);
    void cadastrar(Professor professor, int matricula, String nome, String sobrenome, int idade, String diasDeAula, String horarioDeAula, String curso, String cpf);
    boolean deletarProfessor(Professor professor);
    void listarProfessores();
    void alterar(int id, int anosExperiencia, String diasDeTrabalho, String horarioDeTrabalho, String cursoLecionado, String cpf);
}