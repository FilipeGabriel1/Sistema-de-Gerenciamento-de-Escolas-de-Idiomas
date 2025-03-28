package co.Entidades;

import java.util.ArrayList;
import java.util.List;

public class Curso extends Pessoa{
    
    private String horario;
    private int capacidadeMaxAlunos;
    private int capacidadeMaxAlunosPorTurma;
    private List <Turma> turma;
    private String nomeCurso;
    private List<Aluno> alunos;
    private String diaDasAulas;

    public Curso() {
        this.turma = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    public Curso(String nomeCurso){
        this.nomeCurso = nomeCurso;
    }
    
    public Curso(String nomeCurso, int cargaHoraria, int capacidadeMaxAlunos, String horario, int capacidadeMaxAlunosPorTurma, String diaDasAulas) {
       
        this.capacidadeMaxAlunos = capacidadeMaxAlunos;
        this.horario = horario;
        this.turma = new ArrayList<>();
        this.nomeCurso = nomeCurso;
        this.alunos = new ArrayList<>();
        this.capacidadeMaxAlunosPorTurma = capacidadeMaxAlunosPorTurma;
        this.diaDasAulas = diaDasAulas;

    }

    public String getDiaDasAulas() {
        return diaDasAulas;
    }

    public void setDiaDasAulas(String diaDasAulas) {
        this.diaDasAulas = diaDasAulas;
    }

    public List<Turma> getTurma() {
        return turma;
    }

    public void setTurma(List<Turma> turma) {
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

    public int getCapacidadeMaxAlunosPorTurma() {
        return capacidadeMaxAlunosPorTurma;
    }
    
    public void setCapacidadeMaxAlunosPorTurma(int capacidadeMaxAlunosPorTurma) {
        this.capacidadeMaxAlunosPorTurma = capacidadeMaxAlunosPorTurma;
    }
    

    public void adicionarTurma(Turma turmas){
       if (turma.size() < capacidadeMaxAlunosPorTurma) {
              turma.add(turmas);
              System.out.println("Turmas: " + turmas);
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

    public void removerAluno(Aluno aluno) {
        if (alunos.contains(aluno)) {
            alunos.remove(aluno);
            System.out.println("Aluno removido: " + aluno);
        } else {
            System.out.println("Aluno não encontrado no curso: " + nomeCurso);
        }
    }

@Override
    public String toString() {
        return "Curso{" +
                "turma=" + turma + '\'' +
                "nomeCurso='" + nomeCurso + '\'' +
                ", capacidadeMaxAlunos=" + capacidadeMaxAlunos +
                ", capacidadeMaxAlunosPorTurma=" + capacidadeMaxAlunosPorTurma +
                '}';
    }


}

