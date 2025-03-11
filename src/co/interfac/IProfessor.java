package co.interfac;

import java.util.List;

import co.Entidades.Professor;

public interface IProfessor {

    public void adicionarProfessor(Professor professor);
    public Professor buscarProfessorPorNome(String nome);
     public List<Professor> listarProfessores();
}
