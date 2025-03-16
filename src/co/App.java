package co;

import co.Entidades.Aluno;
import co.Entidades.Curso;
import co.Entidades.CursoPrincipal;
import co.Entidades.Professor;
import co.Entidades.Turma;
import co.Repositorio.AlunoRepositorio;
import co.Repositorio.CursoRepositorio;
import co.Servicos.AlunoServicos;
import co.Servicos.CursoServicos;
import co.Servicos.ProfessorServicos;
import co.Repositorio.ProfessorRepositorio;
import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {

        Turma turmaIngles = new Turma("Turma de Ingles", 30);
        ArrayList<Aluno> alunos = new ArrayList<>();
        Aluno aluno = new Aluno();
        AlunoRepositorio alunoRepositorio = new AlunoRepositorio(alunos);
        AlunoServicos alunoServicos = new AlunoServicos(alunoRepositorio);
        ArrayList<Professor> professores = new ArrayList<>();
        Professor professor = new Professor();
        ProfessorRepositorio professorRepositorio = new ProfessorRepositorio(professores);
        ProfessorServicos professorServicos = new ProfessorServicos(professorRepositorio);
        ArrayList<Curso> cursos = new ArrayList<>();
        Curso curso = new Curso();
        curso.setNomeCurso("Ingles");
        List<Turma> turmas = new ArrayList<>();
        turmas.add(turmaIngles);
        CursoRepositorio cursoRepositorio = new CursoRepositorio(cursos);
        CursoServicos cursoServicos = new CursoServicos(cursoRepositorio);










        cursoServicos.adicionarCurso(curso, "08:00 - 10:00", 30, "Curso de Ingles", turmas);


        alunoServicos.matricular(aluno, 600954, "Filipe", "Gabriel", 19, 400, curso, turmaIngles);
        
        alunoServicos.listarAlunos();

        System.out.println("-------------------------");

    
        professorServicos.cadastrar(professor, 45637, "Joseph", "Ravioli", 15, "Segunda, Terca e Quinta", "08:00 as 10:00", "Ingles");

        professorServicos.listarProfessores();

        System.out.println("-------------------------");

        
       

        cursoServicos.listarCursos();

        cursoServicos.listarAlunosDoCurso(curso);
    }
}