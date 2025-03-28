package co.interfac;

import java.util.ArrayList;
import co.Entidades.Professor;

public interface IProfessorRepositorio {

    
    public Professor buscarPorCPF(String cpf);
    public void salvar(Professor professor);
    Professor buscarProfessorPorNome(String nome, String sobrenome);
    public boolean removerProfessor(Professor professor);
    public ArrayList<Professor> listarTodosProfessores();
    void alterarProfessor(Professor professor);
}
