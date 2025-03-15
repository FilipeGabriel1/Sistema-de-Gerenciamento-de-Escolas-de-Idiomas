package co;

import co.Entidades.Aluno;
import co.Entidades.Curso;
import co.Entidades.Turma;
import co.Repositorio.AlunoRepositorio;
import co.Servicos.AlunoServicos;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Aluno> alunos = new ArrayList<>();

        AlunoRepositorio alunoRepositorio = new AlunoRepositorio(alunos);

        AlunoServicos alunoServicos = new AlunoServicos(alunoRepositorio);

        if (alunos != null) {
           
            Aluno a1 = new Aluno();
            Curso cursoIngles = new Curso();
            cursoIngles.setNomeCurso("Ingles");
            cursoIngles.setHorario("Manhã");

            Turma turma = new Turma("Turma de Ingles A", 30);
            cursoIngles.adicionarTurma(turma);

            alunoServicos.matricular(a1, 500555, "Filipe", "Gabriel", 19, 600, cursoIngles, turma);

            
            Aluno a2 = new Aluno();
            alunoServicos.matricular(a2, 500556, "João", "Silva", 22, 700, cursoIngles, turma);

            alunoServicos.listarAlunos();

            alunoServicos.deletarAluno(a2);

            alunoServicos.listarAlunos();
        }

    }
}