package co.Repositorio;

import co.Entidades.Aluno;
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



    public void alterarProfessor(Professor p) {
        for (Professor professor : this.professores) {
            if (professor.getNome().equalsIgnoreCase(p.getNome()) && professor.getSobrenome().equalsIgnoreCase(p.getSobrenome())) {
                professor.setNome(p.getNome());
                professor.setSobrenome(p.getSobrenome());
                professor.setAnosExperiencia(p.getAnosExperiencia());
                professor.setDiasDeTrabalho(p.getDiasDeTrabalho());
                professor.setHorarioDeTrabalho(p.getHorarioDeTrabalho());
                professor.setCpf(p.getCpf());
                professor.setId(p.getId());

                return;
            }
        }
    }
     public Professor buscarPorCPF(String cpf) {
            for (Professor professor : professores) {
                if (professor.getCpf().equals(cpf)) {
                    return professor;
                }
            }
            return null;
        }
}
