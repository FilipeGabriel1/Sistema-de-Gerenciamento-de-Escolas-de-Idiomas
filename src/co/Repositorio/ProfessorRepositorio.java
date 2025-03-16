package co.Repositorio;

import co.Entidades.Professor;
import co.interfac.IProfessorRepositorio;

import java.util.ArrayList;

public class ProfessorRepositorio implements IProfessorRepositorio {

   private ArrayList<Professor> professores;

    public ProfessorRepositorio(ArrayList<Professor> professores) {
        this.professores = professores;
    }

     public void salvar(Professor professor){
        this.professores.add(professor);
    }

    public Professor buscarProfessorPorNome(String nome, String sobrenome) {
        if (this.professores != null) {
            for (Professor professor : this.professores) {
                if (professor.getNome().equalsIgnoreCase(nome) && professor.getSobrenome().equalsIgnoreCase(sobrenome)) {
                    return professor;
                }
            }
        } else {
            System.out.println("ARRAY LIST VAZIO !");
        }
        return null;
    }

    public ArrayList<Professor> listarTodosProfessores(){
        return professores;
}


public boolean removerProfessor(Professor professor){
    return professores.remove(professor);
}

}
