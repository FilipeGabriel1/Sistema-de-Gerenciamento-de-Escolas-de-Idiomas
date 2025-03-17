package co.Entidades;

import java.util.ArrayList;
import java.util.List;

public class Curso{
    
    private String horario;
    private int capacidadeMaxAlunos;
    private List <Turma> turma;
    private String nomeCurso;
    private List<Aluno> alunos;

    public Curso() {
        this.turma = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }
    
    public Curso(String nomeCurso, int cargaHoraria, int capacidadeMaxAlunos, String horario) {
       
        this.capacidadeMaxAlunos = capacidadeMaxAlunos;
        this.horario = horario;
        this.turma = new ArrayList<>();
        this.nomeCurso = nomeCurso;
        this.alunos = new ArrayList<>();
    }

    public List<Turma> getTurma() {
        return turma;
    }

    public void setTurmas(List<Turma> turma) {
        this.turma = turma;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public void setCapacidadeMaxAlunos(int capacidadeMaxAlunos){
     this.capacidadeMaxAlunos = capacidadeMaxAlunos;
    }

    public int getCapacidadeMaxAlunos(){
     return capacidadeMaxAlunos;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void adicionarTurma(Turma turmas){
       if (turma.size() < capacidadeMaxAlunos) {
              turma.add(turmas);
         return;
       }
    }
    
    public void adicionarAluno(Aluno aluno) {
        if (alunos.size() < capacidadeMaxAlunos) {
            alunos.add(aluno);
        } else {
            System.out.println("Capacidade máxima de alunos atingida para o curso: " + nomeCurso);
        }
    }

   public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

@Override
    public String toString() {
        return "Curso{" +
                "cursoPrincipal=" + 
                "nomeCurso='" + nomeCurso + '\'' +
                ", capacidadeMaxAlunos=" + capacidadeMaxAlunos +
                '}';
    }
}


