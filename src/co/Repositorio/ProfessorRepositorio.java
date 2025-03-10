package co.Repositorio;

import java.util.List;
import co.Entidades.Professor;
import java.util.ArrayList;

public class ProfessorRepositorio {

    private List<Professor> listaProfessores = new ArrayList<Professor>();

    public void adicionarProfessor(Professor professor) {
        listaProfessores.add(professor);

        System.out.println("Professor Salvo: " + professor.getNomeCompleto().toUpperCase());
    }

    public Professor buscarProfessorPorNome(String nome) {
        for (Professor professor : listaProfessores) {
            if (professor.getNome().equalsIgnoreCase(nome)) {
                return professor;
            } else {
                return null;
            }
        }
        return null;
    }

    public void deletarProfessor(String nome) {
        listaProfessores.removeIf(professor -> professor.getNome().contains(nome));
        System.out.println("Professor deletado");
    }

    public List<Professor> listarProfessores() {
        return listaProfessores;
    }
}
