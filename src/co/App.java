package co;

import co.Entidades.Aluno;
import co.Entidades.Curso;
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

        // Instanciando as turmas
        Turma turmaInglesA = new Turma("Turma A", 30);
        Turma turmaInglesB = new Turma("Turma B", 30);
        Turma turmaInglesC = new Turma("Turma C", 30);
        Turma turmaInglesD = new Turma("Turma D", 30);
        Turma turmaJaponesA = new Turma("Turma A", 30);
        Turma turmaJaponesB = new Turma("Turma B", 30);
        Turma turmaJaponesC = new Turma("Turma C", 30);
        Turma turmaJaponesD = new Turma("Turma D", 30);
        Turma turmaEspanholA = new Turma("Turma A", 30);
        Turma turmaEspanholB = new Turma("Turma B", 30);
        Turma turmaEspanholC = new Turma("Turma C", 30);
        Turma turmaEspanholD = new Turma("Turma D", 30);
        Turma turmaFrancesA = new Turma("Turma A", 30);
        Turma turmaFrancesB = new Turma("Turma B", 30);
        Turma turmaFrancesC = new Turma("Turma C", 30);
        Turma turmaFrancesD = new Turma("Turma D", 30);

        // Instanciando os cursos
        ArrayList<Curso> cursos = new ArrayList<>();
        CursoRepositorio cursoRepositorio = new CursoRepositorio(cursos);
        CursoServicos cursoServicos = new CursoServicos(cursoRepositorio);
        Curso cursoIngles = new Curso();
        cursoIngles.setNomeCurso("Ingles");
        Curso cursoJapones = new Curso();
        cursoJapones.setNomeCurso("Japones");
        Curso cursoEspanhol = new Curso();
        cursoEspanhol.setNomeCurso("Espanhol");
        Curso cursoFrances = new Curso();
        cursoFrances.setNomeCurso("Frances");

        System.out.println("----------------------");

        // Adicionando turmas aos cursos

       
        cursoServicos.adicionarCurso(cursoIngles, "10:00 - 12:00", 120, 30,  "Curso de Ingles", List.of(turmaInglesA) , "Segunda e Quarta");
        cursoServicos.adicionarCurso(cursoJapones, "10:00 - 12:00", 120, 30, "Curso de Japones", List.of(turmaJaponesA), "Terca e Quinta");
        cursoServicos.adicionarCurso(cursoEspanhol, "10:00 - 12:00", 120, 30, "Curso de Espanhol", List.of(turmaEspanholA), "Quarta e Sexta");
        cursoServicos.adicionarCurso(cursoFrances, "10:00 - 12:00", 120, 30, "Curso de Frances", List.of(turmaFrancesA), "Terca e Quinta");

        System.out.println("----------------------");

        // Instanciando os alunos
        ArrayList<Aluno> alunos = new ArrayList<>();
        Aluno aluno = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();
        AlunoRepositorio alunoRepositorio = new AlunoRepositorio(alunos);
        AlunoServicos alunoServicos = new AlunoServicos(alunoRepositorio);

        // Matriculando alunos
        alunoServicos.matricular(aluno, 600954, "Filipe", "Gabriel", 19, 400, cursoIngles, turmaInglesA, "12345678912");

        System.out.println("----------------------");

        alunoServicos.matricular(aluno2, 576945, "Joao", "Pedro", 14, 500, cursoJapones, turmaJaponesA, "78463726151");

        alunoServicos.matricular(aluno3, 657483, "Richard", "Medeiros", 18, 300, cursoIngles, turmaInglesA, "73293767322");

    

        System.out.println("----------------------");

        // Instanciando os professores
        ArrayList<Professor> professores = new ArrayList<>();
        Professor professor = new Professor();
        ProfessorRepositorio professorRepositorio = new ProfessorRepositorio(professores);
        ProfessorServicos professorServicos = new ProfessorServicos(professorRepositorio);

        // Cadastrando professor
        professorServicos.cadastrar(professor, 45637, "Joseph", "Ravioli", 15, "Segunda, Terca e Quinta", "08:00 as 10:00", "Ingles", "123456789");

        System.out.println("----------------------");

        // Listando todos os alunos da empresa
        alunoServicos.listarAlunos();

        System.out.println("----------------------");
        // Listando professores
        professorServicos.listarProfessores();

        System.out.println("----------------------");

        // Listando alunos dos cursos
        cursoServicos.listarAlunosDoCurso(cursoIngles);
        
        System.out.println("----------------------");

        cursoServicos.listarAlunosDoCurso(cursoJapones);

        System.out.println("----------------------");

        //Listando cursos
        cursoServicos.listarCursos();
    }
}