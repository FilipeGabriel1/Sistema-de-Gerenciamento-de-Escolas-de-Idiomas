package co.Entidades;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private String nomeTurma;
    private int capacidadeMaxAlunos;
    private List<Aluno> alunos;

    public Turma(String nomeTurma, int capacidadeMaxAlunos) {
        this.nomeTurma = nomeTurma;
        this.capacidadeMaxAlunos = capacidadeMaxAlunos;
        this.alunos = new ArrayList<>();
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public int getCapacidadeMaxAlunos() {
        return capacidadeMaxAlunos;
    }

    public void setCapacidadeMaxAlunos(int capacidadeMaxAlunos) {
        this.capacidadeMaxAlunos = capacidadeMaxAlunos;
    }

    public void adicionarAluno(Aluno aluno){
        if (alunos.size() < capacidadeMaxAlunos){
            alunos.add(aluno);
            
        } else {
            System.out.println("Capacidade máxima de alunos atingida para a turma: " + nomeTurma);     
        }
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public boolean isLotada() {
        return alunos.size() >= capacidadeMaxAlunos;
        }

        public void removerAluno(Aluno aluno) {
        if (alunos.contains(aluno)) {
            alunos.remove(aluno);
            System.out.println("Aluno removido da turma: " + nomeTurma);
        } else {
            System.out.println("Aluno não encontrado na turma: " + nomeTurma);
        }
        }

        @Override
        public String toString() {
        if (isLotada()) {
            return nomeTurma +  " (Turma Lotada)";
        } else {
            return nomeTurma + " (Capacidade Máxima: " + capacidadeMaxAlunos + " alunos, Alunos Matriculados: " + alunos.size() + ")";
        }
    }
}




